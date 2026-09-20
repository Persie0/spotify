package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sr51 implements moc1 {

    /* JADX INFO: renamed from: a */
    public final boolean f213244a;

    /* JADX INFO: renamed from: b */
    public final qr51 f213245b;

    public sr51(boolean z, qr51 qr51Var) {
        this.f213244a = z;
        this.f213245b = qr51Var;
    }

    @Override // p204p.moc1
    /* JADX INFO: renamed from: a */
    public final int mo28648a() {
        return 5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr51)) {
            return false;
        }
        sr51 sr51Var = (sr51) obj;
        return this.f213244a == sr51Var.f213244a && wj50.m88271j(this.f213245b, sr51Var.f213245b);
    }

    public final int hashCode() {
        return this.f213245b.hashCode() + (Boolean.hashCode(this.f213244a) * 31);
    }
}
