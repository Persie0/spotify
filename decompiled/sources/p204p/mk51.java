package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mk51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f144500a;

    /* JADX INFO: renamed from: b */
    public int f144501b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f144502c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk51(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f144502c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f144500a = obj;
        this.f144501b |= Integer.MIN_VALUE;
        return this.f144502c.emit(null, this);
    }
}
