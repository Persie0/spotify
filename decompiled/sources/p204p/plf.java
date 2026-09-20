package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class plf implements bmf {

    /* JADX INFO: renamed from: a */
    public final ekf f178703a;

    public plf(ekf ekfVar) {
        this.f178703a = ekfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof plf) && wj50.m88271j(this.f178703a, ((plf) obj).f178703a);
    }

    public final int hashCode() {
        return this.f178703a.hashCode();
    }
}
