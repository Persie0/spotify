package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nga0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f153622a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oga0 f153623b;

    /* JADX INFO: renamed from: c */
    public int f153624c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nga0(oga0 oga0Var, ibk ibkVar) {
        super(ibkVar);
        this.f153623b = oga0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f153622a = obj;
        this.f153624c |= Integer.MIN_VALUE;
        return this.f153623b.m66877c(this);
    }
}
