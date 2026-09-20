package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class a89 {

    /* JADX INFO: renamed from: a */
    public final String f13224a;

    /* JADX INFO: renamed from: b */
    public final String f13225b;

    /* JADX INFO: renamed from: c */
    public final String f13226c;

    /* JADX INFO: renamed from: d */
    public final String f13227d;

    /* JADX INFO: renamed from: e */
    public final List f13228e;

    public a89(String str, String str2, String str3, String str4, List list) {
        this.f13224a = str;
        this.f13225b = str2;
        this.f13226c = str3;
        this.f13227d = str4;
        this.f13228e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a89)) {
            return false;
        }
        a89 a89Var = (a89) obj;
        return wj50.m88271j(this.f13224a, a89Var.f13224a) && wj50.m88271j(this.f13225b, a89Var.f13225b) && wj50.m88271j(this.f13226c, a89Var.f13226c) && wj50.m88271j(this.f13227d, a89Var.f13227d) && wj50.m88271j(this.f13228e, a89Var.f13228e);
    }

    public final int hashCode() {
        return this.f13228e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f13224a.hashCode() * 31, 31, this.f13225b), 31, this.f13226c), 31, this.f13227d);
    }
}
