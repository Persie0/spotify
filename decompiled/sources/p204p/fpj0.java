package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fpj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f71888a;

    /* JADX INFO: renamed from: b */
    public int f71889b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b9s f71890c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpj0(b9s b9sVar, fbk fbkVar) {
        super(fbkVar);
        this.f71890c = b9sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f71888a = obj;
        this.f71889b |= Integer.MIN_VALUE;
        return this.f71890c.emit(null, this);
    }
}
