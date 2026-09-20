package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class n0h1 extends prg1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ r2h1 f149058h;

    public n0h1(r2h1 r2h1Var) {
        this.f149058h = r2h1Var;
    }

    @Override // p204p.prg1
    /* JADX INFO: renamed from: c */
    public final String mo63453c() {
        rtg1 rtg1Var = (rtg1) this.f149058h.f195146a.get();
        return rtg1Var == null ? "Completer object has been garbage collected, future will fail soon" : s571.m77251j("tag=[", String.valueOf(rtg1Var.f202582a), "]");
    }
}
