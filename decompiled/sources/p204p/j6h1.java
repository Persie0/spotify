package p204p;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes4.dex */
public final class j6h1 extends ptg1 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w7h1 f109320c;

    public j6h1(w7h1 w7h1Var) {
        this.f109320c = w7h1Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        w7h1 w7h1Var = this.f109320c;
        vhf1.m85543R(i, w7h1Var.f248688e);
        Object[] objArr = w7h1Var.f248687d;
        int i2 = i + i;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f109320c.f248688e;
    }
}
