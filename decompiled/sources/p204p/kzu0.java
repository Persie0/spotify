package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kzu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f128222a;

    /* JADX INFO: renamed from: b */
    public int f128223b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f128224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzu0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f128224c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f128222a = obj;
        this.f128223b |= Integer.MIN_VALUE;
        return this.f128224c.emit(null, this);
    }
}
