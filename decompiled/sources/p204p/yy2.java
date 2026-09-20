package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yy2 {

    /* JADX INFO: renamed from: a */
    public final String f277382a;

    /* JADX INFO: renamed from: b */
    public final String f277383b;

    public yy2(String str, String str2) {
        this.f277382a = str;
        this.f277383b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy2)) {
            return false;
        }
        yy2 yy2Var = (yy2) obj;
        return wj50.m88271j(this.f277382a, yy2Var.f277382a) && wj50.m88271j(this.f277383b, yy2Var.f277383b);
    }

    public final int hashCode() {
        return this.f277383b.hashCode() + (this.f277382a.hashCode() * 31);
    }
}
