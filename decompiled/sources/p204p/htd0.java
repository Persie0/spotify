package p204p;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class htd0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f94985a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jtd0 f94986b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Pair f94987c;

    public /* synthetic */ htd0(jtd0 jtd0Var, Pair pair, int i) {
        this.f94985a = i;
        this.f94986b = jtd0Var;
        this.f94987c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f94985a) {
            case 0:
                xwo xwoVar = this.f94986b.f115819b.f147053i;
                Pair pair = this.f94987c;
                xwoVar.mo41680E(((Integer) pair.first).intValue(), (vsd0) pair.second);
                break;
            case 1:
                xwo xwoVar2 = this.f94986b.f115819b.f147053i;
                Pair pair2 = this.f94987c;
                xwoVar2.mo40365S(((Integer) pair2.first).intValue(), (vsd0) pair2.second);
                break;
            default:
                xwo xwoVar3 = this.f94986b.f115819b.f147053i;
                Pair pair3 = this.f94987c;
                xwoVar3.mo40372p(((Integer) pair3.first).intValue(), (vsd0) pair3.second);
                break;
        }
    }
}
