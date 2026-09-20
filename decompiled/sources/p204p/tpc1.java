package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class tpc1 extends i400 {

    /* JADX INFO: renamed from: b */
    public final String f222506b;

    /* JADX INFO: renamed from: c */
    public int f222507c;

    public tpc1(gfb gfbVar) {
        super(gfbVar);
        this.f222506b = "virtual-" + gfbVar.mo44590b() + "-" + UUID.randomUUID().toString();
    }

    @Override // p204p.i400, p204p.gfb
    /* JADX INFO: renamed from: a */
    public final int mo44589a() {
        return mo44598j(0);
    }

    @Override // p204p.i400, p204p.gfb
    /* JADX INFO: renamed from: b */
    public final String mo44590b() {
        return this.f222506b;
    }

    @Override // p204p.i400, p204p.gfb
    /* JADX INFO: renamed from: j */
    public final int mo44598j(int i) {
        return j591.m52451f(this.f98362a.mo44598j(i) - this.f222507c);
    }
}
