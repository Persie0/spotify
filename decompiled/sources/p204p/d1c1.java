package p204p;

import com.spotify.betamax.player.VideoSurfaceView;
import java.util.Collections;

/* JADX INFO: loaded from: classes11.dex */
public final class d1c1 implements vh21 {

    /* JADX INFO: renamed from: a */
    public final ra9 f44227a;

    /* JADX INFO: renamed from: b */
    public final l89 f44228b;

    /* JADX INFO: renamed from: c */
    public final ab9 f44229c;

    /* JADX INFO: renamed from: d */
    public final agy f44230d;

    /* JADX INFO: renamed from: e */
    public pa9 f44231e;

    /* JADX INFO: renamed from: f */
    public VideoSurfaceView f44232f;

    /* JADX INFO: renamed from: g */
    public i0c1 f44233g;

    /* JADX INFO: renamed from: h */
    public final px6 f44234h = new px6(this, 10);

    public d1c1(ra9 ra9Var, l89 l89Var, ab9 ab9Var, agy agyVar) {
        this.f44227a = ra9Var;
        this.f44228b = l89Var;
        this.f44229c = ab9Var;
        this.f44230d = agyVar;
    }

    @Override // p204p.vh21
    /* JADX INFO: renamed from: b */
    public final boolean mo34624b() {
        return false;
    }

    @Override // p204p.vh21
    /* JADX INFO: renamed from: c */
    public final void mo34625c(VideoSurfaceView videoSurfaceView, String str, long j, long j2, String str2, int i) {
        pa9 pa9Var = this.f44231e;
        if (pa9Var != null) {
            pa9Var.m69452r(i != 2);
            yzo0 yzo0VarM69440e = pa9Var.m69440e();
            if (wj50.m88271j(yzo0VarM69440e != null ? yzo0VarM69440e.f277859a.f128765a : null, str)) {
                return;
            }
            pa9Var.m69441f();
            l1p0 l1p0Var = new l1p0(yif1.m93802o(str), 12, null);
            noo0 noo0Var = new noo0(j, j2, false, false, null, null, false, 240);
            VideoSurfaceView videoSurfaceView2 = this.f44232f;
            if (videoSurfaceView2 != null) {
                pa9Var.m69446k(videoSurfaceView2);
            }
            this.f44232f = videoSurfaceView;
            pa9Var.m69439d(videoSurfaceView);
            pa9Var.m69443h(l1p0Var, noo0Var);
            pa9Var.m69447l();
        }
    }

    @Override // p204p.vh21
    /* JADX INFO: renamed from: e */
    public final void mo34627e() {
        pa9 pa9Var = this.f44231e;
        if (pa9Var != null) {
            this.f44227a.mo72486b(pa9Var);
            this.f44231e = null;
        }
    }

    @Override // p204p.vh21
    /* JADX INFO: renamed from: f */
    public final void mo34628f(i0c1 i0c1Var) {
        this.f44233g = i0c1Var;
    }

    @Override // p204p.vh21
    /* JADX INFO: renamed from: g */
    public final void mo34629g(eh00 eh00Var) {
        if (this.f44231e == null) {
            pa9 pa9VarM75103a = ra9.m75103a(this.f44227a, this.f44230d.f15543a, null, null, this.f44228b, Collections.singletonList(this.f44234h), false, null, new mgy(true), 710);
            pa9VarM75103a.m69450p(2);
            pa9VarM75103a.m69454t(false);
            pa9VarM75103a.m69451q(true);
            pa9VarM75103a.m69453s(new et81(this.f44229c.f14044a));
            this.f44231e = pa9VarM75103a;
        }
        eh00Var.invoke();
    }

    @Override // p204p.vh21
    /* JADX INFO: renamed from: a */
    public final void mo34623a(eh00 eh00Var, eh00 eh00Var2) {
    }

    @Override // p204p.vh21
    /* JADX INFO: renamed from: d */
    public final void mo34626d(String str, e651 e651Var, e651 e651Var2) {
    }
}
