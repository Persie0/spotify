package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class d351 {

    /* JADX INFO: renamed from: a */
    public final String f44774a;

    /* JADX INFO: renamed from: b */
    public final String f44775b;

    /* JADX INFO: renamed from: c */
    public final List f44776c;

    public d351(String str, List list, String str2) {
        this.f44774a = str;
        this.f44775b = str2;
        this.f44776c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d351)) {
            return false;
        }
        d351 d351Var = (d351) obj;
        return wj50.m88271j(this.f44774a, d351Var.f44774a) && wj50.m88271j(this.f44775b, d351Var.f44775b) && wj50.m88271j(this.f44776c, d351Var.f44776c);
    }

    public final int hashCode() {
        return this.f44776c.hashCode() + s571.m77243b(this.f44774a.hashCode() * 31, 31, this.f44775b);
    }
}
