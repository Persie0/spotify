package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pn7 implements qn7 {

    /* JADX INFO: renamed from: a */
    public final String f179328a;

    /* JADX INFO: renamed from: b */
    public final String f179329b;

    public pn7(String str, String str2) {
        this.f179328a = str;
        this.f179329b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn7)) {
            return false;
        }
        pn7 pn7Var = (pn7) obj;
        return wj50.m88271j(this.f179328a, pn7Var.f179328a) && wj50.m88271j(this.f179329b, pn7Var.f179329b);
    }

    public final int hashCode() {
        return this.f179329b.hashCode() + (this.f179328a.hashCode() * 31);
    }
}
