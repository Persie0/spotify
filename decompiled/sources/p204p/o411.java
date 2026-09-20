package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o411 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f161514a;

    /* JADX INFO: renamed from: b */
    public int f161515b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f161516c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o411(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f161516c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f161514a = obj;
        this.f161515b |= Integer.MIN_VALUE;
        return this.f161516c.emit(null, this);
    }
}
