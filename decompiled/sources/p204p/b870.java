package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class b870 extends z770 {

    /* JADX INFO: renamed from: a */
    public final short f24514a;

    public b870(short s) {
        this.f24514a = s;
    }

    @Override // p204p.z770
    /* JADX INFO: renamed from: a */
    public final Object mo25032a() {
        return Short.valueOf(this.f24514a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b870) && this.f24514a == ((b870) obj).f24514a;
    }

    public final int hashCode() {
        return Short.hashCode(this.f24514a);
    }
}
