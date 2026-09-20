package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ecu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58389a;

    /* JADX INFO: renamed from: b */
    public int f58390b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f58391c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecu0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f58391c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f58389a = obj;
        this.f58390b |= Integer.MIN_VALUE;
        return this.f58391c.emit(null, this);
    }
}
