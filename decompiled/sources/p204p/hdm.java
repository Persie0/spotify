package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hdm implements Comparable, Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f90161a;

    public hdm(Comparable comparable) {
        this.f90161a = comparable;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Comparable, java.lang.Object] */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hdm hdmVar) {
        if (hdmVar == fdm.f68520b) {
            return 1;
        }
        if (hdmVar == ddm.f47842b) {
            return -1;
        }
        Object obj = hdmVar.f90161a;
        i5u0 i5u0Var = i5u0.f99026c;
        int iCompareTo = this.f90161a.compareTo(obj);
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof edm, hdmVar instanceof edm);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo35749b(StringBuilder sb);

    /* JADX INFO: renamed from: c */
    public abstract void mo35750c(StringBuilder sb);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public Comparable mo35751d() {
        return this.f90161a;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo35752e(Comparable comparable);

    public final boolean equals(Object obj) {
        if (obj instanceof hdm) {
            try {
                if (compareTo((hdm) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}
