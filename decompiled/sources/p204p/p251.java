package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class p251 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f173249a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f173250b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qf40 f173251c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f173252d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f173253e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f173254f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f173255g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ tiv0 f173256h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p251(long j, List list, qf40 qf40Var, float f, float f2, float f3, long j2, tiv0 tiv0Var) {
        super(1);
        this.f173249a = j;
        this.f173250b = list;
        this.f173251c = qf40Var;
        this.f173252d = f;
        this.f173253e = f2;
        this.f173254f = f3;
        this.f173255g = j2;
        this.f173256h = tiv0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        s5o0 s5o0Var = (s5o0) obj;
        long j = this.f173249a;
        float f = 2.0f;
        float fM28430i = b8j.m28430i(j) / 2.0f;
        float fM28429h = b8j.m28429h(j) / 2.0f;
        int i = 0;
        for (Object obj2 : this.f173250b) {
            int i2 = i + 1;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            h6d0 h6d0Var = (h6d0) obj2;
            w5o0 w5o0Var = (w5o0) this.f173251c.get(i);
            int i3 = (int) ((this.f173253e * f) + (this.f173252d * w5o0Var.f248125g));
            int i4 = (int) this.f173254f;
            if (i3 < i4) {
                i3 = i4;
            }
            if (!((i3 >= 0) & (i3 >= 0))) {
                ot40.m67767a("width and height must be >= 0");
            }
            t5o0 t5o0VarMo39619B = h6d0Var.mo39619B(e8j.m38117h(i3, i3, i3, i3));
            long j2 = this.f173255g;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + fM28430i;
            float f2 = w5o0Var.f248122d;
            tiv0 tiv0Var = this.f173256h;
            float f3 = f;
            float fM38555d = edb.m38555d(tiv0Var.f220753c, tiv0Var.f220751a, f2, fIntBitsToFloat);
            float fM38555d2 = edb.m38555d(tiv0Var.f220754d, tiv0Var.f220752b, w5o0Var.f248123e, Float.intBitsToFloat((int) (j2 & 4294967295L)) + fM28429h);
            float f4 = i3 / f3;
            s5o0Var.m77293f(t5o0VarMo39619B, (int) (fM38555d - f4), (int) (fM38555d2 - f4), 0.0f);
            f = f3;
            i = i2;
        }
        return w2a1.f247311a;
    }
}
