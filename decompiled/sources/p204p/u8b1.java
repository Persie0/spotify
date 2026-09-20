package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class u8b1 {

    /* JADX INFO: renamed from: a */
    public final String f227898a;

    /* JADX INFO: renamed from: b */
    public final String f227899b;

    public u8b1(String str, String str2) {
        this.f227898a = str;
        this.f227899b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8b1)) {
            return false;
        }
        u8b1 u8b1Var = (u8b1) obj;
        return wj50.m88271j(this.f227898a, u8b1Var.f227898a) && wj50.m88271j(this.f227899b, u8b1Var.f227899b);
    }

    public final int hashCode() {
        return this.f227899b.hashCode() + (this.f227898a.hashCode() * 31);
    }
}
