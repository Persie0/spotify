package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class a5b {

    /* JADX INFO: renamed from: a */
    public final Set f12478a;

    /* JADX INFO: renamed from: b */
    public final Set f12479b;

    /* JADX INFO: renamed from: c */
    public final long f12480c;

    public a5b(Set set, Set set2, long j) {
        this.f12478a = set;
        this.f12479b = set2;
        this.f12480c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5b)) {
            return false;
        }
        a5b a5bVar = (a5b) obj;
        return wj50.m88271j(this.f12478a, a5bVar.f12478a) && wj50.m88271j(this.f12479b, a5bVar.f12479b) && this.f12480c == a5bVar.f12480c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12480c) + klh.m56830b(this.f12478a.hashCode() * 31, 31, this.f12479b);
    }
}
