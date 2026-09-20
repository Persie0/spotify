package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class j5c implements l5c {

    /* JADX INFO: renamed from: a */
    public final int f108930a;

    /* JADX INFO: renamed from: b */
    public final int f108931b;

    public j5c(int i, int i2) {
        this.f108930a = i;
        this.f108931b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5c)) {
            return false;
        }
        j5c j5cVar = (j5c) obj;
        return this.f108930a == j5cVar.f108930a && this.f108931b == j5cVar.f108931b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108931b) + (Integer.hashCode(this.f108930a) * 31);
    }
}
