package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class u2r0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f226153a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v2r0 f226154b;

    /* JADX INFO: renamed from: c */
    public int f226155c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2r0(v2r0 v2r0Var, ibk ibkVar) {
        super(ibkVar);
        this.f226154b = v2r0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f226153a = obj;
        this.f226155c |= Integer.MIN_VALUE;
        Object objM84527c = this.f226154b.m84527c(null, this);
        return objM84527c == yuk.f276404a ? objM84527c : new s6x0(objM84527c);
    }
}
