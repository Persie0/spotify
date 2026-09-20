package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class i601 implements jts {

    /* JADX INFO: renamed from: a */
    public final int f99066a;

    /* JADX INFO: renamed from: b */
    public final int f99067b;

    public i601(int i, int i2) {
        this.f99066a = i;
        this.f99067b = i2;
    }

    @Override // p204p.jts
    /* JADX INFO: renamed from: a */
    public final void mo28124a(kha khaVar) {
        int iM63437n = n0e1.m63437n(this.f99066a, 0, khaVar.m56408n());
        int iM63437n2 = n0e1.m63437n(this.f99067b, 0, khaVar.m56408n());
        if (iM63437n < iM63437n2) {
            khaVar.m56419y(iM63437n, iM63437n2);
        } else {
            khaVar.m56419y(iM63437n2, iM63437n);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i601)) {
            return false;
        }
        i601 i601Var = (i601) obj;
        return this.f99066a == i601Var.f99066a && this.f99067b == i601Var.f99067b;
    }

    public final int hashCode() {
        return (this.f99066a * 31) + this.f99067b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f99066a);
        sb.append(", end=");
        return edb.m38567p(sb, this.f99067b, ')');
    }
}
