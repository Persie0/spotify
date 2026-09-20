package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class no31 {

    /* JADX INFO: renamed from: a */
    public final int f156562a;

    /* JADX INFO: renamed from: b */
    public final kzk f156563b;

    public no31(int i, kzk kzkVar) {
        this.f156562a = i;
        this.f156563b = kzkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no31)) {
            return false;
        }
        no31 no31Var = (no31) obj;
        return this.f156562a == no31Var.f156562a && this.f156563b == no31Var.f156563b;
    }

    public final int hashCode() {
        return this.f156563b.hashCode() + (Integer.hashCode(this.f156562a) * 31);
    }
}
