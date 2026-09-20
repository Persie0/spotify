package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class a8a {

    /* JADX INFO: renamed from: a */
    public final z7a f13232a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f13233b;

    /* JADX INFO: renamed from: c */
    public final long f13234c;

    public a8a(z7a z7aVar, ArrayList arrayList, long j) {
        this.f13232a = z7aVar;
        this.f13233b = arrayList;
        this.f13234c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8a)) {
            return false;
        }
        a8a a8aVar = (a8a) obj;
        return this.f13232a.equals(a8aVar.f13232a) && this.f13233b.equals(a8aVar.f13233b) && cks.m33185d(this.f13234c, a8aVar.f13234c);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f13233b, this.f13232a.f280144a.hashCode() * 31, 31);
        hvi0 hvi0Var = cks.f39079b;
        return Long.hashCode(this.f13234c) + iM59700f;
    }
}
