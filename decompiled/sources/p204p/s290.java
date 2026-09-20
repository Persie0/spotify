package p204p;

import android.os.Handler;
import android.os.Looper;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class s290 extends jjv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f204935a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hjv0 f204936b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qe70 f204937c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Serializable f204938d;

    /* JADX WARN: Multi-variable type inference failed */
    public s290(eh00 eh00Var, gh00 gh00Var, hjv0 hjv0Var) {
        this.f204937c = (qe70) gh00Var;
        this.f204936b = hjv0Var;
        this.f204938d = (qe70) eh00Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [p.eh00, p.qe70] */
    @Override // p204p.jjv0
    /* JADX INFO: renamed from: a */
    public final void mo29357a() {
        switch (this.f204935a) {
            case 0:
                m77048h();
                break;
            default:
                nlv0 nlv0Var = (nlv0) this.f204938d;
                if (!nlv0Var.f155174a) {
                    nlv0Var.f155174a = true;
                    this.f204936b.mo47722z(this);
                    new Handler(Looper.getMainLooper()).post(new z04(2, this.f204937c));
                    break;
                }
                break;
        }
    }

    @Override // p204p.jjv0
    /* JADX INFO: renamed from: b */
    public final void mo29358b(int i, int i2) {
        switch (this.f204935a) {
            case 0:
                m77048h();
                break;
            default:
                mo29357a();
                break;
        }
    }

    @Override // p204p.jjv0
    /* JADX INFO: renamed from: c */
    public void mo29359c(int i, int i2, Object obj) {
        switch (this.f204935a) {
            case 0:
                m77048h();
                break;
            default:
                super.mo29359c(i, i2, obj);
                break;
        }
    }

    @Override // p204p.jjv0
    /* JADX INFO: renamed from: d */
    public final void mo29360d(int i, int i2) {
        switch (this.f204935a) {
            case 0:
                m77048h();
                break;
            default:
                mo29357a();
                break;
        }
    }

    @Override // p204p.jjv0
    /* JADX INFO: renamed from: e */
    public final void mo29361e(int i, int i2) {
        switch (this.f204935a) {
            case 0:
                m77048h();
                break;
            default:
                mo29357a();
                break;
        }
    }

    @Override // p204p.jjv0
    /* JADX INFO: renamed from: f */
    public final void mo29362f(int i, int i2) {
        switch (this.f204935a) {
            case 0:
                m77048h();
                break;
            default:
                mo29357a();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v0, types: [p.gh00, p.qe70] */
    /* JADX INFO: renamed from: h */
    public void m77048h() {
        hjv0 hjv0Var = this.f204936b;
        if (((Boolean) this.f204937c.invoke(Integer.valueOf(hjv0Var.mo1617e()))).booleanValue()) {
            ((qe70) this.f204938d).invoke();
            hjv0Var.mo47722z(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s290(nlv0 nlv0Var, hjv0 hjv0Var, eh00 eh00Var) {
        this.f204938d = nlv0Var;
        this.f204936b = hjv0Var;
        this.f204937c = (qe70) eh00Var;
    }
}
