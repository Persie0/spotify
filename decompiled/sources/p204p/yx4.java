package p204p;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class yx4 implements ero {

    /* JADX INFO: renamed from: a */
    public final vc40 f277126a;

    /* JADX INFO: renamed from: b */
    public final ivl0 f277127b;

    /* JADX INFO: renamed from: c */
    public final boolean f277128c;

    public yx4(vc40 vc40Var, ivl0 ivl0Var, boolean z) {
        this.f277126a = vc40Var;
        this.f277127b = ivl0Var;
        this.f277128c = z;
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m94806b(yx4 yx4Var, nlv0 nlv0Var) {
        vc40 vc40VarM78072p = sgg1.m78072p(yx4Var.f277126a, yx4Var.f277128c);
        try {
            ImageDecoder.Source sourceM36750e = ds4.m36750e(vc40VarM78072p, yx4Var.f277127b, true);
            if (sourceM36750e == null) {
                gqa gqaVarMo34165C1 = vc40VarM78072p.mo34165C1();
                try {
                    gqaVarMo34165C1.request(Long.MAX_VALUE);
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) gqaVarMo34165C1.mo42408l().f156904b);
                    while (!gqaVarMo34165C1.mo42408l().mo45420R0()) {
                        gqaVarMo34165C1.mo42408l().read(byteBufferAllocateDirect);
                    }
                    byteBufferAllocateDirect.flip();
                    gqaVarMo34165C1.close();
                    sourceM36750e = ImageDecoder.createSource(byteBufferAllocateDirect);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        n0e1.m63430g(gqaVarMo34165C1, th);
                        throw th2;
                    }
                }
            }
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(sourceM36750e, new vx4(yx4Var, nlv0Var, 0));
            mif1.m61875i(vc40VarM78072p, null);
            return drawableDecodeDrawable;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                mif1.m61875i(vc40VarM78072p, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.ero
    /* JADX INFO: renamed from: a */
    public final Object mo39812a(fbk fbkVar) throws Throwable {
        ux4 ux4Var;
        nlv0 nlv0Var;
        nlv0 nlv0Var2;
        if (fbkVar instanceof ux4) {
            ux4Var = (ux4) fbkVar;
            int i = ux4Var.f234821d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ux4Var.f234821d = i - Integer.MIN_VALUE;
            } else {
                ux4Var = new ux4(this, (ibk) fbkVar);
            }
        } else {
            ux4Var = new ux4(this, (ibk) fbkVar);
        }
        Object objM94807c = ux4Var.f234819b;
        int i2 = ux4Var.f234821d;
        Object obj = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                nlv0Var = ux4Var.f234818a;
                bga.m29073P(objM94807c);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nlv0Var2 = ux4Var.f234818a;
                bga.m29073P(objM94807c);
            }
            return new zqo(ufc1.m82967e((Drawable) objM94807c), nlv0Var2.f155174a);
        }
        bga.m29073P(objM94807c);
        nlv0 nlv0Var3 = new nlv0();
        C2570xf c2570xf = new C2570xf(3, this, nlv0Var3);
        ux4Var.f234818a = nlv0Var3;
        ux4Var.f234821d = 1;
        Object objM87844r = wdg1.m87844r(c2570xf, ux4Var);
        if (objM87844r != obj) {
            nlv0Var = nlv0Var3;
            objM94807c = objM87844r;
        }
        return obj;
        ux4Var.f234818a = nlv0Var;
        ux4Var.f234821d = 2;
        objM94807c = m94807c((Drawable) objM94807c, ux4Var);
        if (objM94807c != obj) {
            nlv0Var2 = nlv0Var;
            return new zqo(ufc1.m82967e((Drawable) objM94807c), nlv0Var2.f155174a);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m94807c(Drawable drawable, ibk ibkVar) throws Throwable {
        wx4 wx4Var;
        if (ibkVar instanceof wx4) {
            wx4Var = (wx4) ibkVar;
            int i = wx4Var.f255931d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wx4Var.f255931d = i - Integer.MIN_VALUE;
            } else {
                wx4Var = new wx4(this, ibkVar);
            }
        } else {
            wx4Var = new wx4(this, ibkVar);
        }
        Object obj = wx4Var.f255929b;
        int i2 = wx4Var.f255931d;
        ivl0 ivl0Var = this.f277127b;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (!(drawable instanceof AnimatedImageDrawable)) {
                return drawable;
            }
            skp skpVar = el51.f60595a;
            if (((Number) zuj0.m97055r(ivl0Var, skpVar)).intValue() != -2) {
                ((AnimatedImageDrawable) drawable).setRepeatCount(((Number) zuj0.m97055r(ivl0Var, skpVar)).intValue());
            }
            eh00 eh00Var = (eh00) zuj0.m97055r(ivl0Var, el51.f60597c);
            eh00 eh00Var2 = (eh00) zuj0.m97055r(ivl0Var, el51.f60598d);
            if (eh00Var != null || eh00Var2 != null) {
                n5q n5qVar = xsr.f265651a;
                rb20 rb20Var = pvb0.f181680a.f197428f;
                xx4 xx4Var = new xx4(drawable, eh00Var, eh00Var2, null);
                wx4Var.f255928a = drawable;
                wx4Var.f255931d = 1;
                Object objM89557A = x0h1.m89557A(rb20Var, xx4Var, wx4Var);
                yuk yukVar = yuk.f276404a;
                if (objM89557A == yukVar) {
                    return yukVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            drawable = (Drawable) wx4Var.f255928a;
            bga.m29073P(obj);
        }
        return new zay0(drawable, ivl0Var.f106234c);
    }
}
