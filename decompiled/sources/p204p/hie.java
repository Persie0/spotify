package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hie extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f91797a;

    /* JADX INFO: renamed from: b */
    public boolean f91798b;

    /* JADX INFO: renamed from: c */
    public d850 f91799c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f91800d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ iie f91801e;

    /* JADX INFO: renamed from: f */
    public int f91802f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hie(iie iieVar, ibk ibkVar) {
        super(ibkVar);
        this.f91801e = iieVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f91800d = obj;
        this.f91802f |= Integer.MIN_VALUE;
        return this.f91801e.m50711s(false, null, false, this);
    }
}
