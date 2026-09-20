package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class b4f {

    /* JADX INFO: renamed from: a */
    public final int f23340a;

    /* JADX INFO: renamed from: b */
    public final int f23341b;

    public b4f(int i, int i2) {
        this.f23340a = i;
        this.f23341b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4f)) {
            return false;
        }
        b4f b4fVar = (b4f) obj;
        return this.f23340a == b4fVar.f23340a && this.f23341b == b4fVar.f23341b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23341b) + (Integer.hashCode(this.f23340a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.f23340a);
        sb.append(", columnCount=");
        return edb.m38567p(sb, this.f23341b, ')');
    }
}
