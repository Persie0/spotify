package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dx81 {

    /* JADX INFO: renamed from: a */
    public final boolean f53904a;

    /* JADX INFO: renamed from: b */
    public final rhj f53905b;

    public dx81(boolean z, rhj rhjVar) {
        this.f53904a = z;
        this.f53905b = rhjVar;
    }

    /* JADX INFO: renamed from: a */
    public final rhj m37202a() {
        return this.f53905b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m37203b() {
        return this.f53904a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx81)) {
            return false;
        }
        dx81 dx81Var = (dx81) obj;
        return this.f53904a == dx81Var.f53904a && this.f53905b == dx81Var.f53905b;
    }

    public final int hashCode() {
        return this.f53905b.hashCode() + (Boolean.hashCode(this.f53904a) * 31);
    }
}
