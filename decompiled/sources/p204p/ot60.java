package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ot60 implements rt60 {

    /* JADX INFO: renamed from: a */
    public final String f168985a;

    /* JADX INFO: renamed from: b */
    public final String f168986b;

    /* JADX INFO: renamed from: c */
    public final String f168987c;

    public ot60(String str, String str2, String str3) {
        this.f168985a = str;
        this.f168986b = str2;
        this.f168987c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot60)) {
            return false;
        }
        ot60 ot60Var = (ot60) obj;
        return wj50.m88271j(this.f168985a, ot60Var.f168985a) && wj50.m88271j(this.f168986b, ot60Var.f168986b) && wj50.m88271j(this.f168987c, ot60Var.f168987c);
    }

    public final int hashCode() {
        return this.f168987c.hashCode() + s571.m77243b(this.f168985a.hashCode() * 31, 31, this.f168986b);
    }
}
