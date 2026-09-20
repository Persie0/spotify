package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uri extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f233380a;

    /* JADX INFO: renamed from: b */
    public int f233381b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f233382c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uri(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f233382c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f233380a = obj;
        this.f233381b |= Integer.MIN_VALUE;
        return this.f233382c.emit(null, this);
    }
}
