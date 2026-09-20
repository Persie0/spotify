package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pf61 {

    /* JADX INFO: renamed from: a */
    public final String f176974a;

    /* JADX INFO: renamed from: b */
    public final eh00 f176975b;

    public pf61(String str, eh00 eh00Var) {
        this.f176974a = str;
        this.f176975b = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf61)) {
            return false;
        }
        pf61 pf61Var = (pf61) obj;
        return wj50.m88271j(this.f176974a, pf61Var.f176974a) && wj50.m88271j(this.f176975b, pf61Var.f176975b);
    }

    public final int hashCode() {
        return this.f176975b.hashCode() + (this.f176974a.hashCode() * 31);
    }
}
