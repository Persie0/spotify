package p204p;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class awd1 {

    /* JADX INFO: renamed from: a */
    public zvd1 f20489a;

    public awd1(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f20489a = new yvd1(jt3.m54262d(i, interpolator, j));
        } else {
            this.f20489a = new wvd1(i, interpolator, j);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m27300e(View view, ptc ptcVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            yvd1.m94687h(view, ptcVar);
            return;
        }
        PathInterpolator pathInterpolator = wvd1.f255475e;
        View.OnApplyWindowInsetsListener vvd1Var = ptcVar != null ? new vvd1(view, ptcVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, vvd1Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(vvd1Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public static awd1 m27301g(WindowInsetsAnimation windowInsetsAnimation) {
        awd1 awd1Var = new awd1(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            awd1Var.f20489a = new yvd1(windowInsetsAnimation);
        }
        return awd1Var;
    }

    /* JADX INFO: renamed from: a */
    public final float m27302a() {
        return this.f20489a.mo94688a();
    }

    /* JADX INFO: renamed from: b */
    public final long m27303b() {
        return this.f20489a.mo94689b();
    }

    /* JADX INFO: renamed from: c */
    public final float m27304c() {
        return this.f20489a.mo94690c();
    }

    /* JADX INFO: renamed from: d */
    public final int m27305d() {
        return this.f20489a.mo94691d();
    }

    /* JADX INFO: renamed from: f */
    public final void m27306f(float f) {
        this.f20489a.mo94692e(f);
    }
}
