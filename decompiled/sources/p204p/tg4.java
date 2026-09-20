package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tg4 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f220120a;

    /* JADX INFO: renamed from: b */
    public int f220121b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f220122c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg4(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f220122c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f220120a = obj;
        this.f220121b |= Integer.MIN_VALUE;
        return this.f220122c.emit(null, this);
    }
}
