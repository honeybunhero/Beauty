package app.beautyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class SkinCare extends AppCompatActivity {

    public static final String SKIN_CARE_PRODUCT_TYPE_TEXT = "app.beautyapplication.SKIN_CARE_PRODUCT_TYPE_TEXT";

    LinearLayout ll_cleanser, ll_exfoliators, ll_wash_off_masks, ll_sheet_masks, ll_toners, ll_essences, ll_serums, ll_oils, ll_eyes_care, ll_moisturizer,
            ll_face_wipes, ll_lip_scrubs, ll_nail_care, ll_accessories;

    Button btnAddCleanser, btnAddExfoliators, btnAddWashOffMasks, btnAddSheet_masks, btnAddToners, btnAddEssences, btnAddSerums, btnAddOils, btnAddEyes_care,
            btnAddMoisturizer, btnAddFaceWipes, btnAddLipScrubs, btnAddNailCare, btnAddAccessories;

    Button btnRemoveCleanser, btnRemoveExfoliators, btnRemoveWashOffMasks, btnRemoveSheet_masks, btnRemoveToners, btnRemoveEssences, btnRemoveSerums, btnRemoveOils, btnRemoveEyes_care,
            btnRemoveMoisturizer, btnRemoveFaceWipes, btnRemoveLipScrubs, btnRemoveNailCare, btnRemoveAccessories;

    Button btnViewCleanser, btnViewExfoliators, btnViewWashOffMasks, btnViewSheet_masks, btnViewToners, btnViewEssences, btnViewSerums, btnViewOils, btnViewEyes_care,
            btnViewMoisturizer, btnViewFaceWipes, btnViewLipScrubs, btnViewNailCare, btnViewAccessories;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_care);

        LLSetup();
        AddButtonsSetup();
        RemoveButtonsSetup();
        ViewButtonsSetup();

        btnAddCleanser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(SkinCare.this, "Adding stuff in cleanser", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SkinCare.this, Add_Product.class);
                intent.putExtra(SKIN_CARE_PRODUCT_TYPE_TEXT, "Cleanser");
                startActivity(intent);
            }
        });
        btnAddExfoliators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Adding stuff in exfoliators", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddWashOffMasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Adding stuff in wash off masks", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddSheet_masks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Adding stuff in sheet masks", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddToners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Adding stuff in toners", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddEssences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Adding stuff in essences", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddSerums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Adding stuff in serums", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddOils.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Adding stuff in oils", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddEyes_care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Adding stuff in eye care", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddMoisturizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Adding stuff in moisturizer", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddFaceWipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Adding stuff in face wipes", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddLipScrubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Adding stuff in lip scrubs", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddNailCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Adding stuff in nail care", Toast.LENGTH_SHORT).show();
            }
        });
        btnAddAccessories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Adding stuff in accessories", Toast.LENGTH_SHORT).show();
            }
        });


        btnRemoveCleanser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Removing stuff in cleanser", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveExfoliators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Removing stuff in exfoliators", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveWashOffMasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Removing stuff in wash off masks", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveSheet_masks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Removing stuff in sheet masks", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveToners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Removing stuff in toners", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveEssences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Removing stuff in eessences", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveSerums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Removing stuff in serums", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveOils.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Removing stuff in oils", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveEyes_care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Removing stuff in eye care", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveMoisturizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Removing stuff in moisturizer", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveFaceWipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Removing stuff in face wipes", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveLipScrubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Removing stuff in lip scrubs", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveNailCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Removing stuff in nail care", Toast.LENGTH_SHORT).show();
            }
        });
        btnRemoveAccessories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "Removing stuff in accessories", Toast.LENGTH_SHORT).show();
            }
        });

        btnViewCleanser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "View stuff in cleanser", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewExfoliators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "View stuff in exfoliators", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewWashOffMasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "View stuff in wash off masks", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewSheet_masks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "View stuff in sheet masks", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewToners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "View stuff in toners", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewEssences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "View stuff in essences", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewSerums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "View stuff in serums", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewOils.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "View stuff in oils", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewEyes_care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "View stuff in eye care", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewMoisturizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "View stuff in moisturizer", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewFaceWipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "View stuff in face wipes", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewLipScrubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "View stuff in lip scrubs", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewNailCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "View stuff in nail care", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewAccessories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SkinCare.this, "View stuff in accessories", Toast.LENGTH_SHORT).show();
            }
        });

    }

    void ViewButtonsSetup() {
        btnViewCleanser = findViewById(R.id.btnViewCleanser);
        btnViewExfoliators = findViewById(R.id.btnViewExfoliators);
        btnViewWashOffMasks = findViewById(R.id.btnViewWashOffMasks);
        btnViewSheet_masks = findViewById(R.id.btnViewSheet_masks);
        btnViewToners = findViewById(R.id.btnViewToners);
        btnViewEssences = findViewById(R.id.btnViewEssences);
        btnViewSerums = findViewById(R.id.btnViewSerums);
        btnViewOils = findViewById(R.id.btnViewOils);
        btnViewEyes_care = findViewById(R.id.btnViewEyes_care);
        btnViewMoisturizer = findViewById(R.id.btnViewMoisturizer);
        btnViewFaceWipes = findViewById(R.id.btnViewFaceWipes);
        btnViewLipScrubs = findViewById(R.id.btnViewLipScrubs);
        btnViewNailCare = findViewById(R.id.btnViewNailCare);
        btnViewAccessories = findViewById(R.id.btnViewAccessories);
    }

    void RemoveButtonsSetup() {
        btnRemoveCleanser = findViewById(R.id.btnRemoveCleanser);
        btnRemoveExfoliators = findViewById(R.id.btnRemoveExfoliators);
        btnRemoveWashOffMasks = findViewById(R.id.btnRemoveWashOffMasks);
        btnRemoveSheet_masks = findViewById(R.id.btnRemoveSheet_masks);
        btnRemoveToners = findViewById(R.id.btnRemoveToners);
        btnRemoveEssences = findViewById(R.id.btnRemoveEssences);
        btnRemoveSerums = findViewById(R.id.btnRemoveSerums);
        btnRemoveOils = findViewById(R.id.btnRemoveOils);
        btnRemoveEyes_care = findViewById(R.id.btnRemoveEyes_care);
        btnRemoveMoisturizer = findViewById(R.id.btnRemoveMoisturizer);
        btnRemoveFaceWipes = findViewById(R.id.btnRemoveFaceWipes);
        btnRemoveLipScrubs = findViewById(R.id.btnRemoveLipScrubs);
        btnRemoveNailCare = findViewById(R.id.btnRemoveNailCare);
        btnRemoveAccessories = findViewById(R.id.btnRemoveAccessories);
    }

    void AddButtonsSetup() {
        btnAddCleanser = findViewById(R.id.btnAddCleanser);
        btnAddExfoliators = findViewById(R.id.btnAddExfoliators);
        btnAddWashOffMasks = findViewById(R.id.btnAddWashOffMasks);
        btnAddSheet_masks = findViewById(R.id.btnAddSheet_masks);
        btnAddToners = findViewById(R.id.btnAddToners);
        btnAddEssences = findViewById(R.id.btnAddEssences);
        btnAddSerums = findViewById(R.id.btnAddSerums);
        btnAddOils = findViewById(R.id.btnAddOils);
        btnAddEyes_care = findViewById(R.id.btnAddEyes_care);
        btnAddMoisturizer = findViewById(R.id.btnAddMoisturizer);
        btnAddFaceWipes = findViewById(R.id.btnAddFaceWipes);
        btnAddLipScrubs = findViewById(R.id.btnAddLipScrubs);
        btnAddNailCare = findViewById(R.id.btnAddNailCare);
        btnAddAccessories = findViewById(R.id.btnAddAccessories);
    }

    void LLSetup() {
        ll_cleanser = findViewById(R.id.ll_cleanser);
        ll_exfoliators = findViewById(R.id.ll_exfoliators);
        ll_wash_off_masks = findViewById(R.id.ll_wash_off_masks);
        ll_sheet_masks = findViewById(R.id.ll_sheet_masks);
        ll_toners = findViewById(R.id.ll_toners);
        ll_essences = findViewById(R.id.ll_essences);
        ll_serums = findViewById(R.id.ll_serums);
        ll_oils = findViewById(R.id.ll_oils);
        ll_eyes_care = findViewById(R.id.ll_eyes_care);
        ll_moisturizer = findViewById(R.id.ll_moisturizer);
        ll_face_wipes = findViewById(R.id.ll_face_wipes);
        ll_lip_scrubs = findViewById(R.id.ll_lip_scrubs);
        ll_nail_care = findViewById(R.id.ll_nail_care);
        ll_accessories = findViewById(R.id.ll_accessories);
    }

    public void OnCleanserClick(View v) {
        if (ll_cleanser.getVisibility() == View.VISIBLE) {
            ll_cleanser.setVisibility(View.GONE);
        } else {
            ll_cleanser.setVisibility(View.VISIBLE);
            ll_exfoliators.setVisibility(View.GONE);
            ll_wash_off_masks.setVisibility(View.GONE);
            ll_sheet_masks.setVisibility(View.GONE);
            ll_toners.setVisibility(View.GONE);
            ll_essences.setVisibility(View.GONE);
            ll_serums.setVisibility(View.GONE);
            ll_oils.setVisibility(View.GONE);
            ll_eyes_care.setVisibility(View.GONE);
            ll_moisturizer.setVisibility(View.GONE);
            ll_face_wipes.setVisibility(View.GONE);
            ll_lip_scrubs.setVisibility(View.GONE);
            ll_nail_care.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnExfoliatorsClick(View v) {
        if (ll_exfoliators.getVisibility() == View.VISIBLE) {
            ll_exfoliators.setVisibility(View.GONE);
        } else {
            ll_cleanser.setVisibility(View.GONE);
            ll_exfoliators.setVisibility(View.VISIBLE);
            ll_wash_off_masks.setVisibility(View.GONE);
            ll_sheet_masks.setVisibility(View.GONE);
            ll_toners.setVisibility(View.GONE);
            ll_essences.setVisibility(View.GONE);
            ll_serums.setVisibility(View.GONE);
            ll_oils.setVisibility(View.GONE);
            ll_eyes_care.setVisibility(View.GONE);
            ll_moisturizer.setVisibility(View.GONE);
            ll_face_wipes.setVisibility(View.GONE);
            ll_lip_scrubs.setVisibility(View.GONE);
            ll_nail_care.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnWashOffMaskClick(View v) {
        if (ll_wash_off_masks.getVisibility() == View.VISIBLE) {
            ll_wash_off_masks.setVisibility(View.GONE);
        } else {
            ll_cleanser.setVisibility(View.GONE);
            ll_exfoliators.setVisibility(View.GONE);
            ll_wash_off_masks.setVisibility(View.VISIBLE);
            ll_sheet_masks.setVisibility(View.GONE);
            ll_toners.setVisibility(View.GONE);
            ll_essences.setVisibility(View.GONE);
            ll_serums.setVisibility(View.GONE);
            ll_oils.setVisibility(View.GONE);
            ll_eyes_care.setVisibility(View.GONE);
            ll_moisturizer.setVisibility(View.GONE);
            ll_face_wipes.setVisibility(View.GONE);
            ll_lip_scrubs.setVisibility(View.GONE);
            ll_nail_care.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnSheetMaskClick(View v) {
        if (ll_sheet_masks.getVisibility() == View.VISIBLE) {
            ll_sheet_masks.setVisibility(View.GONE);
        } else {
            ll_cleanser.setVisibility(View.GONE);
            ll_exfoliators.setVisibility(View.GONE);
            ll_wash_off_masks.setVisibility(View.GONE);
            ll_sheet_masks.setVisibility(View.VISIBLE);
            ll_toners.setVisibility(View.GONE);
            ll_essences.setVisibility(View.GONE);
            ll_serums.setVisibility(View.GONE);
            ll_oils.setVisibility(View.GONE);
            ll_eyes_care.setVisibility(View.GONE);
            ll_moisturizer.setVisibility(View.GONE);
            ll_face_wipes.setVisibility(View.GONE);
            ll_lip_scrubs.setVisibility(View.GONE);
            ll_nail_care.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnTonerClick(View v) {
        if (ll_toners.getVisibility() == View.VISIBLE) {
            ll_toners.setVisibility(View.GONE);
        } else {
            ll_cleanser.setVisibility(View.GONE);
            ll_exfoliators.setVisibility(View.GONE);
            ll_wash_off_masks.setVisibility(View.GONE);
            ll_sheet_masks.setVisibility(View.GONE);
            ll_toners.setVisibility(View.VISIBLE);
            ll_essences.setVisibility(View.GONE);
            ll_serums.setVisibility(View.GONE);
            ll_oils.setVisibility(View.GONE);
            ll_eyes_care.setVisibility(View.GONE);
            ll_moisturizer.setVisibility(View.GONE);
            ll_face_wipes.setVisibility(View.GONE);
            ll_lip_scrubs.setVisibility(View.GONE);
            ll_nail_care.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnEssencesClick(View v) {
        if (ll_essences.getVisibility() == View.VISIBLE) {
            ll_essences.setVisibility(View.GONE);
        } else {
            ll_cleanser.setVisibility(View.GONE);
            ll_exfoliators.setVisibility(View.GONE);
            ll_wash_off_masks.setVisibility(View.GONE);
            ll_sheet_masks.setVisibility(View.GONE);
            ll_toners.setVisibility(View.GONE);
            ll_essences.setVisibility(View.VISIBLE);
            ll_serums.setVisibility(View.GONE);
            ll_oils.setVisibility(View.GONE);
            ll_eyes_care.setVisibility(View.GONE);
            ll_moisturizer.setVisibility(View.GONE);
            ll_face_wipes.setVisibility(View.GONE);
            ll_lip_scrubs.setVisibility(View.GONE);
            ll_nail_care.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnSerumClick(View v) {
        if (ll_serums.getVisibility() == View.VISIBLE) {
            ll_serums.setVisibility(View.GONE);
        } else {
            ll_cleanser.setVisibility(View.GONE);
            ll_exfoliators.setVisibility(View.GONE);
            ll_wash_off_masks.setVisibility(View.GONE);
            ll_sheet_masks.setVisibility(View.GONE);
            ll_toners.setVisibility(View.GONE);
            ll_essences.setVisibility(View.GONE);
            ll_serums.setVisibility(View.VISIBLE);
            ll_oils.setVisibility(View.GONE);
            ll_eyes_care.setVisibility(View.GONE);
            ll_moisturizer.setVisibility(View.GONE);
            ll_face_wipes.setVisibility(View.GONE);
            ll_lip_scrubs.setVisibility(View.GONE);
            ll_nail_care.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnOilsClick(View v) {
        if (ll_oils.getVisibility() == View.VISIBLE) {
            ll_oils.setVisibility(View.GONE);
        } else {
            ll_cleanser.setVisibility(View.GONE);
            ll_exfoliators.setVisibility(View.GONE);
            ll_wash_off_masks.setVisibility(View.GONE);
            ll_sheet_masks.setVisibility(View.GONE);
            ll_toners.setVisibility(View.GONE);
            ll_essences.setVisibility(View.GONE);
            ll_serums.setVisibility(View.GONE);
            ll_oils.setVisibility(View.VISIBLE);
            ll_eyes_care.setVisibility(View.GONE);
            ll_moisturizer.setVisibility(View.GONE);
            ll_face_wipes.setVisibility(View.GONE);
            ll_lip_scrubs.setVisibility(View.GONE);
            ll_nail_care.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnEyeCareClick(View v) {
        if (ll_eyes_care.getVisibility() == View.VISIBLE) {
            ll_eyes_care.setVisibility(View.GONE);
        } else {
            ll_cleanser.setVisibility(View.GONE);
            ll_exfoliators.setVisibility(View.GONE);
            ll_wash_off_masks.setVisibility(View.GONE);
            ll_sheet_masks.setVisibility(View.GONE);
            ll_toners.setVisibility(View.GONE);
            ll_essences.setVisibility(View.GONE);
            ll_serums.setVisibility(View.GONE);
            ll_oils.setVisibility(View.GONE);
            ll_eyes_care.setVisibility(View.VISIBLE);
            ll_moisturizer.setVisibility(View.GONE);
            ll_face_wipes.setVisibility(View.GONE);
            ll_lip_scrubs.setVisibility(View.GONE);
            ll_nail_care.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnMoisturizerClick(View v) {
        if (ll_moisturizer.getVisibility() == View.VISIBLE) {
            ll_moisturizer.setVisibility(View.GONE);
        } else {
            ll_cleanser.setVisibility(View.GONE);
            ll_exfoliators.setVisibility(View.GONE);
            ll_wash_off_masks.setVisibility(View.GONE);
            ll_sheet_masks.setVisibility(View.GONE);
            ll_toners.setVisibility(View.GONE);
            ll_essences.setVisibility(View.GONE);
            ll_serums.setVisibility(View.GONE);
            ll_oils.setVisibility(View.GONE);
            ll_eyes_care.setVisibility(View.GONE);
            ll_moisturizer.setVisibility(View.VISIBLE);
            ll_face_wipes.setVisibility(View.GONE);
            ll_lip_scrubs.setVisibility(View.GONE);
            ll_nail_care.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnFaceWipesClick(View v) {
        if (ll_face_wipes.getVisibility() == View.VISIBLE) {
            ll_face_wipes.setVisibility(View.GONE);
        } else {
            ll_cleanser.setVisibility(View.GONE);
            ll_exfoliators.setVisibility(View.GONE);
            ll_wash_off_masks.setVisibility(View.GONE);
            ll_sheet_masks.setVisibility(View.GONE);
            ll_toners.setVisibility(View.GONE);
            ll_essences.setVisibility(View.GONE);
            ll_serums.setVisibility(View.GONE);
            ll_oils.setVisibility(View.GONE);
            ll_eyes_care.setVisibility(View.GONE);
            ll_moisturizer.setVisibility(View.GONE);
            ll_face_wipes.setVisibility(View.VISIBLE);
            ll_lip_scrubs.setVisibility(View.GONE);
            ll_nail_care.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnLipScrubsClick(View v) {
        if (ll_lip_scrubs.getVisibility() == View.VISIBLE) {
            ll_lip_scrubs.setVisibility(View.GONE);
        } else {
            ll_cleanser.setVisibility(View.GONE);
            ll_exfoliators.setVisibility(View.GONE);
            ll_wash_off_masks.setVisibility(View.GONE);
            ll_sheet_masks.setVisibility(View.GONE);
            ll_toners.setVisibility(View.GONE);
            ll_essences.setVisibility(View.GONE);
            ll_serums.setVisibility(View.GONE);
            ll_oils.setVisibility(View.GONE);
            ll_eyes_care.setVisibility(View.GONE);
            ll_moisturizer.setVisibility(View.GONE);
            ll_face_wipes.setVisibility(View.GONE);
            ll_lip_scrubs.setVisibility(View.VISIBLE);
            ll_nail_care.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnNailCareClick(View v) {
        if (ll_nail_care.getVisibility() == View.VISIBLE) {
            ll_nail_care.setVisibility(View.GONE);
        } else {
            ll_cleanser.setVisibility(View.GONE);
            ll_exfoliators.setVisibility(View.GONE);
            ll_wash_off_masks.setVisibility(View.GONE);
            ll_sheet_masks.setVisibility(View.GONE);
            ll_toners.setVisibility(View.GONE);
            ll_essences.setVisibility(View.GONE);
            ll_serums.setVisibility(View.GONE);
            ll_oils.setVisibility(View.GONE);
            ll_eyes_care.setVisibility(View.GONE);
            ll_moisturizer.setVisibility(View.GONE);
            ll_face_wipes.setVisibility(View.GONE);
            ll_lip_scrubs.setVisibility(View.GONE);
            ll_nail_care.setVisibility(View.VISIBLE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnAccessoriesClick(View v) {
        if (ll_accessories.getVisibility() == View.VISIBLE) {
            ll_accessories.setVisibility(View.GONE);
        } else {
            ll_cleanser.setVisibility(View.GONE);
            ll_exfoliators.setVisibility(View.GONE);
            ll_wash_off_masks.setVisibility(View.GONE);
            ll_sheet_masks.setVisibility(View.GONE);
            ll_toners.setVisibility(View.GONE);
            ll_essences.setVisibility(View.GONE);
            ll_serums.setVisibility(View.GONE);
            ll_oils.setVisibility(View.GONE);
            ll_eyes_care.setVisibility(View.GONE);
            ll_moisturizer.setVisibility(View.GONE);
            ll_face_wipes.setVisibility(View.GONE);
            ll_lip_scrubs.setVisibility(View.GONE);
            ll_nail_care.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.VISIBLE);
        }
    }

}