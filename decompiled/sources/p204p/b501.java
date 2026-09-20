package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class b501 implements jts {

    /* JADX INFO: renamed from: a */
    public final int f23462a;

    /* JADX INFO: renamed from: b */
    public final int f23463b;

    public b501(int i, int i2) {
        this.f23462a = i;
        this.f23463b = i2;
    }

    @Override // p204p.jts
    /* JADX INFO: renamed from: a */
    public final void mo28124a(kha khaVar) {
        if (khaVar.m56411q()) {
            khaVar.m56401e();
        }
        int iM63437n = n0e1.m63437n(this.f23462a, 0, khaVar.m56408n());
        int iM63437n2 = n0e1.m63437n(this.f23463b, 0, khaVar.m56408n());
        if (iM63437n != iM63437n2) {
            if (iM63437n < iM63437n2) {
                khaVar.m56417w(iM63437n, iM63437n2);
            } else {
                khaVar.m56417w(iM63437n2, iM63437n);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b501)) {
            return false;
        }
        b501 b501Var = (b501) obj;
        return this.f23462a == b501Var.f23462a && this.f23463b == b501Var.f23463b;
    }

    public final int hashCode() {
        return (this.f23462a * 31) + this.f23463b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f23462a);
        sb.append(", end=");
        return edb.m38567p(sb, this.f23463b, ')');
    }
}
