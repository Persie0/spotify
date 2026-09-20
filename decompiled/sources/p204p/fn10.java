package p204p;

import android.os.Build;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class fn10 implements ssi {

    /* JADX INFO: renamed from: a */
    public final jfr f71145a;

    /* JADX INFO: renamed from: b */
    public final ui10 f71146b;

    /* JADX INFO: renamed from: c */
    public final g94 f71147c;

    /* JADX INFO: renamed from: d */
    public final xre f71148d;

    /* JADX INFO: renamed from: e */
    public final c9k f71149e;

    /* JADX INFO: renamed from: f */
    public final zv41 f71150f = jag1.m52819d(new pm10());

    public fn10(jfr jfrVar, ui10 ui10Var, g94 g94Var, xre xreVar, luk lukVar) {
        this.f71145a = jfrVar;
        this.f71146b = ui10Var;
        this.f71147c = g94Var;
        this.f71148d = xreVar;
        this.f71149e = edb.m38577z(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final void m42195c(fn10 fn10Var, ibk ibkVar) {
        cn10 cn10Var;
        if (ibkVar instanceof cn10) {
            cn10Var = (cn10) ibkVar;
            int i = cn10Var.f39867c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cn10Var.f39867c = i - Integer.MIN_VALUE;
            } else {
                cn10Var = new cn10(fn10Var, ibkVar);
            }
        } else {
            cn10Var = new cn10(fn10Var, ibkVar);
        }
        Object obj = cn10Var.f39865a;
        int i2 = cn10Var.f39867c;
        if (i2 == 0) {
            bga.m29073P(obj);
            luu0 luu0VarM31020l = bzf1.m31020l(fn10Var.f71146b.f230565e);
            dn10 dn10Var = new dn10(fn10Var, 0);
            cn10Var.f39867c = 1;
            if (luu0VarM31020l.f137156a.collect(dn10Var, cn10Var) == yuk.f276404a) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: a */
    public final void mo24869a() {
        if (m42196d()) {
            pm10 pm10Var = new pm10();
            zv41 zv41Var = this.f71150f;
            zv41Var.getClass();
            zv41Var.m97091m(null, pm10Var);
            c9k c9kVar = this.f71149e;
            qlg1.m73215t(c9kVar.f35578a);
            x0h1.m89578u(c9kVar, null, 0, new en10(this, null, 2), 3);
        }
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: b */
    public final void mo24870b() {
        if (m42196d()) {
            fbk fbkVar = null;
            en10 en10Var = new en10(this, fbkVar, 0);
            c9k c9kVar = this.f71149e;
            x0h1.m89578u(c9kVar, null, 0, en10Var, 3);
            x0h1.m89578u(c9kVar, null, 0, new en10(this, fbkVar, 1), 3);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m42196d() {
        return this.f71147c.m43972d() && Build.VERSION.SDK_INT >= 34;
    }
}
