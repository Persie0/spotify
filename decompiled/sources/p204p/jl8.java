package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class jl8 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f113514a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f113515b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f113516c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f113517d;

    public jl8(niz nizVar, w0e1 w0e1Var, long j) {
        this.f113515b = nizVar;
        this.f113517d = w0e1Var;
        this.f113516c = j;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:67:0x011a  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        il8 il8Var;
        int i;
        niz nizVar;
        int i2;
        niz nizVar2;
        n6f n6fVar;
        n6f n6fVar2;
        a47 a47Var;
        a47 p37Var;
        switch (this.f113514a) {
            case 0:
                w0e1 w0e1Var = (w0e1) this.f113517d;
                if (fbkVar instanceof il8) {
                    il8Var = (il8) fbkVar;
                    int i3 = il8Var.f103313b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        il8Var.f103313b = i3 - Integer.MIN_VALUE;
                    } else {
                        il8Var = new il8(this, fbkVar);
                    }
                } else {
                    il8Var = new il8(this, fbkVar);
                }
                Object objM45691b = il8Var.f103312a;
                int i4 = il8Var.f103313b;
                long jM75432b = this.f113516c;
                yuk yukVar = yuk.f276404a;
                if (i4 != 0) {
                    if (i4 == 1) {
                        int i5 = il8Var.f103317f;
                        int i6 = il8Var.f103315d;
                        nizVar = il8Var.f103314c;
                        bga.m29073P(objM45691b);
                        i = i5;
                        i2 = i6;
                    } else if (i4 == 2) {
                        i2 = il8Var.f103315d;
                        nizVar2 = il8Var.f103314c;
                        bga.m29073P(objM45691b);
                        n6fVar2 = (n6f) objM45691b;
                        if (n6fVar2 != null) {
                            jM75432b = n6fVar2.f150873a;
                        }
                        nizVar = nizVar2;
                        n6fVar = new n6f(jM75432b);
                        il8Var.f103314c = null;
                        il8Var.f103315d = i2;
                        il8Var.f103313b = 3;
                        if (nizVar.emit(n6fVar, il8Var) == yukVar) {
                            return yukVar;
                        }
                    } else {
                        if (i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(objM45691b);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(objM45691b);
                hl8 hl8Var = (hl8) obj;
                zsf zsfVar = (zsf) w0e1Var.f246720b;
                String str = hl8Var.f92638a;
                int i7 = hl8Var.f92639b;
                niz nizVar3 = this.f113515b;
                il8Var.f103314c = nizVar3;
                i = 0;
                il8Var.f103315d = 0;
                il8Var.f103317f = 0;
                il8Var.f103313b = 1;
                objM45691b = ((gtf) zsfVar).m45691b(i7, str, il8Var);
                if (objM45691b == yukVar) {
                    return yukVar;
                }
                nizVar = nizVar3;
                i2 = 0;
                pvf pvfVar = (pvf) objM45691b;
                g4a g4aVar = pvfVar != null ? pvfVar.f181734c : null;
                if (g4aVar instanceof e4a) {
                    g7f g7fVar = ((e4a) g4aVar).f56037e;
                    if (g7fVar != null) {
                        jM75432b = rfg1.m75432b((int) (4278190080L | ((long) g7fVar.f77257c)));
                    }
                } else if (g4aVar instanceof c4a) {
                    String str2 = ((c4a) g4aVar).f33892a;
                    il8Var.f103314c = nizVar;
                    il8Var.f103315d = i2;
                    il8Var.f103317f = i;
                    il8Var.f103313b = 2;
                    objM45691b = w0e1.m86929g(w0e1Var, str2, il8Var);
                    if (objM45691b == yukVar) {
                        return yukVar;
                    }
                    nizVar2 = nizVar;
                    n6fVar2 = (n6f) objM45691b;
                    if (n6fVar2 != null) {
                        jM75432b = n6fVar2.f150873a;
                    }
                    nizVar = nizVar2;
                }
                n6fVar = new n6f(jM75432b);
                il8Var.f103314c = null;
                il8Var.f103315d = i2;
                il8Var.f103313b = 3;
                if (nizVar.emit(n6fVar, il8Var) == yukVar) {
                    return yukVar;
                }
                return w2a1.f247311a;
            default:
                k37 k37Var = (k37) obj;
                if (wj50.m88271j(k37Var, h37.f87153a)) {
                    a47Var = z37.f278806a;
                } else if (wj50.m88271j(k37Var, f37.f65405a)) {
                    a47Var = y37.f268769a;
                } else {
                    if (k37Var instanceof i37) {
                        i37 i37Var = (i37) k37Var;
                        p37Var = new o37(i37Var.f98050a, i37Var.f98051b);
                    } else if (k37Var instanceof j37) {
                        p37Var = new p37(((j37) k37Var).f108300a);
                    } else {
                        if (!(k37Var instanceof g37)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        a47Var = m37.f139548a;
                    }
                    a47Var = p37Var;
                }
                if (a47Var instanceof r37) {
                    ((nlv0) this.f113517d).f155174a = true;
                }
                Object objEmit = this.f113515b.emit(new awc0(this.f113516c, a47Var), fbkVar);
                return objEmit == yuk.f276404a ? objEmit : w2a1.f247311a;
        }
    }

    public jl8(nlv0 nlv0Var, niz nizVar, long j) {
        this.f113517d = nlv0Var;
        this.f113515b = nizVar;
        this.f113516c = j;
    }
}
