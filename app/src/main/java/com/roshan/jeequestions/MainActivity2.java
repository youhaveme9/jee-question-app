package com.roshan.jeequestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity2 extends AppCompatActivity {

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pdfView=findViewById(R.id.pdfView);
        int pdf_no  = getIntent().getIntExtra("key_position", 0);

        if(pdf_no==0){
            pdfView.fromAsset("paper-1.pdf").load();
        }
        else if(pdf_no==1){
            pdfView.fromAsset("paper-2.pdf").load();
        }
        else if(pdf_no==2){
            pdfView.fromAsset("about.pdf").load();
        }
    }
}