package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jo2 {

    /* JADX INFO: renamed from: a */
    public final String f114273a;

    /* JADX INFO: renamed from: b */
    public final String f114274b;

    /* JADX INFO: renamed from: c */
    public final int f114275c;

    /* JADX INFO: renamed from: d */
    public final boolean f114276d;

    public jo2(String str, int i, String str2, boolean z) {
        this.f114273a = str;
        this.f114274b = str2;
        this.f114275c = i;
        this.f114276d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo2)) {
            return false;
        }
        jo2 jo2Var = (jo2) obj;
        return this.f114273a.equals(jo2Var.f114273a) && this.f114274b.equals(jo2Var.f114274b) && this.f114275c == jo2Var.f114275c && this.f114276d == jo2Var.f114276d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f114276d) + f710.m40938f(this.f114275c, s571.m77243b(this.f114273a.hashCode() * 31, 31, this.f114274b), 31);
    }
}
