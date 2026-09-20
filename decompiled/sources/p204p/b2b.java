package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b2b extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22557a;

    /* JADX INFO: renamed from: b */
    public int f22558b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f22559c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2b(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f22559c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f22557a = obj;
        this.f22558b |= Integer.MIN_VALUE;
        return this.f22559c.emit(null, this);
    }
}
