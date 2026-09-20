package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ots extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f170087a;

    /* JADX INFO: renamed from: b */
    public int f170088b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f170089c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ots(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f170089c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f170087a = obj;
        this.f170088b |= Integer.MIN_VALUE;
        return this.f170089c.emit(null, this);
    }
}
