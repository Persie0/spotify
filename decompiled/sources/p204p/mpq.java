package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mpq implements jts {

    /* JADX INFO: renamed from: a */
    public final int f146065a;

    /* JADX INFO: renamed from: b */
    public final int f146066b;

    public mpq(int i, int i2) {
        this.f146065a = i;
        this.f146066b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        nt40.m65597a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // p204p.jts
    /* JADX INFO: renamed from: a */
    public final void mo28124a(kha khaVar) {
        int iM56409o = khaVar.m56409o();
        int i = this.f146066b;
        int iM56408n = iM56409o + i;
        if (((iM56409o ^ iM56408n) & (i ^ iM56408n)) < 0) {
            iM56408n = khaVar.m56408n();
        }
        khaVar.m56402f(khaVar.m56409o(), Math.min(iM56408n, khaVar.m56408n()));
        int iM56410p = khaVar.m56410p();
        int i2 = this.f146065a;
        int i3 = iM56410p - i2;
        if (((iM56410p ^ i3) & (i2 ^ iM56410p)) < 0) {
            i3 = 0;
        }
        khaVar.m56402f(Math.max(0, i3), khaVar.m56410p());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpq)) {
            return false;
        }
        mpq mpqVar = (mpq) obj;
        return this.f146065a == mpqVar.f146065a && this.f146066b == mpqVar.f146066b;
    }

    public final int hashCode() {
        return (this.f146065a * 31) + this.f146066b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f146065a);
        sb.append(", lengthAfterCursor=");
        return edb.m38567p(sb, this.f146066b, ')');
    }
}
