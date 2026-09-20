package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kod extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f124764a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gl8 f124765b;

    /* JADX INFO: renamed from: c */
    public int f124766c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kod(gl8 gl8Var, ibk ibkVar) {
        super(ibkVar);
        this.f124765b = gl8Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124764a = obj;
        this.f124766c |= Integer.MIN_VALUE;
        return this.f124765b.m45104s(null, this);
    }
}
