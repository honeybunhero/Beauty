package app.beautyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MakeUp extends AppCompatActivity {

    LinearLayout ll_primer, ll_foundation, ll_concealer, ll_blush, ll_contour, ll_setting_powder, ll_highlighter, ll_brows, ll_eyeshadow, ll_mascara, ll_eyeliner,
            ll_lipliner, ll_lipstick, ll_lipgloss, ll_lipbalm_oil, ll_multi_palette, ll_finishing_spray, ll_accessories;

    Button btnAddPrimer, btnAddFoundation, btnAddConcealer, btnAddBlush, btnAddContour, btnAddSettingPowder, btnAddHighlighter, btnAddBrows, btnAddEyeshadow,
            btnAddMascara, btnAddEyeliner, btnAddLipliner, btnAddLipstick, btnAddLipGloss, btnAddLipBalmOil, btnAddMultiPalette, btnAddFinishingSpray, btnAddAccessories;

    Button btnRemovePrimer, btnRemoveFoundation, btnRemoveConcealer, btnRemoveBlush, btnRemoveContour, btnRemoveSettingPowder, btnRemoveHighlighter, btnRemoveBrows, btnRemoveEyeshadow,
            btnRemoveMascara, btnRemoveEyeliner, btnRemoveLipliner, btnRemoveLipstick, btnRemoveLipGloss, btnRemoveLipBalmOil, btnRemoveMultiPalette, btnRemoveFinishingSpray, btnRemoveAccessories;

    Button btnViewPrimer, btnViewFoundation, btnViewConcealer, btnViewBlush, btnViewContour, btnViewSettingPowder, btnViewHighlighter, btnViewBrows, btnViewEyeshadow,
            btnViewMascara, btnViewEyeliner, btnViewLipliner, btnViewLipstick, btnViewLipGloss, btnViewLipBalmOil, btnViewMultiPalette, btnViewFinishingSpray, btnViewAccessories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_up);

        ll_primer = findViewById(R.id.ll_primer);
        ll_foundation = findViewById(R.id.ll_foundation);
        ll_concealer = findViewById(R.id.ll_concealer);
        ll_blush = findViewById(R.id.ll_blush);
        ll_contour = findViewById(R.id.ll_contour);
        ll_setting_powder = findViewById(R.id.ll_setting_powder);
        ll_highlighter = findViewById(R.id.ll_highlighter);
        ll_brows = findViewById(R.id.ll_brows);
        ll_eyeliner = findViewById(R.id.ll_eyeliner);
        ll_eyeshadow = findViewById(R.id.ll_eyeshadow);
        ll_mascara = findViewById(R.id.ll_mascara);
        ll_lipliner = findViewById(R.id.ll_lipliner);
        ll_lipstick = findViewById(R.id.ll_lipstick);
        ll_lipgloss = findViewById(R.id.ll_lip_gloss);
        ll_lipbalm_oil = findViewById(R.id.ll_lip_balm_oil);
        ll_multi_palette = findViewById(R.id.ll_multi_palette);
        ll_finishing_spray = findViewById(R.id.ll_finishing_spray);
        ll_accessories = findViewById(R.id.ll_accessories);

        btnAddPrimer = findViewById(R.id.btnAddPrimer);
        btnAddFoundation = findViewById(R.id.btnAddFoundation);
        btnAddConcealer = findViewById(R.id.btnAddConcealer);
        btnAddBlush = findViewById(R.id.btnAddBlush);
        btnAddContour = findViewById(R.id.btnAddContour);
        btnAddSettingPowder = findViewById(R.id.btnAddSettingPowder);
        btnAddHighlighter = findViewById(R.id.btnAddHighlighter);
        btnAddBrows = findViewById(R.id.btnAddBrows);
        btnAddEyeshadow = findViewById(R.id.btnAddEyeshadow);
        btnAddMascara = findViewById(R.id.btnAddMascara);
        btnAddEyeliner = findViewById(R.id.btnAddEyeliner);
        btnAddLipliner = findViewById(R.id.btnAddLipliner);
        btnAddLipstick = findViewById(R.id.btnAddLipstick);
        btnAddLipGloss = findViewById(R.id.btnAddLipGloss);
        btnAddLipBalmOil = findViewById(R.id.btnAddLipBalmOil);
        btnAddMultiPalette = findViewById(R.id.btnAddMultiPalette);
        btnAddFinishingSpray = findViewById(R.id.btnAddFinishingSpray);
        btnAddAccessories = findViewById(R.id.btnAddAccessories);

        btnRemovePrimer = findViewById(R.id.btnRemovePrimer);
        btnRemoveFoundation = findViewById(R.id.btnRemoveFoundation);
        btnRemoveConcealer = findViewById(R.id.btnRemoveConcealer);
        btnRemoveBlush = findViewById(R.id.btnRemoveBlush);
        btnRemoveContour = findViewById(R.id.btnRemoveContour);
        btnRemoveSettingPowder = findViewById(R.id.btnRemoveSettingPowder);
        btnRemoveHighlighter = findViewById(R.id.btnRemoveHighlighter);
        btnRemoveBrows = findViewById(R.id.btnRemoveBrows);
        btnRemoveEyeshadow = findViewById(R.id.btnRemoveEyeshadow);
        btnRemoveMascara = findViewById(R.id.btnRemoveMascara);
        btnRemoveEyeliner = findViewById(R.id.btnRemoveEyeliner);
        btnRemoveLipliner = findViewById(R.id.btnRemoveLipliner);
        btnRemoveLipstick = findViewById(R.id.btnRemoveLipstick);
        btnRemoveLipGloss = findViewById(R.id.btnRemoveLipGloss);
        btnRemoveLipBalmOil = findViewById(R.id.btnRemoveLipBalmOil);
        btnRemoveMultiPalette = findViewById(R.id.btnRemoveMultiPalette);
        btnRemoveFinishingSpray = findViewById(R.id.btnRemoveFinishingSpray);
        btnRemoveAccessories = findViewById(R.id.btnRemoveAccessories);

        btnViewPrimer = findViewById(R.id.btnViewPrimer);
        btnViewFoundation = findViewById(R.id.btnViewFoundation);
        btnViewConcealer = findViewById(R.id.btnViewConcealer);
        btnViewBlush = findViewById(R.id.btnViewBlush);
        btnViewContour = findViewById(R.id.btnViewContour);
        btnViewSettingPowder = findViewById(R.id.btnViewSettingPowder);
        btnViewHighlighter = findViewById(R.id.btnViewHighlighter);
        btnViewBrows = findViewById(R.id.btnViewBrows);
        btnViewEyeshadow = findViewById(R.id.btnViewEyeshadow);
        btnViewMascara = findViewById(R.id.btnViewMascara);
        btnViewEyeliner = findViewById(R.id.btnViewEyeliner);
        btnViewLipliner = findViewById(R.id.btnViewLipliner);
        btnViewLipstick = findViewById(R.id.btnViewLipstick);
        btnViewLipGloss = findViewById(R.id.btnViewLipGloss);
        btnViewLipBalmOil = findViewById(R.id.btnViewLipBalmOil);
        btnViewMultiPalette = findViewById(R.id.btnViewMultiPalette);
        btnViewFinishingSpray = findViewById(R.id.btnViewFinishingSpray);
        btnViewAccessories = findViewById(R.id.btnViewAccessories);


        btnAddPrimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Adding stuff in primer", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddFoundation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Adding stuff in foundation", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddConcealer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Adding stuff in concealer", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddBlush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Adding stuff in blush", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddContour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Adding stuff in contour", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddSettingPowder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Adding stuff in setting powder", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddHighlighter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Adding stuff in highlighter", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddBrows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Adding stuff in brows", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddEyeshadow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Adding stuff in eyeshadow", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddMascara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Adding stuff in mascara", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddEyeliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Adding stuff in eyeliner", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddLipliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Adding stuff in lipliner", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddLipstick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Adding stuff in lipstick", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddLipGloss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Adding stuff in lip gloss", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddLipBalmOil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Adding stuff in lip balm/oil", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddMultiPalette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Adding stuff in multi-palette", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddFinishingSpray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Adding stuff in finishing spray", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddAccessories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Adding stuff in accessories", Toast.LENGTH_SHORT).show();
            }
        });

        btnRemovePrimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Removing stuff in primer", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveFoundation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Removing stuff in foundation", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveConcealer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Removing stuff in concealer", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveBlush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Removing stuff in blush", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveContour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Removing stuff in contour", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveSettingPowder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Removing stuff in setting powder", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveHighlighter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Removing stuff in highlighter", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveBrows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Removing stuff in brows", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveEyeshadow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Removing stuff in eyeshadow", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveMascara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Removing stuff in mascara", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveEyeliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Removing stuff in eyeliner", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveLipliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Removing stuff in lipliner", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveLipstick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Removing stuff in lipstick", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveLipGloss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Removing stuff in lip gloss", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveLipBalmOil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Removing stuff in lip balm/oil", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveMultiPalette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Removing stuff in multi-palette", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveFinishingSpray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Removing stuff in finishing spray", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveAccessories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Removing stuff in accessories", Toast.LENGTH_SHORT).show();
            }
        });

        btnViewPrimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Viewing stuff in primer", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewFoundation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Viewing stuff in foundation", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewConcealer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Viewing stuff in concealer", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewBlush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Viewing stuff in blush", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewContour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Viewing stuff in contour", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewSettingPowder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Viewing stuff in setting powder", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewHighlighter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Viewing stuff in highlighter", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewBrows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Viewing stuff in brows", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewEyeshadow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Viewing stuff in eyeshadow", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewMascara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Viewing stuff in mascara", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewEyeliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Viewing stuff in eyeliner", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewLipliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Viewing stuff in lipliner", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewLipstick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Viewing stuff in lipstick", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewLipGloss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Viewing stuff in lip gloss", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewLipBalmOil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Viewing stuff in lip balm/oil", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewMultiPalette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Viewing stuff in multi-palette", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewFinishingSpray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Viewing stuff in finishing spray", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewAccessories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MakeUp.this, "Viewing stuff in accessories", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void OnPrimerClick(View v) {
        if (ll_primer.getVisibility() == View.VISIBLE) {
            ll_primer.setVisibility(View.GONE);
        } else {
            ll_primer.setVisibility(View.VISIBLE);

            ll_foundation.setVisibility(View.GONE);
            ll_concealer.setVisibility(View.GONE);
            ll_blush.setVisibility(View.GONE);
            ll_contour.setVisibility(View.GONE);
            ll_setting_powder.setVisibility(View.GONE);
            ll_highlighter.setVisibility(View.GONE);
            ll_brows.setVisibility(View.GONE);
            ll_eyeliner.setVisibility(View.GONE);
            ll_eyeshadow.setVisibility(View.GONE);
            ll_mascara.setVisibility(View.GONE);
            ll_lipliner.setVisibility(View.GONE);
            ll_lipstick.setVisibility(View.GONE);
            ll_lipgloss.setVisibility(View.GONE);
            ll_lipbalm_oil.setVisibility(View.GONE);
            ll_multi_palette.setVisibility(View.GONE);
            ll_finishing_spray.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnFoundationClick(View v) {
        if (ll_foundation.getVisibility() == View.VISIBLE) {
            ll_foundation.setVisibility(View.GONE);
        } else {
            ll_foundation.setVisibility(View.VISIBLE);

            ll_primer.setVisibility(View.GONE);
            ll_concealer.setVisibility(View.GONE);
            ll_blush.setVisibility(View.GONE);
            ll_contour.setVisibility(View.GONE);
            ll_setting_powder.setVisibility(View.GONE);
            ll_highlighter.setVisibility(View.GONE);
            ll_brows.setVisibility(View.GONE);
            ll_eyeliner.setVisibility(View.GONE);
            ll_eyeshadow.setVisibility(View.GONE);
            ll_mascara.setVisibility(View.GONE);
            ll_lipliner.setVisibility(View.GONE);
            ll_lipstick.setVisibility(View.GONE);
            ll_lipgloss.setVisibility(View.GONE);
            ll_lipbalm_oil.setVisibility(View.GONE);
            ll_multi_palette.setVisibility(View.GONE);
            ll_finishing_spray.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnConcealerClick(View v) {
        if (ll_concealer.getVisibility() == View.VISIBLE) {
            ll_concealer.setVisibility(View.GONE);
        } else {
            ll_concealer.setVisibility(View.VISIBLE);

            ll_primer.setVisibility(View.GONE);
            ll_foundation.setVisibility(View.GONE);
            ll_blush.setVisibility(View.GONE);
            ll_contour.setVisibility(View.GONE);
            ll_setting_powder.setVisibility(View.GONE);
            ll_highlighter.setVisibility(View.GONE);
            ll_brows.setVisibility(View.GONE);
            ll_eyeliner.setVisibility(View.GONE);
            ll_eyeshadow.setVisibility(View.GONE);
            ll_mascara.setVisibility(View.GONE);
            ll_lipliner.setVisibility(View.GONE);
            ll_lipstick.setVisibility(View.GONE);
            ll_lipgloss.setVisibility(View.GONE);
            ll_lipbalm_oil.setVisibility(View.GONE);
            ll_multi_palette.setVisibility(View.GONE);
            ll_finishing_spray.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnBlushClick(View v) {
        if (ll_blush.getVisibility() == View.VISIBLE) {
            ll_blush.setVisibility(View.GONE);
        } else {
            ll_blush.setVisibility(View.VISIBLE);

            ll_primer.setVisibility(View.GONE);
            ll_concealer.setVisibility(View.GONE);
            ll_foundation.setVisibility(View.GONE);
            ll_contour.setVisibility(View.GONE);
            ll_setting_powder.setVisibility(View.GONE);
            ll_highlighter.setVisibility(View.GONE);
            ll_brows.setVisibility(View.GONE);
            ll_eyeliner.setVisibility(View.GONE);
            ll_eyeshadow.setVisibility(View.GONE);
            ll_mascara.setVisibility(View.GONE);
            ll_lipliner.setVisibility(View.GONE);
            ll_lipstick.setVisibility(View.GONE);
            ll_lipgloss.setVisibility(View.GONE);
            ll_lipbalm_oil.setVisibility(View.GONE);
            ll_multi_palette.setVisibility(View.GONE);
            ll_finishing_spray.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnContourClick(View v) {
        if (ll_contour.getVisibility() == View.VISIBLE) {
            ll_contour.setVisibility(View.GONE);
        } else {
            ll_contour.setVisibility(View.VISIBLE);

            ll_primer.setVisibility(View.GONE);
            ll_blush.setVisibility(View.GONE);
            ll_concealer.setVisibility(View.GONE);
            ll_foundation.setVisibility(View.GONE);
            ll_setting_powder.setVisibility(View.GONE);
            ll_highlighter.setVisibility(View.GONE);
            ll_brows.setVisibility(View.GONE);
            ll_eyeliner.setVisibility(View.GONE);
            ll_eyeshadow.setVisibility(View.GONE);
            ll_mascara.setVisibility(View.GONE);
            ll_lipliner.setVisibility(View.GONE);
            ll_lipstick.setVisibility(View.GONE);
            ll_lipgloss.setVisibility(View.GONE);
            ll_lipbalm_oil.setVisibility(View.GONE);
            ll_multi_palette.setVisibility(View.GONE);
            ll_finishing_spray.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnSettingpowderClick(View v) {
        if (ll_setting_powder.getVisibility() == View.VISIBLE) {
            ll_setting_powder.setVisibility(View.GONE);
        } else {
            ll_setting_powder.setVisibility(View.VISIBLE);

            ll_primer.setVisibility(View.GONE);
            ll_blush.setVisibility(View.GONE);
            ll_concealer.setVisibility(View.GONE);
            ll_foundation.setVisibility(View.GONE);
            ll_contour.setVisibility(View.GONE);
            ll_highlighter.setVisibility(View.GONE);
            ll_brows.setVisibility(View.GONE);
            ll_eyeliner.setVisibility(View.GONE);
            ll_eyeshadow.setVisibility(View.GONE);
            ll_mascara.setVisibility(View.GONE);
            ll_lipliner.setVisibility(View.GONE);
            ll_lipstick.setVisibility(View.GONE);
            ll_lipgloss.setVisibility(View.GONE);
            ll_lipbalm_oil.setVisibility(View.GONE);
            ll_multi_palette.setVisibility(View.GONE);
            ll_finishing_spray.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnHighlighterClick(View v) {
        if (ll_highlighter.getVisibility() == View.VISIBLE) {
            ll_highlighter.setVisibility(View.GONE);
        } else {
            ll_highlighter.setVisibility(View.VISIBLE);

            ll_primer.setVisibility(View.GONE);
            ll_blush.setVisibility(View.GONE);
            ll_concealer.setVisibility(View.GONE);
            ll_foundation.setVisibility(View.GONE);
            ll_contour.setVisibility(View.GONE);
            ll_setting_powder.setVisibility(View.GONE);
            ll_brows.setVisibility(View.GONE);
            ll_eyeliner.setVisibility(View.GONE);
            ll_eyeshadow.setVisibility(View.GONE);
            ll_mascara.setVisibility(View.GONE);
            ll_lipliner.setVisibility(View.GONE);
            ll_lipstick.setVisibility(View.GONE);
            ll_lipgloss.setVisibility(View.GONE);
            ll_lipbalm_oil.setVisibility(View.GONE);
            ll_multi_palette.setVisibility(View.GONE);
            ll_finishing_spray.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnBrowsClick(View v) {
        if (ll_brows.getVisibility() == View.VISIBLE) {
            ll_brows.setVisibility(View.GONE);
        } else {
            ll_brows.setVisibility(View.VISIBLE);

            ll_primer.setVisibility(View.GONE);
            ll_blush.setVisibility(View.GONE);
            ll_concealer.setVisibility(View.GONE);
            ll_foundation.setVisibility(View.GONE);
            ll_contour.setVisibility(View.GONE);
            ll_setting_powder.setVisibility(View.GONE);
            ll_highlighter.setVisibility(View.GONE);
            ll_eyeliner.setVisibility(View.GONE);
            ll_eyeshadow.setVisibility(View.GONE);
            ll_mascara.setVisibility(View.GONE);
            ll_lipliner.setVisibility(View.GONE);
            ll_lipstick.setVisibility(View.GONE);
            ll_lipgloss.setVisibility(View.GONE);
            ll_lipbalm_oil.setVisibility(View.GONE);
            ll_multi_palette.setVisibility(View.GONE);
            ll_finishing_spray.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnEyeshadowClick(View v) {
        if (ll_eyeshadow.getVisibility() == View.VISIBLE) {
            ll_eyeshadow.setVisibility(View.GONE);
        } else {
            ll_eyeshadow.setVisibility(View.VISIBLE);

            ll_primer.setVisibility(View.GONE);
            ll_blush.setVisibility(View.GONE);
            ll_concealer.setVisibility(View.GONE);
            ll_foundation.setVisibility(View.GONE);
            ll_contour.setVisibility(View.GONE);
            ll_setting_powder.setVisibility(View.GONE);
            ll_highlighter.setVisibility(View.GONE);
            ll_brows.setVisibility(View.GONE);
            ll_eyeliner.setVisibility(View.GONE);
            ll_mascara.setVisibility(View.GONE);
            ll_lipliner.setVisibility(View.GONE);
            ll_lipstick.setVisibility(View.GONE);
            ll_lipgloss.setVisibility(View.GONE);
            ll_lipbalm_oil.setVisibility(View.GONE);
            ll_multi_palette.setVisibility(View.GONE);
            ll_finishing_spray.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnEyelinerClick(View v) {
        if (ll_eyeliner.getVisibility() == View.VISIBLE) {
            ll_eyeliner.setVisibility(View.GONE);
        } else {
            ll_eyeliner.setVisibility(View.VISIBLE);

            ll_primer.setVisibility(View.GONE);
            ll_blush.setVisibility(View.GONE);
            ll_concealer.setVisibility(View.GONE);
            ll_foundation.setVisibility(View.GONE);
            ll_contour.setVisibility(View.GONE);
            ll_setting_powder.setVisibility(View.GONE);
            ll_highlighter.setVisibility(View.GONE);
            ll_brows.setVisibility(View.GONE);
            ll_eyeshadow.setVisibility(View.GONE);
            ll_mascara.setVisibility(View.GONE);
            ll_lipliner.setVisibility(View.GONE);
            ll_lipstick.setVisibility(View.GONE);
            ll_lipgloss.setVisibility(View.GONE);
            ll_lipbalm_oil.setVisibility(View.GONE);
            ll_multi_palette.setVisibility(View.GONE);
            ll_finishing_spray.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnMascaraClick(View v) {
        if (ll_mascara.getVisibility() == View.VISIBLE) {
            ll_mascara.setVisibility(View.GONE);
        } else {
            ll_mascara.setVisibility(View.VISIBLE);

            ll_primer.setVisibility(View.GONE);
            ll_blush.setVisibility(View.GONE);
            ll_concealer.setVisibility(View.GONE);
            ll_foundation.setVisibility(View.GONE);
            ll_contour.setVisibility(View.GONE);
            ll_setting_powder.setVisibility(View.GONE);
            ll_highlighter.setVisibility(View.GONE);
            ll_brows.setVisibility(View.GONE);
            ll_eyeliner.setVisibility(View.GONE);
            ll_eyeshadow.setVisibility(View.GONE);
            ll_lipliner.setVisibility(View.GONE);
            ll_lipstick.setVisibility(View.GONE);
            ll_lipgloss.setVisibility(View.GONE);
            ll_lipbalm_oil.setVisibility(View.GONE);
            ll_multi_palette.setVisibility(View.GONE);
            ll_finishing_spray.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnLiplinerClick(View v) {
        if (ll_lipliner.getVisibility() == View.VISIBLE) {
            ll_lipliner.setVisibility(View.GONE);
        } else {
            ll_lipliner.setVisibility(View.VISIBLE);

            ll_primer.setVisibility(View.GONE);
            ll_blush.setVisibility(View.GONE);
            ll_concealer.setVisibility(View.GONE);
            ll_foundation.setVisibility(View.GONE);
            ll_contour.setVisibility(View.GONE);
            ll_setting_powder.setVisibility(View.GONE);
            ll_highlighter.setVisibility(View.GONE);
            ll_brows.setVisibility(View.GONE);
            ll_eyeliner.setVisibility(View.GONE);
            ll_eyeshadow.setVisibility(View.GONE);
            ll_mascara.setVisibility(View.GONE);
            ll_lipstick.setVisibility(View.GONE);
            ll_lipgloss.setVisibility(View.GONE);
            ll_lipbalm_oil.setVisibility(View.GONE);
            ll_multi_palette.setVisibility(View.GONE);
            ll_finishing_spray.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnLipstickClick(View v) {
        if (ll_lipstick.getVisibility() == View.VISIBLE) {
            ll_lipstick.setVisibility(View.GONE);
        } else {
            ll_lipstick.setVisibility(View.VISIBLE);

            ll_primer.setVisibility(View.GONE);
            ll_blush.setVisibility(View.GONE);
            ll_concealer.setVisibility(View.GONE);
            ll_foundation.setVisibility(View.GONE);
            ll_contour.setVisibility(View.GONE);
            ll_setting_powder.setVisibility(View.GONE);
            ll_highlighter.setVisibility(View.GONE);
            ll_brows.setVisibility(View.GONE);
            ll_eyeliner.setVisibility(View.GONE);
            ll_eyeshadow.setVisibility(View.GONE);
            ll_mascara.setVisibility(View.GONE);
            ll_lipliner.setVisibility(View.GONE);
            ll_lipgloss.setVisibility(View.GONE);
            ll_lipbalm_oil.setVisibility(View.GONE);
            ll_multi_palette.setVisibility(View.GONE);
            ll_finishing_spray.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnLipglossClick(View v) {
        if (ll_lipgloss.getVisibility() == View.VISIBLE) {
            ll_lipgloss.setVisibility(View.GONE);
        } else {
            ll_lipgloss.setVisibility(View.VISIBLE);

            ll_primer.setVisibility(View.GONE);
            ll_blush.setVisibility(View.GONE);
            ll_concealer.setVisibility(View.GONE);
            ll_foundation.setVisibility(View.GONE);
            ll_contour.setVisibility(View.GONE);
            ll_setting_powder.setVisibility(View.GONE);
            ll_highlighter.setVisibility(View.GONE);
            ll_brows.setVisibility(View.GONE);
            ll_eyeliner.setVisibility(View.GONE);
            ll_eyeshadow.setVisibility(View.GONE);
            ll_mascara.setVisibility(View.GONE);
            ll_lipliner.setVisibility(View.GONE);
            ll_lipstick.setVisibility(View.GONE);
            ll_lipbalm_oil.setVisibility(View.GONE);
            ll_multi_palette.setVisibility(View.GONE);
            ll_finishing_spray.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnLipbalmoilClick(View v) {
        if (ll_lipbalm_oil.getVisibility() == View.VISIBLE) {
            ll_lipbalm_oil.setVisibility(View.GONE);
        } else {
            ll_lipbalm_oil.setVisibility(View.VISIBLE);

            ll_primer.setVisibility(View.GONE);
            ll_blush.setVisibility(View.GONE);
            ll_concealer.setVisibility(View.GONE);
            ll_foundation.setVisibility(View.GONE);
            ll_contour.setVisibility(View.GONE);
            ll_setting_powder.setVisibility(View.GONE);
            ll_highlighter.setVisibility(View.GONE);
            ll_brows.setVisibility(View.GONE);
            ll_eyeliner.setVisibility(View.GONE);
            ll_eyeshadow.setVisibility(View.GONE);
            ll_mascara.setVisibility(View.GONE);
            ll_lipliner.setVisibility(View.GONE);
            ll_lipstick.setVisibility(View.GONE);
            ll_lipgloss.setVisibility(View.GONE);
            ll_multi_palette.setVisibility(View.GONE);
            ll_finishing_spray.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnMultipaletteClick(View v) {
        if (ll_multi_palette.getVisibility() == View.VISIBLE) {
            ll_multi_palette.setVisibility(View.GONE);
        } else {
            ll_multi_palette.setVisibility(View.VISIBLE);

            ll_primer.setVisibility(View.GONE);
            ll_blush.setVisibility(View.GONE);
            ll_concealer.setVisibility(View.GONE);
            ll_foundation.setVisibility(View.GONE);
            ll_contour.setVisibility(View.GONE);
            ll_setting_powder.setVisibility(View.GONE);
            ll_highlighter.setVisibility(View.GONE);
            ll_brows.setVisibility(View.GONE);
            ll_eyeliner.setVisibility(View.GONE);
            ll_eyeshadow.setVisibility(View.GONE);
            ll_mascara.setVisibility(View.GONE);
            ll_lipliner.setVisibility(View.GONE);
            ll_lipstick.setVisibility(View.GONE);
            ll_lipgloss.setVisibility(View.GONE);
            ll_lipbalm_oil.setVisibility(View.GONE);
            ll_finishing_spray.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnFinishingsprayClick(View v) {
        if (ll_finishing_spray.getVisibility() == View.VISIBLE) {
            ll_finishing_spray.setVisibility(View.GONE);
        } else {
            ll_finishing_spray.setVisibility(View.VISIBLE);

            ll_primer.setVisibility(View.GONE);
            ll_blush.setVisibility(View.GONE);
            ll_concealer.setVisibility(View.GONE);
            ll_foundation.setVisibility(View.GONE);
            ll_contour.setVisibility(View.GONE);
            ll_setting_powder.setVisibility(View.GONE);
            ll_highlighter.setVisibility(View.GONE);
            ll_brows.setVisibility(View.GONE);
            ll_eyeliner.setVisibility(View.GONE);
            ll_eyeshadow.setVisibility(View.GONE);
            ll_mascara.setVisibility(View.GONE);
            ll_lipliner.setVisibility(View.GONE);
            ll_lipstick.setVisibility(View.GONE);
            ll_lipgloss.setVisibility(View.GONE);
            ll_lipbalm_oil.setVisibility(View.GONE);
            ll_multi_palette.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnAccessoriesClick(View v) {
        if (ll_accessories.getVisibility() == View.VISIBLE) {
            ll_accessories.setVisibility(View.GONE);
        } else {
            ll_accessories.setVisibility(View.VISIBLE);

            ll_primer.setVisibility(View.GONE);
            ll_blush.setVisibility(View.GONE);
            ll_concealer.setVisibility(View.GONE);
            ll_foundation.setVisibility(View.GONE);
            ll_contour.setVisibility(View.GONE);
            ll_setting_powder.setVisibility(View.GONE);
            ll_highlighter.setVisibility(View.GONE);
            ll_brows.setVisibility(View.GONE);
            ll_eyeliner.setVisibility(View.GONE);
            ll_eyeshadow.setVisibility(View.GONE);
            ll_mascara.setVisibility(View.GONE);
            ll_lipliner.setVisibility(View.GONE);
            ll_lipstick.setVisibility(View.GONE);
            ll_lipgloss.setVisibility(View.GONE);
            ll_lipbalm_oil.setVisibility(View.GONE);
            ll_multi_palette.setVisibility(View.GONE);
            ll_finishing_spray.setVisibility(View.GONE);
        }
    }
}