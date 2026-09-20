package p204p;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class icg1 extends yag1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ mcg1 f100815h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icg1(mcg1 mcg1Var) {
        super(4);
        this.f100815h = mcg1Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        mcg1 mcg1Var = this.f100815h;
        fjf1.m41812I(i, mcg1Var.f142154t);
        Object[] objArr = mcg1Var.f142153i;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f100815h.f142154t;
    }
}
