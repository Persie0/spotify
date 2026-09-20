package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qtt0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f192481a;

    /* JADX INFO: renamed from: b */
    public int f192482b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f192483c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtt0(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f192483c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f192481a = obj;
        this.f192482b |= Integer.MIN_VALUE;
        return this.f192483c.emit(null, this);
    }
}
