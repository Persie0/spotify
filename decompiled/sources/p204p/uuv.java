package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uuv extends ibk {

    /* JADX INFO: renamed from: a */
    public String f234263a;

    /* JADX INFO: renamed from: b */
    public String f234264b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f234265c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zuv f234266d;

    /* JADX INFO: renamed from: e */
    public int f234267e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uuv(zuv zuvVar, ibk ibkVar) {
        super(ibkVar);
        this.f234266d = zuvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f234265c = obj;
        this.f234267e |= Integer.MIN_VALUE;
        return this.f234266d.m97078a(null, null, this);
    }
}
