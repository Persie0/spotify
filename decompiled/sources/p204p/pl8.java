package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pl8 implements sl8 {

    /* JADX INFO: renamed from: a */
    public final String f178660a;

    /* JADX INFO: renamed from: b */
    public final String f178661b;

    public pl8(String str, String str2) {
        this.f178660a = str;
        this.f178661b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl8)) {
            return false;
        }
        pl8 pl8Var = (pl8) obj;
        return wj50.m88271j(this.f178660a, pl8Var.f178660a) && wj50.m88271j(this.f178661b, pl8Var.f178661b);
    }

    public final int hashCode() {
        return this.f178661b.hashCode() + (this.f178660a.hashCode() * 31);
    }
}
