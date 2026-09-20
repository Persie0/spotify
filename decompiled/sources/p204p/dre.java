package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dre extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f52313a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gre f52314b;

    /* JADX INFO: renamed from: c */
    public int f52315c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dre(gre greVar, ibk ibkVar) {
        super(ibkVar);
        this.f52314b = greVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f52313a = obj;
        this.f52315c |= Integer.MIN_VALUE;
        gre.m45482a(this.f52314b, this);
        return yuk.f276404a;
    }
}
