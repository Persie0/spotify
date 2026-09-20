package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yw20 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f276832a;

    /* JADX INFO: renamed from: b */
    public int f276833b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f276834c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw20(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f276834c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f276832a = obj;
        this.f276833b |= Integer.MIN_VALUE;
        return this.f276834c.emit(null, this);
    }
}
