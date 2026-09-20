package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wuv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f255280a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zuv f255281b;

    /* JADX INFO: renamed from: c */
    public int f255282c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wuv(zuv zuvVar, ibk ibkVar) {
        super(ibkVar);
        this.f255281b = zuvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f255280a = obj;
        this.f255282c |= Integer.MIN_VALUE;
        return this.f255281b.m97080c(null, this);
    }
}
