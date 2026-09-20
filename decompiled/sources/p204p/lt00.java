package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lt00 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f136651a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f136652b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ su00 f136653c;

    public /* synthetic */ lt00(niz nizVar, su00 su00Var, int i) {
        this.f136651a = i;
        this.f136652b = nizVar;
        this.f136653c = su00Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        kt00 kt00Var;
        nt00 nt00Var;
        switch (this.f136651a) {
            case 0:
                if (fbkVar instanceof kt00) {
                    kt00Var = (kt00) fbkVar;
                    int i = kt00Var.f126100b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        kt00Var.f126100b = i - Integer.MIN_VALUE;
                    } else {
                        kt00Var = new kt00(this, fbkVar);
                    }
                } else {
                    kt00Var = new kt00(this, fbkVar);
                }
                Object obj2 = kt00Var.f126099a;
                int i2 = kt00Var.f126100b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    qho qhoVar = (qho) obj;
                    oho ohoVar = qhoVar instanceof oho ? (oho) qhoVar : null;
                    ht00 ht00Var = ohoVar != null ? (ht00) ohoVar.f165512a : null;
                    String str = ht00Var != null ? ht00Var.f94891b : null;
                    boolean z = false;
                    if (ht00Var != null && ht00Var.f94890a) {
                        z = true;
                    }
                    rt00 rt00Var = new rt00(this.f136653c, str, z);
                    kt00Var.f126100b = 1;
                    Object objEmit = this.f136652b.emit(rt00Var, kt00Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof nt00) {
                    nt00Var = (nt00) fbkVar;
                    int i3 = nt00Var.f157944b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        nt00Var.f157944b = i3 - Integer.MIN_VALUE;
                    } else {
                        nt00Var = new nt00(this, fbkVar);
                    }
                } else {
                    nt00Var = new nt00(this, fbkVar);
                }
                Object obj3 = nt00Var.f157943a;
                int i4 = nt00Var.f157944b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    qho qhoVar2 = (qho) obj;
                    oho ohoVar2 = qhoVar2 instanceof oho ? (oho) qhoVar2 : null;
                    ht00 ht00Var2 = ohoVar2 != null ? (ht00) ohoVar2.f165512a : null;
                    boolean z2 = false;
                    if (ht00Var2 != null && ht00Var2.f94890a) {
                        z2 = true;
                    }
                    rt00 rt00Var2 = new rt00(this.f136653c, null, z2);
                    nt00Var.f157944b = 1;
                    Object objEmit2 = this.f136652b.emit(rt00Var2, nt00Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }
}
