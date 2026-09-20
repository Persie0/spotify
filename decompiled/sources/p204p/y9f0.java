package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class y9f0 extends oaf0 {

    /* JADX INFO: renamed from: b */
    public final qsj f270585b;

    public y9f0(qsj qsjVar) {
        super(true);
        this.f270585b = qsjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y9f0) && this.f270585b == ((y9f0) obj).f270585b;
    }

    public final int hashCode() {
        return this.f270585b.hashCode();
    }
}
