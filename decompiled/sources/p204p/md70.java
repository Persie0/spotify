package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class md70 implements Comparable {

    /* JADX INFO: renamed from: e */
    public static final md70 f142336e = tug1.m81578p();

    /* JADX INFO: renamed from: a */
    public final int f142337a;

    /* JADX INFO: renamed from: b */
    public final int f142338b;

    /* JADX INFO: renamed from: c */
    public final int f142339c;

    /* JADX INFO: renamed from: d */
    public final int f142340d;

    public md70(int i, int i2, int i3) {
        this.f142337a = i;
        this.f142338b = i2;
        this.f142339c = i3;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            this.f142340d = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f142340d - ((md70) obj).f142340d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        md70 md70Var = obj instanceof md70 ? (md70) obj : null;
        return md70Var != null && this.f142340d == md70Var.f142340d;
    }

    public final int hashCode() {
        return this.f142340d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f142337a);
        sb.append('.');
        sb.append(this.f142338b);
        sb.append('.');
        sb.append(this.f142339c);
        return sb.toString();
    }
}
