package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qn2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f190457a;

    /* JADX INFO: renamed from: b */
    public int f190458b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f190459c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn2(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f190459c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f190457a = obj;
        this.f190458b |= Integer.MIN_VALUE;
        return this.f190459c.emit(null, this);
    }
}
