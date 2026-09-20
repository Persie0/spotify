package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lhi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f133569a;

    /* JADX INFO: renamed from: b */
    public int f133570b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f133571c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f133571c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f133569a = obj;
        this.f133570b |= Integer.MIN_VALUE;
        return this.f133571c.emit(null, this);
    }
}
