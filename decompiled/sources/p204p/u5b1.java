package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class u5b1 {

    /* JADX INFO: renamed from: a */
    public final String f226966a;

    /* JADX INFO: renamed from: b */
    public final String f226967b;

    public u5b1(String str, String str2) {
        this.f226966a = str;
        this.f226967b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5b1)) {
            return false;
        }
        u5b1 u5b1Var = (u5b1) obj;
        return this.f226966a.equals(u5b1Var.f226966a) && this.f226967b.equals(u5b1Var.f226967b);
    }

    public final int hashCode() {
        return s571.m77243b(this.f226966a.hashCode() * 31, 31, this.f226967b);
    }
}
