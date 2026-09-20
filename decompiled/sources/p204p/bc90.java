package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bc90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25809a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gc90 f25810b;

    /* JADX INFO: renamed from: c */
    public int f25811c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc90(gc90 gc90Var, ibk ibkVar) {
        super(ibkVar);
        this.f25810b = gc90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f25809a = obj;
        this.f25811c |= Integer.MIN_VALUE;
        return this.f25810b.m44307g(null, this);
    }
}
