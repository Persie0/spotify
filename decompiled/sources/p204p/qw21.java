package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qw21 {

    /* JADX INFO: renamed from: a */
    public final dk91 f193153a;

    /* JADX INFO: renamed from: b */
    public final uw21 f193154b;

    public qw21(dk91 dk91Var, uw21 uw21Var) {
        this.f193153a = dk91Var;
        this.f193154b = uw21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw21)) {
            return false;
        }
        qw21 qw21Var = (qw21) obj;
        return wj50.m88271j(this.f193153a, qw21Var.f193153a) && wj50.m88271j(this.f193154b, qw21Var.f193154b);
    }

    public final int hashCode() {
        return this.f193154b.hashCode() + (this.f193153a.hashCode() * 31);
    }
}
