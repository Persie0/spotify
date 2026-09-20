package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u2t extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f226163a;

    /* JADX INFO: renamed from: b */
    public int f226164b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f226165c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2t(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f226165c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f226163a = obj;
        this.f226164b |= Integer.MIN_VALUE;
        return this.f226165c.emit(null, this);
    }
}
