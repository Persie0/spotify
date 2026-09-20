package p204p;

import android.app.Activity;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes11.dex */
public final class sgr {

    /* JADX INFO: renamed from: a */
    public final Activity f208927a;

    /* JADX INFO: renamed from: b */
    public final gew f208928b;

    public sgr(Activity activity, gew gewVar) {
        this.f208927a = activity;
        this.f208928b = gewVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m78112a() {
        Activity activity = this.f208927a;
        ih10 ih10VarM31832a0 = c95.m31832a0(activity, activity.getText(R.string.your_library_pinning_failed_title_cant_pin), activity.getText(R.string.your_library_pinning_failed_body_item_in_folder));
        CharSequence text = activity.getText(R.string.your_library_pinning_failed_positive_button);
        nmb nmbVar = new nmb(this, 12);
        ih10VarM31832a0.f102113a = text;
        ih10VarM31832a0.f102115c = nmbVar;
        ih10VarM31832a0.f102120h = new la5(this, 2);
        ih10VarM31832a0.f102117e = true;
        ih10VarM31832a0.m50574b().m58942b();
    }

    /* JADX INFO: renamed from: b */
    public final void m78113b(int i) {
        Activity activity = this.f208927a;
        ih10 ih10VarM31832a0 = c95.m31832a0(activity, activity.getText(R.string.your_library_pinning_failed_title_out_of_pins), activity.getResources().getQuantityString(R.plurals.your_library_pinning_failed_body_item_pin_limit_reached, i, Integer.valueOf(i)));
        CharSequence text = activity.getText(R.string.your_library_pinning_failed_positive_button);
        qgr qgrVar = new qgr(this, i);
        ih10VarM31832a0.f102113a = text;
        ih10VarM31832a0.f102115c = qgrVar;
        ih10VarM31832a0.f102120h = new rgr(this, i);
        ih10VarM31832a0.f102117e = true;
        ih10VarM31832a0.m50574b().m58942b();
    }
}
