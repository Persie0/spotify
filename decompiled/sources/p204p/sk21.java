package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class sk21 {

    /* JADX INFO: renamed from: a */
    public final String f209980a;

    /* JADX INFO: renamed from: b */
    public final String f209981b;

    /* JADX INFO: renamed from: c */
    public final List f209982c;

    public sk21(String str, List list, String str2) {
        this.f209980a = str;
        this.f209981b = str2;
        this.f209982c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk21)) {
            return false;
        }
        sk21 sk21Var = (sk21) obj;
        return wj50.m88271j(this.f209980a, sk21Var.f209980a) && wj50.m88271j(this.f209981b, sk21Var.f209981b) && wj50.m88271j(this.f209982c, sk21Var.f209982c);
    }

    public final int hashCode() {
        return this.f209982c.hashCode() + s571.m77243b(this.f209980a.hashCode() * 31, 31, this.f209981b);
    }
}
