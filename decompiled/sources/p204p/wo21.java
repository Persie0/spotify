package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wo21 {

    /* JADX INFO: renamed from: a */
    public final kq21 f253359a;

    /* JADX INFO: renamed from: b */
    public final String f253360b;

    /* JADX INFO: renamed from: c */
    public final gh00 f253361c;

    public wo21(kq21 kq21Var, String str, gh00 gh00Var) {
        this.f253359a = kq21Var;
        this.f253360b = str;
        this.f253361c = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo21)) {
            return false;
        }
        wo21 wo21Var = (wo21) obj;
        return wj50.m88271j(this.f253359a, wo21Var.f253359a) && wj50.m88271j(this.f253360b, wo21Var.f253360b) && wj50.m88271j(this.f253361c, wo21Var.f253361c);
    }

    public final int hashCode() {
        this.f253359a.getClass();
        return this.f253361c.hashCode() + s571.m77243b(-1554554593, 31, this.f253360b);
    }
}
