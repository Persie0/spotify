package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class y2e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public o3e1 f268596a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f268597b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w2e1 f268598c;

    /* JADX INFO: renamed from: d */
    public int f268599d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2e1(w2e1 w2e1Var, fbk fbkVar) {
        super(fbkVar);
        this.f268598c = w2e1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f268597b = obj;
        this.f268599d |= Integer.MIN_VALUE;
        return this.f268598c.m87075c(null, this);
    }
}
