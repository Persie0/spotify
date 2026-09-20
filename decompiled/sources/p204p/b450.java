package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class b450 extends z350 implements fte {

    /* JADX INFO: renamed from: d */
    public static final b450 f23226d = new b450(1, 0, 1);

    /* JADX INFO: renamed from: a */
    public final boolean m28070a(int i) {
        return this.f278778a <= i && i <= this.f278779b;
    }

    @Override // p204p.z350
    public final boolean equals(Object obj) {
        if (!(obj instanceof b450)) {
            return false;
        }
        if (isEmpty() && ((b450) obj).isEmpty()) {
            return true;
        }
        b450 b450Var = (b450) obj;
        return this.f278778a == b450Var.f278778a && this.f278779b == b450Var.f278779b;
    }

    @Override // p204p.z350
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f278778a * 31) + this.f278779b;
    }

    @Override // p204p.z350, p204p.fte
    public final boolean isEmpty() {
        return this.f278778a > this.f278779b;
    }

    @Override // p204p.fte
    /* JADX INFO: renamed from: n */
    public final Comparable mo28071n() {
        return Integer.valueOf(this.f278778a);
    }

    @Override // p204p.fte
    /* JADX INFO: renamed from: o */
    public final Comparable mo28072o() {
        return Integer.valueOf(this.f278779b);
    }

    @Override // p204p.z350
    public final String toString() {
        return this.f278778a + ".." + this.f278779b;
    }
}
