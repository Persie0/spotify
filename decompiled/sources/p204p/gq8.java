package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gq8 extends kq8 {

    /* JADX INFO: renamed from: a */
    public final w9s f83382a;

    public gq8(w9s w9sVar) {
        this.f83382a = w9sVar;
    }

    @Override // p204p.kq8
    /* JADX INFO: renamed from: a */
    public final int mo42399a() {
        return 40;
    }

    /* JADX INFO: renamed from: b */
    public final w9s m45412b() {
        return this.f83382a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gq8) && this.f83382a == ((gq8) obj).f83382a;
    }

    public final int hashCode() {
        return this.f83382a.hashCode();
    }
}
