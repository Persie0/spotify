package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mhi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f143796a;

    /* JADX INFO: renamed from: b */
    public int f143797b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f143798c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f143798c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f143796a = obj;
        this.f143797b |= Integer.MIN_VALUE;
        return this.f143798c.emit(null, this);
    }
}
