package com.example.practice4_oddtoeven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.practice4_oddtoeven.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button.setOnClickListener(view -> checkOddOrEven());
    }

    private void checkOddOrEven() {
        String text = binding.editNumber.getText().toString();
        if (text.isEmpty()) {
            Toast.makeText(this, "숫자를 입력해 주세요", Toast.LENGTH_SHORT).show();
            return;
        }

        int value = Integer.parseInt(text);

        String message;
        if (value % 2 ==0) {
            message = "%d는 짝수입니다.";
        } else {
            message = "%d는 홀수입니다";
        }

        Toast.makeText(this, String.format(message, value), Toast.LENGTH_SHORT).show();
    }
}