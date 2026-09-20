package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wip extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f251726a;

    /* JADX INFO: renamed from: b */
    public int f251727b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f251728c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wip(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f251728c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f251726a = obj;
        this.f251727b |= Integer.MIN_VALUE;
        return this.f251728c.emit(null, this);
    }
}
