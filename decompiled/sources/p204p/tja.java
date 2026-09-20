package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tja implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f220861a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f220862b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f220863c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f220864d;

    public tja(niz nizVar, boolean z, e330 e330Var) {
        this.f220863c = nizVar;
        this.f220862b = z;
        this.f220864d = e330Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Map] */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        sja sjaVar;
        switch (this.f220861a) {
            case 0:
                e330 e330Var = (e330) this.f220864d;
                if (fbkVar instanceof sja) {
                    sjaVar = (sja) fbkVar;
                    int i = sjaVar.f209790b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        sjaVar.f209790b = i - Integer.MIN_VALUE;
                    } else {
                        sjaVar = new sja(this, fbkVar);
                    }
                } else {
                    sjaVar = new sja(this, fbkVar);
                }
                Object obj2 = sjaVar.f209789a;
                int i2 = sjaVar.f209790b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    niz nizVar = (niz) this.f220863c;
                    ((Boolean) obj).getClass();
                    e330 e330Var2 = !this.f220862b ? (e330) u230.f225972e.f65342b.get(new Float(e330Var.f55608d)) : (e330) u230.f225972e.f65343c.get(new Float(e330Var.f55608d));
                    if (e330Var2 != null) {
                        sjaVar.f209790b = 1;
                        Object objEmit = nizVar.emit(e330Var2, sjaVar);
                        yuk yukVar = yuk.f276404a;
                        if (objEmit == yukVar) {
                            return yukVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                b650 b650Var = (b650) obj;
                eh00 eh00Var = (eh00) this.f220863c;
                kqi0 kqi0Var = (kqi0) this.f220864d;
                if (b650Var instanceof m3r0) {
                    kqi0Var.setValue(Boolean.FALSE);
                    if (this.f220862b && eh00Var != null) {
                        eh00Var.invoke();
                    }
                } else if (b650Var instanceof wds) {
                    kqi0Var.setValue(Boolean.TRUE);
                    if (eh00Var != null) {
                        eh00Var.invoke();
                    }
                } else if ((b650Var instanceof l3r0) || (b650Var instanceof vds)) {
                    kqi0Var.setValue(Boolean.FALSE);
                }
                return w2a1.f247311a;
        }
    }

    public tja(boolean z, eh00 eh00Var, kqi0 kqi0Var) {
        this.f220862b = z;
        this.f220863c = eh00Var;
        this.f220864d = kqi0Var;
    }
}
