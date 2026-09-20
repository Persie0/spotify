package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q8v0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f186409a;

    /* JADX INFO: renamed from: b */
    public int f186410b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f186411c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8v0(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f186411c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f186409a = obj;
        this.f186410b |= Integer.MIN_VALUE;
        return this.f186411c.emit(null, this);
    }
}
