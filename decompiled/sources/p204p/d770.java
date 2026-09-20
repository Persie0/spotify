package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d770 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f46014a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h770 f46015b;

    /* JADX INFO: renamed from: c */
    public int f46016c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d770(h770 h770Var, ibk ibkVar) {
        super(ibkVar);
        this.f46015b = h770Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f46014a = obj;
        this.f46016c |= Integer.MIN_VALUE;
        return this.f46015b.m46760b(null, this);
    }
}
