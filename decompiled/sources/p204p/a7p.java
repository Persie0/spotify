package p204p;

import android.view.KeyEvent;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: classes.dex */
public final class a7p {

    /* JADX INFO: renamed from: a */
    public final er70 f13108a;

    /* JADX INFO: renamed from: b */
    public final voi f13109b;

    /* JADX INFO: renamed from: c */
    public final vaa1 f13110c;

    /* JADX INFO: renamed from: d */
    public final ulp f13111d;

    /* JADX INFO: renamed from: e */
    public final PublishSubject f13112e;

    /* JADX INFO: renamed from: f */
    public final PublishSubject f13113f;

    public a7p(er70 er70Var, voi voiVar, vaa1 vaa1Var, ulp ulpVar) {
        this.f13108a = er70Var;
        this.f13109b = voiVar;
        this.f13110c = vaa1Var;
        this.f13111d = ulpVar;
        PublishSubject publishSubject = new PublishSubject();
        this.f13112e = publishSubject;
        this.f13113f = publishSubject;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m24985a(KeyEvent keyEvent, String str, gh00 gh00Var) {
        qpi qpiVarMo26686H;
        qpi qpiVarMo26686H2;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            voi voiVar = this.f13109b;
            PublishSubject publishSubject = this.f13112e;
            vaa1 vaa1Var = this.f13110c;
            ulp ulpVar = this.f13111d;
            er70 er70Var = this.f13108a;
            if (keyCode != 24) {
                if (keyCode == 25) {
                    if (!m24986b()) {
                        publishSubject.onNext(new ywi(false, str, null));
                        return false;
                    }
                    api apiVarM77296c = ((s5p) voiVar).m77296c();
                    ((lwc1) er70Var.get()).mo44586e(str, ulpVar.m83401c() ? null : vaa1Var.m85042e().m43381m((apiVarM77296c == null || (qpiVarMo26686H2 = apiVarM77296c.mo26686H()) == null) ? null : qpiVarMo26686H2.f191320a, ((lwc1) er70Var.get()).mo44585d()), new z6p(this, str, gh00Var, 0));
                    return true;
                }
            } else {
                if (m24986b()) {
                    api apiVarM77296c2 = ((s5p) voiVar).m77296c();
                    ((lwc1) er70Var.get()).mo44587h(str, ulpVar.m83401c() ? null : vaa1Var.m85042e().m43382n((apiVarM77296c2 == null || (qpiVarMo26686H = apiVarM77296c2.mo26686H()) == null) ? null : qpiVarMo26686H.f191320a, ((lwc1) er70Var.get()).mo44585d()), new z6p(this, str, gh00Var, 1));
                    return true;
                }
                publishSubject.onNext(new ywi(false, str, null));
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m24986b() {
        api apiVarM77296c = ((s5p) this.f13109b).m77296c();
        if (apiVarM77296c != null) {
            boolean zMo26697m = apiVarM77296c.mo26697m();
            boolean z = !apiVarM77296c.mo26697m() && apiVarM77296c.mo26685G() && apiVarM77296c.mo26680B() > 0;
            if (zMo26697m || z) {
                return true;
            }
        }
        return false;
    }
}
