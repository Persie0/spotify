package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sqt0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f213159a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uqt0 f213160b;

    /* JADX INFO: renamed from: c */
    public int f213161c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqt0(uqt0 uqt0Var, ibk ibkVar) {
        super(ibkVar);
        this.f213160b = uqt0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f213159a = obj;
        this.f213161c |= Integer.MIN_VALUE;
        return this.f213160b.mo33214i(null, this);
    }
}
