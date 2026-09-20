package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class q3u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f184961a;

    /* JADX INFO: renamed from: b */
    public int f184962b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ r3u f184963c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3u(r3u r3uVar, ibk ibkVar) {
        super(ibkVar);
        this.f184963c = r3uVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f184961a = obj;
        this.f184962b |= Integer.MIN_VALUE;
        return this.f184963c.mo15629a(null, null, this);
    }
}
