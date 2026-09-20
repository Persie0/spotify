package p204p;

import android.content.Context;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes11.dex */
public final class bcq0 extends zy8 implements oqs {
    public bcq0(Context context) {
        super(context, null, 0, R.drawable.encore_icon_time_16);
        setContentDescription(getResources().getString(R.string.pre_release_badge_content_description));
        setAdjustViewBounds(true);
        setImageTintList(lzj.m60387w(context, R.color.pre_release_badge_color));
        setIconActive(true);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
    }
}
