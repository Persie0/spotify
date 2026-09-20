package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class nzl implements oi0 {

    /* JADX INFO: renamed from: a */
    public final int f160103a;

    public nzl(int i) {
        this.f160103a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nzl) && this.f160103a == ((nzl) obj).f160103a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f160103a);
    }
}
