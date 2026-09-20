package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class do9 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f50988a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f50989b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ go9 f50990c;

    /* JADX INFO: renamed from: d */
    public int f50991d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do9(go9 go9Var, ibk ibkVar) {
        super(ibkVar);
        this.f50990c = go9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f50989b = obj;
        this.f50991d |= Integer.MIN_VALUE;
        return go9.m45328c(this.f50990c, null, this);
    }
}
