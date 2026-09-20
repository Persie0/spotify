package p204p;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ubu0 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f228889a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vbu0 f228890b;

    public /* synthetic */ ubu0(vbu0 vbu0Var, int i) {
        this.f228889a = i;
        this.f228890b = vbu0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f228889a) {
            case 0:
                this.f228890b.m85173d((HashMap) obj);
                break;
            default:
                this.f228890b.m85172c((HashMap) obj);
                break;
        }
        return w2a1.f247311a;
    }
}
