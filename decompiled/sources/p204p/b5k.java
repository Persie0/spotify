package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class b5k implements g5k {

    /* JADX INFO: renamed from: a */
    public final String f23600a;

    public b5k(String str) {
        this.f23600a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b5k) && wj50.m88271j(this.f23600a, ((b5k) obj).f23600a);
    }

    public final int hashCode() {
        return this.f23600a.hashCode();
    }
}
