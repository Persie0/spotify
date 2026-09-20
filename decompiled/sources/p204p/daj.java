package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class daj implements ktx {

    /* JADX INFO: renamed from: a */
    public final long f47050a;

    /* JADX INFO: renamed from: b */
    public final List f47051b;

    /* JADX INFO: renamed from: c */
    public final List f47052c;

    /* JADX INFO: renamed from: d */
    public final List f47053d;

    public daj(long j, List list, List list2, List list3) {
        this.f47050a = j;
        this.f47051b = list;
        this.f47052c = list2;
        this.f47053d = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof daj)) {
            return false;
        }
        daj dajVar = (daj) obj;
        return cks.m33185d(this.f47050a, dajVar.f47050a) && wj50.m88271j(this.f47051b, dajVar.f47051b) && wj50.m88271j(this.f47052c, dajVar.f47052c) && wj50.m88271j(this.f47053d, dajVar.f47053d);
    }

    public final int hashCode() {
        hvi0 hvi0Var = cks.f39079b;
        return this.f47053d.hashCode() + s571.m77244c(s571.m77244c(Long.hashCode(this.f47050a) * 31, 31, this.f47051b), 31, this.f47052c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public daj(int i, long j) {
        if ((i & 1) != 0) {
            hvi0 hvi0Var = cks.f39079b;
            j = 0;
        }
        lau lauVar = lau.f131415a;
        this(j, lauVar, lauVar, lauVar);
    }
}
