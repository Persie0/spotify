package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cmv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f39805a;

    /* JADX INFO: renamed from: b */
    public int f39806b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f39807c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmv0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f39807c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f39805a = obj;
        this.f39806b |= Integer.MIN_VALUE;
        return this.f39807c.emit(null, this);
    }
}
