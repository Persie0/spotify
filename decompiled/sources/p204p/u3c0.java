package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u3c0 {

    /* JADX INFO: renamed from: a */
    public final Boolean f226317a;

    /* JADX INFO: renamed from: b */
    public final Boolean f226318b;

    /* JADX INFO: renamed from: c */
    public final Boolean f226319c;

    /* JADX INFO: renamed from: d */
    public final Boolean f226320d;

    public u3c0(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.f226317a = bool;
        this.f226318b = bool2;
        this.f226319c = bool3;
        this.f226320d = bool4;
    }

    /* JADX INFO: renamed from: a */
    public static u3c0 m82275a(u3c0 u3c0Var, Boolean bool, Boolean bool2, Boolean bool3, int i) {
        if ((i & 1) != 0) {
            bool = u3c0Var.f226317a;
        }
        Boolean bool4 = u3c0Var.f226318b;
        if ((i & 4) != 0) {
            bool2 = u3c0Var.f226319c;
        }
        if ((i & 8) != 0) {
            bool3 = u3c0Var.f226320d;
        }
        u3c0Var.getClass();
        return new u3c0(bool, bool4, bool2, bool3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3c0)) {
            return false;
        }
        u3c0 u3c0Var = (u3c0) obj;
        return wj50.m88271j(this.f226317a, u3c0Var.f226317a) && wj50.m88271j(this.f226318b, u3c0Var.f226318b) && wj50.m88271j(this.f226319c, u3c0Var.f226319c) && wj50.m88271j(this.f226320d, u3c0Var.f226320d);
    }

    public final int hashCode() {
        Boolean bool = this.f226317a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f226318b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f226319c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f226320d;
        return iHashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }
}
