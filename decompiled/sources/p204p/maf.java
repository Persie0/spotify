package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class maf implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bqa f141581a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f141582b;

    public maf(bqa bqaVar, int i) {
        this.f141581a = bqaVar;
        this.f141582b = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (p204p.qlk.m73247z(r0) == r4) goto L21;
     */
    @Override // p204p.niz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, fbk fbkVar) {
        laf lafVar;
        if (fbkVar instanceof laf) {
            lafVar = (laf) fbkVar;
            int i = lafVar.f131338c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lafVar.f131338c = i - Integer.MIN_VALUE;
            } else {
                lafVar = new laf(this, fbkVar);
            }
        } else {
            lafVar = new laf(this, fbkVar);
        }
        Object obj2 = lafVar.f131336a;
        int i2 = lafVar.f131338c;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj2);
            bo40 bo40Var = new bo40(this.f141582b, obj);
            lafVar.f131338c = 1;
            if (this.f141581a.mo30229d(bo40Var, lafVar) != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(obj2);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
        lafVar.f131338c = 2;
    }
}
