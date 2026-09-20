package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class paf implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ juk f175516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f175517b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rir0 f175518c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ niz f175519d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ mb61 f175520e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ uf60 f175521f;

    /* JADX WARN: Multi-variable type inference failed */
    public paf(juk jukVar, Object obj, rir0 rir0Var, niz nizVar, vh00 vh00Var, uf60 uf60Var) {
        this.f175516a = jukVar;
        this.f175517b = obj;
        this.f175518c = rir0Var;
        this.f175519d = nizVar;
        this.f175520e = (mb61) vh00Var;
        this.f175521f = uf60Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [p.mb61, p.vh00] */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) throws Throwable {
        oaf oafVar;
        if (fbkVar instanceof oaf) {
            oafVar = (oaf) fbkVar;
            int i = oafVar.f163321c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oafVar.f163321c = i - Integer.MIN_VALUE;
            } else {
                oafVar = new oaf(this, fbkVar);
            }
        } else {
            oafVar = new oaf(this, fbkVar);
        }
        Object obj2 = oafVar.f163319a;
        int i2 = oafVar.f163321c;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1Var;
        }
        bga.m29073P(obj2);
        nd0 nd0Var = new nd0(this.f175518c, this.f175519d, (vh00) this.f175520e, obj, this.f175521f, (fbk) null);
        oafVar.f163321c = 1;
        Object objM89931V = x4w0.m89931V(this.f175516a, w2a1Var, this.f175517b, nd0Var, oafVar);
        yuk yukVar = yuk.f276404a;
        return objM89931V == yukVar ? yukVar : w2a1Var;
    }
}
