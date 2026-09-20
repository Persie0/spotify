package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class lue extends ibk {

    /* JADX INFO: renamed from: a */
    public dve f137071a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f137072b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dve f137073c;

    /* JADX INFO: renamed from: d */
    public int f137074d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lue(dve dveVar, ibk ibkVar) {
        super(ibkVar);
        this.f137073c = dveVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f137072b = obj;
        this.f137074d |= Integer.MIN_VALUE;
        return this.f137073c.m37092m(0L, this);
    }
}
