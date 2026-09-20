package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class b0g0 implements f0g0 {

    /* JADX INFO: renamed from: a */
    public final String f21912a;

    /* JADX INFO: renamed from: b */
    public final List f21913b;

    /* JADX INFO: renamed from: c */
    public final List f21914c;

    public b0g0(String str, List list, List list2) {
        this.f21912a = str;
        this.f21913b = list;
        this.f21914c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0g0)) {
            return false;
        }
        b0g0 b0g0Var = (b0g0) obj;
        return wj50.m88271j(this.f21912a, b0g0Var.f21912a) && wj50.m88271j(this.f21913b, b0g0Var.f21913b) && wj50.m88271j(this.f21914c, b0g0Var.f21914c);
    }

    public final int hashCode() {
        return this.f21914c.hashCode() + s571.m77244c(this.f21912a.hashCode() * 31, 31, this.f21913b);
    }
}
