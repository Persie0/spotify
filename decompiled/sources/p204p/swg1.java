package p204p;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class swg1 extends vug1 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uwg1 f214667c;

    public swg1(uwg1 uwg1Var) {
        this.f214667c = uwg1Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        uwg1 uwg1Var = this.f214667c;
        bnf1.m29985u(i, uwg1Var.f234657f);
        Object[] objArr = uwg1Var.f234656e;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f214667c.f234657f;
    }
}
