package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class cy71 extends enk0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f43177b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dy71 f43178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy71(dy71 dy71Var, int i) {
        super(null);
        this.f43177b = i;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.f43178c = dy71Var;
                super(bool);
                break;
            default:
                this.f43178c = dy71Var;
                break;
        }
    }

    @Override // p204p.enk0
    /* JADX INFO: renamed from: a */
    public final void mo34343a(qr60 qr60Var, Object obj, Object obj2) {
        switch (this.f43177b) {
            case 0:
                dy71.m37324a(this.f43178c);
                break;
            default:
                if (((Boolean) obj).booleanValue() != ((Boolean) obj2).booleanValue()) {
                    dy71.m37324a(this.f43178c);
                }
                break;
        }
    }
}
