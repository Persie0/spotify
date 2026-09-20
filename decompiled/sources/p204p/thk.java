package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class thk extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f220446a;

    /* JADX INFO: renamed from: b */
    public int f220447b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f220448c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thk(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f220448c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f220446a = obj;
        this.f220447b |= Integer.MIN_VALUE;
        return this.f220448c.emit(null, this);
    }
}
