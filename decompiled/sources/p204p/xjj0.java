package p204p;

import android.content.Context;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes11.dex */
public final class xjj0 extends zy8 implements gr50 {
    public xjj0(Context context) {
        super(context, null, 0, R.drawable.encore_icon_notification_new);
        setContentDescription(getResources().getString(R.string.your_library_new_release_badge_content_description));
        setAdjustViewBounds(true);
        setImageTintList(lzj.m60387w(context, R.color.new_release_badge_color));
        setIconActive(true);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
    }
}
