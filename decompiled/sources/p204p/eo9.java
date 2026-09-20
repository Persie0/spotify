package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class eo9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61343a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ go9 f61344b;

    /* JADX INFO: renamed from: c */
    public int f61345c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo9(go9 go9Var, ibk ibkVar) {
        super(ibkVar);
        this.f61344b = go9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f61343a = obj;
        this.f61345c |= Integer.MIN_VALUE;
        return this.f61344b.m45329d(null, this);
    }
}
