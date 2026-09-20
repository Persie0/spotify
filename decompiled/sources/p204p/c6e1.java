package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class c6e1 implements l6e1 {

    /* JADX INFO: renamed from: a */
    public final String f34520a;

    /* JADX INFO: renamed from: b */
    public final String f34521b;

    /* JADX INFO: renamed from: c */
    public final int f34522c;

    /* JADX INFO: renamed from: d */
    public final Integer f34523d;

    public c6e1(int i, String str, Integer num, String str2) {
        this.f34520a = str;
        this.f34521b = str2;
        this.f34522c = i;
        this.f34523d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6e1)) {
            return false;
        }
        c6e1 c6e1Var = (c6e1) obj;
        return this.f34520a.equals(c6e1Var.f34520a) && this.f34521b.equals(c6e1Var.f34521b) && this.f34522c == c6e1Var.f34522c && wj50.m88271j(this.f34523d, c6e1Var.f34523d);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f34522c, s571.m77243b(this.f34520a.hashCode() * 31, 31, this.f34521b), 31);
        Integer num = this.f34523d;
        return iM40938f + (num == null ? 0 : num.hashCode());
    }
}
