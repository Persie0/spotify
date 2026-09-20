package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class c2w0 implements f2w0 {

    /* JADX INFO: renamed from: a */
    public final String f33473a;

    /* JADX INFO: renamed from: b */
    public final String f33474b;

    /* JADX INFO: renamed from: c */
    public final String f33475c;

    /* JADX INFO: renamed from: d */
    public final List f33476d;

    /* JADX INFO: renamed from: e */
    public final String f33477e;

    /* JADX INFO: renamed from: f */
    public final String f33478f;

    /* JADX INFO: renamed from: g */
    public final dhl f33479g;

    public c2w0(String str, String str2, String str3, List list, String str4, String str5, dhl dhlVar) {
        this.f33473a = str;
        this.f33474b = str2;
        this.f33475c = str3;
        this.f33476d = list;
        this.f33477e = str4;
        this.f33478f = str5;
        this.f33479g = dhlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2w0)) {
            return false;
        }
        c2w0 c2w0Var = (c2w0) obj;
        return wj50.m88271j(this.f33473a, c2w0Var.f33473a) && wj50.m88271j(this.f33474b, c2w0Var.f33474b) && wj50.m88271j(this.f33475c, c2w0Var.f33475c) && wj50.m88271j(this.f33476d, c2w0Var.f33476d) && wj50.m88271j(this.f33477e, c2w0Var.f33477e) && wj50.m88271j(this.f33478f, c2w0Var.f33478f) && wj50.m88271j(this.f33479g, c2w0Var.f33479g);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(s571.m77243b(this.f33473a.hashCode() * 31, 31, this.f33474b), 31, this.f33475c), 31, this.f33476d);
        String str = this.f33477e;
        int iHashCode = (iM77244c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f33478f;
        return this.f33479g.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
