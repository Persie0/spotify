package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class ba51 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25095a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ca51 f25096b;

    public /* synthetic */ ba51(ca51 ca51Var, int i) {
        this.f25095a = i;
        this.f25096b = ca51Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f25095a) {
            case 0:
                gh00 gh00VarM31996x410ba73e = this.f25096b.m31996x410ba73e();
                if (gh00VarM31996x410ba73e != null) {
                    gh00VarM31996x410ba73e.invoke(Boolean.TRUE);
                }
                break;
            case 1:
                gh00 gh00VarM31996x410ba73e2 = this.f25096b.m31996x410ba73e();
                if (gh00VarM31996x410ba73e2 != null) {
                    gh00VarM31996x410ba73e2.invoke(Boolean.FALSE);
                }
                break;
            case 2:
                gh00 gh00VarM31994x9ba664d = this.f25096b.m31994x9ba664d();
                if (gh00VarM31994x9ba664d != null) {
                    gh00VarM31994x9ba664d.invoke(Boolean.TRUE);
                }
                break;
            case 3:
                gh00 gh00VarM31994x9ba664d2 = this.f25096b.m31994x9ba664d();
                if (gh00VarM31994x9ba664d2 != null) {
                    gh00VarM31994x9ba664d2.invoke(Boolean.FALSE);
                }
                break;
            case 4:
                eh00 eh00VarM31993x19c6c5c0 = this.f25096b.m31993x19c6c5c0();
                if (eh00VarM31993x19c6c5c0 != null) {
                    eh00VarM31993x19c6c5c0.invoke();
                }
                break;
            case 5:
                eh00 eh00VarM31998x85f43667 = this.f25096b.m31998x85f43667();
                if (eh00VarM31998x85f43667 != null) {
                    eh00VarM31998x85f43667.invoke();
                }
                break;
            case 6:
                eh00 eh00VarM31997x938155ab = this.f25096b.m31997x938155ab();
                if (eh00VarM31997x938155ab != null) {
                    eh00VarM31997x938155ab.invoke();
                }
                break;
            default:
                eh00 eh00VarM31995xc2743a7 = this.f25096b.m31995xc2743a7();
                if (eh00VarM31995xc2743a7 != null) {
                    eh00VarM31995xc2743a7.invoke();
                }
                break;
        }
    }
}
