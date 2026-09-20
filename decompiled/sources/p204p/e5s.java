package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e5s extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f56459a;

    /* JADX INFO: renamed from: b */
    public int f56460b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f56461c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5s(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f56461c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f56459a = obj;
        this.f56460b |= Integer.MIN_VALUE;
        return this.f56461c.emit(null, this);
    }
}
