package p204p;

import android.net.Uri;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class fb41 {

    /* JADX INFO: renamed from: a */
    public final dja f67713a;

    /* JADX INFO: renamed from: b */
    public final bgi0 f67714b;

    /* JADX INFO: renamed from: c */
    public final ugq0 f67715c;

    /* JADX INFO: renamed from: d */
    public final etq f67716d;

    /* JADX INFO: renamed from: e */
    public final i4t0 f67717e;

    /* JADX INFO: renamed from: f */
    public final n14 f67718f;

    /* JADX INFO: renamed from: g */
    public final eja f67719g;

    /* JADX INFO: renamed from: i */
    public final c9k f67721i;

    /* JADX INFO: renamed from: h */
    public final LinkedList f67720h = new LinkedList();

    /* JADX INFO: renamed from: j */
    public final PublishSubject f67722j = new PublishSubject();

    /* JADX INFO: renamed from: k */
    public final lwr f67723k = new lwr();

    public fb41(dja djaVar, bgi0 bgi0Var, ugq0 ugq0Var, etq etqVar, s7o s7oVar, n14 n14Var, luk lukVar, eja ejaVar) {
        this.f67713a = djaVar;
        this.f67714b = bgi0Var;
        this.f67715c = ugq0Var;
        this.f67716d = etqVar;
        this.f67717e = s7oVar;
        this.f67718f = n14Var;
        this.f67719g = ejaVar;
        this.f67721i = kk40.m56661c(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m41207a(fb41 fb41Var, ibk ibkVar) {
        eb41 eb41Var;
        d501 d501VarM36181a;
        fb41Var.getClass();
        if (ibkVar instanceof eb41) {
            eb41Var = (eb41) ibkVar;
            int i = eb41Var.f57821c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eb41Var.f57821c = i - Integer.MIN_VALUE;
            } else {
                eb41Var = new eb41(fb41Var, ibkVar);
            }
        } else {
            eb41Var = new eb41(fb41Var, ibkVar);
        }
        Object objM86755t = eb41Var.f57819a;
        int i2 = eb41Var.f57821c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            yab yabVarM37220I = dxf1.m37220I((qwx0) fb41Var.f67717e.get());
            eb41Var.f57821c = 1;
            objM86755t = vyf1.m86755t(yabVarM37220I, eb41Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        if (((Boolean) objM86755t).booleanValue() && (d501VarM36181a = fb41Var.f67713a.m36181a()) != null) {
            d501VarM36181a.m34949t();
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: b */
    public final void m41208b(r55 r55Var) {
        this.f67713a.getClass();
        wia.m88197e(true);
        Uri data = r55Var.getIntent().getData();
        if (this.f67719g.mo30747d(String.valueOf(data))) {
            return;
        }
        m41210d(new db41(this, r55Var, null, data, false));
    }

    /* JADX INFO: renamed from: c */
    public final void m41209c() {
        d501 d501VarM36181a = this.f67713a.m36181a();
        if (d501VarM36181a != null && d501VarM36181a.m34947r()) {
            synchronized (this.f67720h) {
                try {
                    for (cja cjaVar : this.f67720h) {
                        this.f67716d.m39972p(this.f67715c.m83048b(), this.f67715c.m83047a());
                        cjaVar.m32934b(d501VarM36181a.m34941k());
                    }
                    this.f67720h.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m41210d(eh00 eh00Var) {
        if (this.f67713a.m36181a() != null) {
            eh00Var.invoke();
            return;
        }
        this.f67723k.m60127a(this.f67722j.subscribe(new sw3(6, eh00Var)));
    }
}
