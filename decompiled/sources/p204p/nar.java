package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nar extends ibk {

    /* JADX INFO: renamed from: a */
    public qe70 f152109a;

    /* JADX INFO: renamed from: b */
    public lsi0 f152110b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f152111c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ oar f152112d;

    /* JADX INFO: renamed from: e */
    public int f152113e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nar(oar oarVar, ibk ibkVar) {
        super(ibkVar);
        this.f152112d = oarVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f152111c = obj;
        this.f152113e |= Integer.MIN_VALUE;
        return this.f152112d.m66576i(null, this);
    }
}
