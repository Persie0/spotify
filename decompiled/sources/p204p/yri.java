package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yri extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f275483a;

    /* JADX INFO: renamed from: b */
    public int f275484b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f275485c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yri(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f275485c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f275483a = obj;
        this.f275484b |= Integer.MIN_VALUE;
        return this.f275485c.emit(null, this);
    }
}
