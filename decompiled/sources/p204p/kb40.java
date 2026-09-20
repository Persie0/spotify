package p204p;

import android.graphics.Bitmap;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes8.dex */
public final class kb40 implements dut {

    /* JADX INFO: renamed from: a */
    public final e940 f121079a;

    /* JADX INFO: renamed from: b */
    public final luk f121080b;

    /* JADX INFO: renamed from: d */
    public String f121082d;

    /* JADX INFO: renamed from: g */
    public final cph f121085g;

    /* JADX INFO: renamed from: c */
    public final zv41 f121081c = jag1.m52819d(cb40.f36006a);

    /* JADX INFO: renamed from: e */
    public final xiz f121083e = axf1.m27398m(new zc30(this, 12), p740.f174571X0, zy20.f287454T0, null, p740.f174573Y0, 8);

    /* JADX INFO: renamed from: f */
    public final i5x f121084f = mhf1.m61771p(this).m94133b(k740.f119970g, k740.f119971h);

    public kb40(xre xreVar, e940 e940Var, luk lukVar) {
        this.f121079a = e940Var;
        this.f121080b = lukVar;
        fyf fyfVar = xlg.f263142a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f121085g = new cph(fyfVar, 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m55928e(kb40 kb40Var, String str, boolean z, ibk ibkVar) {
        ib40 ib40Var;
        int i;
        if (ibkVar instanceof ib40) {
            ib40Var = (ib40) ibkVar;
            int i2 = ib40Var.f100435d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ib40Var.f100435d = i2 - Integer.MIN_VALUE;
            } else {
                ib40Var = new ib40(kb40Var, ibkVar);
            }
        } else {
            ib40Var = new ib40(kb40Var, ibkVar);
        }
        Object objM55929f = ib40Var.f100433b;
        int i3 = ib40Var.f100435d;
        if (i3 == 0) {
            bga.m29073P(objM55929f);
            int i4 = (z ? 180 : 240) * 3;
            ib40Var.f100432a = i4;
            ib40Var.f100435d = 1;
            objM55929f = kb40Var.m55929f(str, ib40Var);
            Object obj = yuk.f276404a;
            if (objM55929f == obj) {
                return obj;
            }
            i = i4;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = ib40Var.f100432a;
            bga.m29073P(objM55929f);
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) objM55929f, i, i, true);
        return new db40(bitmapCreateScaledBitmap, Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, 6, 6, true));
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f121084f;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f121085g;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:40|25|(1:35)(1:28)) */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        r6 = r12;
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        if (p204p.njg1.m64619l(((long) r12) * 500, r0) == r5) goto L35;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0070 -> B:36:0x0085). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0082 -> B:36:0x0085). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m55929f(String str, ibk ibkVar) throws Exception {
        jb40 jb40Var;
        Exception e;
        int i;
        int i2;
        String str2;
        if (ibkVar instanceof jb40) {
            jb40Var = (jb40) ibkVar;
            int i3 = jb40Var.f110646f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jb40Var.f110646f = i3 - Integer.MIN_VALUE;
            } else {
                jb40Var = new jb40(this, ibkVar);
            }
        } else {
            jb40Var = new jb40(this, ibkVar);
        }
        Object obj = jb40Var.f110644d;
        int i4 = jb40Var.f110646f;
        yuk yukVar = yuk.f276404a;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    i2 = jb40Var.f110643c;
                    String str3 = jb40Var.f110641a;
                    try {
                        bga.m29073P(obj);
                        return obj;
                    } catch (Exception e2) {
                        str2 = str3;
                        e = e2;
                    }
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = jb40Var.f110643c;
                    e = jb40Var.f110642b;
                    str2 = jb40Var.f110641a;
                    bga.m29073P(obj);
                    i = i2 + 1;
                    str = str2;
                }
                if (i2 < 3) {
                    jb40Var.f110641a = str2;
                    jb40Var.f110642b = e;
                    jb40Var.f110643c = i2;
                    jb40Var.f110646f = 2;
                }
                i = i2 + 1;
                str = str2;
            } else {
                bga.m29073P(obj);
                e = null;
                i = 1;
            }
            if (i >= 4) {
                wj50.m88279p(e);
                throw e;
            }
            lxe lxeVarMo24613j = this.f121079a.mo24613j(str);
            lxeVarMo24613j.f137801g = false;
            Single singleM60183i = lxeVarMo24613j.m60183i();
            jb40Var.f110641a = str;
            jb40Var.f110642b = null;
            jb40Var.f110643c = i;
            jb40Var.f110646f = 1;
            Object objM96567o = zn91.m96567o(singleM60183i, jb40Var);
            return objM96567o == yukVar ? yukVar : objM96567o;
        } catch (CancellationException e3) {
            throw e3;
        }
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f121083e;
    }
}
