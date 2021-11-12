package app.beautyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class BodyCare extends AppCompatActivity {
    public static final String BODY_CARE_PRODUCT_TYPE_TEXT = "app.beautyapplication.BODY_CARE_PRODUCT_TYPE_TEXT";
    LinearLayout ll_bodywash, ll_body_lotion, ll_body_oil, ll_body_scrub, ll_bath_bomb, ll_feminine_Care, ll_deodorant, ll_perfume, ll_accessories;

    Button btnAddBodyWash, btnAddBodyLotion, btnAddBodyOil, btnAddBodyScrub, btnAddBathBomb, btnAddFeminineCare, btnAddDeodorant, btnAddPerfume, btnAddAccessories;

    Button btnViewBodyWash, btnViewBodyLotion, btnViewBodyOil, btnViewBodyScrub, btnViewBathBomb, btnViewFemininCare, btnViewDeodorant, btnViewPerfume, btnViewAccessories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_care);

        LLSetup();
        AddButtonsSetup();
        ViewButtonsSetup();

        btnAddBodyWash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BodyCare.this, Add_Product.class);
                intent.putExtra(BODY_CARE_PRODUCT_TYPE_TEXT, "Body Wash");
                startActivity(intent);
            }
        });
        btnAddBodyLotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BodyCare.this, Add_Product.class);
                intent.putExtra(BODY_CARE_PRODUCT_TYPE_TEXT, "Body Lotion");
                startActivity(intent);
            }
        });
        btnAddBodyOil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BodyCare.this, Add_Product.class);
                intent.putExtra(BODY_CARE_PRODUCT_TYPE_TEXT, "Body Oil");
                startActivity(intent);
            }
        });
        btnAddBodyScrub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BodyCare.this, Add_Product.class);
                intent.putExtra(BODY_CARE_PRODUCT_TYPE_TEXT, "Body Scrub");
                startActivity(intent);
            }
        });
        btnAddBathBomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BodyCare.this, Add_Product.class);
                intent.putExtra(BODY_CARE_PRODUCT_TYPE_TEXT, "Bath Bomb");
                startActivity(intent);
            }
        });
        btnAddFeminineCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BodyCare.this, Add_Product.class);
                intent.putExtra(BODY_CARE_PRODUCT_TYPE_TEXT, "Feminine Care");
                startActivity(intent);
            }
        });
        btnAddDeodorant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BodyCare.this, Add_Product.class);
                intent.putExtra(BODY_CARE_PRODUCT_TYPE_TEXT, "Deodorant");
                startActivity(intent);
            }
        });
        btnAddPerfume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BodyCare.this, Add_Product.class);
                intent.putExtra(BODY_CARE_PRODUCT_TYPE_TEXT, "Perfume");
                startActivity(intent);
            }
        });
        btnAddAccessories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BodyCare.this, Add_Product.class);
                intent.putExtra(BODY_CARE_PRODUCT_TYPE_TEXT, "Body Care Accessories");
                startActivity(intent);
            }
        });

        btnViewBodyWash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BodyCare.this, View_Products.class);
                intent.putExtra(BODY_CARE_PRODUCT_TYPE_TEXT, "Body Wash");
                startActivity(intent);
            }
        });
        btnViewBodyLotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BodyCare.this, View_Products.class);
                intent.putExtra(BODY_CARE_PRODUCT_TYPE_TEXT, "Body Lotion");
                startActivity(intent);
            }
        });
        btnViewBodyOil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BodyCare.this, View_Products.class);
                intent.putExtra(BODY_CARE_PRODUCT_TYPE_TEXT, "Body Oil");
                startActivity(intent);
            }
        });
        btnViewBodyScrub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BodyCare.this, View_Products.class);
                intent.putExtra(BODY_CARE_PRODUCT_TYPE_TEXT, "Body Scrub");
                startActivity(intent);
            }
        });
        btnViewBathBomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BodyCare.this, View_Products.class);
                intent.putExtra(BODY_CARE_PRODUCT_TYPE_TEXT, "Bath Bomb");
                startActivity(intent);
            }
        });
        btnViewFemininCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BodyCare.this, View_Products.class);
                intent.putExtra(BODY_CARE_PRODUCT_TYPE_TEXT, "Feminine Care");
                startActivity(intent);
            }
        });
        btnViewDeodorant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BodyCare.this, View_Products.class);
                intent.putExtra(BODY_CARE_PRODUCT_TYPE_TEXT, "Deodorant");
                startActivity(intent);
            }
        });
        btnViewPerfume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BodyCare.this, View_Products.class);
                intent.putExtra(BODY_CARE_PRODUCT_TYPE_TEXT, "Perfume");
                startActivity(intent);
            }
        });

        btnViewAccessories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BodyCare.this, View_Products.class);
                intent.putExtra(BODY_CARE_PRODUCT_TYPE_TEXT, "Body Care Accessories");
                startActivity(intent);
            }
        });
    }

    void LLSetup() {
        ll_bodywash = findViewById(R.id.ll_bodywash);
        ll_body_lotion = findViewById(R.id.ll_body_lotion);
        ll_body_oil = findViewById(R.id.ll_body_oil);
        ll_body_scrub = findViewById(R.id.ll_body_scrub);
        ll_bath_bomb = findViewById(R.id.ll_bath_bomb);
        ll_feminine_Care = findViewById(R.id.ll_feminine_Care);
        ll_deodorant = findViewById(R.id.ll_deodorant);
        ll_perfume = findViewById(R.id.ll_perfume);
        ll_accessories = findViewById(R.id.ll_accessories);
    }

    void AddButtonsSetup() {
        btnAddBodyWash = findViewById(R.id.btnAddBodyWash);
        btnAddBodyLotion = findViewById(R.id.btnAddBodyLotion);
        btnAddBodyOil = findViewById(R.id.btnAddBodyOil);
        btnAddBodyScrub = findViewById(R.id.btnAddBodyScrub);
        btnAddBathBomb = findViewById(R.id.btnAddBathBomb);
        btnAddFeminineCare = findViewById(R.id.btnAddFeminineCare);
        btnAddDeodorant = findViewById(R.id.btnAddDeodorant);
        btnAddPerfume = findViewById(R.id.btnAddPerfume);
        btnAddAccessories = findViewById(R.id.btnAddAccessories);
    }

    void ViewButtonsSetup() {
        btnViewBodyWash = findViewById(R.id.btnViewBodyWash);
        btnViewBodyLotion = findViewById(R.id.btnViewBodyLotion);
        btnViewBodyOil = findViewById(R.id.btnViewBodyOil);
        btnViewBodyScrub = findViewById(R.id.btnViewBodyScrub);
        btnViewBathBomb = findViewById(R.id.btnViewBathBomb);
        btnViewFemininCare = findViewById(R.id.btnViewFemininCare);
        btnViewDeodorant = findViewById(R.id.btnViewDeodorant);
        btnViewPerfume = findViewById(R.id.btnViewPerfume);
        btnViewAccessories = findViewById(R.id.btnViewAccessories);
    }

    public void OnBodyWashClick(View v) {
        if (ll_bodywash.getVisibility() == View.VISIBLE) {
            ll_bodywash.setVisibility(View.GONE);
        } else {
            ll_bodywash.setVisibility(View.VISIBLE);

            ll_body_lotion.setVisibility(View.GONE);
            ll_body_oil.setVisibility(View.GONE);
            ll_body_scrub.setVisibility(View.GONE);
            ll_bath_bomb.setVisibility(View.GONE);
            ll_feminine_Care.setVisibility(View.GONE);
            ll_deodorant.setVisibility(View.GONE);
            ll_perfume.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnBodyLotionClick(View v) {
        if (ll_body_lotion.getVisibility() == View.VISIBLE) {
            ll_body_lotion.setVisibility(View.GONE);
        } else {
            ll_body_lotion.setVisibility(View.VISIBLE);

            ll_bodywash.setVisibility(View.GONE);
            ll_body_oil.setVisibility(View.GONE);
            ll_body_scrub.setVisibility(View.GONE);
            ll_bath_bomb.setVisibility(View.GONE);
            ll_feminine_Care.setVisibility(View.GONE);
            ll_deodorant.setVisibility(View.GONE);
            ll_perfume.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnBodyOilClick(View v) {
        if (ll_body_oil.getVisibility() == View.VISIBLE) {
            ll_body_oil.setVisibility(View.GONE);
        } else {
            ll_body_oil.setVisibility(View.VISIBLE);

            ll_bodywash.setVisibility(View.GONE);
            ll_body_lotion.setVisibility(View.GONE);
            ll_body_scrub.setVisibility(View.GONE);
            ll_bath_bomb.setVisibility(View.GONE);
            ll_feminine_Care.setVisibility(View.GONE);
            ll_deodorant.setVisibility(View.GONE);
            ll_perfume.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnBodyScrubClick(View v) {
        if (ll_body_scrub.getVisibility() == View.VISIBLE) {
            ll_body_scrub.setVisibility(View.GONE);
        } else {
            ll_body_scrub.setVisibility(View.VISIBLE);

            ll_bodywash.setVisibility(View.GONE);
            ll_body_lotion.setVisibility(View.GONE);
            ll_body_oil.setVisibility(View.GONE);
            ll_bath_bomb.setVisibility(View.GONE);
            ll_feminine_Care.setVisibility(View.GONE);
            ll_deodorant.setVisibility(View.GONE);
            ll_perfume.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnBathBombClick(View v) {
        if (ll_bath_bomb.getVisibility() == View.VISIBLE) {
            ll_bath_bomb.setVisibility(View.GONE);
        } else {
            ll_bath_bomb.setVisibility(View.VISIBLE);

            ll_bodywash.setVisibility(View.GONE);
            ll_body_lotion.setVisibility(View.GONE);
            ll_body_oil.setVisibility(View.GONE);
            ll_body_scrub.setVisibility(View.GONE);
            ll_feminine_Care.setVisibility(View.GONE);
            ll_deodorant.setVisibility(View.GONE);
            ll_perfume.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnFeminineCareClick(View v) {
        if (ll_feminine_Care.getVisibility() == View.VISIBLE) {
            ll_feminine_Care.setVisibility(View.GONE);
        } else {
            ll_feminine_Care.setVisibility(View.VISIBLE);

            ll_bodywash.setVisibility(View.GONE);
            ll_body_lotion.setVisibility(View.GONE);
            ll_body_oil.setVisibility(View.GONE);
            ll_body_scrub.setVisibility(View.GONE);
            ll_bath_bomb.setVisibility(View.GONE);
            ll_deodorant.setVisibility(View.GONE);
            ll_perfume.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnDeodorantClick(View v) {
        if (ll_deodorant.getVisibility() == View.VISIBLE) {
            ll_deodorant.setVisibility(View.GONE);
        } else {
            ll_deodorant.setVisibility(View.VISIBLE);

            ll_bodywash.setVisibility(View.GONE);
            ll_body_lotion.setVisibility(View.GONE);
            ll_body_oil.setVisibility(View.GONE);
            ll_body_scrub.setVisibility(View.GONE);
            ll_bath_bomb.setVisibility(View.GONE);
            ll_feminine_Care.setVisibility(View.GONE);
            ll_perfume.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }

    public void OnPerfumeClick(View v) {
        if (ll_perfume.getVisibility() == View.VISIBLE) {
            ll_perfume.setVisibility(View.GONE);
        } else {
            ll_perfume.setVisibility(View.VISIBLE);

            ll_bodywash.setVisibility(View.GONE);
            ll_body_lotion.setVisibility(View.GONE);
            ll_body_oil.setVisibility(View.GONE);
            ll_body_scrub.setVisibility(View.GONE);
            ll_bath_bomb.setVisibility(View.GONE);
            ll_feminine_Care.setVisibility(View.GONE);
            ll_deodorant.setVisibility(View.GONE);
            ll_accessories.setVisibility(View.GONE);
        }
    }


    public void OnAccessoriesClick(View v) {
        if (ll_accessories.getVisibility() == View.VISIBLE) {
            ll_accessories.setVisibility(View.GONE);
        } else {
            ll_accessories.setVisibility(View.VISIBLE);

            ll_bodywash.setVisibility(View.GONE);
            ll_body_lotion.setVisibility(View.GONE);
            ll_body_oil.setVisibility(View.GONE);
            ll_body_scrub.setVisibility(View.GONE);
            ll_bath_bomb.setVisibility(View.GONE);
            ll_feminine_Care.setVisibility(View.GONE);
            ll_deodorant.setVisibility(View.GONE);
            ll_perfume.setVisibility(View.GONE);
        }
    }
}