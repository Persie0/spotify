package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ml0 extends ibk {

    /* JADX INFO: renamed from: a */
    public x02 f144726a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f144727b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ol0 f144728c;

    /* JADX INFO: renamed from: d */
    public int f144729d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml0(ol0 ol0Var, ibk ibkVar) {
        super(ibkVar);
        this.f144728c = ol0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f144727b = obj;
        this.f144729d |= Integer.MIN_VALUE;
        return this.f144728c.m67273e(null, false, null, this);
    }
}
