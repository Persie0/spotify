package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ykb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f273661a;

    /* JADX INFO: renamed from: b */
    public int f273662b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f273663c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykb(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f273663c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f273661a = obj;
        this.f273662b |= Integer.MIN_VALUE;
        return this.f273663c.emit(null, this);
    }
}
