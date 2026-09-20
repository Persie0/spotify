package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ruq0 {

    /* JADX INFO: renamed from: a */
    public final q7z0 f202893a;

    /* JADX INFO: renamed from: b */
    public final fje0 f202894b;

    public ruq0(q7z0 q7z0Var, fje0 fje0Var) {
        this.f202893a = q7z0Var;
        this.f202894b = fje0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ruq0)) {
            return false;
        }
        ruq0 ruq0Var = (ruq0) obj;
        return wj50.m88271j(this.f202893a, ruq0Var.f202893a) && wj50.m88271j(this.f202894b, ruq0Var.f202894b);
    }

    public final int hashCode() {
        return this.f202894b.f70207a.hashCode() + (this.f202893a.hashCode() * 31);
    }
}
