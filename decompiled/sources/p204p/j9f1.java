package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class j9f1 extends daf1 {

    /* JADX INFO: renamed from: h */
    public final transient int f110164h;

    /* JADX INFO: renamed from: i */
    public final transient int f110165i;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ daf1 f110166t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9f1(daf1 daf1Var, int i, int i2) {
        super(1);
        this.f110166t = daf1Var;
        this.f110164h = i;
        this.f110165i = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        quf1.m73927s(i, this.f110165i);
        return this.f110166t.get(i + this.f110164h);
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: i */
    public final int mo46354i() {
        return this.f110166t.mo28834l() + this.f110164h + this.f110165i;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: l */
    public final int mo28834l() {
        return this.f110166t.mo28834l() + this.f110164h;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: n */
    public final Object[] mo46355n() {
        return this.f110166t.mo46355n();
    }

    @Override // p204p.daf1, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final daf1 subList(int i, int i2) {
        quf1.m73929u(i, i2, this.f110165i);
        int i3 = this.f110164h;
        return this.f110166t.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f110165i;
    }
}
