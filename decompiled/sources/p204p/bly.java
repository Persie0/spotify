package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bly {

    /* JADX INFO: renamed from: a */
    public final int f28301a;

    /* JADX INFO: renamed from: b */
    public final qf40 f28302b;

    public bly(int i, AbstractC2524w8 abstractC2524w8) {
        this.f28301a = i;
        this.f28302b = abstractC2524w8;
    }

    /* JADX INFO: renamed from: a */
    public final int m29787a() {
        return this.f28301a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bly)) {
            return false;
        }
        bly blyVar = (bly) obj;
        return this.f28301a == blyVar.f28301a && wj50.m88271j(this.f28302b, blyVar.f28302b);
    }

    public final int hashCode() {
        return this.f28302b.hashCode() + (Integer.hashCode(this.f28301a) * 31);
    }
}
