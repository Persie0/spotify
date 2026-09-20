package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class yto0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f276182a;

    /* JADX INFO: renamed from: b */
    public int f276183b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f276184c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yto0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f276184c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f276182a = obj;
        this.f276183b |= Integer.MIN_VALUE;
        return this.f276184c.emit(null, this);
    }
}
