package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class f6c extends i6c {

    /* JADX INFO: renamed from: a */
    public final int f66360a;

    /* JADX INFO: renamed from: b */
    public final int f66361b;

    public f6c(int i, int i2) {
        this.f66360a = i;
        this.f66361b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6c)) {
            return false;
        }
        f6c f6cVar = (f6c) obj;
        return this.f66360a == f6cVar.f66360a && this.f66361b == f6cVar.f66361b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f66361b) + (Integer.hashCode(this.f66360a) * 31);
    }
}
