package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class wpt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f253837a;

    /* JADX INFO: renamed from: b */
    public int f253838b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ypt f253839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpt(ypt yptVar, ibk ibkVar) {
        super(ibkVar);
        this.f253839c = yptVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f253837a = obj;
        this.f253838b |= Integer.MIN_VALUE;
        return this.f253839c.mo15629a(null, null, this);
    }
}
