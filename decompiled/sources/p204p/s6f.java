package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class s6f {

    /* JADX INFO: renamed from: a */
    public final List f206117a;

    /* JADX INFO: renamed from: b */
    public final long f206118b;

    public s6f(long j, List list) {
        this.f206117a = list;
        this.f206118b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6f)) {
            return false;
        }
        s6f s6fVar = (s6f) obj;
        if (!wj50.m88271j(this.f206117a, s6fVar.f206117a)) {
            return false;
        }
        long j = s6fVar.f206118b;
        int i = n6f.f150872l;
        return as91.m27074b(this.f206118b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f206117a.hashCode() * 31;
        int i = n6f.f150872l;
        return Long.hashCode(this.f206118b) + iHashCode;
    }
}
