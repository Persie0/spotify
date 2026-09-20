package p204p;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* JADX INFO: renamed from: p.r9 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2330r9 {

    /* JADX INFO: renamed from: a */
    public AbstractC2368s9[] f196875a;

    /* JADX INFO: renamed from: b */
    public int f196876b;

    /* JADX INFO: renamed from: c */
    public int f196877c;

    /* JADX INFO: renamed from: d */
    public du51 f196878d;

    /* JADX INFO: renamed from: f */
    public final AbstractC2368s9 m74998f() {
        AbstractC2368s9 abstractC2368s9Mo46964g;
        du51 du51Var;
        synchronized (this) {
            try {
                AbstractC2368s9[] abstractC2368s9ArrMo46965h = this.f196875a;
                if (abstractC2368s9ArrMo46965h == null) {
                    abstractC2368s9ArrMo46965h = mo46965h();
                    this.f196875a = abstractC2368s9ArrMo46965h;
                } else if (this.f196876b >= abstractC2368s9ArrMo46965h.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC2368s9ArrMo46965h, abstractC2368s9ArrMo46965h.length * 2);
                    this.f196875a = (AbstractC2368s9[]) objArrCopyOf;
                    abstractC2368s9ArrMo46965h = (AbstractC2368s9[]) objArrCopyOf;
                }
                int i = this.f196877c;
                do {
                    abstractC2368s9Mo46964g = abstractC2368s9ArrMo46965h[i];
                    if (abstractC2368s9Mo46964g == null) {
                        abstractC2368s9Mo46964g = mo46964g();
                        abstractC2368s9ArrMo46965h[i] = abstractC2368s9Mo46964g;
                    }
                    i++;
                    if (i >= abstractC2368s9ArrMo46965h.length) {
                        i = 0;
                    }
                } while (!abstractC2368s9Mo46964g.mo42937a(this));
                this.f196877c = i;
                this.f196876b++;
                du51Var = this.f196878d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (du51Var != null) {
            du51Var.m36900x(1);
        }
        return abstractC2368s9Mo46964g;
    }

    /* JADX INFO: renamed from: g */
    public abstract AbstractC2368s9 mo46964g();

    /* JADX INFO: renamed from: h */
    public abstract AbstractC2368s9[] mo46965h();

    /* JADX INFO: renamed from: i */
    public final void m74999i(AbstractC2368s9 abstractC2368s9) {
        du51 du51Var;
        int i;
        fbk[] fbkVarArrMo42938b;
        synchronized (this) {
            try {
                int i2 = this.f196876b - 1;
                this.f196876b = i2;
                du51Var = this.f196878d;
                if (i2 == 0) {
                    this.f196877c = 0;
                }
                fbkVarArrMo42938b = abstractC2368s9.mo42938b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (fbk fbkVar : fbkVarArrMo42938b) {
            if (fbkVar != null) {
                fbkVar.resumeWith(w2a1.f247311a);
            }
        }
        if (du51Var != null) {
            du51Var.m36900x(-1);
        }
    }

    /* JADX INFO: renamed from: j */
    public final du51 m75000j() {
        du51 du51Var;
        synchronized (this) {
            du51Var = this.f196878d;
            if (du51Var == null) {
                int i = this.f196876b;
                du51Var = new du51(1, Alert.DURATION_SHOW_INDEFINITELY, 2);
                du51Var.mo46962a(Integer.valueOf(i));
                this.f196878d = du51Var;
            }
        }
        return du51Var;
    }
}
