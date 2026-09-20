package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class j0f1 extends k0f1 {

    /* JADX INFO: renamed from: h */
    public final transient int f107451h;

    /* JADX INFO: renamed from: i */
    public final transient int f107452i;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ k0f1 f107453t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0f1(k0f1 k0f1Var, int i, int i2) {
        super(0);
        this.f107453t = k0f1Var;
        this.f107451h = i;
        this.f107452i = i2;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: b */
    public final int mo46351b() {
        return this.f107453t.mo46352d() + this.f107451h + this.f107452i;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: d */
    public final int mo46352d() {
        return this.f107453t.mo46352d() + this.f107451h;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: e */
    public final Object[] mo46353e() {
        return this.f107453t.mo46353e();
    }

    @Override // java.util.List
    public final Object get(int i) {
        ex60.m40169c(i, this.f107452i);
        return this.f107453t.get(i + this.f107451h);
    }

    @Override // p204p.k0f1, java.util.List
    /* JADX INFO: renamed from: p */
    public final k0f1 subList(int i, int i2) {
        ex60.m40174h(i, i2, this.f107452i);
        int i3 = this.f107451h;
        return this.f107453t.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f107452i;
    }
}
