package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class aur extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20007a;

    /* JADX INFO: renamed from: b */
    public int f20008b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bur f20009c;

    /* JADX INFO: renamed from: d */
    public yqr f20010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aur(bur burVar, ibk ibkVar) {
        super(ibkVar);
        this.f20009c = burVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f20007a = obj;
        this.f20008b |= Integer.MIN_VALUE;
        return this.f20009c.mo15629a(null, null, this);
    }
}
