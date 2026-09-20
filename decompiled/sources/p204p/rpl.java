package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rpl extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f201608a;

    /* JADX INFO: renamed from: b */
    public int f201609b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f201610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpl(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f201610c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f201608a = obj;
        this.f201609b |= Integer.MIN_VALUE;
        return this.f201610c.emit(null, this);
    }
}
