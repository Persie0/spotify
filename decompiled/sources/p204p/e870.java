package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class e870 extends z770 {

    /* JADX INFO: renamed from: a */
    public final int f57097a;

    public e870(int i) {
        this.f57097a = i;
    }

    @Override // p204p.z770
    /* JADX INFO: renamed from: a */
    public final Object mo25032a() {
        return new vr91(this.f57097a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e870) && this.f57097a == ((e870) obj).f57097a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57097a);
    }
}
