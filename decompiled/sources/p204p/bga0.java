package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class bga0 {

    /* JADX INFO: renamed from: a */
    public final t4j f26895a;

    /* JADX INFO: renamed from: b */
    public final o7r f26896b;

    public bga0(t4j t4jVar, o7r o7rVar) {
        this.f26895a = t4jVar;
        this.f26896b = o7rVar;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3 A[PHI: r13
      0x00f3: PHI (r13v16 p.c8r) = (r13v14 p.c8r), (r13v19 p.c8r) binds: [B:47:0x00bb, B:59:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fb, code lost:
    
        if (p204p.zfa0.f282269a[r13.ordinal()] == 1) goto L62;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m29105a(String str, th00 th00Var, ibk ibkVar) {
        aga0 aga0Var;
        Object objM87199a;
        int i;
        int i2;
        String str2;
        int i3;
        c8r c8rVar;
        int iOrdinal;
        Object objM89557A;
        c8r c8rVar2;
        if (ibkVar instanceof aga0) {
            aga0Var = (aga0) ibkVar;
            int i4 = aga0Var.f15328h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aga0Var.f15328h = i4 - Integer.MIN_VALUE;
            } else {
                aga0Var = new aga0(this, ibkVar);
            }
        } else {
            aga0Var = new aga0(this, ibkVar);
        }
        Object obj = aga0Var.f15326f;
        int i5 = aga0Var.f15328h;
        o7r o7rVar = this.f26896b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i5 == 0) {
            bga.m29073P(obj);
            if (!o7rVar.mo66382a()) {
                return dga0.f48762a;
            }
            aga0Var.f15321a = str;
            aga0Var.f15322b = th00Var;
            aga0Var.f15328h = 1;
            objM87199a = ((w4j) this.f26895a).m87199a("permission_coordinator", aga0Var);
            if (objM87199a != yukVar) {
            }
            return yukVar;
        }
        if (i5 == 1) {
            th00Var = (th00) aga0Var.f15322b;
            str = aga0Var.f15321a;
            bga.m29073P(obj);
            objM87199a = ((s6x0) obj).f206218a;
        } else {
            if (i5 == 2) {
                i3 = aga0Var.f15325e;
                i2 = aga0Var.f15324d;
                str2 = aga0Var.f15321a;
                bga.m29073P(obj);
                c8rVar = (c8r) obj;
                if (i2 == 0) {
                    iOrdinal = c8rVar.ordinal();
                    if (iOrdinal != 0 || iOrdinal == 1) {
                        rnj0 rnj0Var = rnj0.f200934b;
                        g3a0 g3a0Var = new g3a0(this, str2, fbkVar, 10);
                        aga0Var.f15321a = null;
                        aga0Var.f15322b = null;
                        aga0Var.f15323c = c8rVar;
                        aga0Var.f15324d = i2;
                        aga0Var.f15325e = i3;
                        aga0Var.f15328h = 3;
                        objM89557A = x0h1.m89557A(rnj0Var, g3a0Var, aga0Var);
                        if (objM89557A != yukVar) {
                            obj = objM89557A;
                            c8rVar2 = c8rVar;
                        }
                        return yukVar;
                    }
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return gga0.f79584a;
            }
            if (i5 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c8rVar2 = aga0Var.f15323c;
            bga.m29073P(obj);
        }
        ((s6x0) obj).getClass();
        c8rVar = c8rVar2;
        if (s6x0.m77348a(objM87199a) != null) {
            return cga0.f37610a;
        }
        int iOrdinal2 = ((a5j) objM87199a).ordinal();
        if (iOrdinal2 == 0) {
            return ega0.f59285a;
        }
        if (iOrdinal2 == 1) {
            i = 1;
        } else {
            if (iOrdinal2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 0;
        }
        boolean zM66383b = o7rVar.m66383b();
        int i6 = !zM66383b ? 1 : 0;
        if (i != 0 || !zM66383b) {
            z7r z7rVar = !zM66383b ? z7r.f280273b : z7r.f280272a;
            aga0Var.f15321a = str;
            aga0Var.f15322b = null;
            aga0Var.f15324d = i;
            aga0Var.f15325e = i6;
            aga0Var.f15328h = 2;
            Object objInvoke = th00Var.invoke(z7rVar, aga0Var);
            if (objInvoke != yukVar) {
                int i7 = i;
                obj = objInvoke;
                i2 = i7;
                str2 = str;
                i3 = i6;
                c8rVar = (c8r) obj;
                if (i2 == 0) {
                    iOrdinal = c8rVar.ordinal();
                    if (iOrdinal != 0) {
                    }
                    rnj0 rnj0Var2 = rnj0.f200934b;
                    g3a0 g3a0Var2 = new g3a0(this, str2, fbkVar, 10);
                    aga0Var.f15321a = null;
                    aga0Var.f15322b = null;
                    aga0Var.f15323c = c8rVar;
                    aga0Var.f15324d = i2;
                    aga0Var.f15325e = i3;
                    aga0Var.f15328h = 3;
                    objM89557A = x0h1.m89557A(rnj0Var2, g3a0Var2, aga0Var);
                    if (objM89557A != yukVar) {
                        obj = objM89557A;
                        c8rVar2 = c8rVar;
                        ((s6x0) obj).getClass();
                        c8rVar = c8rVar2;
                    }
                }
                return gga0.f79584a;
            }
            return yukVar;
        }
        return fga0.f69262a;
    }
}
