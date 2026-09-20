package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class z2t extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f278663a;

    /* JADX INFO: renamed from: b */
    public int f278664b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f278665c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2t(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f278665c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f278663a = obj;
        this.f278664b |= Integer.MIN_VALUE;
        return this.f278665c.emit(null, this);
    }
}
