package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yt9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f276043a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zt9 f276044b;

    /* JADX INFO: renamed from: c */
    public int f276045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt9(zt9 zt9Var, ibk ibkVar) {
        super(ibkVar);
        this.f276044b = zt9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f276043a = obj;
        this.f276045c |= Integer.MIN_VALUE;
        return this.f276044b.m96901b(this);
    }
}
