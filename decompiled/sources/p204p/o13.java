package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class o13 extends ibk {

    /* JADX INFO: renamed from: a */
    public hz80 f160577a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f160578b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v13 f160579c;

    /* JADX INFO: renamed from: d */
    public int f160580d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o13(v13 v13Var, ibk ibkVar) {
        super(ibkVar);
        this.f160579c = v13Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f160578b = obj;
        this.f160580d |= Integer.MIN_VALUE;
        return this.f160579c.mo55376a(null, null, this);
    }
}
