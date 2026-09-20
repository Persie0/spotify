package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class v0d0 extends ibk {

    /* JADX INFO: renamed from: a */
    public h1d0 f235966a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f235967b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ h1d0 f235968c;

    /* JADX INFO: renamed from: d */
    public int f235969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0d0(h1d0 h1d0Var, ibk ibkVar) {
        super(ibkVar);
        this.f235968c = h1d0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f235967b = obj;
        this.f235969d |= Integer.MIN_VALUE;
        Object objM46417a = this.f235968c.m46417a(null, null, null, 0, null, this);
        return objM46417a == yuk.f276404a ? objM46417a : new s6x0(objM46417a);
    }
}
