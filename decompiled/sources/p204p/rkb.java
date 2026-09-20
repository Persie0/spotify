package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rkb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f200042a;

    /* JADX INFO: renamed from: b */
    public int f200043b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f200044c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rkb(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f200044c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f200042a = obj;
        this.f200043b |= Integer.MIN_VALUE;
        return this.f200044c.emit(null, this);
    }
}
