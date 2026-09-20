package p204p;

import android.view.ViewGroup;
import com.spotify.music.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class myb0 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ qr60[] f148382h = {new spi0(myb0.class, "systemBarsInsets", "getSystemBarsInsets()Landroidx/compose/foundation/layout/WindowInsets;", 0), new spi0(myb0.class, "mainPageInsetBottom", "getMainPageInsetBottom()I", 0), new spi0(myb0.class, "mainPageInsetBottomLegacy", "getMainPageInsetBottomLegacy()I", 0)};

    /* JADX INFO: renamed from: a */
    public final ViewGroup f148383a;

    /* JADX INFO: renamed from: b */
    public final wg61 f148384b = new wg61(new vmb0(this, 9));

    /* JADX INFO: renamed from: c */
    public final bpi0 f148385c;

    /* JADX INFO: renamed from: d */
    public final bpi0 f148386d;

    /* JADX INFO: renamed from: e */
    public final lyb0 f148387e;

    /* JADX INFO: renamed from: f */
    public final lyb0 f148388f;

    /* JADX INFO: renamed from: g */
    public final lyb0 f148389g;

    public myb0(ViewGroup viewGroup) {
        this.f148383a = viewGroup;
        bpi0 bpi0Var = new bpi0(1);
        WeakHashMap weakHashMap = mec1.f142677a;
        swd1 swd1VarM35774a = dec1.m35774a(viewGroup);
        if (swd1VarM35774a != null) {
            wqi0 wqi0Var = (wqi0) ((yum0) bpi0Var.f29480b).getValue();
            dx40 dx40VarMo51806g = swd1VarM35774a.f214650a.mo51806g(519);
            jez jezVar = new jez(dx40VarMo51806g.f53848a, dx40VarMo51806g.f53849b, dx40VarMo51806g.f53850c, dx40VarMo51806g.f53851d);
            if (!wj50.m88271j(wqi0Var.m88769e(), jezVar)) {
                wqi0Var.m88770f(jezVar);
            }
        }
        this.f148385c = bpi0Var;
        this.f148386d = bpi0Var;
        viewGroup.setTag(R.id.main_layout_insets_tag, bpi0Var);
        this.f148387e = new lyb0(rfg1.m75445o(0, 14), this);
        this.f148388f = new lyb0(this, 1);
        this.f148389g = new lyb0(this, 2);
    }

    /* JADX INFO: renamed from: b */
    public static final void m63168b(myb0 myb0Var) {
        lyb0 lyb0Var = myb0Var.f148387e;
        qr60[] qr60VarArr = f148382h;
        qr60 qr60Var = qr60VarArr[0];
        int iMo41501c = ((tvd1) lyb0Var.f61172a).mo41501c((yqq) myb0Var.f148384b.getValue());
        lyb0 lyb0Var2 = myb0Var.f148388f;
        qr60 qr60Var2 = qr60VarArr[1];
        int iIntValue = ((Number) lyb0Var2.f61172a).intValue();
        wqi0 wqi0Var = (wqi0) ((yum0) myb0Var.f148385c.f29481c).getValue();
        dx40 dx40VarM37189b = dx40.m37189b(0, iMo41501c, 0, iIntValue);
        jez jezVar = new jez(dx40VarM37189b.f53848a, dx40VarM37189b.f53849b, dx40VarM37189b.f53850c, dx40VarM37189b.f53851d);
        if (!wj50.m88271j(wqi0Var.m88769e(), jezVar)) {
            wqi0Var.m88770f(jezVar);
        }
        ViewGroup viewGroup = myb0Var.f148383a;
        WeakHashMap weakHashMap = mec1.f142677a;
        aec1.m25717c(viewGroup);
    }

    /* JADX INFO: renamed from: a */
    public final void m63169a(int i, xq00 xq00Var) {
        xq00Var.m91775k0(-1785287555);
        int i2 = (xq00Var.m91766g(this) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            WeakHashMap weakHashMap = cxd1.f42984x;
            this.f148387e.m39516c(f148382h[0], this, bxd1.m30815d(xq00Var).f42991g);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new jtb0(this, i, 6);
        }
    }
}
