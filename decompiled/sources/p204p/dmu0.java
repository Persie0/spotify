package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class dmu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f50613a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ emu0 f50614b;

    /* JADX INFO: renamed from: c */
    public int f50615c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu0(emu0 emu0Var, ibk ibkVar) {
        super(ibkVar);
        this.f50614b = emu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f50613a = obj;
        this.f50615c |= Integer.MIN_VALUE;
        return this.f50614b.m39463a(this);
    }
}
