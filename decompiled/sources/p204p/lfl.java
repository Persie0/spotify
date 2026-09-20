package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lfl implements nfl {

    /* JADX INFO: renamed from: a */
    public final kfl f132970a;

    public lfl(kfl kflVar) {
        this.f132970a = kflVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lfl) && wj50.m88271j(this.f132970a, ((lfl) obj).f132970a);
    }

    public final int hashCode() {
        return this.f132970a.hashCode();
    }
}
