package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cda implements eda {

    /* JADX INFO: renamed from: a */
    public final int f36841a;

    public cda(int i) {
        this.f36841a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cda) && this.f36841a == ((cda) obj).f36841a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36841a);
    }
}
