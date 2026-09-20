package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lb60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f131576a;

    /* JADX INFO: renamed from: b */
    public int f131577b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f131578c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb60(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f131578c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f131576a = obj;
        this.f131577b |= Integer.MIN_VALUE;
        return this.f131578c.emit(null, this);
    }
}
