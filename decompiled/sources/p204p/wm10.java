package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wm10 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f252681a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zm10 f252682b;

    /* JADX INFO: renamed from: c */
    public int f252683c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm10(zm10 zm10Var, ibk ibkVar) {
        super(ibkVar);
        this.f252682b = zm10Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f252681a = obj;
        this.f252683c |= Integer.MIN_VALUE;
        zm10.m96394c(this.f252682b, this);
        return yuk.f276404a;
    }
}
