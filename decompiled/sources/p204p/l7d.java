package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l7d extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f130624a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f130625b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f130626c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l7d(gh00 gh00Var, kqi0 kqi0Var, int i) {
        super(2);
        this.f130624a = i;
        this.f130625b = gh00Var;
        this.f130626c = kqi0Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f130624a) {
            case 0:
                frd frdVar = (frd) obj;
                this.f130625b.invoke(new e9d(frdVar.f72446a, ((Number) obj2).intValue()));
                this.f130626c.setValue(new s2s0(frdVar.f72447b, frdVar.f72449d));
                break;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                this.f130626c.setValue(Boolean.FALSE);
                gh00 gh00Var = this.f130625b;
                if (zBooleanValue) {
                    gh00Var.invoke(new bav(iIntValue));
                } else {
                    gh00Var.invoke(new cav(iIntValue));
                }
                break;
            default:
                ((Number) obj2).intValue();
                this.f130626c.setValue(Boolean.FALSE);
                this.f130625b.invoke(new y4i0((String) obj));
                break;
        }
        return w2a1.f247311a;
    }
}
