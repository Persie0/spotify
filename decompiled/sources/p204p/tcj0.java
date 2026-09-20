package p204p;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class tcj0 implements ssi {

    /* JADX INFO: renamed from: a */
    public final zcp f219090a;

    /* JADX INFO: renamed from: b */
    public final iej0 f219091b;

    /* JADX INFO: renamed from: c */
    public final luk f219092c;

    /* JADX INFO: renamed from: d */
    public final Context f219093d;

    /* JADX INFO: renamed from: e */
    public xuk f219094e;

    public tcj0(zcp zcpVar, iej0 iej0Var, Context context, luk lukVar) {
        this.f219090a = zcpVar;
        this.f219091b = iej0Var;
        this.f219092c = lukVar;
        this.f219093d = context.getApplicationContext();
        this.f219094e = dq60.m36621u(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (p204p.vig1.m85661p(r1, p204p.paj0.f175544a, r3, null, r5, 8) == r7) goto L26;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m80476c(tcj0 tcj0Var, boolean z, ibk ibkVar) {
        scj0 scj0Var;
        if (ibkVar instanceof scj0) {
            scj0Var = (scj0) ibkVar;
            int i = scj0Var.f207758d;
            if ((i & Integer.MIN_VALUE) != 0) {
                scj0Var.f207758d = i - Integer.MIN_VALUE;
            } else {
                scj0Var = new scj0(tcj0Var, ibkVar);
            }
        } else {
            scj0Var = new scj0(tcj0Var, ibkVar);
        }
        scj0 scj0Var2 = scj0Var;
        Object objM86755t = scj0Var2.f207756b;
        int i2 = scj0Var2.f207758d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            fiz fizVar = tcj0Var.f219091b.f101428g;
            scj0Var2.f207755a = z;
            scj0Var2.f207758d = 1;
            objM86755t = vyf1.m86755t(fizVar, scj0Var2);
            if (objM86755t != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            z = scj0Var2.f207755a;
            bga.m29073P(objM86755t);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        kk40.m56680v(tcj0Var.f219094e, null);
        return w2a1.f247311a;
        aej0 aej0Var = (aej0) objM86755t;
        if (z && (aej0Var instanceof wdj0)) {
            iej0 iej0Var = tcj0Var.f219091b;
            Context context = tcj0Var.f219093d;
            scj0Var2.f207755a = z;
            scj0Var2.f207758d = 2;
        }
        return w2a1.f247311a;
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: a */
    public final void mo24869a() {
        if (Build.VERSION.SDK_INT > 36) {
            kk40.m56680v(this.f219094e, null);
        }
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: b */
    public final void mo24870b() {
        if (Build.VERSION.SDK_INT > 36) {
            this.f219094e = dv9.m37073v(this.f219094e, new ccj0(this, 2));
            wxf1.m89255l(this.f219094e, b0g1.m27776L(this.f219090a.f281556b, new go3(this, null, 11)));
        }
    }
}
