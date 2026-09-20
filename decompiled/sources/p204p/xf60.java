package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class xf60 extends hqb {

    /* JADX INFO: renamed from: i */
    public final eg60 f260849i;

    public xf60(fbk fbkVar, eg60 eg60Var) {
        super(1, fbkVar);
        this.f260849i = eg60Var;
    }

    @Override // p204p.hqb
    /* JADX INFO: renamed from: o */
    public final Throwable mo48220o(eg60 eg60Var) {
        Throwable thM96001c;
        eg60 eg60Var2 = this.f260849i;
        eg60Var2.getClass();
        Object obj = eg60.f59229a.get(eg60Var2);
        if (!(obj instanceof zf60) || (thM96001c = ((zf60) obj).m96001c()) == null) {
            return obj instanceof ruf ? ((ruf) obj).f202838a : eg60Var.mo26603h();
        }
        return thM96001c;
    }

    @Override // p204p.hqb
    /* JADX INFO: renamed from: x */
    public final String mo48227x() {
        return "AwaitContinuation";
    }
}
