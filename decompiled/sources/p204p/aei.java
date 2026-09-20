package p204p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class aei implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final x5a0 f14880a;

    /* JADX INFO: renamed from: b */
    public final dei f14881b;

    /* JADX INFO: renamed from: c */
    public final vdi f14882c;

    /* JADX INFO: renamed from: d */
    public final vk9 f14883d;

    /* JADX INFO: renamed from: e */
    public final ydi f14884e;

    /* JADX INFO: renamed from: f */
    public final uqm f14885f;

    /* JADX INFO: renamed from: g */
    public final pfm0 f14886g;

    public aei(x5a0 x5a0Var, dei deiVar, vdi vdiVar, vk9 vk9Var, ydi ydiVar, uqm uqmVar) {
        this.f14880a = x5a0Var;
        this.f14881b = deiVar;
        this.f14882c = vdiVar;
        this.f14883d = vk9Var;
        this.f14884e = ydiVar;
        this.f14885f = uqmVar;
        pw71 pw71Var = new pw71(new sl51(""));
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        cbm0 cbm0VarM90710U0 = xgg1.m90710U0();
        Parcelable.Creator<voc1> creator = voc1.CREATOR;
        this.f14886g = new pfm0(new qfm0[]{pw71Var, new q040(cbm0VarM90710U0, mug1.m62869n(deiVar.m35802c()), null), new e6m0(true), new sw91(14, true, false, false)}, false);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f14886g;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return x5a0.m89980b(this.f14880a, tky.m81027c(new v4a0[0], new mr0(this, null, 29)), new l7i(this, 4), new u5a0(new zdi(this), new z23(this, 3), njy0.f154678O0));
    }
}
