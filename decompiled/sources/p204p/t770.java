package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class t770 extends z770 {

    /* JADX INFO: renamed from: a */
    public final char f217723a;

    public t770(char c) {
        this.f217723a = c;
    }

    @Override // p204p.z770
    /* JADX INFO: renamed from: a */
    public final Object mo25032a() {
        return Character.valueOf(this.f217723a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t770) && this.f217723a == ((t770) obj).f217723a;
    }

    public final int hashCode() {
        return Character.hashCode(this.f217723a);
    }
}
