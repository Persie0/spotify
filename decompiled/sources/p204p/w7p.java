package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class w7p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f248727a;

    /* JADX INFO: renamed from: b */
    public int f248728b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f248729c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7p(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f248729c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f248727a = obj;
        this.f248728b |= Integer.MIN_VALUE;
        return this.f248729c.emit(null, this);
    }
}
