package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class w2y {

    /* JADX INFO: renamed from: a */
    public final List f247438a;

    /* JADX INFO: renamed from: b */
    public final List f247439b;

    /* JADX INFO: renamed from: c */
    public final List f247440c;

    /* JADX INFO: renamed from: d */
    public final n6f f247441d;

    /* JADX INFO: renamed from: e */
    public final String f247442e;

    /* JADX INFO: renamed from: f */
    public final String f247443f;

    public w2y(List list, List list2, List list3, n6f n6fVar, String str, String str2) {
        this.f247438a = list;
        this.f247439b = list2;
        this.f247440c = list3;
        this.f247441d = n6fVar;
        this.f247442e = str;
        this.f247443f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2y)) {
            return false;
        }
        w2y w2yVar = (w2y) obj;
        return wj50.m88271j(this.f247438a, w2yVar.f247438a) && wj50.m88271j(this.f247439b, w2yVar.f247439b) && wj50.m88271j(this.f247440c, w2yVar.f247440c) && wj50.m88271j(this.f247441d, w2yVar.f247441d) && wj50.m88271j(this.f247442e, w2yVar.f247442e) && wj50.m88271j(this.f247443f, w2yVar.f247443f);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77244c(this.f247438a.hashCode() * 31, 31, this.f247439b), 31, this.f247440c);
        n6f n6fVar = this.f247441d;
        int iHashCode = (iM77244c + (n6fVar == null ? 0 : Long.hashCode(n6fVar.f150873a))) * 31;
        String str = this.f247442e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f247443f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
