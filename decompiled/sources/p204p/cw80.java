package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cw80 implements ew80 {

    /* JADX INFO: renamed from: a */
    public final nt80 f42665a;

    public cw80(nt80 nt80Var) {
        this.f42665a = nt80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cw80) && wj50.m88271j(this.f42665a, ((cw80) obj).f42665a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f42665a.hashCode() * 31);
    }
}
