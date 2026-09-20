package p204p;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class dmx0 implements ek7 {

    /* JADX INFO: renamed from: a */
    public final ImageButton f50631a;

    public dmx0(Context context) {
        this.f50631a = (ImageButton) View.inflate(context, R.layout.view_rounded_authentication_button, null);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        this.f50631a.setOnClickListener(new irr0(4, gh00Var));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        int i;
        int i2;
        int iOrdinal = ((dk7) obj).f49899a.ordinal();
        if (iOrdinal == 0) {
            i = R.drawable.button_icon_phone;
            i2 = R.string.continue_with_phone;
        } else if (iOrdinal == 1) {
            i = R.drawable.button_icon_facebook_color_24dp;
            i2 = R.string.signup_experiment_copy_facebook_button;
        } else if (iOrdinal != 2) {
            i2 = R.string.continue_with_email;
            i = R.drawable.button_icon_email;
            if (iOrdinal == 5 || iOrdinal == 7 || iOrdinal != 8) {
            }
        } else {
            i = R.drawable.button_icon_google_color_24dp;
            i2 = R.string.continue_with_google;
        }
        ImageButton imageButton = this.f50631a;
        imageButton.setImageResource(i);
        imageButton.setContentDescription(imageButton.getContext().getString(i2));
    }

    @Override // p204p.clc1
    public final View getView() {
        return this.f50631a;
    }
}
