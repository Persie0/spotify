package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class e7l extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56949a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b7l f56950b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f7l f56951c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e7l(b7l b7lVar, f7l f7lVar, int i) {
        super(1);
        this.f56949a = i;
        this.f56950b = b7lVar;
        this.f56951c = f7lVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f56949a) {
            case 0:
                boolean z = ((z6l) this.f56950b).f279950d;
                f7l f7lVar = this.f56951c;
                if (z) {
                    f7lVar.f66742c.invoke();
                } else {
                    f7lVar.f66741b.m63782a(bda.f26063c);
                }
                break;
            default:
                boolean z2 = ((z6l) this.f56950b).f279950d;
                f7l f7lVar2 = this.f56951c;
                if (z2) {
                    f7lVar2.f66742c.invoke();
                } else {
                    f7lVar2.f66741b.m63782a(bda.f26063c);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
