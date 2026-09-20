package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class off0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f164750a;

    /* JADX INFO: renamed from: b */
    public int f164751b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f164752c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public off0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f164752c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f164750a = obj;
        this.f164751b |= Integer.MIN_VALUE;
        return this.f164752c.emit(null, this);
    }
}
