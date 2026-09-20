package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pqe extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f180293a;

    /* JADX INFO: renamed from: b */
    public int f180294b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f180295c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqe(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f180295c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f180293a = obj;
        this.f180294b |= Integer.MIN_VALUE;
        return this.f180295c.emit(null, this);
    }
}
