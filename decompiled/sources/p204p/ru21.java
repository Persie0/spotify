package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ru21 {

    /* JADX INFO: renamed from: a */
    public final int f202732a;

    /* JADX INFO: renamed from: b */
    public final int f202733b;

    public ru21(int i, int i2) {
        this.f202732a = i;
        this.f202733b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m76410a() {
        return this.f202732a;
    }

    /* JADX INFO: renamed from: b */
    public final int m76411b() {
        return this.f202733b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru21)) {
            return false;
        }
        ru21 ru21Var = (ru21) obj;
        return this.f202732a == ru21Var.f202732a && this.f202733b == ru21Var.f202733b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f202733b) + (Integer.hashCode(this.f202732a) * 31);
    }
}
