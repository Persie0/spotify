package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class q82 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f186217a;

    /* JADX INFO: renamed from: b */
    public int f186218b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f186219c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q82(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f186219c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f186217a = obj;
        this.f186218b |= Integer.MIN_VALUE;
        return this.f186219c.emit(null, this);
    }
}
