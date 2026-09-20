package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class z4s extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f279332a;

    /* JADX INFO: renamed from: b */
    public int f279333b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x4s f279334c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4s(x4s x4sVar, fbk fbkVar) {
        super(fbkVar);
        this.f279334c = x4sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f279332a = obj;
        this.f279333b |= Integer.MIN_VALUE;
        return this.f279334c.emit(null, this);
    }
}
