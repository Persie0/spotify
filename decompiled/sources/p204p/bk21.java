package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.spotify.music.R;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bk21 implements r6o0 {

    /* JADX INFO: renamed from: a */
    public final List f27818a;

    /* JADX INFO: renamed from: b */
    public ShimmerFrameLayout f27819b;

    /* JADX INFO: renamed from: c */
    public rsz0 f27820c;

    public bk21(List list) {
        this.f27818a = list;
    }

    @Override // p204p.r6o0
    /* JADX INFO: renamed from: a */
    public final void mo29574a(boolean z) {
        ShimmerFrameLayout shimmerFrameLayout = this.f27819b;
        if (shimmerFrameLayout != null) {
            if (!z) {
                shimmerFrameLayout.postDelayed(this.f27820c, 500L);
            } else {
                shimmerFrameLayout.m1428c(false);
                this.f27819b.m1429d();
            }
        }
    }

    @Override // p204p.u9m0
    /* JADX INFO: renamed from: c */
    public final void mo24481c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        yj21 yj21Var = new yj21(context);
        yj21Var.setComponents(this.f27818a);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) layoutInflater.inflate(R.layout.placeholder_skeleton, viewGroup, false);
        this.f27819b = shimmerFrameLayout;
        shimmerFrameLayout.addView(yj21Var);
        this.f27820c = new rsz0(this, 6);
    }

    @Override // p204p.u9m0
    public final View getView() {
        return this.f27819b;
    }

    @Override // p204p.u9m0
    public final void stop() {
        ShimmerFrameLayout shimmerFrameLayout = this.f27819b;
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.removeCallbacks(this.f27820c);
            this.f27819b = null;
        }
    }

    @Override // p204p.u9m0
    public final void start() {
    }
}
