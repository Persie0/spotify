package p204p;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes10.dex */
public final class k2c implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f118589a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mb61 f118590b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ niz f118591c;

    /* JADX WARN: Multi-variable type inference failed */
    public k2c(niz nizVar, th00 th00Var, int i) {
        this.f118589a = i;
        switch (i) {
            case 2:
                this.f118591c = nizVar;
                this.f118590b = (mb61) th00Var;
                break;
            default:
                this.f118591c = nizVar;
                this.f118590b = (mb61) th00Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r1v7, types: [p.mb61, p.th00] */
    /* JADX WARN: Type inference failed for: r3v1, types: [p.mb61, p.th00] */
    /* JADX WARN: Type inference failed for: r3v7, types: [p.mb61, p.th00] */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        j2c j2cVar;
        niz nizVar;
        int i;
        mkz mkzVar;
        int i2;
        Object objInvoke;
        pkz pkzVar;
        niz nizVar2;
        int i3;
        switch (this.f118589a) {
            case 0:
                if (fbkVar instanceof j2c) {
                    j2cVar = (j2c) fbkVar;
                    int i4 = j2cVar.f107994b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        j2cVar.f107994b = i4 - Integer.MIN_VALUE;
                    } else {
                        j2cVar = new j2c(this, fbkVar);
                    }
                } else {
                    j2cVar = new j2c(this, fbkVar);
                }
                Object obj2 = j2cVar.f107993a;
                int i5 = j2cVar.f107994b;
                yuk yukVar = yuk.f276404a;
                if (i5 != 0) {
                    if (i5 == 1) {
                        i = j2cVar.f107996d;
                        nizVar = j2cVar.f107995c;
                        bga.m29073P(obj2);
                    } else {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj2);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj2);
                nizVar = this.f118591c;
                j2cVar.f107995c = nizVar;
                j2cVar.f107996d = 0;
                j2cVar.f107994b = 1;
                Object objInvoke2 = this.f118590b.invoke(obj, j2cVar);
                if (objInvoke2 == yukVar) {
                    return yukVar;
                }
                obj2 = objInvoke2;
                i = 0;
                if (obj2 != null) {
                    j2cVar.f107995c = null;
                    j2cVar.f107996d = i;
                    j2cVar.f107994b = 2;
                    if (nizVar.emit(obj2, j2cVar) == yukVar) {
                        return yukVar;
                    }
                }
                return w2a1.f247311a;
            case 1:
                if (fbkVar instanceof mkz) {
                    mkzVar = (mkz) fbkVar;
                    int i6 = mkzVar.f144715b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        mkzVar.f144715b = i6 - Integer.MIN_VALUE;
                    } else {
                        mkzVar = new mkz(this, fbkVar);
                    }
                } else {
                    mkzVar = new mkz(this, fbkVar);
                }
                Object obj3 = mkzVar.f144714a;
                int i7 = mkzVar.f144715b;
                yuk yukVar2 = yuk.f276404a;
                if (i7 != 0) {
                    if (i7 == 1) {
                        int i8 = mkzVar.f144718e;
                        Object obj4 = mkzVar.f144717d;
                        bga.m29073P(obj3);
                        i2 = i8;
                        obj = obj4;
                        objInvoke = obj3;
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj3);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj3);
                mkzVar.f144717d = obj;
                i2 = 0;
                mkzVar.f144718e = 0;
                mkzVar.f144715b = 1;
                objInvoke = this.f118590b.invoke(obj, mkzVar);
                if (objInvoke == yukVar2) {
                    return yukVar2;
                }
                if (!((Boolean) objInvoke).booleanValue()) {
                    throw new AbortFlowException(this);
                }
                mkzVar.f144717d = null;
                mkzVar.f144718e = i2;
                mkzVar.f144715b = 2;
                if (this.f118591c.emit(obj, mkzVar) == yukVar2) {
                    return yukVar2;
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof pkz) {
                    pkzVar = (pkz) fbkVar;
                    int i9 = pkzVar.f178596b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        pkzVar.f178596b = i9 - Integer.MIN_VALUE;
                    } else {
                        pkzVar = new pkz(this, fbkVar);
                    }
                } else {
                    pkzVar = new pkz(this, fbkVar);
                }
                Object obj5 = pkzVar.f178595a;
                int i10 = pkzVar.f178596b;
                yuk yukVar3 = yuk.f276404a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        i3 = pkzVar.f178598d;
                        nizVar2 = pkzVar.f178597c;
                        bga.m29073P(obj5);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj5);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj5);
                nizVar2 = this.f118591c;
                pkzVar.f178597c = nizVar2;
                pkzVar.f178598d = 0;
                pkzVar.f178596b = 1;
                Object objInvoke3 = this.f118590b.invoke(obj, pkzVar);
                if (objInvoke3 == yukVar3) {
                    return yukVar3;
                }
                obj5 = objInvoke3;
                i3 = 0;
                pkzVar.f178597c = null;
                pkzVar.f178598d = i3;
                pkzVar.f178596b = 2;
                if (nizVar2.emit(obj5, pkzVar) == yukVar3) {
                    return yukVar3;
                }
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k2c(niz nizVar, th00 th00Var) {
        this.f118589a = 1;
        this.f118590b = (mb61) th00Var;
        this.f118591c = nizVar;
    }
}
