package p204p;

import android.content.Context;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class szn0 extends zy8 implements oqs {
    public szn0(Context context) {
        super(context, null, 0, R.drawable.encore_icon_pin);
        setContentDescription(getResources().getString(R.string.pin_badge_content_description));
        setAdjustViewBounds(true);
        setImageTintList(lzj.m60387w(context, R.color.pin_badge_color));
        setIconActive(true);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo2820d(Object obj) {
        m79756e(((Boolean) obj).booleanValue());
    }

    /* JADX INFO: renamed from: e */
    public final void m79756e(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    public /* synthetic */ szn0(Context context, int i) {
        this(context);
    }
}
