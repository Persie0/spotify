package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class w110 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final rd50 f246923a;

    /* JADX INFO: renamed from: b */
    public final int f246924b;

    /* JADX INFO: renamed from: c */
    public final vyd1 f246925c;

    /* JADX INFO: renamed from: d */
    public final boolean f246926d;

    /* JADX INFO: renamed from: e */
    public final boolean f246927e;

    public w110(rd50 rd50Var, int i, vyd1 vyd1Var, boolean z, boolean z2) {
        this.f246923a = rd50Var;
        this.f246924b = i;
        this.f246925c = vyd1Var;
        this.f246926d = z;
        this.f246927e = z2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f246924b - ((w110) obj).f246924b;
    }
}
