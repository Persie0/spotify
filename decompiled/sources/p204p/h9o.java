package p204p;

import android.app.Activity;

/* JADX INFO: loaded from: classes7.dex */
public final class h9o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f89011a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h4t0 f89012b;

    public /* synthetic */ h9o(h4t0 h4t0Var, int i) {
        this.f89011a = i;
        this.f89012b = h4t0Var;
    }

    /* JADX INFO: renamed from: a */
    public final rz41 m46871a() {
        switch (this.f89011a) {
            case 0:
                s7o s7oVar = (s7o) this.f89012b;
                return new rz41(((s2o) s7oVar.f206441c).m77069B(), (i9o) ((h4t0) ((s2o) s7oVar.f206441c).f205036c).get());
            case 1:
                mmb mmbVar = (mmb) ((s7o) this.f89012b).f206441c;
                mmbVar.getClass();
                Activity activity = (Activity) ((pxa1) mmbVar.f145103b).f182248a.get();
                jg31.m53271i(activity);
                return new rz41(new C2012je(activity).m53044a().compareTo(EnumC1976ie.f101279c) >= 0, (i9o) ((h4t0) mmbVar.f145111t).get());
            default:
                x28 x28Var = (x28) ((zao) this.f89012b).f281093c;
                x28Var.getClass();
                r55 r55Var = (r55) ((vxa1) x28Var.f257383b).f245682b.get();
                jg31.m53271i(r55Var);
                return new rz41(new C2012je(r55Var).m53044a().compareTo(EnumC1976ie.f101279c) >= 0, (i9o) ((h4t0) x28Var.f257390i).get());
        }
    }
}
