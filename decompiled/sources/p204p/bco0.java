package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bco0 implements cco0 {

    /* JADX INFO: renamed from: a */
    public final int f25927a;

    public bco0(int i) {
        this.f25927a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bco0) && this.f25927a == ((bco0) obj).f25927a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25927a);
    }
}
