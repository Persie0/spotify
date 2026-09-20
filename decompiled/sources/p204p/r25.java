package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class r25 implements u25 {

    /* JADX INFO: renamed from: a */
    public final boolean f195051a;

    public r25(boolean z) {
        this.f195051a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r25) && this.f195051a == ((r25) obj).f195051a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f195051a);
    }
}
