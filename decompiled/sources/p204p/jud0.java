package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jud0 extends ibk {

    /* JADX INFO: renamed from: a */
    public long f116097a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f116098b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kud0 f116099c;

    /* JADX INFO: renamed from: d */
    public int f116100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jud0(kud0 kud0Var, ibk ibkVar) {
        super(ibkVar);
        this.f116099c = kud0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f116098b = obj;
        this.f116100d |= Integer.MIN_VALUE;
        return kud0.m57387b(this.f116099c, 0L, this);
    }
}
