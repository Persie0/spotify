package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r411 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f195631a;

    /* JADX INFO: renamed from: b */
    public int f195632b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f195633c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r411(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f195633c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f195631a = obj;
        this.f195632b |= Integer.MIN_VALUE;
        return this.f195633c.emit(null, this);
    }
}
