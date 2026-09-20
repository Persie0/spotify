package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class wre1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f254347a;

    /* JADX INFO: renamed from: b */
    public int f254348b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aae1 f254349c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wre1(aae1 aae1Var, fbk fbkVar) {
        super(fbkVar);
        this.f254349c = aae1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f254347a = obj;
        this.f254348b |= Integer.MIN_VALUE;
        return this.f254349c.emit(null, this);
    }
}
