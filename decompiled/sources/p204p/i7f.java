package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class i7f extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f99543a;

    /* JADX INFO: renamed from: b */
    public int f99544b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f99545c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7f(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f99545c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99543a = obj;
        this.f99544b |= Integer.MIN_VALUE;
        return this.f99545c.emit(null, this);
    }
}
