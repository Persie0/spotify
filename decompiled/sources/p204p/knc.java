package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class knc extends enc {

    /* JADX INFO: renamed from: d */
    public final fiz f124376d;

    public knc(int i, int i2, juk jukVar, fiz fizVar) {
        super(jukVar, i, i2);
        this.f124376d = fizVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b A[RETURN] */
    @Override // p204p.enc, p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        Object objCollect;
        int i = this.f61129b;
        yuk yukVar = yuk.f276404a;
        if (i == -3) {
            juk context = fbkVar.getContext();
            juk jukVarM37393y = dyu.m37393y(context, this.f61128a);
            if (wj50.m88271j(jukVarM37393y, context)) {
                Object objMo56939k = mo56939k(nizVar, fbkVar);
                if (objMo56939k == yukVar) {
                    return objMo56939k;
                }
            } else {
                hcp0 hcp0Var = hcp0.f89853L0;
                if (wj50.m88271j(jukVarM37393y.mo26595B(hcp0Var), context.mo26595B(hcp0Var))) {
                    Object objM89931V = x4w0.m89931V(jukVarM37393y, x4w0.m89953t(nizVar, fbkVar.getContext()), fcg1.m41325s(jukVarM37393y), new b6b(this, null, 9), fbkVar);
                    if (objM89931V == yukVar) {
                        return objM89931V;
                    }
                } else {
                    objCollect = super.collect(nizVar, fbkVar);
                    if (objCollect == yukVar) {
                        return objCollect;
                    }
                }
            }
        } else {
            objCollect = super.collect(nizVar, fbkVar);
            if (objCollect == yukVar) {
                return objCollect;
            }
        }
        return w2a1.f247311a;
    }

    @Override // p204p.enc
    /* JADX INFO: renamed from: g */
    public final Object mo39486g(sir0 sir0Var, fbk fbkVar) {
        Object objMo56939k = mo56939k(new gsz0(sir0Var), fbkVar);
        return objMo56939k == yuk.f276404a ? objMo56939k : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: k */
    public abstract Object mo56939k(niz nizVar, fbk fbkVar);

    @Override // p204p.enc
    public final String toString() {
        return this.f124376d + " -> " + super.toString();
    }
}
