package p204p;

import android.os.Build;
import android.widget.Magnifier;
import android.widget.ProgressBar;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public class fdo0 implements ddo0 {

    /* JADX INFO: renamed from: a */
    public final Object f68535a;

    @Override // p204p.ddo0
    /* JADX INFO: renamed from: a */
    public void mo35753a(float f, long j, long j2) {
        ((Magnifier) this.f68535a).show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: renamed from: b */
    public void m41373b() {
        ((Magnifier) this.f68535a).dismiss();
    }

    /* JADX INFO: renamed from: c */
    public long m41374c() {
        return (((long) ((Magnifier) this.f68535a).getHeight()) & 4294967295L) | (((long) ((Magnifier) this.f68535a).getWidth()) << 32);
    }

    /* JADX INFO: renamed from: d */
    public void m41375d() {
        if (Build.VERSION.SDK_INT >= 28) {
            ProgressBar progressBar = (ProgressBar) ((wiy0) this.f68535a).f251777b;
            progressBar.setAccessibilityPaneTitle(progressBar.getContext().getString(R.string.loading_screen_accessibility_title));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m41376e() {
        ((Magnifier) this.f68535a).update();
    }
}
