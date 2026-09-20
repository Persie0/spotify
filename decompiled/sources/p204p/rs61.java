package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class rs61 extends pir {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f202188a;

    public /* synthetic */ rs61(int i) {
        this.f202188a = i;
    }

    @Override // p204p.pir
    /* JADX INFO: renamed from: a */
    public final boolean mo50013a(Object obj, Object obj2) {
        switch (this.f202188a) {
            case 0:
                return ((xyn0) obj).equals((xyn0) obj2);
            default:
                return ((ma71) obj).equals((ma71) obj2);
        }
    }

    @Override // p204p.pir
    /* JADX INFO: renamed from: b */
    public final boolean mo50014b(Object obj, Object obj2) {
        switch (this.f202188a) {
            case 0:
                return wj50.m88271j(((xyn0) obj).f267388b, ((xyn0) obj2).f267388b);
            default:
                return true;
        }
    }
}
