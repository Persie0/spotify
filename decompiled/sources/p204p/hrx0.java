package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hrx0 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f94549a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f94550b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f94551c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f94552d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f94553e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f94554f;

    public /* synthetic */ hrx0(dbe1 dbe1Var, int i, t5o0 t5o0Var, int i2, o6d0 o6d0Var) {
        this.f94552d = dbe1Var;
        this.f94550b = i;
        this.f94553e = t5o0Var;
        this.f94551c = i2;
        this.f94554f = o6d0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f94549a) {
            case 0:
                t5o0[] t5o0VarArr = (t5o0[]) this.f94552d;
                irx0 irx0Var = (irx0) this.f94553e;
                int[] iArr = (int[]) this.f94554f;
                s5o0 s5o0Var = (s5o0) obj;
                int length = t5o0VarArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    t5o0 t5o0Var = t5o0VarArr[i];
                    int i3 = i2 + 1;
                    wj50.m88279p(t5o0Var);
                    hox0 hox0VarM84553n = v3d1.m84553n(t5o0Var);
                    vhf1 vhf1Var = hox0VarM84553n != null ? hox0VarM84553n.f93647c : null;
                    int i4 = this.f94550b;
                    s5o0Var.m77293f(t5o0Var, iArr[i2], vhf1Var != null ? vhf1Var.mo62877k(i4, t5o0Var.f217323b, ko70.f124556a, t5o0Var, this.f94551c) : irx0Var.f105066b.m85124a(t5o0Var.f217323b, i4), 0.0f);
                    i++;
                    i2 = i3;
                }
                break;
            default:
                dbe1 dbe1Var = (dbe1) this.f94552d;
                t5o0 t5o0Var2 = (t5o0) this.f94553e;
                s5o0.m77286h((s5o0) obj, t5o0Var2, ((y350) dbe1Var.f47307O0.invoke(new g450((((long) (this.f94550b - t5o0Var2.f217322a)) << 32) | (((long) (this.f94551c - t5o0Var2.f217323b)) & 4294967295L)), ((o6d0) this.f94554f).getLayoutDirection())).f268755a);
                break;
        }
        return w2a1.f247311a;
    }

    public /* synthetic */ hrx0(t5o0[] t5o0VarArr, irx0 irx0Var, int i, int i2, int[] iArr) {
        this.f94552d = t5o0VarArr;
        this.f94553e = irx0Var;
        this.f94550b = i;
        this.f94551c = i2;
        this.f94554f = iArr;
    }
}
