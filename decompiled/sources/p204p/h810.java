package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h810 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88595a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i810 f88596b;

    /* JADX INFO: renamed from: c */
    public int f88597c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h810(i810 i810Var, fbk fbkVar) {
        super(fbkVar);
        this.f88596b = i810Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f88595a = obj;
        this.f88597c |= Integer.MIN_VALUE;
        return this.f88596b.invoke(this);
    }
}
