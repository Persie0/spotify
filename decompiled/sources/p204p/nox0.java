package p204p;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Row;

/* JADX INFO: loaded from: classes3.dex */
public final class nox0 {

    /* JADX INFO: renamed from: g */
    public static final nox0 f156805g = new nox0(new mox0());

    /* JADX INFO: renamed from: h */
    public static final nox0 f156806h;

    /* JADX INFO: renamed from: i */
    public static final nox0 f156807i;

    /* JADX INFO: renamed from: j */
    public static final nox0 f156808j;

    /* JADX INFO: renamed from: k */
    public static final nox0 f156809k;

    /* JADX INFO: renamed from: a */
    public final int f156810a;

    /* JADX INFO: renamed from: b */
    public final int f156811b;

    /* JADX INFO: renamed from: c */
    public final boolean f156812c;

    /* JADX INFO: renamed from: d */
    public final boolean f156813d;

    /* JADX INFO: renamed from: e */
    public final boolean f156814e;

    /* JADX INFO: renamed from: f */
    public final ckx0 f156815f;

    static {
        mox0 mox0Var = new mox0();
        mox0Var.f145775d = 0;
        mox0Var.f145776e = false;
        mox0Var.f145774c = 1;
        mox0Var.f145772a = true;
        mox0Var.f145773b = false;
        f156806h = new nox0(mox0Var);
        mox0 mox0Var2 = new mox0();
        mox0Var2.f145775d = 2;
        mox0Var2.f145776e = true;
        mox0Var2.f145774c = 2;
        mox0Var2.f145773b = true;
        mox0Var2.f145772a = false;
        f156807i = new nox0(mox0Var2);
        mox0 mox0Var3 = new mox0();
        mox0Var3.f145775d = 0;
        mox0Var3.f145776e = true;
        mox0Var3.f145774c = 2;
        mox0Var3.f145773b = true;
        mox0Var3.f145772a = true;
        nox0 nox0Var = new nox0(mox0Var3);
        f156808j = nox0Var;
        mox0 mox0Var4 = new mox0();
        mox0Var4.f145772a = nox0Var.f156814e;
        mox0Var4.f145774c = nox0Var.f156810a;
        mox0Var4.f145775d = nox0Var.f156811b;
        mox0Var4.f145776e = nox0Var.f156812c;
        mox0Var4.f145777f = nox0Var.f156815f;
        mox0Var4.f145773b = true;
        f156809k = new nox0(mox0Var4);
    }

    public nox0(mox0 mox0Var) {
        this.f156814e = mox0Var.f145772a;
        this.f156810a = mox0Var.f145774c;
        this.f156811b = mox0Var.f145775d;
        this.f156813d = mox0Var.f145773b;
        this.f156812c = mox0Var.f145776e;
        this.f156815f = mox0Var.f145777f;
    }

    /* JADX INFO: renamed from: a */
    public final void m65252a(Row row) {
        if (!this.f156814e && row.getOnClickDelegate() != null) {
            throw new IllegalArgumentException("A click listener is not allowed on the row");
        }
        if (!this.f156813d && row.getToggle() != null) {
            throw new IllegalArgumentException("A toggle is not allowed on the row");
        }
        CarIcon image = row.getImage();
        if (image != null) {
            if (!this.f156812c) {
                throw new IllegalArgumentException("An image is not allowed on the row");
            }
            this.f156815f.m33212k(image);
        }
        int size = row.getTexts().size();
        int i = this.f156810a;
        if (size > i) {
            throw new IllegalArgumentException(s571.m77246e(i, "The number of lines of texts for the row exceeded the supported max of "));
        }
    }
}
