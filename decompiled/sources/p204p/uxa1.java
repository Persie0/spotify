package p204p;

import androidx.car.app.model.Alert;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class uxa1 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final xnh f234871a;

    /* JADX INFO: renamed from: b */
    public final nr71 f234872b;

    /* JADX INFO: renamed from: c */
    public final y5t f234873c;

    /* JADX INFO: renamed from: d */
    public final lxa1 f234874d;

    /* JADX INFO: renamed from: e */
    public final mwa1 f234875e;

    /* JADX INFO: renamed from: f */
    public final tao f234876f;

    /* JADX INFO: renamed from: g */
    public final uao f234877g;

    /* JADX INFO: renamed from: h */
    public final boolean f234878h;

    /* JADX INFO: renamed from: i */
    public final bqa f234879i = xtm0.m92080a(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);

    /* JADX INFO: renamed from: j */
    public final pfm0 f234880j;

    public uxa1(xnh xnhVar, nr71 nr71Var, y5t y5tVar, lxa1 lxa1Var, mwa1 mwa1Var, tao taoVar, uao uaoVar, boolean z) {
        this.f234871a = xnhVar;
        this.f234872b = nr71Var;
        this.f234873c = y5tVar;
        this.f234874d = lxa1Var;
        this.f234875e = mwa1Var;
        this.f234876f = taoVar;
        this.f234877g = uaoVar;
        this.f234878h = z;
        pw71 pw71Var = new pw71(new sl51(""));
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f234880j = new pfm0(new qfm0[]{pw71Var, new q040(xgg1.m90579B2(), xoc1.f264171q4, null)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f234880j;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f234871a.m91502a(rkk.m75763o(new qxa1(this, 0), true, -1447062301), new wc21(new sxa1(this), txa1.f224651b, new d67(29)));
    }
}
