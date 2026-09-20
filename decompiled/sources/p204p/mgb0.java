package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mgb0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f143429a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f143430b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f143431c;

    public /* synthetic */ mgb0(gh00 gh00Var, kqi0 kqi0Var, int i) {
        this.f143429a = i;
        this.f143430b = gh00Var;
        this.f143431c = kqi0Var;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        boolean z;
        int i = this.f143429a;
        w2a1 w2a1Var = w2a1.f247311a;
        gh00 gh00Var = this.f143430b;
        kqi0 kqi0Var = this.f143431c;
        switch (i) {
            case 0:
                gh00Var.invoke(new yeb0(((Number) ((eh00) kqi0Var.getValue()).invoke()).intValue(), (d850) obj));
                break;
            case 1:
                nmu0 nmu0Var = (nmu0) obj;
                if (nmu0Var instanceof lmu0) {
                    kqi0Var.setValue(((lmu0) nmu0Var).f135033a);
                }
                gh00Var.invoke(nmu0Var);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    float f = bwy0.f31744b;
                    if (((Boolean) kqi0Var.getValue()).booleanValue()) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                gh00Var.invoke(new dvy0(zBooleanValue, z));
                float f2 = bwy0.f31744b;
                kqi0Var.setValue(Boolean.FALSE);
                break;
        }
        return w2a1Var;
    }
}
