package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class j7i extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f109600a;

    /* JADX INFO: renamed from: b */
    public int f109601b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f109602c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7i(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f109602c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f109600a = obj;
        this.f109601b |= Integer.MIN_VALUE;
        return this.f109602c.emit(null, this);
    }
}
