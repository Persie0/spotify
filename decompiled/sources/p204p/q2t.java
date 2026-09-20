package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class q2t extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f184711a;

    /* JADX INFO: renamed from: b */
    public int f184712b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f184713c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2t(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f184713c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f184711a = obj;
        this.f184712b |= Integer.MIN_VALUE;
        return this.f184713c.emit(null, this);
    }
}
