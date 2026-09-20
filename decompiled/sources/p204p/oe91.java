package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class oe91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f164387a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pe91 f164388b;

    /* JADX INFO: renamed from: c */
    public int f164389c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe91(pe91 pe91Var, ibk ibkVar) {
        super(ibkVar);
        this.f164388b = pe91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f164387a = obj;
        this.f164389c |= Integer.MIN_VALUE;
        return pe91.m69711d(this.f164388b, this);
    }
}
