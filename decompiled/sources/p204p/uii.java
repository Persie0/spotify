package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uii extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f230685a;

    /* JADX INFO: renamed from: b */
    public int f230686b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f230687c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uii(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f230687c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f230685a = obj;
        this.f230686b |= Integer.MIN_VALUE;
        return this.f230687c.emit(null, this);
    }
}
