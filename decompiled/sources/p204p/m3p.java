package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m3p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f139691a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n3p f139692b;

    /* JADX INFO: renamed from: c */
    public int f139693c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3p(n3p n3pVar, ibk ibkVar) {
        super(ibkVar);
        this.f139692b = n3pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f139691a = obj;
        this.f139693c |= Integer.MIN_VALUE;
        return this.f139692b.m63643f(null, this);
    }
}
