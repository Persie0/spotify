package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class emb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60868a;

    /* JADX INFO: renamed from: b */
    public int f60869b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fmb1 f60870c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emb1(fmb1 fmb1Var, fbk fbkVar) {
        super(fbkVar);
        this.f60870c = fmb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60868a = obj;
        this.f60869b |= Integer.MIN_VALUE;
        return this.f60870c.emit(null, this);
    }
}
