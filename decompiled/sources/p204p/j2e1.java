package p204p;

import androidx.work.impl.WorkerStoppedException;

/* JADX INFO: loaded from: classes.dex */
public final class j2e1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ f890 f108031a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f108032b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f108033c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ k2e1 f108034d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2e1(f890 f890Var, boolean z, String str, k2e1 k2e1Var) {
        super(1);
        this.f108031a = f890Var;
        this.f108032b = z;
        this.f108033c = str;
        this.f108034d = k2e1Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        if (th instanceof WorkerStoppedException) {
            this.f108031a.m41020e(((WorkerStoppedException) th).f1420a);
        }
        if (this.f108032b && (str = this.f108033c) != null) {
            k2e1 k2e1Var = this.f108034d;
            tm4 tm4Var = k2e1Var.f118610e.f49375m;
            int iHashCode = k2e1Var.f118606a.hashCode();
            tm4Var.getClass();
            tm4.m81090h(str, iHashCode);
        }
        return w2a1.f247311a;
    }
}
