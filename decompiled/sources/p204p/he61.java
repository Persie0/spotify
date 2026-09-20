package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class he61 {

    /* JADX INFO: renamed from: a */
    public final String f90335a;

    /* JADX INFO: renamed from: b */
    public final String f90336b;

    public he61(String str, String str2) {
        this.f90335a = str;
        this.f90336b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he61)) {
            return false;
        }
        he61 he61Var = (he61) obj;
        return wj50.m88271j(this.f90335a, he61Var.f90335a) && wj50.m88271j(this.f90336b, he61Var.f90336b);
    }

    public final int hashCode() {
        return this.f90336b.hashCode() + (this.f90335a.hashCode() * 31);
    }
}
