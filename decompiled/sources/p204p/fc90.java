package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fc90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f68035a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gc90 f68036b;

    /* JADX INFO: renamed from: c */
    public int f68037c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc90(gc90 gc90Var, ibk ibkVar) {
        super(ibkVar);
        this.f68036b = gc90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f68035a = obj;
        this.f68037c |= Integer.MIN_VALUE;
        return this.f68036b.m44311k(null, this, false);
    }
}
