package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class f7i extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66686a;

    /* JADX INFO: renamed from: b */
    public int f66687b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f66688c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7i(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f66688c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f66686a = obj;
        this.f66687b |= Integer.MIN_VALUE;
        return this.f66688c.emit(null, this);
    }
}
