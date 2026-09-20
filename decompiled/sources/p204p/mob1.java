package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mob1 {

    /* JADX INFO: renamed from: a */
    public final lob1 f145644a;

    /* JADX INFO: renamed from: b */
    public final String f145645b;

    /* JADX INFO: renamed from: c */
    public final String f145646c;

    public mob1(lob1 lob1Var, String str, String str2) {
        this.f145644a = lob1Var;
        this.f145645b = str;
        this.f145646c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mob1)) {
            return false;
        }
        mob1 mob1Var = (mob1) obj;
        return wj50.m88271j(this.f145644a, mob1Var.f145644a) && wj50.m88271j(this.f145645b, mob1Var.f145645b) && wj50.m88271j(this.f145646c, mob1Var.f145646c);
    }

    public final int hashCode() {
        return this.f145646c.hashCode() + s571.m77243b(this.f145644a.hashCode() * 31, 31, this.f145645b);
    }
}
