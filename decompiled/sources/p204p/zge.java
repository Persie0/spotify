package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zge {

    /* JADX INFO: renamed from: a */
    public final int f282598a;

    public zge(int i) {
        this.f282598a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zge) && this.f282598a == ((zge) obj).f282598a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f282598a);
    }
}
