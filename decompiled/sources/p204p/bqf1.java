package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class bqf1 extends gqf1 {

    /* JADX INFO: renamed from: c */
    public final transient int f29808c;

    /* JADX INFO: renamed from: d */
    public final transient int f29809d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ gqf1 f29810e;

    public bqf1(gqf1 gqf1Var, int i, int i2) {
        this.f29810e = gqf1Var;
        this.f29808c = i;
        this.f29809d = i2;
    }

    @Override // p204p.jpf1
    /* JADX INFO: renamed from: b */
    public final int mo30259b() {
        return this.f29810e.mo30260d() + this.f29808c + this.f29809d;
    }

    @Override // p204p.jpf1
    /* JADX INFO: renamed from: d */
    public final int mo30260d() {
        return this.f29810e.mo30260d() + this.f29808c;
    }

    @Override // p204p.jpf1
    /* JADX INFO: renamed from: e */
    public final Object[] mo30261e() {
        return this.f29810e.mo30261e();
    }

    @Override // p204p.gqf1, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final gqf1 subList(int i, int i2) {
        jg31.m53261G(i, i2, this.f29809d);
        int i3 = this.f29808c;
        return this.f29810e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        jg31.m53260F(i, this.f29809d);
        return this.f29810e.get(i + this.f29808c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29809d;
    }
}
