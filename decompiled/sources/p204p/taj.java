package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Update;
import com.spotify.mobius.coroutines.C1044a;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes6.dex */
public final class taj implements wsa0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f218619a;

    /* JADX INFO: renamed from: b */
    public final Object f218620b;

    /* JADX INFO: renamed from: c */
    public final Object f218621c;

    public /* synthetic */ taj(Update update, Connectable connectable, int i) {
        this.f218619a = i;
        this.f218620b = update;
        this.f218621c = connectable;
    }

    @Override // p204p.wsa0
    /* JADX INFO: renamed from: a */
    public final Connectable mo24834a() {
        switch (this.f218619a) {
            case 0:
                return (w4s0) this.f218621c;
            case 1:
                return (Connectable) this.f218621c;
            case 2:
                return (o72) this.f218621c;
            case 3:
                return (mfw0) this.f218621c;
            case 4:
                return (g5q0) this.f218621c;
            case 5:
                return (C2300qn) this.f218621c;
            case 6:
                return (o72) this.f218621c;
            case 7:
                return (C1044a) this.f218620b;
            case 8:
                return (ybx0) this.f218621c;
            default:
                return (x3v) this.f218621c;
        }
    }

    @Override // p204p.wsa0
    /* JADX INFO: renamed from: b */
    public final Update mo24835b() {
        switch (this.f218619a) {
            case 0:
                return (brp) this.f218620b;
            case 1:
                return (brp) this.f218620b;
            case 2:
                return (ata0) this.f218620b;
            case 3:
                return (ata0) this.f218620b;
            case 4:
                return (ata0) this.f218620b;
            case 5:
                return (txh0) this.f218620b;
            case 6:
                return (brp) this.f218620b;
            case 7:
                return (jza0) this.f218621c;
            case 8:
                return (eaq) this.f218620b;
            default:
                return (eaq) this.f218620b;
        }
    }

    public taj(bcm0 bcm0Var) {
        this.f218619a = 6;
        this.f218620b = brp.f30126B;
        this.f218621c = new o72(bcm0Var, 23);
    }

    public taj(gd8 gd8Var) {
        this.f218619a = 0;
        this.f218620b = brp.f30128D;
        rqn rqnVar = (rqn) gd8Var.f78759b;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f218621c = rqnVar.m76259a(xgg1.m90727W3());
    }

    public taj(C1044a c1044a) {
        this.f218619a = 7;
        this.f218620b = c1044a;
        this.f218621c = jza0.f117667y;
    }

    public taj(cdn cdnVar, int i) {
        this.f218619a = i;
        switch (i) {
            case 3:
                this.f218620b = ata0.f19634i;
                this.f218621c = (mfw0) cdnVar.f36915b;
                break;
            case 4:
                this.f218620b = ata0.f19632g;
                this.f218621c = (g5q0) cdnVar.f36918e;
                break;
            default:
                this.f218620b = ata0.f19631f;
                this.f218621c = (o72) cdnVar.f36917d;
                break;
        }
    }

    public taj(Class cls, Class cls2, Class cls3, wsa0 wsa0Var) {
        this.f218619a = 5;
        this.f218620b = new txh0(cls2, cls, wsa0Var);
        this.f218621c = new C2300qn(10, wsa0Var, cls3);
    }

    public taj(boolean z, mgl mglVar, zam0 zam0Var) {
        Object objM76259a;
        this.f218619a = 1;
        this.f218620b = brp.f30128D;
        if (z) {
            objM76259a = new m1q((s7s0) ((otn) mglVar.f143589u.f213118a.f241006d).f169519U2.get(), zam0Var);
        } else {
            objM76259a = mglVar.f143588t.m76259a(zam0Var);
        }
        this.f218621c = objM76259a;
    }
}
