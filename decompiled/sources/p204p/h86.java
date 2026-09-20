package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class h86 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f88638a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f88639b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f88640c;

    public /* synthetic */ h86(kqi0 kqi0Var, kqi0 kqi0Var2, int i) {
        this.f88638a = i;
        this.f88639b = kqi0Var;
        this.f88640c = kqi0Var2;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        switch (this.f88638a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                qf40 qf40Var = (qf40) this.f88639b.getValue();
                if (iIntValue >= 0 && iIntValue < qf40Var.size()) {
                    ((th00) this.f88640c.getValue()).invoke(qf40Var.get(iIntValue), new Integer(iIntValue));
                }
                break;
            default:
                this.f88639b.setValue((fda) ((qfm0) obj));
                this.f88640c.setValue(Boolean.TRUE);
                break;
        }
        return w2a1.f247311a;
    }
}
