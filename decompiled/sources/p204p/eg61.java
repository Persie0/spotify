package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class eg61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f59231a;

    /* JADX INFO: renamed from: b */
    public int f59232b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f59233c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg61(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f59233c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f59231a = obj;
        this.f59232b |= Integer.MIN_VALUE;
        return this.f59233c.emit(null, this);
    }
}
