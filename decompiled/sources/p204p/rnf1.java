package p204p;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class rnf1 extends tlf1 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wnf1 f200907c;

    public rnf1(wnf1 wnf1Var) {
        this.f200907c = wnf1Var;
    }

    @Override // p204p.jlf1
    /* JADX INFO: renamed from: f */
    public final boolean mo39568f() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        wnf1 wnf1Var = this.f200907c;
        p271.m68894D(i, wnf1Var.f253173e);
        Object[] objArr = wnf1Var.f253172d;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f200907c.f253173e;
    }
}
