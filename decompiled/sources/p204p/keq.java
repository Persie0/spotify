package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class keq implements Comparable {

    /* JADX INFO: renamed from: a */
    public final boolean f121931a;

    /* JADX INFO: renamed from: b */
    public final boolean f121932b;

    public keq(int i, r300 r300Var) {
        this.f121931a = (r300Var.f195376e & 1) != 0;
        this.f121932b = o09.m65985u(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        keq keqVar = (keq) obj;
        return ytf.f276111a.mo88921d(this.f121932b, keqVar.f121932b).mo88921d(this.f121931a, keqVar.f121931a).mo88923f();
    }
}
