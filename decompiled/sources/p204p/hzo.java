package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class hzo extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f96985a;

    /* JADX INFO: renamed from: b */
    public int f96986b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f96987c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzo(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f96987c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f96985a = obj;
        this.f96986b |= Integer.MIN_VALUE;
        return this.f96987c.emit(null, this);
    }
}
