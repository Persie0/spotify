package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class iq8 extends kq8 {

    /* JADX INFO: renamed from: a */
    public final boolean f104651a;

    public iq8(boolean z) {
        this.f104651a = z;
    }

    @Override // p204p.kq8
    /* JADX INFO: renamed from: a */
    public final int mo42399a() {
        return 8;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m51349b() {
        return this.f104651a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iq8) && this.f104651a == ((iq8) obj).f104651a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104651a);
    }
}
