package p204p;

import android.graphics.ImageDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class oy41 implements ero {

    /* JADX INFO: renamed from: a */
    public final ImageDecoder.Source f171666a;

    /* JADX INFO: renamed from: b */
    public final AutoCloseable f171667b;

    /* JADX INFO: renamed from: c */
    public final ivl0 f171668c;

    /* JADX INFO: renamed from: d */
    public final tpz0 f171669d;

    public oy41(ImageDecoder.Source source, AutoCloseable autoCloseable, ivl0 ivl0Var, tpz0 tpz0Var) {
        this.f171666a = source;
        this.f171667b = autoCloseable;
        this.f171668c = ivl0Var;
        this.f171669d = tpz0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.ero
    /* JADX INFO: renamed from: a */
    public final Object mo39812a(fbk fbkVar) {
        ny41 ny41Var;
        tpz0 tpz0Var;
        if (fbkVar instanceof ny41) {
            ny41Var = (ny41) fbkVar;
            int i = ny41Var.f159708d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ny41Var.f159708d = i - Integer.MIN_VALUE;
            } else {
                ny41Var = new ny41(this, (ibk) fbkVar);
            }
        } else {
            ny41Var = new ny41(this, (ibk) fbkVar);
        }
        Object obj = ny41Var.f159706b;
        int i2 = ny41Var.f159708d;
        if (i2 == 0) {
            bga.m29073P(obj);
            tpz0 tpz0Var2 = this.f171669d;
            ny41Var.f159705a = tpz0Var2;
            ny41Var.f159708d = 1;
            Object objM78928b = tpz0Var2.m78928b(ny41Var);
            yuk yukVar = yuk.f276404a;
            if (objM78928b == yukVar) {
                return yukVar;
            }
            tpz0Var = tpz0Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tpz0Var = ny41Var.f159705a;
            bga.m29073P(obj);
        }
        try {
            AutoCloseable autoCloseable = this.f171667b;
            try {
                nlv0 nlv0Var = new nlv0();
                zqo zqoVar = new zqo(ufc1.m82968f(ImageDecoder.decodeBitmap(this.f171666a, new vx4(this, nlv0Var, 1))), nlv0Var.f155174a);
                mif1.m61875i(autoCloseable, null);
                tpz0Var.m78930e();
                return zqoVar;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    mif1.m61875i(autoCloseable, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            tpz0Var.m78930e();
            throw th3;
        }
    }
}
