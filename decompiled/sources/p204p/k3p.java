package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class k3p extends ibk {

    /* JADX INFO: renamed from: a */
    public vbc f118944a;

    /* JADX INFO: renamed from: b */
    public n3p f118945b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f118946c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ n3p f118947d;

    /* JADX INFO: renamed from: e */
    public int f118948e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3p(n3p n3pVar, ibk ibkVar) {
        super(ibkVar);
        this.f118947d = n3pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f118946c = obj;
        this.f118948e |= Integer.MIN_VALUE;
        return this.f118947d.m63641c(null, this);
    }
}
