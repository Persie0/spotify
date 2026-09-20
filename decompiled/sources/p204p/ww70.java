package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ww70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f255722a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yw70 f255723b;

    /* JADX INFO: renamed from: c */
    public int f255724c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww70(yw70 yw70Var, fbk fbkVar) {
        super(fbkVar);
        this.f255723b = yw70Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f255722a = obj;
        this.f255724c |= Integer.MIN_VALUE;
        return this.f255723b.m94777f(0, 0, this);
    }
}
