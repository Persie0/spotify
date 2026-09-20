package p204p;

import java.util.AbstractList;

/* JADX INFO: loaded from: classes.dex */
public final class wd50 extends AbstractList {

    /* JADX INFO: renamed from: a */
    public final ud50 f250208a;

    /* JADX INFO: renamed from: b */
    public final vd50 f250209b;

    public wd50(ud50 ud50Var, vd50 vd50Var) {
        this.f250208a = ud50Var;
        this.f250209b = vd50Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f250209b.convert(((n350) this.f250208a).m63583e(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((n350) this.f250208a).f149937c;
    }
}
