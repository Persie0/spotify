package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cvs0 extends dvs0 {

    /* JADX INFO: renamed from: a */
    public final boolean f42535a;

    /* JADX INFO: renamed from: b */
    public final String f42536b;

    /* JADX INFO: renamed from: c */
    public final boolean f42537c;

    public cvs0(String str, boolean z, boolean z2) {
        this.f42535a = z;
        this.f42536b = str;
        this.f42537c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvs0)) {
            return false;
        }
        cvs0 cvs0Var = (cvs0) obj;
        return this.f42535a == cvs0Var.f42535a && wj50.m88271j(this.f42536b, cvs0Var.f42536b) && this.f42537c == cvs0Var.f42537c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f42535a) * 31;
        String str = this.f42536b;
        return Boolean.hashCode(this.f42537c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
