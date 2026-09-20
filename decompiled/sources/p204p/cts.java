package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cts extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f41968a;

    /* JADX INFO: renamed from: b */
    public int f41969b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f41970c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cts(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f41970c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f41968a = obj;
        this.f41969b |= Integer.MIN_VALUE;
        return this.f41970c.emit(null, this);
    }
}
