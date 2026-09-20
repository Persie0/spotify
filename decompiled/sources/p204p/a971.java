package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class a971 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13505a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d971 f13506b;

    /* JADX INFO: renamed from: c */
    public int f13507c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a971(d971 d971Var, ibk ibkVar) {
        super(ibkVar);
        this.f13506b = d971Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13505a = obj;
        this.f13507c |= Integer.MIN_VALUE;
        return this.f13506b.m35342t(this);
    }
}
