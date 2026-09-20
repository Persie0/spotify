package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uq01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f232881a;

    /* JADX INFO: renamed from: b */
    public int f232882b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f232883c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq01(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f232883c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f232881a = obj;
        this.f232882b |= Integer.MIN_VALUE;
        return this.f232883c.emit(null, this);
    }
}
