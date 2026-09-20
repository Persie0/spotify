package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zp71 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f285011a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bq71 f285012b;

    /* JADX INFO: renamed from: c */
    public int f285013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp71(bq71 bq71Var, ibk ibkVar) {
        super(ibkVar);
        this.f285012b = bq71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f285011a = obj;
        this.f285013c |= Integer.MIN_VALUE;
        return this.f285012b.m30200b(null, null, null, this);
    }
}
