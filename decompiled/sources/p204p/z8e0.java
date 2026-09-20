package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class z8e0 {

    /* JADX INFO: renamed from: a */
    public final String f280456a;

    /* JADX INFO: renamed from: b */
    public final String f280457b;

    /* JADX INFO: renamed from: c */
    public final p8e0 f280458c;

    public z8e0(String str, String str2, p8e0 p8e0Var) {
        this.f280456a = str;
        this.f280457b = str2;
        this.f280458c = p8e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8e0)) {
            return false;
        }
        z8e0 z8e0Var = (z8e0) obj;
        return wj50.m88271j(this.f280456a, z8e0Var.f280456a) && wj50.m88271j(this.f280457b, z8e0Var.f280457b) && wj50.m88271j(this.f280458c, z8e0Var.f280458c);
    }

    public final int hashCode() {
        return this.f280458c.hashCode() + s571.m77243b(this.f280456a.hashCode() * 31, 31, this.f280457b);
    }
}
