package p204p;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class itd0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f105517a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jtd0 f105518b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Pair f105519c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ o0a0 f105520d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ lhd0 f105521e;

    public /* synthetic */ itd0(jtd0 jtd0Var, Pair pair, o0a0 o0a0Var, lhd0 lhd0Var, int i) {
        this.f105517a = i;
        this.f105518b = jtd0Var;
        this.f105519c = pair;
        this.f105520d = o0a0Var;
        this.f105521e = lhd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f105517a) {
            case 0:
                xwo xwoVar = this.f105518b.f115819b.f147053i;
                Pair pair = this.f105519c;
                xwoVar.mo33838m(((Integer) pair.first).intValue(), (vsd0) pair.second, this.f105520d, this.f105521e);
                break;
            default:
                xwo xwoVar2 = this.f105518b.f115819b.f147053i;
                Pair pair2 = this.f105519c;
                xwoVar2.mo33837d(((Integer) pair2.first).intValue(), (vsd0) pair2.second, this.f105520d, this.f105521e);
                break;
        }
    }
}
