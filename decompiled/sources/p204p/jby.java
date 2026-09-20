package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jby extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f110918a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mby f110919b;

    /* JADX INFO: renamed from: c */
    public int f110920c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jby(mby mbyVar, ibk ibkVar) {
        super(ibkVar);
        this.f110919b = mbyVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f110918a = obj;
        this.f110920c |= Integer.MIN_VALUE;
        return this.f110919b.m61429a(null, null, this);
    }
}
