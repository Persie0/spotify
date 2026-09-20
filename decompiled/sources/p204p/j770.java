package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j770 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f109523a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k770 f109524b;

    /* JADX INFO: renamed from: c */
    public int f109525c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j770(k770 k770Var, ibk ibkVar) {
        super(ibkVar);
        this.f109524b = k770Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f109523a = obj;
        this.f109525c |= Integer.MIN_VALUE;
        return this.f109524b.m55635b(null, null, null, this);
    }
}
