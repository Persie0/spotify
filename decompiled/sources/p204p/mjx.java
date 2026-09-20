package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class mjx implements Comparable {

    /* JADX INFO: renamed from: a */
    public final jap0 f144410a;

    /* JADX INFO: renamed from: b */
    public int f144411b;

    /* JADX INFO: renamed from: c */
    public long f144412c;

    /* JADX INFO: renamed from: d */
    public Object f144413d;

    public mjx(jap0 jap0Var) {
        this.f144410a = jap0Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        mjx mjxVar = (mjx) obj;
        Object obj2 = this.f144413d;
        if ((obj2 == null) != (mjxVar.f144413d == null)) {
            return obj2 != null ? -1 : 1;
        }
        if (obj2 == null) {
            return 0;
        }
        int i = this.f144411b - mjxVar.f144411b;
        return i != 0 ? i : Long.compare(this.f144412c, mjxVar.f144412c);
    }
}
