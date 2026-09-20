package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sn9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f210854a;

    /* JADX INFO: renamed from: b */
    public int f210855b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f210856c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn9(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f210856c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f210854a = obj;
        this.f210855b |= Integer.MIN_VALUE;
        return this.f210856c.emit(null, this);
    }
}
