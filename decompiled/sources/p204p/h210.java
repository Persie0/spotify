package p204p;

import android.content.Context;
import android.widget.ProgressBar;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes11.dex */
public final class h210 extends ProgressBar implements gr50 {
    public h210(Context context) {
        super(context, null, 0);
        setIndeterminate(true);
        setIndeterminateDrawable(context.getDrawable(R.drawable.loading_spinner));
        setIndeterminateTintList(lzj.m60387w(context, R.color.dark_base_text_subdued));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
    }
}
