package p204p;

import androidx.compose.material.AnchoredDragFinishedSignal;

/* JADX INFO: loaded from: classes3.dex */
public final class tr3 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f222953a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rlv0 f222954b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xuk f222955c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ th00 f222956d;

    public /* synthetic */ tr3(rlv0 rlv0Var, xuk xukVar, th00 th00Var, int i) {
        this.f222953a = i;
        this.f222954b = rlv0Var;
        this.f222955c = xukVar;
        this.f222956d = th00Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        qr3 qr3Var;
        rr3 rr3Var;
        sr3 sr3Var;
        switch (this.f222953a) {
            case 0:
                if (fbkVar instanceof qr3) {
                    qr3Var = (qr3) fbkVar;
                    int i = qr3Var.f191722e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        qr3Var.f191722e = i - Integer.MIN_VALUE;
                    } else {
                        qr3Var = new qr3(this, fbkVar);
                    }
                } else {
                    qr3Var = new qr3(this, fbkVar);
                }
                Object obj2 = qr3Var.f191720c;
                int i2 = qr3Var.f191722e;
                rlv0 rlv0Var = this.f222954b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    tf60 tf60Var = (tf60) rlv0Var.f200373a;
                    if (tf60Var != null) {
                        tf60Var.mo26601e(new AnchoredDragFinishedSignal());
                        qr3Var.f191718a = obj;
                        qr3Var.f191719b = tf60Var;
                        qr3Var.f191722e = 1;
                        Object objMo26604k = tf60Var.mo26604k(qr3Var);
                        yuk yukVar = yuk.f276404a;
                        if (objMo26604k == yukVar) {
                            return yukVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tf60 tf60Var2 = qr3Var.f191719b;
                    obj = qr3Var.f191718a;
                    bga.m29073P(obj2);
                }
                th00 th00Var = this.f222956d;
                xuk xukVar = this.f222955c;
                rlv0Var.f200373a = x0h1.m89578u(xukVar, null, 4, new pr3(th00Var, obj, xukVar, null, 0), 1);
                return w2a1.f247311a;
            case 1:
                if (fbkVar instanceof rr3) {
                    rr3Var = (rr3) fbkVar;
                    int i3 = rr3Var.f201939e;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        rr3Var.f201939e = i3 - Integer.MIN_VALUE;
                    } else {
                        rr3Var = new rr3(this, fbkVar);
                    }
                } else {
                    rr3Var = new rr3(this, fbkVar);
                }
                Object obj3 = rr3Var.f201937c;
                int i4 = rr3Var.f201939e;
                rlv0 rlv0Var2 = this.f222954b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    tf60 tf60Var3 = (tf60) rlv0Var2.f200373a;
                    if (tf60Var3 != null) {
                        tf60Var3.mo26601e(new androidx.compose.material3.internal.AnchoredDragFinishedSignal());
                        rr3Var.f201935a = obj;
                        rr3Var.f201936b = tf60Var3;
                        rr3Var.f201939e = 1;
                        Object objMo26604k2 = tf60Var3.mo26604k(rr3Var);
                        yuk yukVar2 = yuk.f276404a;
                        if (objMo26604k2 == yukVar2) {
                            return yukVar2;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tf60 tf60Var4 = rr3Var.f201936b;
                    obj = rr3Var.f201935a;
                    bga.m29073P(obj3);
                }
                th00 th00Var2 = this.f222956d;
                xuk xukVar2 = this.f222955c;
                rlv0Var2.f200373a = x0h1.m89578u(xukVar2, null, 4, new pr3(th00Var2, obj, xukVar2, null, 1), 1);
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof sr3) {
                    sr3Var = (sr3) fbkVar;
                    int i5 = sr3Var.f213222e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        sr3Var.f213222e = i5 - Integer.MIN_VALUE;
                    } else {
                        sr3Var = new sr3(this, fbkVar);
                    }
                } else {
                    sr3Var = new sr3(this, fbkVar);
                }
                Object obj4 = sr3Var.f213220c;
                int i6 = sr3Var.f213222e;
                rlv0 rlv0Var3 = this.f222954b;
                if (i6 == 0) {
                    bga.m29073P(obj4);
                    tf60 tf60Var5 = (tf60) rlv0Var3.f200373a;
                    if (tf60Var5 != null) {
                        tf60Var5.mo26601e(new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal());
                        sr3Var.f213218a = obj;
                        sr3Var.f213219b = tf60Var5;
                        sr3Var.f213222e = 1;
                        Object objMo26604k3 = tf60Var5.mo26604k(sr3Var);
                        yuk yukVar3 = yuk.f276404a;
                        if (objMo26604k3 == yukVar3) {
                            return yukVar3;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tf60 tf60Var6 = sr3Var.f213219b;
                    obj = sr3Var.f213218a;
                    bga.m29073P(obj4);
                }
                th00 th00Var3 = this.f222956d;
                xuk xukVar3 = this.f222955c;
                rlv0Var3.f200373a = x0h1.m89578u(xukVar3, null, 4, new pr3(th00Var3, obj, xukVar3, null, 2), 1);
                return w2a1.f247311a;
        }
    }
}
