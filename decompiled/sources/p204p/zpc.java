package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zpc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f285094a;

    /* JADX INFO: renamed from: b */
    public int f285095b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f285096c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpc(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f285096c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f285094a = obj;
        this.f285095b |= Integer.MIN_VALUE;
        return this.f285096c.emit(null, this);
    }
}
