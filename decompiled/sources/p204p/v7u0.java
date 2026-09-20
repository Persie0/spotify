package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class v7u0 {

    /* JADX INFO: renamed from: a */
    public final ci20 f238317a;

    /* JADX INFO: renamed from: b */
    public final String f238318b;

    public v7u0(ci20 ci20Var, String str) {
        this.f238317a = ci20Var;
        this.f238318b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7u0)) {
            return false;
        }
        v7u0 v7u0Var = (v7u0) obj;
        return wj50.m88271j(this.f238317a, v7u0Var.f238317a) && wj50.m88271j(this.f238318b, v7u0Var.f238318b);
    }

    public final int hashCode() {
        return this.f238318b.hashCode() + (this.f238317a.hashCode() * 31);
    }
}
