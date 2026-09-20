package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class a0e0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f11065a;

    /* JADX INFO: renamed from: b */
    public int f11066b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f11067c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0e0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f11067c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f11065a = obj;
        this.f11066b |= Integer.MIN_VALUE;
        return this.f11067c.emit(null, this);
    }
}
