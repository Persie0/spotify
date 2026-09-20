package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class y2t extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f268675a;

    /* JADX INFO: renamed from: b */
    public int f268676b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f268677c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2t(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f268677c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f268675a = obj;
        this.f268676b |= Integer.MIN_VALUE;
        return this.f268677c.emit(null, this);
    }
}
