package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ces {

    /* JADX INFO: renamed from: a */
    public final int f37171a;

    /* JADX INFO: renamed from: b */
    public final float f37172b;

    public ces(int i, float f) {
        this.f37171a = i;
        this.f37172b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ces)) {
            return false;
        }
        ces cesVar = (ces) obj;
        return this.f37171a == cesVar.f37171a && Float.compare(this.f37172b, cesVar.f37172b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f37172b) + (Integer.hashCode(this.f37171a) * 31);
    }
}
