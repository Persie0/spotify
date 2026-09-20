package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dt11 {

    /* JADX INFO: renamed from: a */
    public final String f52696a;

    /* JADX INFO: renamed from: b */
    public final String f52697b;

    public dt11(String str, String str2) {
        this.f52696a = str;
        this.f52697b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt11)) {
            return false;
        }
        dt11 dt11Var = (dt11) obj;
        return wj50.m88271j(this.f52696a, dt11Var.f52696a) && wj50.m88271j(this.f52697b, dt11Var.f52697b);
    }

    public final int hashCode() {
        return this.f52697b.hashCode() + (this.f52696a.hashCode() * 31);
    }
}
