package p204p;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class z4m {

    /* JADX INFO: renamed from: a */
    public final Set f279296a;

    /* JADX INFO: renamed from: b */
    public final Set f279297b;

    /* JADX INFO: renamed from: c */
    public final Set f279298c;

    /* JADX INFO: renamed from: d */
    public final Set f279299d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ z4m(int i, Set set, Set set2) {
        gbu gbuVar = gbu.f78413a;
        this(set, set2, gbuVar, gbuVar);
    }

    /* JADX INFO: renamed from: a */
    public static z4m m95350a(z4m z4mVar, Set set, Set set2, Set set3, LinkedHashSet linkedHashSet, int i) {
        if ((i & 1) != 0) {
            set = z4mVar.f279296a;
        }
        if ((i & 2) != 0) {
            set2 = z4mVar.f279297b;
        }
        if ((i & 4) != 0) {
            set3 = z4mVar.f279298c;
        }
        Set set4 = linkedHashSet;
        if ((i & 8) != 0) {
            set4 = z4mVar.f279299d;
        }
        z4mVar.getClass();
        return new z4m(set, set2, set3, set4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4m)) {
            return false;
        }
        z4m z4mVar = (z4m) obj;
        return wj50.m88271j(this.f279296a, z4mVar.f279296a) && wj50.m88271j(this.f279297b, z4mVar.f279297b) && wj50.m88271j(this.f279298c, z4mVar.f279298c) && wj50.m88271j(this.f279299d, z4mVar.f279299d);
    }

    public final int hashCode() {
        return this.f279299d.hashCode() + klh.m56830b(klh.m56830b(this.f279296a.hashCode() * 31, 31, this.f279297b), 31, this.f279298c);
    }

    public z4m(Set set, Set set2, Set set3, Set set4) {
        this.f279296a = set;
        this.f279297b = set2;
        this.f279298c = set3;
        this.f279299d = set4;
    }
}
