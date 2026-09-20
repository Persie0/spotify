package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b781 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24184a;

    /* JADX INFO: renamed from: b */
    public int f24185b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f24186c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b781(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f24186c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f24184a = obj;
        this.f24185b |= Integer.MIN_VALUE;
        return this.f24186c.emit(null, this);
    }
}
