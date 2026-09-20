package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class msr0 extends usr0 {

    /* JADX INFO: renamed from: a */
    public final int f146846a;

    public msr0(int i) {
        this.f146846a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof msr0) && this.f146846a == ((msr0) obj).f146846a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f146846a);
    }
}
