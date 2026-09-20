package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class phq0 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f177707a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rlv0 f177708b;

    public /* synthetic */ phq0(rlv0 rlv0Var, int i) {
        this.f177707a = i;
        this.f177708b = rlv0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f177707a) {
            case 0:
                vv70 vv70Var = ((ee91) ((ce91) obj)).f58721M0;
                rlv0 rlv0Var = this.f177708b;
                List listM46717N = (List) rlv0Var.f200373a;
                if (listM46717N != null) {
                    listM46717N.add(vv70Var);
                } else {
                    listM46717N = h6f.m46717N(vv70Var);
                }
                rlv0Var.f200373a = listM46717N;
                return be91.f26307b;
            default:
                this.f177708b.f200373a = (yk60) obj;
                return w2a1.f247311a;
        }
    }
}
