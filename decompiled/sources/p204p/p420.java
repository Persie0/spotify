package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p420 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f173783a;

    /* JADX INFO: renamed from: b */
    public int f173784b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f173785c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p420(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f173785c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f173783a = obj;
        this.f173784b |= Integer.MIN_VALUE;
        return this.f173785c.emit(null, this);
    }
}
