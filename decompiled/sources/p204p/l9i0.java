package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l9i0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f131130a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o9i0 f131131b;

    /* JADX INFO: renamed from: c */
    public int f131132c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9i0(o9i0 o9i0Var, ibk ibkVar) {
        super(ibkVar);
        this.f131131b = o9i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f131130a = obj;
        this.f131132c |= Integer.MIN_VALUE;
        return this.f131131b.m66474a(false, this);
    }
}
