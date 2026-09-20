package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class a1d0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f11386a;

    /* JADX INFO: renamed from: b */
    public Object f11387b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f11388c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ h1d0 f11389d;

    /* JADX INFO: renamed from: e */
    public int f11390e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1d0(h1d0 h1d0Var, ibk ibkVar) {
        super(ibkVar);
        this.f11389d = h1d0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f11388c = obj;
        this.f11390e |= Integer.MIN_VALUE;
        Object objM46420d = this.f11389d.m46420d(null, this);
        return objM46420d == yuk.f276404a ? objM46420d : new s6x0(objM46420d);
    }
}
