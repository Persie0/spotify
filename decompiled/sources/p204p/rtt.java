package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rtt extends ibk {

    /* JADX INFO: renamed from: a */
    public String f202644a;

    /* JADX INFO: renamed from: b */
    public String f202645b;

    /* JADX INFO: renamed from: c */
    public String f202646c;

    /* JADX INFO: renamed from: d */
    public ye30 f202647d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f202648e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ stt f202649f;

    /* JADX INFO: renamed from: g */
    public int f202650g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtt(stt sttVar, ibk ibkVar) {
        super(ibkVar);
        this.f202649f = sttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f202648e = obj;
        this.f202650g |= Integer.MIN_VALUE;
        Object objM79316a = this.f202649f.m79316a(null, null, null, null, this);
        return objM79316a == yuk.f276404a ? objM79316a : new s6x0(objM79316a);
    }
}
