package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f770 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66572a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h770 f66573b;

    /* JADX INFO: renamed from: c */
    public int f66574c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f770(h770 h770Var, ibk ibkVar) {
        super(ibkVar);
        this.f66573b = h770Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f66572a = obj;
        this.f66574c |= Integer.MIN_VALUE;
        return this.f66573b.m46762d(this);
    }
}
