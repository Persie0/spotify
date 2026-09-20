package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uy91 {

    /* JADX INFO: renamed from: a */
    public final String f235218a;

    /* JADX INFO: renamed from: b */
    public final String f235219b;

    public uy91(String str, String str2) {
        this.f235218a = str;
        this.f235219b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy91)) {
            return false;
        }
        uy91 uy91Var = (uy91) obj;
        return wj50.m88271j(this.f235218a, uy91Var.f235218a) && wj50.m88271j(this.f235219b, uy91Var.f235219b);
    }

    public final int hashCode() {
        return this.f235219b.hashCode() + (this.f235218a.hashCode() * 31);
    }
}
