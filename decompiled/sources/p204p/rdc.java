package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class rdc {

    /* JADX INFO: renamed from: a */
    public final er70 f198091a;

    /* JADX INFO: renamed from: b */
    public final xjp f198092b;

    public rdc(er70 er70Var, xjp xjpVar) {
        this.f198091a = er70Var;
        this.f198092b = xjpVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m75326a(rdc rdcVar, vdc vdcVar, ibk ibkVar) {
        qdc qdcVar;
        if (ibkVar instanceof qdc) {
            qdcVar = (qdc) ibkVar;
            int i = qdcVar.f187534c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qdcVar.f187534c = i - Integer.MIN_VALUE;
            } else {
                qdcVar = new qdc(rdcVar, ibkVar);
            }
        } else {
            qdcVar = new qdc(rdcVar, ibkVar);
        }
        Object objM86755t = qdcVar.f187532a;
        int i2 = qdcVar.f187534c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM86755t);
                xjp xjpVar = rdcVar.f198092b;
                fiz fizVarM62953p = mvl0.m62953p(new ner(k0e1.m54985d(((jpx) ((epx) xjpVar.f262184c)).m53978b(new C1668ai("categorized_video_list_artist_page", false, (gh00) new mcs(xjpVar, 1)))), xjpVar, vdcVar.f240376a, 1));
                qdcVar.f187534c = 1;
                objM86755t = vyf1.m86755t(fizVarM62953p, qdcVar);
                yuk yukVar = yuk.f276404a;
                if (objM86755t == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM86755t);
            }
            return new zdc((mdc) objM86755t);
        } catch (Exception unused) {
            return ydc.f271733a;
        }
    }
}
