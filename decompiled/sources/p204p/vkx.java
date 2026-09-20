package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vkx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f242306a;

    /* JADX INFO: renamed from: b */
    public int f242307b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v1a f242308c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vkx(v1a v1aVar, fbk fbkVar) {
        super(fbkVar);
        this.f242308c = v1aVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f242306a = obj;
        this.f242307b |= Integer.MIN_VALUE;
        return this.f242308c.emit(null, this);
    }
}
