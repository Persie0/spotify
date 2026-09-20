package p204p;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes2.dex */
public final class okz implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f166695a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f166696b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mb61 f166697c;

    /* JADX WARN: Multi-variable type inference failed */
    public okz(niz nizVar, th00 th00Var) {
        this.f166696b = nizVar;
        this.f166697c = (mb61) th00Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r3v2, types: [p.mb61, p.th00] */
    /* JADX WARN: Type inference failed for: r8v2, types: [p.mb61, p.vh00] */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        nkz nkzVar;
        qkz qkzVar;
        niz nizVar;
        int i;
        switch (this.f166695a) {
            case 0:
                if (fbkVar instanceof nkz) {
                    nkzVar = (nkz) fbkVar;
                    int i2 = nkzVar.f154971b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        nkzVar.f154971b = i2 - Integer.MIN_VALUE;
                    } else {
                        nkzVar = new nkz(this, fbkVar);
                    }
                } else {
                    nkzVar = new nkz(this, fbkVar);
                }
                Object objMo24510D0 = nkzVar.f154970a;
                int i3 = nkzVar.f154971b;
                if (i3 == 0) {
                    bga.m29073P(objMo24510D0);
                    nkzVar.f154971b = 1;
                    objMo24510D0 = this.f166697c.mo24510D0(this.f166696b, obj, nkzVar);
                    yuk yukVar = yuk.f276404a;
                    if (objMo24510D0 == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objMo24510D0);
                }
                if (((Boolean) objMo24510D0).booleanValue()) {
                    return w2a1.f247311a;
                }
                throw new AbortFlowException(this);
            default:
                if (fbkVar instanceof qkz) {
                    qkzVar = (qkz) fbkVar;
                    int i4 = qkzVar.f189673b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        qkzVar.f189673b = i4 - Integer.MIN_VALUE;
                    } else {
                        qkzVar = new qkz(this, fbkVar);
                    }
                } else {
                    qkzVar = new qkz(this, fbkVar);
                }
                Object obj2 = qkzVar.f189672a;
                int i5 = qkzVar.f189673b;
                yuk yukVar2 = yuk.f276404a;
                if (i5 != 0) {
                    if (i5 == 1) {
                        i = qkzVar.f189675d;
                        nizVar = qkzVar.f189674c;
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
                nizVar = this.f166696b;
                qkzVar.f189674c = nizVar;
                qkzVar.f189675d = 0;
                qkzVar.f189673b = 1;
                Object objInvoke = this.f166697c.invoke(obj, qkzVar);
                if (objInvoke == yukVar2) {
                    return yukVar2;
                }
                obj2 = objInvoke;
                i = 0;
                qkzVar.f189674c = null;
                qkzVar.f189675d = i;
                qkzVar.f189673b = 2;
                if (nizVar.emit(obj2, qkzVar) == yukVar2) {
                    return yukVar2;
                }
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public okz(vh00 vh00Var, niz nizVar) {
        this.f166697c = (mb61) vh00Var;
        this.f166696b = nizVar;
    }
}
