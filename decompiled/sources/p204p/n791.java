package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n791 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f151116a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r791 f151117b;

    /* JADX INFO: renamed from: c */
    public int f151118c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n791(r791 r791Var, ibk ibkVar) {
        super(ibkVar);
        this.f151117b = r791Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f151116a = obj;
        this.f151118c |= Integer.MIN_VALUE;
        Object objM74894b = this.f151117b.m74894b(null, null, this);
        return objM74894b == yuk.f276404a ? objM74894b : new s6x0(objM74894b);
    }
}
