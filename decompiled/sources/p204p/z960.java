package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class z960 implements ca60 {

    /* JADX INFO: renamed from: a */
    public final boolean f280671a;

    public z960(boolean z) {
        this.f280671a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z960) && this.f280671a == ((z960) obj).f280671a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f280671a);
    }
}
