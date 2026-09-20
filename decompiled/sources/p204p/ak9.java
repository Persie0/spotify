package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ak9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16462a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bk9 f16463b;

    /* JADX INFO: renamed from: c */
    public int f16464c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak9(bk9 bk9Var, ibk ibkVar) {
        super(ibkVar);
        this.f16463b = bk9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f16462a = obj;
        this.f16464c |= Integer.MIN_VALUE;
        return this.f16463b.mo27514a(null, this);
    }
}
