package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class tub0 implements w8j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f223812a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uub0 f223813b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i500 f223814c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi8 f223815d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ m05 f223816e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zzq0 f223817f;

    public /* synthetic */ tub0(uub0 uub0Var, i500 i500Var, vi8 vi8Var, m05 m05Var, zzq0 zzq0Var, int i) {
        this.f223812a = i;
        this.f223813b = uub0Var;
        this.f223814c = i500Var;
        this.f223815d = vi8Var;
        this.f223816e = m05Var;
        this.f223817f = zzq0Var;
    }

    @Override // p204p.w8j
    public final void accept(Object obj) {
        switch (this.f223812a) {
            case 0:
                b7j0 b7j0Var = this.f223813b.f234144a;
                vi8 vi8Var = this.f223815d;
                b7j0Var.mo28381e(vi8Var.f241639a, vi8Var.f241640b, vi8Var.f241641c, this.f223816e, this.f223814c, this.f223817f, false);
                break;
            case 1:
                b7j0 b7j0Var2 = this.f223813b.f234144a;
                vi8 vi8Var2 = this.f223815d;
                b7j0Var2.mo28383h(this.f223814c, vi8Var2.f241639a, vi8Var2.f241640b, vi8Var2.f241641c, this.f223816e.f138513a, this.f223817f);
                break;
            case 2:
                b7j0 b7j0Var3 = this.f223813b.f234144a;
                vi8 vi8Var3 = this.f223815d;
                b7j0Var3.mo28381e(vi8Var3.f241639a, vi8Var3.f241640b, vi8Var3.f241641c, this.f223816e, this.f223814c, this.f223817f, true);
                break;
            default:
                b7j0 b7j0Var4 = this.f223813b.f234144a;
                String str = ((si8) obj).f209374c;
                vi8 vi8Var4 = this.f223815d;
                b7j0Var4.mo28384i(str, this.f223814c, vi8Var4.f241639a, vi8Var4.f241640b, vi8Var4.f241641c, this.f223816e.f138513a, this.f223817f);
                break;
        }
    }
}
