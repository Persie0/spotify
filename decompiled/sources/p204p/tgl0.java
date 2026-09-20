package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tgl0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f220213a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vgl0 f220214b;

    /* JADX INFO: renamed from: c */
    public int f220215c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgl0(vgl0 vgl0Var, ibk ibkVar) {
        super(ibkVar);
        this.f220214b = vgl0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f220213a = obj;
        this.f220215c |= Integer.MIN_VALUE;
        return this.f220214b.m85490m(this);
    }
}
