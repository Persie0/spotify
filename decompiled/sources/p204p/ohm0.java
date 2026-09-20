package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ohm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f165505a;

    /* JADX INFO: renamed from: b */
    public int f165506b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fu00 f165507c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohm0(fu00 fu00Var, fbk fbkVar) {
        super(fbkVar);
        this.f165507c = fu00Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f165505a = obj;
        this.f165506b |= Integer.MIN_VALUE;
        return this.f165507c.emit(null, this);
    }
}
