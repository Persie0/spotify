package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class tiq0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f220725a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uiq0 f220726b;

    /* JADX INFO: renamed from: c */
    public int f220727c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tiq0(uiq0 uiq0Var, ibk ibkVar) {
        super(ibkVar);
        this.f220726b = uiq0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f220725a = obj;
        this.f220727c |= Integer.MIN_VALUE;
        return this.f220726b.m83207c(null, this);
    }
}
