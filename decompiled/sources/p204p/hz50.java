package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hz50 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f96794a;

    /* JADX INFO: renamed from: b */
    public int f96795b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc30 f96796c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz50(wc30 wc30Var, fbk fbkVar) {
        super(fbkVar);
        this.f96796c = wc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f96794a = obj;
        this.f96795b |= Integer.MIN_VALUE;
        return this.f96796c.emit(null, this);
    }
}
