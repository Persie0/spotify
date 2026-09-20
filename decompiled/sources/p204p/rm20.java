package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rm20 {

    /* JADX INFO: renamed from: a */
    public final rv41 f200423a;

    /* JADX INFO: renamed from: b */
    public final rv41 f200424b;

    public rm20(kqi0 kqi0Var, rv41 rv41Var) {
        this.f200423a = kqi0Var;
        this.f200424b = rv41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm20)) {
            return false;
        }
        rm20 rm20Var = (rm20) obj;
        return wj50.m88271j(this.f200423a, rm20Var.f200423a) && wj50.m88271j(this.f200424b, rm20Var.f200424b);
    }

    public final int hashCode() {
        return this.f200424b.hashCode() + (this.f200423a.hashCode() * 31);
    }
}
