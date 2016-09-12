package com.example.gates.catancards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private static final int SMALLTITLE = 30;
    private static final int NORMALTITLE = 40;
    Deck deck;
    Card card;
    TextView titleText, numberText, descriptionText, countText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleText = (TextView) this.findViewById(R.id.card_title);
        numberText = (TextView) this.findViewById(R.id.card_number);
        descriptionText = (TextView) this.findViewById(R.id.card_desc);
        countText = (TextView) this.findViewById(R.id.card_count);

        deck = new Deck();
        drawCard();
    }

    public void switchCards(View view) {
        drawCard();
    }

    public void drawCard() {
        card = deck.nextCard();
        updateViews(card);
    }

    public void updateViews(Card currCard) {
        titleText.setText(currCard.getTitleRef());
        numberText.setText(currCard.getNumber() + "");
        descriptionText.setText(currCard.getDescriptionRef());
        countText.setText(deck.getCount()+"");

        if(currCard.getDescriptionRef() == R.string.normal_desc) {
            descriptionText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        }
        else {
            descriptionText.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        }

        if(currCard.getTitleRef() == R.string.neighborly_title) {
            titleText.setTextSize(SMALLTITLE);
        }
        else {
            titleText.setTextSize(NORMALTITLE);
        }
    }

}
