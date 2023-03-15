package com.aulia.sejalan;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LevelTigaActivity extends AppCompatActivity implements View.OnClickListener{

    TextView totalQuestionsTextView;
    TextView questionsTextView;
    Button ans_A, ans_B, ans_C, ans_D;
    Button btnSubmit;

    int score = 0;
    int totalQuestion = QuestionAnswerLvTiga.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leveltiga);

        totalQuestionsTextView  = findViewById(R.id.total_question3);
        questionsTextView       = findViewById(R.id.question3);
        ans_A                   = findViewById(R.id.ansA3);
        ans_B                   = findViewById(R.id.ansB3);
        ans_C                   = findViewById(R.id.ansC3);
        ans_D                   = findViewById(R.id.ansD3);
        btnSubmit               = findViewById(R.id.btnSubmit3);

        ans_A.setOnClickListener(this);
        ans_B.setOnClickListener(this);
        ans_C.setOnClickListener(this);
        ans_D.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);

        totalQuestionsTextView.setText("Total Question : "+totalQuestion);

        loadNewQuestion();
    }

    @Override
    public void onClick(View view) {

        ans_A.setBackgroundColor(Color.WHITE);
        ans_B.setBackgroundColor(Color.WHITE);
        ans_C.setBackgroundColor(Color.WHITE);
        ans_D.setBackgroundColor(Color.WHITE);


        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.btnSubmit3) {

            if(selectedAnswer.equals(QuestionAnswerLvTiga.correctAnswers[currentQuestionIndex])) {
                score++;
            }

            currentQuestionIndex++;
            loadNewQuestion();

        }else {
            //choises button clicked
            selectedAnswer = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.CYAN);
        }
    }

    public void loadNewQuestion() {

        if(currentQuestionIndex == totalQuestion) {
            finishQuiz();
            return;
        }

        questionsTextView.setText(QuestionAnswerLvTiga.question[currentQuestionIndex]);
        ans_A.setText(QuestionAnswerLvTiga.choices[currentQuestionIndex][0]);
        ans_B.setText(QuestionAnswerLvTiga.choices[currentQuestionIndex][1]);
        ans_C.setText(QuestionAnswerLvTiga.choices[currentQuestionIndex][2]);
        ans_D.setText(QuestionAnswerLvTiga.choices[currentQuestionIndex][3]);
    }

    public void finishQuiz() {
        String passStatus = "";
        if(score > totalQuestion*0.60) {
            passStatus = "Passed";
        }else {
            passStatus = "Failed";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score is "+ score+" out of "+totalQuestion)
                .setPositiveButton("Restart", (dialogInterface, i) -> restartQuiz())
                .setNegativeButton("Exit", (dialogInterface, e) -> exit())
                .setCancelable(false)
                .show();
    }

    public void restartQuiz() {
        score = 0;
        currentQuestionIndex = 0;
        loadNewQuestion();
    }

    public void exit() {
        Intent exit = new Intent(LevelTigaActivity.this, QuizActivity.class);
        startActivity(exit);
        finish();
    }
}