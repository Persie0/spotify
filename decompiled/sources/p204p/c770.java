package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c770 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f34773a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h770 f34774b;

    /* JADX INFO: renamed from: c */
    public int f34775c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c770(h770 h770Var, ibk ibkVar) {
        super(ibkVar);
        this.f34774b = h770Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f34773a = obj;
        this.f34775c |= Integer.MIN_VALUE;
        return this.f34774b.m46759a(this);
    }
}
