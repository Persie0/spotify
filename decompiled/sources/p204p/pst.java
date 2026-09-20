package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pst implements sx0 {

    /* JADX INFO: renamed from: a */
    public final j2r f180929a;

    public pst(j2r j2rVar) {
        this.f180929a = j2rVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70888a(fbk fbkVar) {
        nst nstVar;
        if (fbkVar instanceof nst) {
            nstVar = (nst) fbkVar;
            int i = nstVar.f157891c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nstVar.f157891c = i - Integer.MIN_VALUE;
            } else {
                nstVar = new nst(this, fbkVar);
            }
        } else {
            nstVar = new nst(this, fbkVar);
        }
        Object objM27703d = nstVar.f157889a;
        int i2 = nstVar.f157891c;
        if (i2 == 0) {
            bga.m29073P(objM27703d);
            nstVar.f157891c = 1;
            j2r j2rVar = this.f180929a;
            objM27703d = ((azx) j2rVar.f108129c).m27703d(j2rVar.m52225g(), nstVar);
            yuk yukVar = yuk.f276404a;
            if (objM27703d == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM27703d);
        }
        return new y6v(((fxx) objM27703d).f74479a);
    }
}
