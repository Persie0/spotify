package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class f2g0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65189a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h2g0 f65190b;

    /* JADX INFO: renamed from: c */
    public int f65191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2g0(h2g0 h2g0Var, ibk ibkVar) {
        super(ibkVar);
        this.f65190b = h2g0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f65189a = obj;
        this.f65191c |= Integer.MIN_VALUE;
        Object objM46492c = this.f65190b.m46492c(null, null, null, null, this);
        return objM46492c == yuk.f276404a ? objM46492c : new s6x0(objM46492c);
    }
}
