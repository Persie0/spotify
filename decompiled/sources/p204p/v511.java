package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class v511 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f237289a;

    /* JADX INFO: renamed from: b */
    public int f237290b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f237291c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v511(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f237291c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f237289a = obj;
        this.f237290b |= Integer.MIN_VALUE;
        return this.f237291c.emit(null, this);
    }
}
