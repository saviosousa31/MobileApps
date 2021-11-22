package br.saviosousa31.projetocalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i = 0;
    int count = 0;
    int[] Resultado;
    int Total;
    static int INVALID = 9999999;
    String operacao;

    /*
    Botões:
     */
    Button btn00, btn01, btn02, btn03, btn04, btn05, btn06, btn07, btn08, btn09;
    Button btnSoma, btnSub, btnMult, btnDiv, btnIgual, btnCE;

    TextView RESULTSCREEN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resultado = new int[2];

        RESULTSCREEN = (TextView) findViewById(R.id.RESULTSCREEN);
        btn00 = (Button) findViewById(R.id.button0);
        btn01 = (Button) findViewById(R.id.button1);
        btn02 = (Button) findViewById(R.id.button2);
        btn03 = (Button) findViewById(R.id.button3);
        btn04 = (Button) findViewById(R.id.button4);
        btn05 = (Button) findViewById(R.id.button5);
        btn06 = (Button) findViewById(R.id.button6);
        btn07 = (Button) findViewById(R.id.button7);
        btn08 = (Button) findViewById(R.id.button8);
        btn09 = (Button) findViewById(R.id.button9);
        btnSoma = (Button) findViewById(R.id.buttonsoma);
        btnSub = (Button) findViewById(R.id.buttonsub);
        btnMult = (Button) findViewById(R.id.buttonmult);
        btnDiv = (Button) findViewById(R.id.buttondiv);
        btnIgual = (Button) findViewById(R.id.buttonigual);
        btnCE = (Button) findViewById(R.id.buttonLimpar);

        btn00.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               if(count <7){
                   Resultado[i] = (Resultado[i] * 10);
                   count++;
               }
               exibirResultado();
               Total = 0;
            }
        });

        btn01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(count <7){
                    Resultado[i] = (Resultado[i] * 10) + 1;
                    count++;
                }
                exibirResultado();
                Total = 0;
            }
        });

        btn02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(count <7){
                    Resultado[i] = (Resultado[i] * 10) + 2;
                    count++;
                }
                exibirResultado();
                Total = 0;
            }
        });

        btn03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(count <7){
                    Resultado[i] = (Resultado[i] * 10) + 3;
                    count++;
                }
                exibirResultado();
                Total = 0;
            }
        });

        btn04.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(count <7){
                    Resultado[i] = (Resultado[i] * 10) + 4;
                    count++;
                }
                exibirResultado();
                Total = 0;
            }
        });

        btn05.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(count <7){
                    Resultado[i] = (Resultado[i] * 10) + 5;
                    count++;
                }
                exibirResultado();
                Total = 0;
            }
        });

        btn06.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(count <7){
                    Resultado[i] = (Resultado[i] * 10) + 6;
                    count++;
                }
                exibirResultado();
                Total = 0;
            }
        });

        btn07.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(count <7){
                    Resultado[i] = (Resultado[i] * 10) + 7;
                    count++;
                }
                exibirResultado();
                Total = 0;
            }
        });

        btn08.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(count <7){
                    Resultado[i] = (Resultado[i] * 10) + 8;
                    count++;
                }
                exibirResultado();
                Total = 0;
            }
        });

        btn09.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(count <7){
                    Resultado[i] = (Resultado[i] * 10) + 9;
                    count++;
                }
                exibirResultado();
                Total = 0;
            }
        });

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "soma";
                proximoNumero();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "sub";
                proximoNumero();
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "mult";
                proximoNumero();
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "div";
                proximoNumero();
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular();
                exibirResultado();
                Total = 0;
                count = 0;
            }
        });

        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpar();
            }
        });

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "soma";
                proximoNumero();
            }
        });
    }

    private void exibirResultado(){
        String tela = "";
        if (Total != 0 && Total < INVALID){
            tela = String.valueOf(Total);
        } else if (Total > INVALID){
            tela = "ERROR";
        } else{
            tela = String.valueOf(Resultado[i]);
        }
        RESULTSCREEN.setText(tela);
    }

    private void proximoNumero(){
        count = 0;
        i = 1;
    }

    private void limpar(){
        i = 0;
        count = 0;
        Total = 0;
        Resultado[0] = 0;
        Resultado[1] = 0;
        exibirResultado();
    }

    private void calcular(){
        double value;
        switch (operacao){
            case "soma" : Total = (Resultado[0] + Resultado[1]); break;
            case "sub" : Total = (Resultado[0] - Resultado[1]); break;
            case "mult" : Total = (Resultado[0] * Resultado[1]); break;
            case "div" : Total = (Resultado[0] / Resultado[1]); break;
        }

        if (Total < INVALID){
            Resultado[0] = Total;
            Resultado[1] = 0;
            i = 1;
        }
    }
}