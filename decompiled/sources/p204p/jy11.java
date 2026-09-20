package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jy11 extends enk0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f117267b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ky11 f117268c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy11(ky11 ky11Var, int i) {
        super(null);
        this.f117267b = i;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.f117268c = ky11Var;
                super(bool);
                break;
            default:
                this.f117268c = ky11Var;
                break;
        }
    }

    @Override // p204p.enk0
    /* JADX INFO: renamed from: a */
    public final void mo34343a(qr60 qr60Var, Object obj, Object obj2) {
        switch (this.f117267b) {
            case 0:
                w6l0 w6l0Var = (w6l0) obj2;
                w6l0 w6l0Var2 = (w6l0) obj;
                if (w6l0Var2 != null) {
                    w6l0Var2.m87300e();
                }
                if (w6l0Var != null) {
                    this.f117268c.f127626c.m28386b(w6l0Var);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue() != ((Boolean) obj2).booleanValue()) {
                    this.f117268c.m57642a();
                }
                break;
        }
    }
}
