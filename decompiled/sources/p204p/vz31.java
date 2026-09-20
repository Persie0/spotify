package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vz31 implements b041 {

    /* JADX INFO: renamed from: a */
    public final String f246374a;

    /* JADX INFO: renamed from: b */
    public final String f246375b;

    /* JADX INFO: renamed from: c */
    public final float f246376c;

    public vz31(float f, String str, String str2) {
        this.f246374a = str;
        this.f246375b = str2;
        this.f246376c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz31)) {
            return false;
        }
        vz31 vz31Var = (vz31) obj;
        return wj50.m88271j(this.f246374a, vz31Var.f246374a) && wj50.m88271j(this.f246375b, vz31Var.f246375b) && Float.compare(this.f246376c, vz31Var.f246376c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f246376c) + s571.m77243b(this.f246374a.hashCode() * 31, 31, this.f246375b);
    }
}
