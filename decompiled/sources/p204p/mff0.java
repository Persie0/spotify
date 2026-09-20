package p204p;

import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class mff0 extends AppCompatImageView implements oqs {
    public mff0(Context context) {
        super(context, null, 0);
        setAdjustViewBounds(true);
        setImageDrawable(ihf1.m50639w(context, R.drawable.encore_icon_tune));
        Resources resources = getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = u1x0.f225931a;
        setColorFilter(resources.getColor(R.color.badge_icon_color, theme));
        setBackground(context.getDrawable(R.drawable.background_badge));
        setContentDescription(context.getString(R.string.badge_content_description));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
    }
}
