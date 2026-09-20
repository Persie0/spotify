package p204p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class fdp implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68536a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sir0 f68537b;

    public /* synthetic */ fdp(sir0 sir0Var, int i) {
        this.f68536a = i;
        this.f68537b = sir0Var;
    }

    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f68536a) {
            case 0:
                this.f68537b.mo30231j(obj);
                break;
            case 1:
                wj50.m88279p(obj);
                this.f68537b.mo30231j(obj);
                break;
            default:
                this.f68537b.mo30231j(obj);
                break;
        }
    }
}
