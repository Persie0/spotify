package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class s770 extends z770 {

    /* JADX INFO: renamed from: a */
    public final byte f206289a;

    public s770(byte b) {
        this.f206289a = b;
    }

    @Override // p204p.z770
    /* JADX INFO: renamed from: a */
    public final Object mo25032a() {
        return Byte.valueOf(this.f206289a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s770) && this.f206289a == ((s770) obj).f206289a;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f206289a);
    }
}
