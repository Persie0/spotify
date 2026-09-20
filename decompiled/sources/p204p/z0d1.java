package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class z0d1 implements f1d1 {

    /* JADX INFO: renamed from: a */
    public final String f278070a;

    /* JADX INFO: renamed from: b */
    public final String f278071b;

    /* JADX INFO: renamed from: c */
    public final String f278072c;

    public z0d1(String str, String str2, String str3) {
        this.f278070a = str;
        this.f278071b = str2;
        this.f278072c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0d1)) {
            return false;
        }
        z0d1 z0d1Var = (z0d1) obj;
        return wj50.m88271j(this.f278070a, z0d1Var.f278070a) && wj50.m88271j(this.f278071b, z0d1Var.f278071b) && wj50.m88271j(this.f278072c, z0d1Var.f278072c);
    }

    public final int hashCode() {
        return this.f278072c.hashCode() + s571.m77243b(this.f278070a.hashCode() * 31, 31, this.f278071b);
    }
}
