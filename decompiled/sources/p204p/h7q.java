package p204p;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.music.R;
import java.text.DateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public final class h7q implements ovf {

    /* JADX INFO: renamed from: a */
    public final x4k0 f88515a;

    public h7q(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.single_user_trial_card, (ViewGroup) null, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        this.f88515a = new x4k0((LinearLayout) viewInflate);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        x4k0 x4k0Var = this.f88515a;
        x4k0Var.f258142b.setOnClickListener(new v6q(9, gh00Var));
        LinearLayout linearLayout = x4k0Var.f258142b;
        ((Button) linearLayout.findViewById(R.id.primary_button)).setOnClickListener(new v6q(10, gh00Var));
        ((ConstraintLayout) linearLayout.findViewById(R.id.abt_entry_point)).setOnClickListener(new v6q(11, gh00Var));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        sh21 sh21Var = (sh21) obj;
        String str = sh21Var.f208989f;
        String str2 = DateFormat.getDateInstance(3).format(new Date(sh21Var.f208986c));
        x4k0 x4k0Var = this.f88515a;
        ((TextView) x4k0Var.f258142b.findViewById(R.id.title)).setText(sh21Var.f208984a);
        LinearLayout linearLayout = x4k0Var.f258142b;
        ((SpotifyIconView) linearLayout.findViewById(R.id.spotify_logo)).setColor(sh21Var.f208985b);
        ((TextView) linearLayout.findViewById(R.id.description)).setText(sh21Var.f208987d);
        String strM56834f = klh.m56834f(linearLayout.getContext().getString(R.string.premium_status_row_trial_offer), " • ", linearLayout.getContext().getString(R.string.premium_status_row_trial_active));
        TypedValue typedValue = new TypedValue();
        linearLayout.getContext().getTheme().resolveAttribute(R.attr.baseTextBrightAccent, typedValue, true);
        int color = linearLayout.getContext().getColor(typedValue.resourceId);
        TextView textView = (TextView) linearLayout.findViewById(R.id.plan_length_description);
        String string = linearLayout.getContext().getString(R.string.premium_status_row_trial_active);
        SpannableString spannableString = new SpannableString(strM56834f);
        spannableString.setSpan(new ForegroundColorSpan(color), wl51.m88458H0(strM56834f, string, 0, false, 6), strM56834f.length(), 33);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
        ((TextView) linearLayout.findViewById(R.id.plan_expiry_description)).setText(linearLayout.getContext().getResources().getString(R.string.premium_plan_trial_expiry_date, str2.toString()));
        String str3 = sh21Var.f208988e;
        if (str3.length() > 0) {
            Button button = (Button) linearLayout.findViewById(R.id.primary_button);
            button.setText(str3);
            button.setVisibility(0);
        }
        if (str.length() <= 0 && str.equals("")) {
            ((ConstraintLayout) linearLayout.findViewById(R.id.abt_entry_point)).setVisibility(8);
            ((SpotifyIconView) linearLayout.findViewById(R.id.abt_entry_point_icon)).setVisibility(8);
            ((SpotifyIconView) linearLayout.findViewById(R.id.abt_entry_point_arrow_icon)).setVisibility(8);
            ((TextView) linearLayout.findViewById(R.id.abt_entry_point_title)).setVisibility(8);
            ((TextView) linearLayout.findViewById(R.id.abt_entry_point_subtitle)).setVisibility(8);
            linearLayout.findViewById(R.id.abt_home_background).setVisibility(8);
            return;
        }
        ((SpotifyIconView) linearLayout.findViewById(R.id.abt_entry_point_icon)).setVisibility(0);
        ((SpotifyIconView) linearLayout.findViewById(R.id.abt_entry_point_arrow_icon)).setVisibility(0);
        linearLayout.findViewById(R.id.abt_home_background).setVisibility(0);
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.abt_entry_point_title);
        textView2.setVisibility(0);
        textView2.setText(str);
        TextView textView3 = (TextView) linearLayout.findViewById(R.id.abt_entry_point_subtitle);
        textView3.setVisibility(0);
        textView3.setText(sh21Var.f208990g);
    }

    @Override // p204p.clc1
    public final View getView() {
        return this.f88515a.f258142b;
    }
}
