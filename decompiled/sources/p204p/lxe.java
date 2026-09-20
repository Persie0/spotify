package p204p;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class lxe implements wb40 {

    /* JADX INFO: renamed from: j */
    public static final AtomicLong f137794j = new AtomicLong(0);

    /* JADX INFO: renamed from: a */
    public final f940 f137795a;

    /* JADX INFO: renamed from: b */
    public final rb40 f137796b;

    /* JADX INFO: renamed from: c */
    public final a350 f137797c;

    /* JADX INFO: renamed from: d */
    public cwr f137798d;

    /* JADX INFO: renamed from: e */
    public cwr f137799e;

    /* JADX INFO: renamed from: f */
    public boolean f137800f = true;

    /* JADX INFO: renamed from: g */
    public boolean f137801g = true;

    /* JADX INFO: renamed from: h */
    public Map f137802h = new LinkedHashMap();

    /* JADX INFO: renamed from: i */
    public final String f137803i;

    public lxe(f940 f940Var, rb40 rb40Var, a350 a350Var) {
        this.f137795a = f940Var;
        this.f137796b = rb40Var;
        this.f137797c = a350Var;
        String strValueOf = String.valueOf(f137794j.getAndIncrement());
        this.f137803i = strValueOf;
        rb40Var.m75138b().m43631a(new skp(kvw0.class, 7), new kvw0(strValueOf));
    }

    /* JADX INFO: renamed from: a */
    public final vb40 m60175a() {
        boolean z = this.f137801g;
        skp skpVar = zb40.f281236a;
        rb40 rb40Var = this.f137796b;
        rb40Var.m75138b().m43631a(zb40.f281241f, Boolean.valueOf(z));
        rb40Var.f197445e = new dxe(this.f137797c, null, this.f137802h, this.f137803i);
        return rb40Var.m75137a();
    }

    /* JADX INFO: renamed from: b */
    public final lxe m60176b() {
        cwr cwrVar = this.f137798d;
        if (cwrVar != null) {
            cwrVar.dispose();
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final void m60177c() {
        cwr cwrVar = this.f137799e;
        if (cwrVar != null) {
            cwrVar.dispose();
        }
        if (this.f137798d == this.f137799e) {
            this.f137798d = null;
        }
        this.f137799e = null;
    }

    /* JADX INFO: renamed from: d */
    public final lxe m60178d() {
        this.f137796b.f197456p = ray0.f197407a;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final lxe m60179e() {
        this.f137796b.f197455o = tg1.m80714d(ci21.f38193c);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final lxe m60180f(Drawable drawable) {
        this.f137796b.f197453m = new C2245p6(ufc1.m82967e(drawable), 24);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final void m60181g(gh00 gh00Var, gh00 gh00Var2) {
        this.f137801g = false;
        m60184j(new cxb((Object) null, gh00Var, gh00Var2, 15));
    }

    /* JADX INFO: renamed from: h */
    public final lxe m60182h() {
        this.f137796b.f197456p = ray0.f197408b;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final Single m60183i() {
        return Single.create(new kp7(this, 18));
    }

    /* JADX INFO: renamed from: j */
    public final void m60184j(wc40 wc40Var) {
        ixe ixeVar = new ixe(wc40Var);
        rb40 rb40Var = this.f137796b;
        rb40Var.f197444d = ixeVar;
        boolean z = this.f137801g;
        skp skpVar = zb40.f281236a;
        rb40Var.m75138b().m43631a(zb40.f281241f, Boolean.valueOf(z));
        rb40Var.f197445e = new jxe(this, wc40Var, 0);
        cwr cwrVarM48896a = ((hvu0) this.f137795a).m48896a(rb40Var.m75137a());
        this.f137798d = cwrVarM48896a;
        this.f137799e = cwrVarM48896a;
    }

    /* JADX INFO: renamed from: k */
    public final void m60185k(ImageView imageView, mu61 mu61Var) {
        iu61 yd40Var = this.f137800f ? new yd40(imageView) : new hkj0(imageView);
        rb40 rb40Var = this.f137796b;
        rb40Var.f197444d = yd40Var;
        boolean z = this.f137801g;
        skp skpVar = zb40.f281236a;
        rb40Var.m75138b().m43631a(zb40.f281241f, Boolean.valueOf(z));
        rb40Var.f197445e = new dxe(this.f137797c, mu61Var, this.f137802h, this.f137803i);
        this.f137798d = ((hvu0) this.f137795a).m48896a(rb40Var.m75137a());
    }

    /* JADX INFO: renamed from: l */
    public final lxe m60186l(int i) {
        skp skpVar = zb40.f281236a;
        k6f k6fVar = new k6f(i, 2);
        rb40 rb40Var = this.f137796b;
        rb40Var.f197452l = k6fVar;
        rb40Var.f197453m = new k6f(i, 1);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final lxe m60187m(Drawable drawable) {
        this.f137796b.f197452l = new C2245p6(ufc1.m82967e(drawable), 24);
        m60180f(drawable);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m60188n() {
        ((hvu0) this.f137795a).m48896a(this.f137796b.m75137a());
    }

    /* JADX INFO: renamed from: o */
    public final CompletableCreate m60189o() {
        return new CompletableCreate(new id8(this, 16));
    }

    /* JADX INFO: renamed from: p */
    public final lxe m60190p(int i, int i2, int i3) {
        if (i > 0 && i2 > 0) {
            qvu0 qvu0VarM80714d = tg1.m80714d(upf.m83691h(i, i2));
            rb40 rb40Var = this.f137796b;
            rb40Var.f197455o = qvu0VarM80714d;
            int iM38547C = edb.m38547C(i3);
            if (iM38547C != 0) {
                if (iM38547C == 1) {
                    rb40Var.f197457q = 2;
                    return this;
                }
                if (iM38547C != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                rb40Var.f197457q = 1;
                return this;
            }
            rb40Var.f197457q = 2;
        }
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final lxe m60191q(String str) {
        this.f137796b.m75138b().m43631a(new skp(str.getClass(), 7), str);
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final lxe m60192r(l591 l591Var) {
        List listM44518y = geg1.m44518y(new kxe(l591Var));
        skp skpVar = yb40.f271071a;
        rb40 rb40Var = this.f137796b;
        rb40Var.m75138b().m43631a(yb40.f271071a, q0f1.m71825R(listM44518y));
        String strM43753y0 = g6f.m43753y0(listM44518y, null, null, null, new C2245p6(new plv0(), 25), 31);
        if (strM43753y0 != null) {
            rb40Var.m75139c().put("coil#transformations", strM43753y0);
            return this;
        }
        rb40Var.m75139c().remove("coil#transformations");
        return this;
    }
}
