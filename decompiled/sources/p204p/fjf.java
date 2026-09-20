package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fjf extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f70211a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hjf f70212b;

    /* JADX INFO: renamed from: c */
    public int f70213c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjf(hjf hjfVar, ibk ibkVar) {
        super(ibkVar);
        this.f70212b = hjfVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f70211a = obj;
        this.f70213c |= Integer.MIN_VALUE;
        return this.f70212b.mo25626e(null, null, null, this);
    }
}
