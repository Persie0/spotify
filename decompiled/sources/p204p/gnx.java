package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class gnx {

    /* JADX INFO: renamed from: a */
    public final fnx f82787a;

    /* JADX INFO: renamed from: b */
    public final String f82788b;

    /* JADX INFO: renamed from: c */
    public final List f82789c;

    /* JADX INFO: renamed from: d */
    public final n6f f82790d;

    public gnx(fnx fnxVar, String str, List list, n6f n6fVar) {
        this.f82787a = fnxVar;
        this.f82788b = str;
        this.f82789c = list;
        this.f82790d = n6fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnx)) {
            return false;
        }
        gnx gnxVar = (gnx) obj;
        return wj50.m88271j(this.f82787a, gnxVar.f82787a) && wj50.m88271j(this.f82788b, gnxVar.f82788b) && wj50.m88271j(this.f82789c, gnxVar.f82789c) && wj50.m88271j(this.f82790d, gnxVar.f82790d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f82787a.hashCode() * 31, 31, this.f82788b);
        List list = this.f82789c;
        int iHashCode = (iM77243b + (list == null ? 0 : list.hashCode())) * 31;
        n6f n6fVar = this.f82790d;
        return iHashCode + (n6fVar != null ? Long.hashCode(n6fVar.f150873a) : 0);
    }
}
