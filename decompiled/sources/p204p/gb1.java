package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public kb1 f78161a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f78162b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hb1 f78163c;

    /* JADX INFO: renamed from: d */
    public int f78164d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb1(hb1 hb1Var, ibk ibkVar) {
        super(ibkVar);
        this.f78163c = hb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f78162b = obj;
        this.f78164d |= Integer.MIN_VALUE;
        return hb1.m46959b(this.f78163c, null, this);
    }
}
