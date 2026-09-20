package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nii0 {

    /* JADX INFO: renamed from: a */
    public final String f154270a;

    /* JADX INFO: renamed from: b */
    public final String f154271b;

    public nii0(String str, String str2) {
        this.f154270a = str;
        this.f154271b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nii0)) {
            return false;
        }
        nii0 nii0Var = (nii0) obj;
        return wj50.m88271j(this.f154270a, nii0Var.f154270a) && wj50.m88271j(this.f154271b, nii0Var.f154271b);
    }

    public final int hashCode() {
        return this.f154271b.hashCode() + (this.f154270a.hashCode() * 31);
    }
}
