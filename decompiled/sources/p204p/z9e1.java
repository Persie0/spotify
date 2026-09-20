package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z9e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f280758a;

    /* JADX INFO: renamed from: b */
    public int f280759b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aae1 f280760c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9e1(aae1 aae1Var, fbk fbkVar) {
        super(fbkVar);
        this.f280760c = aae1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f280758a = obj;
        this.f280759b |= Integer.MIN_VALUE;
        return this.f280760c.emit(null, this);
    }
}
