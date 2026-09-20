package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class q31 extends lug1 {

    /* JADX INFO: renamed from: b */
    public final String f184773b;

    /* JADX INFO: renamed from: c */
    public final String f184774c;

    public q31(String str, String str2) {
        this.f184773b = str;
        this.f184774c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q31)) {
            return false;
        }
        q31 q31Var = (q31) obj;
        return wj50.m88271j(this.f184773b, q31Var.f184773b) && wj50.m88271j(this.f184774c, q31Var.f184774c);
    }

    public final int hashCode() {
        return this.f184774c.hashCode() + (this.f184773b.hashCode() * 31);
    }
}
