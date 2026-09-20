package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class vfy implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f241068a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz[] f241069b;

    public /* synthetic */ vfy(fiz[] fizVarArr, int i) {
        this.f241068a = i;
        this.f241069b = fizVarArr;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f241068a) {
            case 0:
                return new pub[this.f241069b.length];
            default:
                return new Object[this.f241069b.length];
        }
    }
}
