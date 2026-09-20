package p204p;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ftd0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f73189a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jtd0 f73190b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Pair f73191c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ lhd0 f73192d;

    public /* synthetic */ ftd0(jtd0 jtd0Var, Pair pair, lhd0 lhd0Var, int i) {
        this.f73189a = i;
        this.f73190b = jtd0Var;
        this.f73191c = pair;
        this.f73192d = lhd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f73189a) {
            case 0:
                xwo xwoVar = this.f73190b.f115819b.f147053i;
                Pair pair = this.f73191c;
                int iIntValue = ((Integer) pair.first).intValue();
                vsd0 vsd0Var = (vsd0) pair.second;
                vsd0Var.getClass();
                xwoVar.mo33840u(iIntValue, vsd0Var, this.f73192d);
                break;
            default:
                xwo xwoVar2 = this.f73190b.f115819b.f147053i;
                Pair pair2 = this.f73191c;
                xwoVar2.mo33836C(((Integer) pair2.first).intValue(), (vsd0) pair2.second, this.f73192d);
                break;
        }
    }
}
