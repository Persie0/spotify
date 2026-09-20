package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rsb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f202247a;

    /* JADX INFO: renamed from: b */
    public int f202248b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f202249c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rsb(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f202249c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f202247a = obj;
        this.f202248b |= Integer.MIN_VALUE;
        return this.f202249c.emit(null, this);
    }
}
