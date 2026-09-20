package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class x2f extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f257459a;

    /* JADX INFO: renamed from: b */
    public int f257460b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f257461c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2f(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f257461c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f257459a = obj;
        this.f257460b |= Integer.MIN_VALUE;
        return this.f257461c.emit(null, this);
    }
}
