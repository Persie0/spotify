package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class i4e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f98516a;

    /* JADX INFO: renamed from: b */
    public int f98517b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di91 f98518c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4e1(di91 di91Var, fbk fbkVar) {
        super(fbkVar);
        this.f98518c = di91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f98516a = obj;
        this.f98517b |= Integer.MIN_VALUE;
        return this.f98518c.emit(null, this);
    }
}
