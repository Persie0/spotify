package p204p;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class vnf1 extends dkf1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ znf1 f243126h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnf1(znf1 znf1Var) {
        super(3);
        this.f243126h = znf1Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        znf1 znf1Var = this.f243126h;
        gxf1.m46088r(i, znf1Var.f284490t);
        Object[] objArr = znf1Var.f284489i;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f243126h.f284490t;
    }
}
