package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class of40 extends AbstractC2154n7 implements rf40 {

    /* JADX INFO: renamed from: a */
    public final rf40 f164637a;

    /* JADX INFO: renamed from: b */
    public final int f164638b;

    /* JADX INFO: renamed from: c */
    public final int f164639c;

    /* JADX WARN: Multi-variable type inference failed */
    public of40(rf40 rf40Var, int i, int i2) {
        this.f164637a = rf40Var;
        this.f164638b = i;
        hdi.m47243t(i, i2, ((AbstractC2282q6) rf40Var).mo33075a());
        this.f164639c = i2 - i;
    }

    @Override // p204p.AbstractC2282q6
    /* JADX INFO: renamed from: a */
    public final int mo33075a() {
        return this.f164639c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hdi.m47241r(i, this.f164639c);
        return this.f164637a.get(this.f164638b + i);
    }

    @Override // p204p.AbstractC2154n7, java.util.List
    public final List subList(int i, int i2) {
        hdi.m47243t(i, i2, this.f164639c);
        int i3 = this.f164638b;
        return new of40(this.f164637a, i + i3, i3 + i2);
    }
}
