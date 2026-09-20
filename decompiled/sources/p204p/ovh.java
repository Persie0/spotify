package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ovh extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f170499a;

    /* JADX INFO: renamed from: b */
    public int f170500b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f170501c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovh(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f170501c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f170499a = obj;
        this.f170500b |= Integer.MIN_VALUE;
        return this.f170501c.emit(null, this);
    }
}
