package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x1f extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f257176a;

    /* JADX INFO: renamed from: b */
    public int f257177b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f257178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1f(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f257178c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f257176a = obj;
        this.f257177b |= Integer.MIN_VALUE;
        return this.f257178c.emit(null, this);
    }
}
