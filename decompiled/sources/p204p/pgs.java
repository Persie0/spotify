package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pgs implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f177389a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f177390b;

    public /* synthetic */ pgs(int i, gh00 gh00Var) {
        this.f177389a = i;
        this.f177390b = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f177389a) {
            case 0:
                return new qgs((rgs) obj, this.f177390b);
            case 1:
                gh00 gh00Var = this.f177390b;
                ce91 ce91Var = (ce91) obj;
                if (!(ce91Var instanceof j510)) {
                    throw new IllegalStateException("Node is not a GestureNode instance");
                }
                Boolean bool = (Boolean) gh00Var.invoke(((j510) ce91Var).f108837M0);
                bool.getClass();
                return bool;
            case 2:
                oa31 oa31Var = (oa31) this.f177390b.invoke((sa31) obj);
                synchronized (ua31.f228351c) {
                    ua31.f228352d = ua31.f228352d.m77609f(oa31Var.mo28818g());
                }
                return oa31Var;
            default:
                gh00 gh00Var2 = this.f177390b;
                Long l = (Long) obj;
                l.longValue();
                return gh00Var2.invoke(l);
        }
    }
}
