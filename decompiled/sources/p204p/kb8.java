package p204p;

import java.text.DecimalFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kb8 extends ewf {

    /* JADX INFO: renamed from: e */
    public hu30 f121108e;

    /* JADX INFO: renamed from: k */
    public int f121114k;

    /* JADX INFO: renamed from: l */
    public int f121115l;

    /* JADX INFO: renamed from: t */
    public final ArrayList f121123t;

    /* JADX INFO: renamed from: f */
    public final int f121109f = -7829368;

    /* JADX INFO: renamed from: g */
    public final float f121110g = 1.0f;

    /* JADX INFO: renamed from: h */
    public final int f121111h = -7829368;

    /* JADX INFO: renamed from: i */
    public final float f121112i = 1.0f;

    /* JADX INFO: renamed from: j */
    public float[] f121113j = new float[0];

    /* JADX INFO: renamed from: m */
    public int f121116m = 6;

    /* JADX INFO: renamed from: n */
    public float f121117n = 1.0f;

    /* JADX INFO: renamed from: o */
    public boolean f121118o = false;

    /* JADX INFO: renamed from: p */
    public boolean f121119p = false;

    /* JADX INFO: renamed from: q */
    public boolean f121120q = true;

    /* JADX INFO: renamed from: r */
    public boolean f121121r = true;

    /* JADX INFO: renamed from: s */
    public boolean f121122s = true;

    /* JADX INFO: renamed from: u */
    public float f121124u = 0.0f;

    /* JADX INFO: renamed from: v */
    public float f121125v = 0.0f;

    /* JADX INFO: renamed from: w */
    public boolean f121126w = false;

    /* JADX INFO: renamed from: x */
    public boolean f121127x = false;

    /* JADX INFO: renamed from: y */
    public float f121128y = 0.0f;

    /* JADX INFO: renamed from: z */
    public float f121129z = 0.0f;

    /* JADX INFO: renamed from: A */
    public float f121107A = 0.0f;

    public kb8() {
        this.f63529c = u0b1.m82122c(10.0f);
        this.f63527a = u0b1.m82122c(5.0f);
        this.f63528b = u0b1.m82122c(5.0f);
        this.f121123t = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public void mo55935a(float f, float f2) {
        float f3 = this.f121126w ? this.f121129z : f - this.f121124u;
        float f4 = this.f121127x ? this.f121128y : f2 + this.f121125v;
        if (Math.abs(f4 - f3) == 0.0f) {
            f4 += 1.0f;
            f3 -= 1.0f;
        }
        this.f121129z = f3;
        this.f121128y = f4;
        this.f121107A = Math.abs(f4 - f3);
    }

    /* JADX INFO: renamed from: b */
    public final String m55936b() {
        int i = 0;
        String str = "";
        while (true) {
            float[] fArr = this.f121113j;
            if (i >= fArr.length) {
                return str;
            }
            String strMo31672a = (i < 0 || i >= fArr.length) ? "" : m55937c().mo31672a(this.f121113j[i], this);
            if (strMo31672a != null && str.length() < strMo31672a.length()) {
                str = strMo31672a;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final hu30 m55937c() {
        hu30 hu30Var = this.f121108e;
        if (hu30Var == null || ((hu30Var instanceof lzo) && ((lzo) hu30Var).f138399b != this.f121115l)) {
            int i = this.f121115l;
            lzo lzoVar = new lzo();
            lzoVar.f138399b = i;
            StringBuffer stringBuffer = new StringBuffer();
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 == 0) {
                    stringBuffer.append(".");
                }
                stringBuffer.append("0");
            }
            lzoVar.f138398a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
            this.f121108e = lzoVar;
        }
        return this.f121108e;
    }
}
