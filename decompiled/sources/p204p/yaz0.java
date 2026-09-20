package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yaz0 {

    /* JADX INFO: renamed from: a */
    public final String f271031a;

    /* JADX INFO: renamed from: b */
    public final bc51 f271032b;

    public yaz0(String str, bc51 bc51Var) {
        this.f271031a = str;
        this.f271032b = bc51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yaz0)) {
            return false;
        }
        yaz0 yaz0Var = (yaz0) obj;
        return wj50.m88271j(this.f271031a, yaz0Var.f271031a) && wj50.m88271j(this.f271032b, yaz0Var.f271032b);
    }

    public final int hashCode() {
        return this.f271032b.hashCode() + (this.f271031a.hashCode() * 31);
    }
}
