package p204p;

import android.app.Activity;
import android.text.SpannableString;
import android.text.style.BulletSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes.dex */
public final class qcv0 {

    /* JADX INFO: renamed from: a */
    public final Activity f187409a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f187410b;

    /* JADX INFO: renamed from: c */
    public final kv91 f187411c;

    /* JADX INFO: renamed from: d */
    public final vfm f187412d;

    /* JADX INFO: renamed from: e */
    public final ofm0 f187413e;

    /* JADX INFO: renamed from: f */
    public final int f187414f;

    /* JADX INFO: renamed from: g */
    public final bbg0 f187415g = ig31.m50475E();

    /* JADX INFO: renamed from: h */
    public final wg61 f187416h = new wg61(l3b0.f129263Q0);

    public qcv0(Activity activity, z9j0 z9j0Var, kv91 kv91Var, vfm vfmVar, ofm0 ofm0Var, int i) {
        this.f187409a = activity;
        this.f187410b = z9j0Var;
        this.f187411c = kv91Var;
        this.f187412d = vfmVar;
        this.f187413e = ofm0Var;
        this.f187414f = i;
    }

    /* JADX INFO: renamed from: a */
    public final EncoreTextView m72567a(int i) {
        EncoreTextView encoreTextView = new EncoreTextView(this.f187409a, null, 0, 6, null);
        encoreTextView.setTextAppearance(R.style.TextAppearance_Encore_BodySmall);
        encoreTextView.setTextColor(vtg1.m86387n(encoreTextView, R.attr.baseTextSubdued));
        int dimensionPixelSize = encoreTextView.getContext().getResources().getDimensionPixelSize(R.dimen.bulletpoint_gap_width);
        BulletSpan bulletSpan = new BulletSpan(dimensionPixelSize);
        SpannableString spannableString = new SpannableString(encoreTextView.getContext().getString(i));
        spannableString.setSpan(bulletSpan, 0, spannableString.length(), 33);
        encoreTextView.setText(spannableString);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = encoreTextView.getContext().getResources().getDimensionPixelSize(R.dimen.bulletpoint_top_margin);
        marginLayoutParams.setMarginStart(dimensionPixelSize);
        encoreTextView.setLayoutParams(marginLayoutParams);
        return encoreTextView;
    }

    /* JADX INFO: renamed from: b */
    public final EncoreTextView m72568b(int i) {
        EncoreTextView encoreTextView = new EncoreTextView(this.f187409a, null, 0, 6, null);
        encoreTextView.setTextAppearance(R.style.TextAppearance_Encore_BodyMediumBold);
        encoreTextView.setTextColor(vtg1.m86387n(encoreTextView, R.attr.baseTextBase));
        encoreTextView.setText(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = encoreTextView.getContext().getResources().getDimensionPixelSize(R.dimen.section_top_margin);
        encoreTextView.setLayoutParams(marginLayoutParams);
        return encoreTextView;
    }

    /* JADX INFO: renamed from: c */
    public final EncoreTextView m72569c() {
        EncoreTextView encoreTextView = new EncoreTextView(this.f187409a, null, 0, 6, null);
        encoreTextView.setTextAppearance(R.style.TextAppearance_Encore_BodySmall);
        encoreTextView.setTextColor(vtg1.m86387n(encoreTextView, R.attr.baseTextBase));
        encoreTextView.setText(R.string.recommendations_disabled_upsell_sheet_turnon_note);
        encoreTextView.setGravity(1);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = encoreTextView.getContext().getResources().getDimensionPixelSize(R.dimen.note_top_margin);
        encoreTextView.setLayoutParams(marginLayoutParams);
        return encoreTextView;
    }

    /* JADX INFO: renamed from: d */
    public final void m72570d() {
        voc1 voc1Var;
        q040 q040Var = (q040) this.f187413e.mo15684j0(q040.class).mo31538a();
        String str = (q040Var == null || (voc1Var = q040Var.f183902b) == null) ? null : voc1Var.f243453a;
        wba wbaVar = new wba(this.f187409a, R.style.DisableRecommendationsBottomSheetTheme);
        Window window = wbaVar.getWindow();
        if (window != null) {
            ds4.m36746a(window);
            new gc41(window, window.getDecorView()).m44292h(false);
        }
        wbaVar.setContentView(R.layout.recommendations_disabled_bottomsheet_content);
        View viewFindViewById = wbaVar.findViewById(R.id.bottom_sheet_content);
        if (viewFindViewById != null) {
            p3h1.m69032r(viewFindViewById, oxr0.f171504M0);
        }
        wbaVar.m87626g().m1576J(wbaVar.getContext().getResources().getDisplayMetrics().heightPixels);
        wbaVar.m87626g().m1578L(3);
        wbaVar.setOnCancelListener(new fic(this, 6));
        View viewFindViewById2 = wbaVar.findViewById(R.id.settings_button);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new lt7(this, str, wbaVar, 11));
        }
        LinearLayout linearLayout = (LinearLayout) wbaVar.findViewById(R.id.argument_container);
        View viewFindViewById3 = wbaVar.findViewById(R.id.subtitle);
        if (this.f187414f == 2) {
            if (viewFindViewById3 != null) {
                viewFindViewById3.setVisibility(0);
            }
            if (linearLayout != null) {
                linearLayout.addView(m72568b(R.string.recommendations_disabled_upsell_sheet_youremissingouton_title));
                linearLayout.addView(m72567a(R.string.disable_recommendations_sheet_youwillmissout_text_1));
                linearLayout.addView(m72567a(R.string.disable_recommendations_sheet_youwillmissout_text_2));
                linearLayout.addView(m72567a(R.string.disable_recommendations_sheet_youwillmissout_text_3));
                linearLayout.addView(m72568b(R.string.recommendations_disabled_upsell_sheet_yourestillgetting_title));
                linearLayout.addView(m72567a(R.string.disable_recommendations_sheet_youwillstillget_text_1));
                linearLayout.addView(m72569c());
            }
        } else {
            if (viewFindViewById3 != null) {
                viewFindViewById3.setVisibility(8);
            }
            if (linearLayout != null) {
                linearLayout.addView(m72568b(R.string.recommendations_disabled_upsell_sheet_yourenotgetting_title));
                linearLayout.addView(m72567a(R.string.recommendations_disabled_upsell_sheet_yourenotgetting_text_1));
                linearLayout.addView(m72567a(R.string.recommendations_disabled_upsell_sheet_yourenotgetting_text_2));
                linearLayout.addView(m72567a(R.string.recommendations_disabled_upsell_sheet_yourenotgetting_text_3));
                linearLayout.addView(m72568b(R.string.recommendations_disabled_upsell_sheet_yourestillgetting_title));
                linearLayout.addView(m72567a(R.string.recommendations_disabled_upsell_sheet_yourestillgetting_text_1));
                linearLayout.addView(m72569c());
            }
        }
        wbaVar.show();
    }
}
