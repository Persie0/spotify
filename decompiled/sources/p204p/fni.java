package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fni extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f71298a;

    /* JADX INFO: renamed from: b */
    public int f71299b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gni f71300c;

    /* JADX INFO: renamed from: d */
    public bqz0 f71301d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fni(gni gniVar, ibk ibkVar) {
        super(ibkVar);
        this.f71300c = gniVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f71298a = obj;
        this.f71299b |= Integer.MIN_VALUE;
        return this.f71300c.mo15629a(null, null, this);
    }
}
