package p204p;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class hb3 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f89372a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f89373b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f89374c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f89375d;

    public hb3(niz nizVar, String str, ArrayList arrayList) {
        this.f89373b = nizVar;
        this.f89374c = str;
        this.f89375d = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    /* JADX WARN: Code duplicated, block: B:52:0x00af  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        gb3 gb3Var;
        vta1 vta1Var;
        mpl mplVar;
        switch (this.f89372a) {
            case 0:
                if (fbkVar instanceof gb3) {
                    gb3Var = (gb3) fbkVar;
                    int i = gb3Var.f78178b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        gb3Var.f78178b = i - Integer.MIN_VALUE;
                    } else {
                        gb3Var = new gb3(this, fbkVar);
                    }
                } else {
                    gb3Var = new gb3(this, fbkVar);
                }
                Object obj2 = gb3Var.f78177a;
                int i2 = gb3Var.f78178b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    wta1 wta1Var = (wta1) obj;
                    if (wta1Var == null) {
                        vta1Var = null;
                    } else {
                        if (!wta1Var.f254902a.f202555a.equals(this.f89374c)) {
                            wta1Var = null;
                        }
                        if (wta1Var != null) {
                            vta1Var = wta1Var.f254903b;
                        } else {
                            vta1Var = null;
                        }
                    }
                    yuk yukVar = yuk.f276404a;
                    niz nizVar = this.f89373b;
                    if (vta1Var == null) {
                        gb3Var.f78178b = 1;
                        if (nizVar.emit(null, gb3Var) == yukVar) {
                            return yukVar;
                        }
                    } else {
                        boolean z = vta1Var instanceof tta1;
                        ArrayList arrayList = this.f89375d;
                        if (z) {
                            fc0 fc0VarM96023l = zfg1.m96023l(((tta1) vta1Var).f223566a, arrayList);
                            gb3Var.f78178b = 2;
                            if (nizVar.emit(fc0VarM96023l, gb3Var) == yukVar) {
                                return yukVar;
                            }
                        } else if (vta1Var instanceof sta1) {
                            fc0 fc0VarM96023l2 = zfg1.m96023l(((sta1) vta1Var).f213878a, arrayList);
                            gb3Var.f78178b = 3;
                            if (nizVar.emit(fc0VarM96023l2, gb3Var) == yukVar) {
                                return yukVar;
                            }
                        } else if (!vta1Var.equals(uta1.f233862a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2 && i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof mpl) {
                    mplVar = (mpl) fbkVar;
                    int i3 = mplVar.f146047b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        mplVar.f146047b = i3 - Integer.MIN_VALUE;
                    } else {
                        mplVar = new mpl(this, fbkVar);
                    }
                } else {
                    mplVar = new mpl(this, fbkVar);
                }
                Object obj3 = mplVar.f146046a;
                int i4 = mplVar.f146047b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    znl znlVar = (znl) obj;
                    fc0 fc0VarM96023l3 = null;
                    if (znlVar != null) {
                        if (!znlVar.f284519a.equals(this.f89374c)) {
                            znlVar = null;
                        }
                        if (znlVar != null) {
                            fc0VarM96023l3 = zfg1.m96023l(znlVar.f284520b, this.f89375d);
                        }
                    }
                    mplVar.f146047b = 1;
                    Object objEmit = this.f89373b.emit(fc0VarM96023l3, mplVar);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit == yukVar2) {
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

    public hb3(niz nizVar, ArrayList arrayList, String str) {
        this.f89375d = arrayList;
        this.f89374c = str;
        this.f89373b = nizVar;
    }
}
