package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class htz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f95210a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k9u f95211b;

    /* JADX INFO: renamed from: c */
    public int f95212c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htz(k9u k9uVar, ibk ibkVar) {
        super(ibkVar);
        this.f95211b = k9uVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f95210a = obj;
        this.f95212c |= Integer.MIN_VALUE;
        return this.f95211b.m55849k(null, this);
    }
}
