package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class cz2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f43422a;

    /* JADX INFO: renamed from: b */
    public int f43423b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f43424c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz2(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f43424c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f43422a = obj;
        this.f43423b |= Integer.MIN_VALUE;
        return this.f43424c.emit(null, this);
    }
}
