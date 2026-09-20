package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ruk {

    /* JADX INFO: renamed from: a */
    public final luk f202866a;

    /* JADX INFO: renamed from: b */
    public final luk f202867b;

    /* JADX INFO: renamed from: c */
    public final xst f202868c;

    /* JADX INFO: renamed from: d */
    public final bmx f202869d;

    public ruk(luk lukVar, luk lukVar2, xst xstVar, bmx bmxVar) {
        this.f202866a = lukVar;
        this.f202867b = lukVar2;
        this.f202868c = xstVar;
        this.f202869d = bmxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (p204p.x0h1.m89557A(r6.f202867b, r1, r0) == r5) goto L21;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m76453a(ibk ibkVar) {
        quk qukVar;
        if (ibkVar instanceof quk) {
            qukVar = (quk) ibkVar;
            int i = qukVar.f192728c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qukVar.f192728c = i - Integer.MIN_VALUE;
            } else {
                qukVar = new quk(this, ibkVar);
            }
        } else {
            qukVar = new quk(this, ibkVar);
        }
        Object objM89557A = qukVar.f192726a;
        int i2 = qukVar.f192728c;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bga.m29073P(objM89557A);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89557A);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM89557A);
        qri qriVar = new qri(this, fbkVar, 19);
        qukVar.f192728c = 1;
        objM89557A = x0h1.m89557A(this.f202866a, qriVar, qukVar);
        if (objM89557A != yukVar) {
        }
        return yukVar;
        qhk qhkVar = new qhk(this, (hpa0) objM89557A, fbkVar, 2);
        qukVar.f192728c = 2;
    }
}
