package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class w6g0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f248376a;

    /* JADX INFO: renamed from: b */
    public int f248377b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f248378c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6g0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f248378c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f248376a = obj;
        this.f248377b |= Integer.MIN_VALUE;
        return this.f248378c.emit(null, this);
    }
}
