package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class w1w extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f247189a;

    /* JADX INFO: renamed from: b */
    public int f247190b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f247191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1w(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f247191c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f247189a = obj;
        this.f247190b |= Integer.MIN_VALUE;
        return this.f247191c.emit(null, this);
    }
}
