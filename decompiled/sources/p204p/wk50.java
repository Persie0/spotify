package p204p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class wk50 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final pkh f252131a;

    /* JADX INFO: renamed from: b */
    public final z9j0 f252132b;

    /* JADX INFO: renamed from: c */
    public final tk50 f252133c;

    /* JADX INFO: renamed from: d */
    public final fc41 f252134d;

    /* JADX INFO: renamed from: e */
    public final yk50 f252135e;

    /* JADX INFO: renamed from: f */
    public final kv91 f252136f;

    /* JADX INFO: renamed from: g */
    public final zl00 f252137g;

    /* JADX INFO: renamed from: h */
    public final pfm0 f252138h;

    public wk50(pkh pkhVar, z9j0 z9j0Var, tk50 tk50Var, fc41 fc41Var, yk50 yk50Var, kv91 kv91Var, zl00 zl00Var) {
        this.f252131a = pkhVar;
        this.f252132b = z9j0Var;
        this.f252133c = tk50Var;
        this.f252134d = fc41Var;
        this.f252135e = yk50Var;
        this.f252136f = kv91Var;
        this.f252137g = zl00Var;
        pw71 pw71Var = new pw71(new sl51(""));
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        cbm0 cbm0VarM90627I1 = xgg1.m90627I1();
        Parcelable.Creator<voc1> creator = voc1.CREATOR;
        this.f252138h = new pfm0(new qfm0[]{pw71Var, new q040(cbm0VarM90627I1, mug1.m62869n(yk50Var.getUri()), null), new tkm0(qkm0.f189619a, 0, 2), new i200(1), new zox()}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f252138h;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        xlg0 xlg0VarM53277p = jg31.m53277p();
        return this.f252131a.m70217a(this.f252133c.m81000b(), rkk.m75763o(new i9y(16, this, xlg0VarM53277p), true, 1584426503), new hlh(rkk.m75763o(new nv20(this, 21), true, -802529767), null, null, true, 54));
    }
}
