package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class x0d0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f256861a;

    /* JADX INFO: renamed from: b */
    public String f256862b;

    /* JADX INFO: renamed from: c */
    public Object f256863c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f256864d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ h1d0 f256865e;

    /* JADX INFO: renamed from: f */
    public int f256866f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0d0(h1d0 h1d0Var, ibk ibkVar) {
        super(ibkVar);
        this.f256865e = h1d0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f256864d = obj;
        this.f256866f |= Integer.MIN_VALUE;
        Object objM46419c = this.f256865e.m46419c(null, null, this);
        return objM46419c == yuk.f276404a ? objM46419c : new s6x0(objM46419c);
    }
}
