package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yta1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f276067a;

    /* JADX INFO: renamed from: b */
    public int f276068b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di91 f276069c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yta1(di91 di91Var, fbk fbkVar) {
        super(fbkVar);
        this.f276069c = di91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f276067a = obj;
        this.f276068b |= Integer.MIN_VALUE;
        return this.f276069c.emit(null, this);
    }
}
