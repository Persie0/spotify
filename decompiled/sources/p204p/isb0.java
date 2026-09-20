package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class isb0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f105208a;

    /* JADX INFO: renamed from: b */
    public int f105209b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jsb0 f105210c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isb0(jsb0 jsb0Var, ibk ibkVar) {
        super(ibkVar);
        this.f105210c = jsb0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f105208a = obj;
        this.f105209b |= Integer.MIN_VALUE;
        return this.f105210c.mo15629a(null, null, this);
    }
}
