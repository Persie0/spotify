package p204p;

import android.net.Uri;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes10.dex */
public final class d5y0 implements ivb0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nmf f45530a;

    public d5y0(nmf nmfVar) {
        this.f45530a = nmfVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // p204p.ivb0
    /* JADX INFO: renamed from: a */
    public final Object mo35046a(fbk fbkVar) {
        c5y0 c5y0Var;
        Object objM56795a;
        kl1 kl1Var = (kl1) this.f45530a.f155418b;
        if (fbkVar instanceof c5y0) {
            c5y0Var = (c5y0) fbkVar;
            int i = c5y0Var.f34316c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5y0Var.f34316c = i - Integer.MIN_VALUE;
            } else {
                c5y0Var = new c5y0(this, (ibk) fbkVar);
            }
        } else {
            c5y0Var = new c5y0(this, (ibk) fbkVar);
        }
        Object obj = c5y0Var.f34314a;
        int i2 = c5y0Var.f34316c;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                c5y0Var.f34316c = 1;
                Uri uri = kl1Var.f123773g;
                if (uri == null || (objM56795a = kl1Var.m56795a(uri.toString(), c5y0Var)) != yukVar) {
                    objM56795a = w2a1.f247311a;
                }
                if (objM56795a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    throw new KotlinNothingValueException();
                }
                bga.m29073P(obj);
            }
            c5y0Var.f34316c = 2;
            njg1.m64618k(c5y0Var);
            return yukVar;
        } catch (Throwable th) {
            twy twyVar = kl1Var.f123768b;
            ((lwr) twyVar.f224515g).m60129c();
            s73 s73Var = (s73) twyVar.f224516h;
            if (s73Var != null) {
                s73Var.dismiss();
            }
            twyVar.f224516h = null;
            throw th;
        }
    }
}
