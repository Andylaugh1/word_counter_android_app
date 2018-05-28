package com.example.codeclan.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Map;

public class WordCounterActivity extends AppCompatActivity {

    EditText enterTextBox;
    TextView answerText;
    Button countButton, instanceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        enterTextBox = findViewById(R.id.enter_text);
        countButton = findViewById(R.id.count_button);
        answerText = findViewById(R.id.answer_box);
        instanceButton = findViewById(R.id.instance_button);
    }

    public void onCountButtonClicked(View button){
        String sentence = enterTextBox.getText().toString();

        WordCounter wordCounter = new WordCounter();
        String answer = wordCounter.splitWords(sentence);

        answerText.setText(answer);
    }

    public void onCountInstanceButtonClicked(View button){
        String sentence = enterTextBox.getText().toString();

        WordCounter wordCounter = new WordCounter();
        Map<String, Integer> answer = wordCounter.countWordInstances(sentence);

        answerText.setText(answer.toString());
    }
}
