package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class tgz implements Comparable {

    /* JADX INFO: renamed from: a */
    public int f220294a;

    /* JADX INFO: renamed from: b */
    public int f220295b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        tgz tgzVar = (tgz) obj;
        int i = this.f220295b;
        int i2 = tgzVar.f220295b;
        return i != i2 ? i - i2 : this.f220294a - tgzVar.f220294a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Order{order=");
        sb.append(this.f220295b);
        sb.append(", index=");
        return edb.m38567p(sb, this.f220294a, '}');
    }
}
