package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ni2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f154160a;

    /* JADX INFO: renamed from: b */
    public int f154161b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f154162c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni2(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f154162c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f154160a = obj;
        this.f154161b |= Integer.MIN_VALUE;
        return this.f154162c.emit(null, this);
    }
}
