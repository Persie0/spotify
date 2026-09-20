package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class hm1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f92792a;

    /* JADX INFO: renamed from: b */
    public int f92793b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f92794c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm1(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f92794c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f92792a = obj;
        this.f92793b |= Integer.MIN_VALUE;
        return this.f92794c.emit(null, this);
    }
}
