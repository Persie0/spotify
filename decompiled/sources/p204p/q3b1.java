package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class q3b1 extends kce0 {

    /* JADX INFO: renamed from: d */
    public static final q3b1 f184832d = new q3b1("must have no value parameters", 0);

    /* JADX INFO: renamed from: e */
    public static final q3b1 f184833e = new q3b1("must have a single value parameter", 1);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f184834c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3b1(String str, int i) {
        super(str, 1);
        this.f184834c = i;
    }

    @Override // p204p.xxd
    /* JADX INFO: renamed from: a */
    public final boolean mo28860a(nd60 nd60Var) {
        switch (this.f184834c) {
            case 0:
                return nd60Var.mo32015K().isEmpty();
            default:
                return nd60Var.mo32015K().size() == 1;
        }
    }
}
