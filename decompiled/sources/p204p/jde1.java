package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jde1 {

    /* JADX INFO: renamed from: a */
    public final sjd f111341a;

    /* JADX INFO: renamed from: b */
    public final boolean f111342b;

    public jde1(sjd sjdVar, boolean z) {
        this.f111341a = sjdVar;
        this.f111342b = z;
    }

    /* JADX INFO: renamed from: a */
    public static jde1 m53020a(jde1 jde1Var, sjd sjdVar, int i) {
        if ((i & 1) != 0) {
            sjdVar = jde1Var.f111341a;
        }
        boolean z = (i & 2) != 0 ? jde1Var.f111342b : true;
        jde1Var.getClass();
        return new jde1(sjdVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jde1)) {
            return false;
        }
        jde1 jde1Var = (jde1) obj;
        return wj50.m88271j(this.f111341a, jde1Var.f111341a) && this.f111342b == jde1Var.f111342b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111342b) + (this.f111341a.hashCode() * 31);
    }
}
