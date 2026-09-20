package p204p;

import androidx.media3.common.util.GlUtil$GlException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fi9 implements sxb1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69811a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ii9 f69812b;

    public /* synthetic */ fi9(ii9 ii9Var, int i) {
        this.f69811a = i;
        this.f69812b = ii9Var;
    }

    @Override // p204p.sxb1
    public final void run() throws GlUtil$GlException {
        switch (this.f69811a) {
            case 0:
                ii9 ii9Var = this.f69812b;
                if (!ii9Var.f102467e.isEmpty()) {
                    ii9Var.f102465X = true;
                } else {
                    e6q e6qVar = ii9Var.f102470h;
                    e6qVar.getClass();
                    e6qVar.mo28862a();
                    qpo.m73450a();
                }
                break;
            case 1:
                ii9 ii9Var2 = this.f69812b;
                ii9Var2.f102472t++;
                ii9Var2.m50697U();
                break;
            default:
                ii9 ii9Var3 = this.f69812b;
                ce10 ce10Var = ii9Var3.f102471i;
                if (ce10Var != null) {
                    ce10Var.m32471a();
                }
                ii9Var3.f102467e.clear();
                break;
        }
    }
}
