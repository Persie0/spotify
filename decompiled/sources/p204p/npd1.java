package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class npd1 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final int f156952a;

    /* JADX INFO: renamed from: b */
    public final jpd1 f156953b;

    public npd1(int i, jpd1 jpd1Var) {
        this.f156952a = i;
        this.f156953b = jpd1Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f156952a, ((npd1) obj).f156952a);
    }
}
