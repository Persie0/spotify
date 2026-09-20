package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kfy0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f122243a;

    /* JADX INFO: renamed from: b */
    public int f122244b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f122245c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfy0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f122245c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f122243a = obj;
        this.f122244b |= Integer.MIN_VALUE;
        return this.f122245c.emit(null, this);
    }
}
