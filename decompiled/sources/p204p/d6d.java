package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class d6d extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f45671a;

    /* JADX INFO: renamed from: b */
    public int f45672b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e6d f45673c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6d(e6d e6dVar, ibk ibkVar) {
        super(ibkVar);
        this.f45673c = e6dVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f45671a = obj;
        this.f45672b |= Integer.MIN_VALUE;
        return this.f45673c.mo15629a(null, null, this);
    }
}
