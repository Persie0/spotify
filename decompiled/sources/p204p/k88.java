package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class k88 implements n88 {

    /* JADX INFO: renamed from: a */
    public final int f120266a;

    /* JADX INFO: renamed from: b */
    public final boolean f120267b;

    /* JADX INFO: renamed from: c */
    public final String f120268c;

    public k88(String str, int i, boolean z) {
        this.f120266a = i;
        this.f120267b = z;
        this.f120268c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k88)) {
            return false;
        }
        k88 k88Var = (k88) obj;
        return this.f120266a == k88Var.f120266a && this.f120267b == k88Var.f120267b && wj50.m88271j(this.f120268c, k88Var.f120268c);
    }

    public final int hashCode() {
        return this.f120268c.hashCode() + s571.m77245d(Integer.hashCode(this.f120266a) * 31, 31, this.f120267b);
    }
}
