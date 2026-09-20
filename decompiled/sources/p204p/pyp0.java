package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class pyp0 extends ryp0 {

    /* JADX INFO: renamed from: a */
    public final String f183449a;

    /* JADX INFO: renamed from: b */
    public final String f183450b;

    /* JADX INFO: renamed from: c */
    public final List f183451c;

    /* JADX INFO: renamed from: d */
    public final String f183452d;

    public pyp0(String str, List list, String str2, String str3) {
        this.f183449a = str;
        this.f183450b = str2;
        this.f183451c = list;
        this.f183452d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyp0)) {
            return false;
        }
        pyp0 pyp0Var = (pyp0) obj;
        return wj50.m88271j(this.f183449a, pyp0Var.f183449a) && wj50.m88271j(this.f183450b, pyp0Var.f183450b) && this.f183451c.equals(pyp0Var.f183451c) && wj50.m88271j(this.f183452d, pyp0Var.f183452d);
    }

    public final int hashCode() {
        return this.f183452d.hashCode() + ((m761.EPISODE_PAGE.hashCode() + s571.m77244c((((edb.m38547C(4) + s571.m77243b(this.f183449a.hashCode() * 31, 31, this.f183450b)) * 31) - 816631292) * 31, 31, this.f183451c)) * 31);
    }
}
