package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cg01 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ niz f37500a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ na01 f37501b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f37502c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hg01 f37503d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ wf01 f37504e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f37505f;

    public cg01(niz nizVar, na01 na01Var, int i, hg01 hg01Var, wf01 wf01Var, int i2) {
        this.f37500a = nizVar;
        this.f37501b = na01Var;
        this.f37502c = i;
        this.f37503d = hg01Var;
        this.f37504e = wf01Var;
        this.f37505f = i2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (r6.emit(r10, r0) == r5) goto L30;
     */
    @Override // p204p.niz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, fbk fbkVar) {
        bg01 bg01Var;
        int i;
        niz nizVar;
        int i2;
        niz nizVar2;
        if (fbkVar instanceof bg01) {
            bg01Var = (bg01) fbkVar;
            int i3 = bg01Var.f26811b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bg01Var.f26811b = i3 - Integer.MIN_VALUE;
            } else {
                bg01Var = new bg01(this, fbkVar);
            }
        } else {
            bg01Var = new bg01(this, fbkVar);
        }
        Object objM87918a = bg01Var.f26810a;
        int i4 = bg01Var.f26811b;
        fbk fbkVar2 = null;
        yuk yukVar = yuk.f276404a;
        if (i4 != 0) {
            if (i4 == 1) {
                i2 = bg01Var.f26813d;
                nizVar2 = bg01Var.f26812c;
                bga.m29073P(objM87918a);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM87918a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM87918a);
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        na01 na01Var = this.f37501b;
        na01 na01Var2 = zBooleanValue ? na01Var : null;
        i = 0;
        nizVar = this.f37500a;
        if (na01Var2 != null) {
            bg01Var.f26812c = nizVar;
            bg01Var.f26813d = 0;
            bg01Var.f26811b = 1;
            int i5 = hg01.f90976r;
            hg01 hg01Var = this.f37503d;
            hg01Var.getClass();
            objM87918a = this.f37504e.m87918a(this.f37505f + "." + this.f37502c, null, new zf01(na01Var, hg01Var, fbkVar2, i), bg01Var);
            if (objM87918a != yukVar) {
                i2 = 0;
                nizVar2 = nizVar;
            }
        } else {
            objM87918a = null;
            bg01Var.f26812c = null;
            bg01Var.f26813d = i;
            bg01Var.f26811b = 2;
        }
        return yukVar;
        nizVar = nizVar2;
        i = i2;
        bg01Var.f26812c = null;
        bg01Var.f26813d = i;
        bg01Var.f26811b = 2;
    }
}
