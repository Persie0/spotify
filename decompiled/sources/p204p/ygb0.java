package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ygb0 extends bhb0 {

    /* JADX INFO: renamed from: b */
    public final int f272547b;

    public ygb0(int i) {
        super(i);
        this.f272547b = i;
    }

    @Override // p204p.bhb0
    /* JADX INFO: renamed from: a */
    public final int mo25925a() {
        return this.f272547b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ygb0) && this.f272547b == ((ygb0) obj).f272547b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f272547b);
    }
}
