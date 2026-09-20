package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class w3g0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f247584a;

    /* JADX INFO: renamed from: b */
    public Object f247585b;

    /* JADX INFO: renamed from: c */
    public boolean f247586c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f247587d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ z3g0 f247588e;

    /* JADX INFO: renamed from: f */
    public int f247589f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3g0(z3g0 z3g0Var, ibk ibkVar) {
        super(ibkVar);
        this.f247588e = z3g0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f247587d = obj;
        this.f247589f |= Integer.MIN_VALUE;
        Object objM95279d = this.f247588e.m95279d(null, this, false);
        return objM95279d == yuk.f276404a ? objM95279d : new s6x0(objM95279d);
    }
}
