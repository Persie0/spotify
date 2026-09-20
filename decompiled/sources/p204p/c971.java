package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class c971 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35415a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d971 f35416b;

    /* JADX INFO: renamed from: c */
    public int f35417c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c971(d971 d971Var, ibk ibkVar) {
        super(ibkVar);
        this.f35416b = d971Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f35415a = obj;
        this.f35417c |= Integer.MIN_VALUE;
        return this.f35416b.m35347y(this);
    }
}
