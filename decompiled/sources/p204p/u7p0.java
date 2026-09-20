package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u7p0 extends h8p0 {

    /* JADX INFO: renamed from: a */
    public final String f227738a;

    /* JADX INFO: renamed from: b */
    public final boolean f227739b;

    public u7p0(String str, boolean z) {
        str.getClass();
        this.f227738a = str;
        this.f227739b = z;
    }

    @Override // p204p.h8p0
    /* JADX INFO: renamed from: a */
    public final Object mo25046a(brw brwVar, crw crwVar, h7u h7uVar, b5p b5pVar, k9u k9uVar, i2v i2vVar, d9p d9pVar, drw drwVar, erw erwVar, xqw xqwVar, yqw yqwVar, zqw zqwVar, arw arwVar) {
        return h7uVar.mo98394apply(this);
    }

    @Override // p204p.h8p0
    /* JADX INFO: renamed from: b */
    public final void mo25047b(wx41 wx41Var, onz0 onz0Var, wx41 wx41Var2, wx41 wx41Var3, wx41 wx41Var4, kq11 kq11Var, vr11 vr11Var, prv0 prv0Var, wx41 wx41Var5, ux41 ux41Var, vx41 vx41Var, rg41 rg41Var) {
        wx41Var2.m89218a(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u7p0)) {
            return false;
        }
        u7p0 u7p0Var = (u7p0) obj;
        return u7p0Var.f227739b == this.f227739b && u7p0Var.f227738a.equals(this.f227738a);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f227739b).hashCode() + (this.f227738a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pause{featureIdentifier=");
        sb.append(this.f227738a);
        sb.append(", systemInitiated=");
        return s571.m77253l(sb, this.f227739b, '}');
    }
}
