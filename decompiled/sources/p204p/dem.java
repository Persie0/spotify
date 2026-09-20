package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class dem {

    /* JADX INFO: renamed from: a */
    public final String f48123a;

    /* JADX INFO: renamed from: b */
    public final List f48124b;

    /* JADX INFO: renamed from: c */
    public final cem f48125c;

    /* JADX INFO: renamed from: d */
    public final List f48126d;

    /* JADX INFO: renamed from: e */
    public final Object f48127e;

    /* JADX INFO: renamed from: f */
    public final gx81 f48128f;

    public dem(String str, List list, cem cemVar, List list2, Object obj, gx81 gx81Var) {
        this.f48123a = str;
        this.f48124b = list;
        this.f48125c = cemVar;
        this.f48126d = list2;
        this.f48127e = obj;
        this.f48128f = gx81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dem)) {
            return false;
        }
        dem demVar = (dem) obj;
        return wj50.m88271j(this.f48123a, demVar.f48123a) && wj50.m88271j(this.f48124b, demVar.f48124b) && wj50.m88271j(this.f48125c, demVar.f48125c) && wj50.m88271j(this.f48126d, demVar.f48126d) && wj50.m88271j(this.f48127e, demVar.f48127e) && wj50.m88271j(this.f48128f, demVar.f48128f);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.f48123a.hashCode() * 31, 31, this.f48124b);
        cem cemVar = this.f48125c;
        int iHashCode = (iM77244c + (cemVar == null ? 0 : cemVar.hashCode())) * 961;
        List list = this.f48126d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Object obj = this.f48127e;
        return this.f48128f.hashCode() + ((iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31);
    }
}
