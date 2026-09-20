package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class cws implements jws {

    /* JADX INFO: renamed from: a */
    public final List f42804a;

    /* JADX INFO: renamed from: b */
    public final List f42805b;

    /* JADX INFO: renamed from: c */
    public final boolean f42806c;

    public cws(qf40 qf40Var, List list, boolean z) {
        this.f42804a = qf40Var;
        this.f42805b = list;
        this.f42806c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cws)) {
            return false;
        }
        cws cwsVar = (cws) obj;
        return wj50.m88271j(this.f42804a, cwsVar.f42804a) && wj50.m88271j(this.f42805b, cwsVar.f42805b) && this.f42806c == cwsVar.f42806c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42806c) + s571.m77244c(this.f42804a.hashCode() * 31, 31, this.f42805b);
    }
}
