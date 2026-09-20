package p204p;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class vyt0 implements r4m0 {

    /* JADX INFO: renamed from: a */
    public final pkh f246324a;

    /* JADX INFO: renamed from: b */
    public final zyt0 f246325b;

    /* JADX INFO: renamed from: c */
    public final rwt0 f246326c;

    /* JADX INFO: renamed from: d */
    public final y0o f246327d;

    /* JADX INFO: renamed from: e */
    public final pfm0 f246328e;

    public vyt0(Resources resources, pkh pkhVar, zyt0 zyt0Var, rwt0 rwt0Var, y0o y0oVar, n6q n6qVar) {
        this.f246324a = pkhVar;
        this.f246325b = zyt0Var;
        this.f246326c = rwt0Var;
        this.f246327d = y0oVar;
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f246328e = new pfm0(new qfm0[]{new q040(xgg1.m90609F4(), xoc1.f264017X.m83614b(zyt0Var.m97247c()), null), new fda(Integer.valueOf((int) (resources.getDisplayMetrics().heightPixels * 0.5f)), bda.f26061a, null, 0, null, n6qVar, false, false, false, 2012), new tkm0(qkm0.f189619a, 0, 2)}, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m86861c(vyt0 vyt0Var, ibk ibkVar) {
        uyt0 uyt0Var;
        Object objM76584g;
        if (ibkVar instanceof uyt0) {
            uyt0Var = (uyt0) ibkVar;
            int i = uyt0Var.f235361c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uyt0Var.f235361c = i - Integer.MIN_VALUE;
            } else {
                uyt0Var = new uyt0(vyt0Var, ibkVar);
            }
        } else {
            uyt0Var = new uyt0(vyt0Var, ibkVar);
        }
        Object obj = uyt0Var.f235359a;
        int i2 = uyt0Var.f235361c;
        if (i2 == 0) {
            bga.m29073P(obj);
            rwt0 rwt0Var = vyt0Var.f246326c;
            String strM97248g = vyt0Var.f246325b.m97248g();
            uyt0Var.f235361c = 1;
            objM76584g = rwt0Var.m76584g(strM97248g, uyt0Var);
            yuk yukVar = yuk.f276404a;
            if (objM76584g == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            objM76584g = ((s6x0) obj).f206218a;
        }
        bga.m29073P(objM76584g);
        return opo.m67574x((Iterable) objM76584g);
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: a */
    public final pfm0 mo24326a() {
        return this.f246328e;
    }

    @Override // p204p.r4m0
    /* JADX INFO: renamed from: b */
    public final u6m0 mo24327b() {
        return this.f246324a.m70217a(tky.m81027c(new v4a0[]{new v4a0()}, new bya0(this, null, 20)), rkk.m75763o(new glt0(this, 8), true, 313032645), new hlh(null, null, null, false, 63));
    }
}
