package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uz31 implements b041 {

    /* JADX INFO: renamed from: a */
    public final String f235416a;

    /* JADX INFO: renamed from: b */
    public final String f235417b;

    public uz31(String str, String str2) {
        this.f235416a = str;
        this.f235417b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz31)) {
            return false;
        }
        uz31 uz31Var = (uz31) obj;
        return wj50.m88271j(this.f235416a, uz31Var.f235416a) && wj50.m88271j(this.f235417b, uz31Var.f235417b);
    }

    public final int hashCode() {
        return this.f235417b.hashCode() + (this.f235416a.hashCode() * 31);
    }
}
