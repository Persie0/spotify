package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes9.dex */
public final class utq0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f233970a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vtq0 f233971b;

    public /* synthetic */ utq0(vtq0 vtq0Var, int i) {
        this.f233970a = i;
        this.f233971b = vtq0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f233970a) {
            case 0:
                this.f233971b.f244753b.mo47345e();
                break;
            case 1:
                jtq0 jtq0Var = (jtq0) obj;
                d850 d850Var = jtq0Var.f115951e;
                if (d850Var != null) {
                    this.f233971b.f244753b.mo47342b(jtq0Var.f115950d, d850Var, null);
                }
                break;
            default:
                d850 d850Var2 = ((itq0) obj).f105672d;
                if (d850Var2 != null) {
                    dzj dzjVar = this.f233971b.f244754c;
                    dzjVar.f54682a.mo47342b(dzjVar.m37470a(1), d850Var2, null);
                }
                break;
        }
    }
}
