package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class w67 implements x67 {

    /* JADX INFO: renamed from: a */
    public final String f248269a;

    /* JADX INFO: renamed from: b */
    public final String f248270b;

    /* JADX INFO: renamed from: c */
    public final String f248271c;

    public w67(String str, String str2, String str3) {
        this.f248269a = str;
        this.f248270b = str2;
        this.f248271c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w67)) {
            return false;
        }
        w67 w67Var = (w67) obj;
        return wj50.m88271j(this.f248269a, w67Var.f248269a) && wj50.m88271j(this.f248270b, w67Var.f248270b) && wj50.m88271j(this.f248271c, w67Var.f248271c);
    }

    public final int hashCode() {
        return this.f248271c.hashCode() + s571.m77243b(this.f248269a.hashCode() * 31, 31, this.f248270b);
    }
}
