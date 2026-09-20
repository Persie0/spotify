package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class flm0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f70819a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f70820b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t5o0 f70821c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f70822d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t5o0 f70823e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ArrayList f70824f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f70825g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flm0(List list, int i, t5o0 t5o0Var, int i2, t5o0 t5o0Var2, ArrayList arrayList, int i3) {
        super(1);
        this.f70819a = list;
        this.f70820b = i;
        this.f70821c = t5o0Var;
        this.f70822d = i2;
        this.f70823e = t5o0Var2;
        this.f70824f = arrayList;
        this.f70825g = i3;
    }

    /* JADX INFO: renamed from: a */
    public static final void m42010a(int i, int i2, s5o0 s5o0Var, t5o0 t5o0Var) {
        s5o0Var.m77294i(t5o0Var, i2, (i - t5o0Var.f217323b) / 2, 0.0f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        s5o0 s5o0Var = (s5o0) obj;
        ?? r0 = this.f70819a;
        t5o0 t5o0Var = (t5o0) g6f.m43745s0(r0);
        int i = this.f70820b;
        int i2 = this.f70825g;
        if (t5o0Var != null) {
            m42010a(i2, i, s5o0Var, t5o0Var);
        }
        t5o0 t5o0Var2 = this.f70821c;
        m42010a(i2, i, s5o0Var, t5o0Var2);
        int i3 = i + t5o0Var2.f217322a;
        int i4 = this.f70822d;
        int i5 = 0;
        int i6 = i3 + (i4 < 0 ? 0 : i4);
        t5o0 t5o0Var3 = this.f70823e;
        m42010a(i2, i6, s5o0Var, t5o0Var3);
        int i7 = i6 + t5o0Var3.f217322a;
        int i8 = -i4;
        if (i8 < 0) {
            i8 = 0;
        }
        int i9 = i7 + i8;
        for (Object obj2 : this.f70824f) {
            int i10 = i5 + 1;
            if (i5 < 0) {
                h6f.m46722S();
                throw null;
            }
            t5o0 t5o0Var4 = (t5o0) obj2;
            t5o0 t5o0Var5 = (t5o0) g6f.m43747t0(i10, r0);
            if (t5o0Var5 != null) {
                m42010a(i2, i9, s5o0Var, t5o0Var5);
            }
            m42010a(i2, i9, s5o0Var, t5o0Var4);
            i9 += t5o0Var4.f217322a;
            i5 = i10;
        }
        return w2a1.f247311a;
    }
}
