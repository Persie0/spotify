package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zga0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f282559a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ia70 f282560b;

    /* JADX INFO: renamed from: c */
    public int f282561c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zga0(ia70 ia70Var, ibk ibkVar) {
        super(ibkVar);
        this.f282560b = ia70Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f282559a = obj;
        this.f282561c |= Integer.MIN_VALUE;
        return this.f282560b.m50040l(this);
    }
}
