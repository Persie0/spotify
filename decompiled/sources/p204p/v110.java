package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class v110 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final int f236217a;

    /* JADX INFO: renamed from: b */
    public final wyd1 f236218b;

    /* JADX INFO: renamed from: c */
    public final boolean f236219c;

    public v110(int i, wyd1 wyd1Var, boolean z) {
        this.f236217a = i;
        this.f236218b = wyd1Var;
        this.f236219c = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f236217a - ((v110) obj).f236217a;
    }
}
