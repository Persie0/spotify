package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class wtt0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f255013a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f255014b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f255015c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f255016d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f255017e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtt0(int i, int i2, int i3, ArrayList arrayList) {
        super(1);
        this.f255014b = i;
        this.f255017e = arrayList;
        this.f255015c = i2;
        this.f255016d = i3;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f255013a) {
            case 0:
                s5o0 s5o0Var = (s5o0) obj;
                int i = this.f255014b;
                for (t5o0 t5o0Var : (ArrayList) this.f255017e) {
                    s5o0Var.m77294i(t5o0Var, i, this.f255015c, 0.0f);
                    i += t5o0Var.f217322a + this.f255016d;
                }
                break;
            default:
                t5o0 t5o0Var2 = (t5o0) this.f255017e;
                ((s5o0) obj).m77294i(t5o0Var2, this.f255014b, (this.f255015c - t5o0Var2.f217323b) + this.f255016d, 0.0f);
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtt0(t5o0 t5o0Var, int i, int i2, int i3) {
        super(1);
        this.f255017e = t5o0Var;
        this.f255014b = i;
        this.f255015c = i2;
        this.f255016d = i3;
    }
}
