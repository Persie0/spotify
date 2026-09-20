package p204p;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class xff1 extends daf1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ lgf1 f260956h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xff1(lgf1 lgf1Var) {
        super(1);
        this.f260956h = lgf1Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        lgf1 lgf1Var = this.f260956h;
        quf1.m73927s(i, lgf1Var.f133218t);
        Object[] objArr = lgf1Var.f133217i;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f260956h.f133218t;
    }
}
