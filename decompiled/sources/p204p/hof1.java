package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class hof1 extends dkf1 {

    /* JADX INFO: renamed from: h */
    public final transient Object[] f93530h;

    /* JADX INFO: renamed from: i */
    public final transient int f93531i;

    /* JADX INFO: renamed from: t */
    public final transient int f93532t;

    public hof1(int i, Object[] objArr) {
        super(3);
        this.f93530h = objArr;
        this.f93531i = i;
        this.f93532t = 1;
    }

    @Override // java.util.List
    public final Object get(int i) {
        gxf1.m46088r(i, this.f93532t);
        Object obj = this.f93530h[i + i + this.f93531i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f93532t;
    }
}
