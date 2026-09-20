package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pg4 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f177217a;

    /* JADX INFO: renamed from: b */
    public int f177218b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f177219c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg4(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f177219c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f177217a = obj;
        this.f177218b |= Integer.MIN_VALUE;
        return this.f177219c.emit(null, this);
    }
}
