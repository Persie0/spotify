package p204p;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes3.dex */
public final class yvd1 extends zvd1 {

    /* JADX INFO: renamed from: e */
    public final WindowInsetsAnimation f276651e;

    public yvd1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f276651e = windowInsetsAnimation;
    }

    /* JADX INFO: renamed from: f */
    public static dx40 m94685f(WindowInsetsAnimation.Bounds bounds) {
        return dx40.m37191d(bounds.getUpperBound());
    }

    /* JADX INFO: renamed from: g */
    public static dx40 m94686g(WindowInsetsAnimation.Bounds bounds) {
        return dx40.m37191d(bounds.getLowerBound());
    }

    /* JADX INFO: renamed from: h */
    public static void m94687h(View view, ptc ptcVar) {
        view.setWindowInsetsAnimationCallback(ptcVar != null ? new xvd1(ptcVar) : null);
    }

    @Override // p204p.zvd1
    /* JADX INFO: renamed from: a */
    public final float mo94688a() {
        return this.f276651e.getAlpha();
    }

    @Override // p204p.zvd1
    /* JADX INFO: renamed from: b */
    public final long mo94689b() {
        return this.f276651e.getDurationMillis();
    }

    @Override // p204p.zvd1
    /* JADX INFO: renamed from: c */
    public final float mo94690c() {
        return this.f276651e.getInterpolatedFraction();
    }

    @Override // p204p.zvd1
    /* JADX INFO: renamed from: d */
    public final int mo94691d() {
        return this.f276651e.getTypeMask();
    }

    @Override // p204p.zvd1
    /* JADX INFO: renamed from: e */
    public final void mo94692e(float f) {
        this.f276651e.setFraction(f);
    }
}
