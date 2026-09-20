package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class izx0 extends ibk implements niz {

    /* JADX INFO: renamed from: a */
    public final niz f107300a;

    /* JADX INFO: renamed from: b */
    public final juk f107301b;

    /* JADX INFO: renamed from: c */
    public final int f107302c;

    /* JADX INFO: renamed from: d */
    public juk f107303d;

    /* JADX INFO: renamed from: e */
    public fbk f107304e;

    public izx0(niz nizVar, juk jukVar) {
        super(quf.f192697c, dau.f47107a);
        this.f107300a = nizVar;
        this.f107301b = jukVar;
        this.f107302c = ((Number) jukVar.mo26605o(0, new bxp(2))).intValue();
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        try {
            Object objM52034f = m52034f(fbkVar, obj);
            return objM52034f == yuk.f276404a ? objM52034f : w2a1.f247311a;
        } catch (Throwable th) {
            this.f107303d = new xbs(th, fbkVar.getContext());
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final Object m52034f(fbk fbkVar, Object obj) {
        juk context = fbkVar.getContext();
        qlg1.m73220y(context);
        juk jukVar = this.f107303d;
        if (jukVar != context) {
            if (jukVar instanceof xbs) {
                throw new IllegalStateException(xl51.m91377Z("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((xbs) jukVar).f259993b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            hkf1.m47800h(this, context);
            this.f107303d = context;
        }
        this.f107304e = fbkVar;
        Object objMo24510D0 = kzx0.f128232a.mo24510D0(this.f107300a, obj, this);
        if (!wj50.m88271j(objMo24510D0, yuk.f276404a)) {
            this.f107304e = null;
        }
        return objMo24510D0;
    }

    @Override // p204p.ly8, p204p.zuk
    public final zuk getCallerFrame() {
        fbk fbkVar = this.f107304e;
        if (fbkVar instanceof zuk) {
            return (zuk) fbkVar;
        }
        return null;
    }

    @Override // p204p.ibk, p204p.fbk
    public final juk getContext() {
        juk jukVar = this.f107303d;
        return jukVar == null ? dau.f47107a : jukVar;
    }

    @Override // p204p.ly8
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        Throwable thM77348a = s6x0.m77348a(obj);
        if (thM77348a != null) {
            this.f107303d = new xbs(thM77348a, getContext());
        }
        fbk fbkVar = this.f107304e;
        if (fbkVar != null) {
            fbkVar.resumeWith(obj);
        }
        return yuk.f276404a;
    }
}
