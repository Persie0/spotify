package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class o8w extends t8w {

    /* JADX INFO: renamed from: a */
    public final j6y f162883a;

    public o8w(j6y j6yVar) {
        this.f162883a = j6yVar;
    }

    @Override // p204p.t8w
    /* JADX INFO: renamed from: a */
    public final boolean mo63860a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8w) && this.f162883a.equals(((o8w) obj).f162883a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f162883a.hashCode() * 31);
    }
}
