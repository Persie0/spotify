package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class d870 extends z770 {

    /* JADX INFO: renamed from: a */
    public final byte f46397a;

    public d870(byte b) {
        this.f46397a = b;
    }

    @Override // p204p.z770
    /* JADX INFO: renamed from: a */
    public final Object mo25032a() {
        return new uq91(this.f46397a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d870) && this.f46397a == ((d870) obj).f46397a;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f46397a);
    }
}
