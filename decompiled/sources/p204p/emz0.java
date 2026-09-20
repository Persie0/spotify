package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class emz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61029a;

    /* JADX INFO: renamed from: b */
    public int f61030b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f61031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emz0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f61031c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f61029a = obj;
        this.f61030b |= Integer.MIN_VALUE;
        return this.f61031c.emit(null, this);
    }
}
