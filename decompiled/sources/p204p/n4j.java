package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class n4j {

    /* JADX INFO: renamed from: a */
    public final int f150357a;

    /* JADX INFO: renamed from: b */
    public final g4j f150358b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f150359c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f150360d;

    public n4j(int i, g4j g4jVar, ArrayList arrayList, ArrayList arrayList2) {
        this.f150357a = i;
        this.f150358b = g4jVar;
        this.f150359c = arrayList;
        this.f150360d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4j)) {
            return false;
        }
        n4j n4jVar = (n4j) obj;
        return this.f150357a == n4jVar.f150357a && this.f150358b == n4jVar.f150358b && this.f150359c.equals(n4jVar.f150359c) && this.f150360d.equals(n4jVar.f150360d);
    }

    public final int hashCode() {
        return this.f150360d.hashCode() + lq51.m59700f(this.f150359c, (this.f150358b.hashCode() + (edb.m38547C(this.f150357a) * 31)) * 31, 31);
    }
}
