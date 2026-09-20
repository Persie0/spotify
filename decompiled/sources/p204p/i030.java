package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i030 extends vz8 {

    /* JADX INFO: renamed from: e */
    public final List f97117e;

    /* JADX INFO: renamed from: f */
    public final long f97118f;

    /* JADX INFO: renamed from: g */
    public final String f97119g;

    public i030(long j, String str, List list) {
        super(0L, list.size() - 1);
        this.f97119g = str;
        this.f97118f = j;
        this.f97117e = list;
    }

    @Override // p204p.nad0
    /* JADX INFO: renamed from: a */
    public final long mo32205a() {
        m86873d();
        return this.f97118f + ((y030) this.f97117e.get((int) this.f246412d)).f267883e;
    }

    @Override // p204p.nad0
    /* JADX INFO: renamed from: b */
    public final long mo32206b() {
        m86873d();
        y030 y030Var = (y030) this.f97117e.get((int) this.f246412d);
        return this.f97118f + y030Var.f267883e + y030Var.f267881c;
    }

    @Override // p204p.nad0
    /* JADX INFO: renamed from: c */
    public final sjo mo32207c() {
        m86873d();
        y030 y030Var = (y030) this.f97117e.get((int) this.f246412d);
        return new sjo(qvf1.m73999D(this.f97119g, y030Var.f267879a), y030Var.f267887i, y030Var.f267888t);
    }
}
