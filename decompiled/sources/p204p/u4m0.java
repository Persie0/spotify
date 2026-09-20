package p204p;

import com.spotify.tome.pageactivity.PageActivity;

/* JADX INFO: loaded from: classes10.dex */
public final class u4m0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f226775a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PageActivity f226776b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u4m0(int i, PageActivity pageActivity) {
        super(0);
        this.f226775a = i;
        this.f226776b = pageActivity;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f226775a) {
            case 0:
                this.f226776b.f6893u1 = true;
                return w2a1.f247311a;
            default:
                k5m0 k5m0Var = this.f226776b.f6877e1;
                if (k5m0Var != null) {
                    k5m0Var.mo55546f();
                    return w2a1.f247311a;
                }
                wj50.m88260d0("pageActivityNavigator");
                throw null;
        }
    }
}
