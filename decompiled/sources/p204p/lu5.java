package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class lu5 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f136999a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f137000b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f137001c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f137002d;

    public /* synthetic */ lu5(Object obj, int i, Object obj2, int i2) {
        this.f136999a = i2;
        this.f137000b = obj;
        this.f137001c = i;
        this.f137002d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:87:0x0134  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Object, java.util.List] */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        ku5 ku5Var;
        ztb ztbVar;
        wtb wtbVarM70881y;
        kj80 kj80Var;
        int i = this.f136999a;
        int i2 = 3;
        yuk yukVar = yuk.f276404a;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = this.f137002d;
        int i3 = this.f137001c;
        Object obj3 = this.f137000b;
        boolean z = true;
        switch (i) {
            case 0:
                if (fbkVar instanceof ku5) {
                    ku5Var = (ku5) fbkVar;
                    int i4 = ku5Var.f126460b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        ku5Var.f126460b = i4 - Integer.MIN_VALUE;
                    } else {
                        ku5Var = new ku5(this, fbkVar);
                    }
                } else {
                    ku5Var = new ku5(this, fbkVar);
                }
                Object obj4 = ku5Var.f126459a;
                int i5 = ku5Var.f126460b;
                if (i5 == 0) {
                    bga.m29073P(obj4);
                    qho qhoVarM72837a = ((qho) obj).m72837a(new C2580xm((uxe) obj2, i3, i2));
                    ku5Var.f126460b = 1;
                    if (((niz) obj3).emit(qhoVarM72837a, ku5Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj4);
                }
                return w2a1Var;
            case 1:
                if (fbkVar instanceof ztb) {
                    ztbVar = (ztb) fbkVar;
                    int i6 = ztbVar.f286127b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        ztbVar.f286127b = i6 - Integer.MIN_VALUE;
                    } else {
                        ztbVar = new ztb(this, fbkVar);
                    }
                } else {
                    ztbVar = new ztb(this, fbkVar);
                }
                Object obj5 = ztbVar.f286126a;
                int i7 = ztbVar.f286127b;
                if (i7 == 0) {
                    bga.m29073P(obj5);
                    niz nizVar = (niz) obj3;
                    yfj yfjVar = (yfj) ((gqx) obj).mo45449a(yfj.class, (String) obj2).f72301b;
                    int iM38547C = edb.m38547C(i3);
                    if (iM38547C == 0) {
                        wtbVarM70881y = psh.m70881y(yfjVar != null ? yfjVar.f272266a : null);
                    } else if (iM38547C == 1) {
                        wtbVarM70881y = psh.m70881y(yfjVar != null ? yfjVar.f272267b : null);
                    } else if (iM38547C == 2) {
                        wtbVarM70881y = psh.m70881y(yfjVar != null ? yfjVar.f272268c : null);
                    } else {
                        if (iM38547C != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        wtbVarM70881y = psh.m70881y(yfjVar != null ? yfjVar.f272269d : null);
                    }
                    ztbVar.f286127b = 1;
                    if (nizVar.emit(wtbVarM70881y, ztbVar) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj5);
                }
                return w2a1Var;
            case 2:
                if (!((Boolean) obj).booleanValue()) {
                    sw70 sw70VarM94779h = ((yw70) obj3).m94779h();
                    tw70 tw70Var = (tw70) g6f.m43689C0(sw70VarM94779h.f214605k);
                    kqi0 kqi0Var = (kqi0) obj2;
                    int i8 = tw70Var != null ? tw70Var.f224325a : -1;
                    int i9 = tw70Var != null ? tw70Var.f224340p + tw70Var.f224341q : 0;
                    int i10 = sw70VarM94779h.f214608n;
                    int i11 = sw70VarM94779h.f214607m;
                    float f = bwc.f31610a;
                    if (i10 != 0 && (i8 != i10 - 1 || i11 - i9 < (-i3))) {
                        z = false;
                    }
                    kqi0Var.setValue(Boolean.valueOf(z));
                }
                return w2a1Var;
            default:
                if (fbkVar instanceof kj80) {
                    kj80Var = (kj80) fbkVar;
                    int i12 = kj80Var.f123263b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        kj80Var.f123263b = i12 - Integer.MIN_VALUE;
                    } else {
                        kj80Var = new kj80(this, fbkVar);
                    }
                } else {
                    kj80Var = new kj80(this, fbkVar);
                }
                Object obj6 = kj80Var.f123262a;
                int i13 = kj80Var.f123263b;
                if (i13 == 0) {
                    bga.m29073P(obj6);
                    niz nizVar2 = (niz) obj3;
                    gj80 gj80Var = (gj80) obj;
                    ij80 ij80Var = gj80Var != null ? new ij80(i3, gj80Var, ((oj80) obj2).f166001a.f38525d.contains(gj80Var.toString())) : null;
                    kj80Var.f123263b = 1;
                    if (nizVar2.emit(ij80Var, kj80Var) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                }
                return w2a1Var;
        }
    }

    public /* synthetic */ lu5(niz nizVar, Object obj, int i, int i2) {
        this.f136999a = i2;
        this.f137000b = nizVar;
        this.f137002d = obj;
        this.f137001c = i;
    }
}
