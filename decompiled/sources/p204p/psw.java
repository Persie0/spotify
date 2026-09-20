package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class psw implements v2x {

    /* JADX INFO: renamed from: a */
    public final up60 f180995a;

    public psw(up60 up60Var) {
        this.f180995a = up60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof psw) && wj50.m88271j(this.f180995a, ((psw) obj).f180995a);
    }

    public final int hashCode() {
        return this.f180995a.hashCode();
    }
}
