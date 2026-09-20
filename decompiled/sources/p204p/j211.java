package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class j211 extends hvg1 {

    /* JADX INFO: renamed from: b */
    public final int f107903b;

    /* JADX INFO: renamed from: c */
    public final String f107904c;

    public j211(int i, String str) {
        this.f107903b = i;
        this.f107904c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j211)) {
            return false;
        }
        j211 j211Var = (j211) obj;
        return this.f107903b == j211Var.f107903b && wj50.m88271j(this.f107904c, j211Var.f107904c);
    }

    public final int hashCode() {
        return this.f107904c.hashCode() + (Integer.hashCode(this.f107903b) * 31);
    }
}
