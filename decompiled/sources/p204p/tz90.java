package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tz90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f225197a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uz90 f225198b;

    /* JADX INFO: renamed from: c */
    public int f225199c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz90(uz90 uz90Var, ibk ibkVar) {
        super(ibkVar);
        this.f225198b = uz90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f225197a = obj;
        this.f225199c |= Integer.MIN_VALUE;
        return this.f225198b.m84289a(null, this);
    }
}
