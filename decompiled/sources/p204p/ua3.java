package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ua3 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f228343a;

    /* JADX INFO: renamed from: b */
    public int f228344b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f228345c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua3(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f228345c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f228343a = obj;
        this.f228344b |= Integer.MIN_VALUE;
        return this.f228345c.emit(null, this);
    }
}
