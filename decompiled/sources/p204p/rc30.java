package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rc30 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f197714a;

    /* JADX INFO: renamed from: b */
    public int f197715b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f197716c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc30(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f197716c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f197714a = obj;
        this.f197715b |= Integer.MIN_VALUE;
        return this.f197716c.emit(null, this);
    }
}
