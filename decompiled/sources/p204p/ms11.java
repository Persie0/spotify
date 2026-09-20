package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ms11 {

    /* JADX INFO: renamed from: a */
    public final String f146675a;

    /* JADX INFO: renamed from: b */
    public final String f146676b;

    public ms11(String str, String str2) {
        this.f146675a = str;
        this.f146676b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms11)) {
            return false;
        }
        ms11 ms11Var = (ms11) obj;
        return wj50.m88271j(this.f146675a, ms11Var.f146675a) && wj50.m88271j(this.f146676b, ms11Var.f146676b);
    }

    public final int hashCode() {
        return this.f146676b.hashCode() + (this.f146675a.hashCode() * 31);
    }
}
