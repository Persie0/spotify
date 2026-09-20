package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tyx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f225068a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ azx f225069b;

    /* JADX INFO: renamed from: c */
    public int f225070c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyx(azx azxVar, ibk ibkVar) {
        super(ibkVar);
        this.f225069b = azxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f225068a = obj;
        this.f225070c |= Integer.MIN_VALUE;
        return this.f225069b.m27703d(null, this);
    }
}
