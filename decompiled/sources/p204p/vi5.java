package p204p;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class vi5 implements wi5, aj5, oj50, tfs, vhz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f241616a;

    /* JADX INFO: renamed from: b */
    public float f241617b;

    public /* synthetic */ vi5(float f, int i) {
        this.f241616a = i;
        this.f241617b = f;
    }

    @Override // p204p.vhz
    /* JADX INFO: renamed from: a */
    public float mo39758a(float f, float f2, long j) {
        long jMo39764n = mo39764n(f2);
        return (Float.intBitsToFloat((int) (g84.m43944a(jMo39764n > 0 ? j / jMo39764n : 1.0f) >> 32)) * m85587c(f2)) + f;
    }

    /* JADX INFO: renamed from: b */
    public euk m85586b(euk eukVar) {
        return eukVar instanceof l0w0 ? eukVar : new ey1(this.f241617b, eukVar);
    }

    /* JADX INFO: renamed from: c */
    public float m85587c(float f) {
        float[] fArr = g84.f77404a;
        float f2 = uwd1.f234634a;
        float f3 = this.f241617b;
        double dExp = Math.exp((uwd1.f234635b / uwd1.f234636c) * Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (f2 * f3))));
        return Math.signum(f) * ((float) (dExp * ((double) (f2 * f3))));
    }

    /* JADX INFO: renamed from: d */
    public pqm0 m85588d(int i, int i2) {
        float f = this.f241617b;
        if (i == 0 || i2 == 0) {
            return new pqm0(0, 0);
        }
        Integer numValueOf = Integer.valueOf(q3d0.m72083N(i / (f < 1.0f ? 1.0f : f)));
        float f2 = i2;
        if (f < 1.0f) {
            f = 1.0f;
        }
        return new pqm0(numValueOf, Integer.valueOf(q3d0.m72083N(f2 / f)));
    }

    @Override // p204p.tfs
    /* JADX INFO: renamed from: e */
    public Drawable mo54267e(Bitmap bitmap) {
        wj50.m88279p(bitmap);
        return new pmx0(bitmap, this.f241617b);
    }

    @Override // p204p.wi5, p204p.aj5
    /* JADX INFO: renamed from: j */
    public float mo26142j() {
        switch (this.f241616a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f241617b;
    }

    @Override // p204p.vhz
    /* JADX INFO: renamed from: l */
    public float mo39763l() {
        return 0.0f;
    }

    @Override // p204p.vhz
    /* JADX INFO: renamed from: n */
    public long mo39764n(float f) {
        float[] fArr = g84.f77404a;
        return (long) (Math.exp(Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (uwd1.f234634a * this.f241617b))) / uwd1.f234636c) * 1.0E9d);
    }

    @Override // p204p.vhz
    /* JADX INFO: renamed from: o */
    public float mo39765o(float f, float f2) {
        return m85587c(f2) + f;
    }

    @Override // p204p.vhz
    /* JADX INFO: renamed from: q */
    public float mo39767q(long j, float f) {
        long jMo39764n = mo39764n(f);
        return ((Float.intBitsToFloat((int) (g84.m43944a(jMo39764n > 0 ? j / jMo39764n : 1.0f) & 4294967295L)) * m85587c(f)) / jMo39764n) * 1.0E9f;
    }

    @Override // p204p.wi5
    /* JADX INFO: renamed from: t */
    public void mo75551t(yqq yqqVar, int i, int[] iArr, ko70 ko70Var, int[] iArr2) {
        switch (this.f241616a) {
            case 0:
                if (ko70Var != ko70.f124556a) {
                    bj5.m29364a(i, iArr, iArr2, true);
                } else {
                    bj5.m29364a(i, iArr, iArr2, false);
                }
                break;
            case 1:
                if (ko70Var != ko70.f124556a) {
                    bj5.m29367d(i, iArr, iArr2, true);
                } else {
                    bj5.m29367d(i, iArr, iArr2, false);
                }
                break;
            case 2:
                if (ko70Var != ko70.f124556a) {
                    bj5.m29368e(i, iArr, iArr2, true);
                } else {
                    bj5.m29368e(i, iArr, iArr2, false);
                }
                break;
            default:
                if (ko70Var != ko70.f124556a) {
                    bj5.m29369f(i, iArr, iArr2, true);
                } else {
                    bj5.m29369f(i, iArr, iArr2, false);
                }
                break;
        }
    }

    public String toString() {
        switch (this.f241616a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            case 3:
                return "Arrangement#SpaceEvenly";
            case 4:
            default:
                return super.toString();
            case 5:
                return String.format(Locale.US, "unit(%.2f, %.2f)", Float.valueOf(0.0f), Float.valueOf(this.f241617b));
        }
    }

    @Override // p204p.aj5
    /* JADX INFO: renamed from: u */
    public void mo26143u(yqq yqqVar, int i, int[] iArr, int[] iArr2) {
        switch (this.f241616a) {
            case 0:
                bj5.m29364a(i, iArr, iArr2, false);
                break;
            case 1:
                bj5.m29367d(i, iArr, iArr2, false);
                break;
            case 2:
                bj5.m29368e(i, iArr, iArr2, false);
                break;
            default:
                bj5.m29369f(i, iArr, iArr2, false);
                break;
        }
    }

    public /* synthetic */ vi5(int i, boolean z) {
        this.f241616a = i;
    }

    public vi5(int i) {
        this.f241616a = i;
        switch (i) {
            case 1:
                this.f241617b = 0;
                break;
            case 2:
                this.f241617b = 0;
                break;
            case 3:
                this.f241617b = 0;
                break;
            default:
                this.f241617b = 0;
                break;
        }
    }

    public vi5(yqq yqqVar) {
        this.f241616a = 9;
        this.f241617b = yqqVar.mo24619j() * 386.0878f * 160.0f * 0.84f;
    }

    @Override // p204p.oj50
    /* JADX INFO: renamed from: h */
    public float mo61924h(float f, float f2, float f3) {
        return f3;
    }
}
