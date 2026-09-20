package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fet0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f68830a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wvy f68831b;

    /* JADX INFO: renamed from: c */
    public int f68832c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fet0(wvy wvyVar, ibk ibkVar) {
        super(ibkVar);
        this.f68831b = wvyVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f68830a = obj;
        this.f68832c |= Integer.MIN_VALUE;
        return this.f68831b.m89165b(null, this);
    }
}
