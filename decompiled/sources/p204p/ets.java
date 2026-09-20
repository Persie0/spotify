package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ets extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62794a;

    /* JADX INFO: renamed from: b */
    public int f62795b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f62796c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ets(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f62796c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f62794a = obj;
        this.f62795b |= Integer.MIN_VALUE;
        return this.f62796c.emit(null, this);
    }
}
