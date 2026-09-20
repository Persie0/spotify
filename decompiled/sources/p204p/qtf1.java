package p204p;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class qtf1 extends gqf1 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vtf1 f192378c;

    public qtf1(vtf1 vtf1Var) {
        this.f192378c = vtf1Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        vtf1 vtf1Var = this.f192378c;
        jg31.m53260F(i, vtf1Var.f244639e);
        Object[] objArr = vtf1Var.f244638d;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f192378c.f244639e;
    }
}
