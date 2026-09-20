package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n1t extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f149505a;

    /* JADX INFO: renamed from: b */
    public int f149506b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f149507c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1t(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f149507c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f149505a = obj;
        this.f149506b |= Integer.MIN_VALUE;
        return this.f149507c.emit(null, this);
    }
}
