package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b901 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24735a;

    /* JADX INFO: renamed from: b */
    public int f24736b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f24737c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b901(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f24737c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f24735a = obj;
        this.f24736b |= Integer.MIN_VALUE;
        return this.f24737c.emit(null, this);
    }
}
