package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class eca0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58279a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ica0 f58280b;

    /* JADX INFO: renamed from: c */
    public int f58281c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eca0(ica0 ica0Var, ibk ibkVar) {
        super(ibkVar);
        this.f58280b = ica0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f58279a = obj;
        this.f58281c |= Integer.MIN_VALUE;
        return this.f58280b.m50246d(null, this);
    }
}
