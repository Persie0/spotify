package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class x370 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f257707a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e470 f257708b;

    /* JADX INFO: renamed from: c */
    public int f257709c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x370(e470 e470Var, ibk ibkVar) {
        super(ibkVar);
        this.f257708b = e470Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f257707a = obj;
        this.f257709c |= Integer.MIN_VALUE;
        return this.f257708b.m37758a(null, null, null, null, this);
    }
}
