package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pki implements sli {

    /* JADX INFO: renamed from: a */
    public final ms51 f178465a;

    public pki(ms51 ms51Var) {
        this.f178465a = ms51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pki) && wj50.m88271j(this.f178465a, ((pki) obj).f178465a);
    }

    public final int hashCode() {
        return this.f178465a.hashCode();
    }
}
