package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class a371 {

    /* JADX INFO: renamed from: a */
    public final String f11891a;

    /* JADX INFO: renamed from: b */
    public final List f11892b;

    /* JADX INFO: renamed from: c */
    public final Long f11893c;

    /* JADX INFO: renamed from: d */
    public final y271 f11894d;

    public a371(String str, List list, Long l, y271 y271Var) {
        this.f11891a = str;
        this.f11892b = list;
        this.f11893c = l;
        this.f11894d = y271Var;
    }

    /* JADX INFO: renamed from: a */
    public static a371 m24614a(a371 a371Var, y271 y271Var) {
        String str = a371Var.f11891a;
        List list = a371Var.f11892b;
        Long l = a371Var.f11893c;
        a371Var.getClass();
        return new a371(str, list, l, y271Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a371)) {
            return false;
        }
        a371 a371Var = (a371) obj;
        return wj50.m88271j(this.f11891a, a371Var.f11891a) && wj50.m88271j(this.f11892b, a371Var.f11892b) && wj50.m88271j(this.f11893c, a371Var.f11893c) && wj50.m88271j(this.f11894d, a371Var.f11894d);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(this.f11891a.hashCode() * 31, 31, this.f11892b);
        Long l = this.f11893c;
        return this.f11894d.hashCode() + ((iM77244c + (l == null ? 0 : l.hashCode())) * 31);
    }
}
