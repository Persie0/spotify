package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class l0f extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f128414a;

    /* JADX INFO: renamed from: b */
    public int f128415b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f128416c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0f(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f128416c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f128414a = obj;
        this.f128415b |= Integer.MIN_VALUE;
        return this.f128416c.emit(null, this);
    }
}
