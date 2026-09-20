package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class jce0 extends kce0 {

    /* JADX INFO: renamed from: d */
    public static final jce0 f111106d = new jce0("must be a member function", 0);

    /* JADX INFO: renamed from: e */
    public static final jce0 f111107e = new jce0("must be a member or an extension function", 1);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f111108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jce0(String str, int i) {
        super(str, 0);
        this.f111108c = i;
    }

    @Override // p204p.xxd
    /* JADX INFO: renamed from: a */
    public final boolean mo28860a(nd60 nd60Var) {
        switch (this.f111108c) {
            case 0:
                return nd60Var.f177792X != null;
            default:
                return (nd60Var.f177792X == null && nd60Var.f177804t == null) ? false : true;
        }
    }
}
