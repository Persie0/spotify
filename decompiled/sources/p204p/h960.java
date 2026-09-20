package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class h960 implements m960 {

    /* JADX INFO: renamed from: a */
    public final boolean f88885a;

    public h960(boolean z) {
        this.f88885a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h960) && this.f88885a == ((h960) obj).f88885a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88885a);
    }
}
