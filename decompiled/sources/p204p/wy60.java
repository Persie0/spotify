package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class wy60 extends qe70 implements vh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f256206a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f256207b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f256208c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f256209d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy60(float f, float f2, float f3, float f4) {
        super(3);
        this.f256206a = f;
        this.f256207b = f2;
        this.f256208c = f3;
        this.f256209d = f4;
    }

    @Override // p204p.vh00
    /* JADX INFO: renamed from: D0 */
    public final Object mo24510D0(Object obj, Object obj2, Object obj3) {
        o6d0 o6d0Var = (o6d0) obj;
        h6d0 h6d0Var = (h6d0) obj2;
        long j = ((b8j) obj3).f24596a;
        int iMo35990l0 = o6d0Var.mo35990l0(this.f256206a);
        int iMo35990l1 = o6d0Var.mo35990l0(this.f256207b);
        int iMo35990l2 = o6d0Var.mo35990l0(this.f256208c);
        int iMo35990l3 = o6d0Var.mo35990l0(this.f256209d);
        t5o0 t5o0VarMo39619B = h6d0Var.mo39619B(b8j.m28422a(0, b8j.m28426e(j) ? b8j.m28430i(j) + iMo35990l0 + iMo35990l2 : b8j.m28430i(j), 0, b8j.m28425d(j) ? b8j.m28429h(j) + iMo35990l1 + iMo35990l3 : b8j.m28429h(j)));
        int i = (t5o0VarMo39619B.f217322a - iMo35990l0) - iMo35990l2;
        if (i < 0) {
            i = 0;
        }
        int i2 = (t5o0VarMo39619B.f217323b - iMo35990l1) - iMo35990l3;
        return o6d0Var.mo44714T(i, i2 >= 0 ? i2 : 0, nau.f152117a, new s430(t5o0VarMo39619B, iMo35990l0, iMo35990l1, 1));
    }
}
