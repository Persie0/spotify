package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class trk extends enk0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f223080b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ urk f223081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public trk(urk urkVar, int i) {
        super(null);
        this.f223080b = i;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.f223081c = urkVar;
                super(bool);
                break;
            default:
                this.f223081c = urkVar;
                break;
        }
    }

    @Override // p204p.enk0
    /* JADX INFO: renamed from: a */
    public final void mo34343a(qr60 qr60Var, Object obj, Object obj2) {
        switch (this.f223080b) {
            case 0:
                urk.m83854w1(this.f223081c);
                break;
            default:
                if (((Boolean) obj).booleanValue() != ((Boolean) obj2).booleanValue()) {
                    urk.m83854w1(this.f223081c);
                }
                break;
        }
    }
}
