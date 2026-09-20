package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class av21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20076a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ev21 f20077b;

    /* JADX INFO: renamed from: c */
    public int f20078c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av21(ev21 ev21Var, ibk ibkVar) {
        super(ibkVar);
        this.f20077b = ev21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f20076a = obj;
        this.f20078c |= Integer.MIN_VALUE;
        return this.f20077b.m40083c(null, this);
    }
}
