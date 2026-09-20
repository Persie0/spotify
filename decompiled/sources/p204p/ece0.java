package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ece0 implements vn50 {

    /* JADX INFO: renamed from: a */
    public final String f58317a;

    /* JADX INFO: renamed from: b */
    public final String f58318b;

    /* JADX INFO: renamed from: c */
    public final String f58319c;

    /* JADX INFO: renamed from: d */
    public final fo01 f58320d;

    public ece0(String str, String str2, String str3, fo01 fo01Var) {
        this.f58317a = str;
        this.f58318b = str2;
        this.f58319c = str3;
        this.f58320d = fo01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ece0)) {
            return false;
        }
        ece0 ece0Var = (ece0) obj;
        return wj50.m88271j(this.f58317a, ece0Var.f58317a) && wj50.m88271j(this.f58318b, ece0Var.f58318b) && wj50.m88271j(this.f58319c, ece0Var.f58319c) && wj50.m88271j(this.f58320d, ece0Var.f58320d);
    }

    public final int hashCode() {
        return this.f58320d.hashCode() + s571.m77243b(s571.m77243b(this.f58317a.hashCode() * 31, 31, this.f58318b), 31, this.f58319c);
    }
}
