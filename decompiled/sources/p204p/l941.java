package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class l941 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f131002a;

    /* JADX INFO: renamed from: b */
    public int f131003b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f131004c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l941(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f131004c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f131002a = obj;
        this.f131003b |= Integer.MIN_VALUE;
        return this.f131004c.emit(null, this);
    }
}
