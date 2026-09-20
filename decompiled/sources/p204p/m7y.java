package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class m7y {

    /* JADX INFO: renamed from: a */
    public final List f140871a;

    /* JADX INFO: renamed from: b */
    public final j6y f140872b;

    /* JADX INFO: renamed from: c */
    public final List f140873c;

    /* JADX INFO: renamed from: d */
    public final List f140874d;

    public m7y(int i, List list, List list2) {
        j6y j6yVar = (j6y) g6f.m43745s0(list);
        List listSubList = list.isEmpty() ? null : list.subList(1, list.size());
        list2 = (i & 8) != 0 ? null : list2;
        this.f140871a = list;
        this.f140872b = j6yVar;
        this.f140873c = listSubList;
        this.f140874d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7y)) {
            return false;
        }
        m7y m7yVar = (m7y) obj;
        return wj50.m88271j(this.f140871a, m7yVar.f140871a) && wj50.m88271j(this.f140872b, m7yVar.f140872b) && wj50.m88271j(this.f140873c, m7yVar.f140873c) && wj50.m88271j(this.f140874d, m7yVar.f140874d);
    }

    public final int hashCode() {
        int iHashCode = this.f140871a.hashCode() * 31;
        j6y j6yVar = this.f140872b;
        int iHashCode2 = (iHashCode + (j6yVar == null ? 0 : j6yVar.hashCode())) * 31;
        List list = this.f140873c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f140874d;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }
}
