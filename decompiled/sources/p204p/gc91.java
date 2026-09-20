package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gc91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f78522a;

    /* JADX INFO: renamed from: b */
    public int f78523b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f78524c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc91(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f78524c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f78522a = obj;
        this.f78523b |= Integer.MIN_VALUE;
        return this.f78524c.emit(null, this);
    }
}
