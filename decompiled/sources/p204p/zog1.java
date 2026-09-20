package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class zog1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f284787a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c4d1 f284788b;

    /* JADX INFO: renamed from: c */
    public int f284789c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zog1(c4d1 c4d1Var, ibk ibkVar) {
        super(ibkVar);
        this.f284788b = c4d1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f284787a = obj;
        this.f284789c |= Integer.MIN_VALUE;
        return this.f284788b.m31440g(null, null, this);
    }
}
