package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m7s0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f140823a;

    /* JADX INFO: renamed from: b */
    public int f140824b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wk8 f140825c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7s0(wk8 wk8Var, fbk fbkVar) {
        super(fbkVar);
        this.f140825c = wk8Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f140823a = obj;
        this.f140824b |= Integer.MIN_VALUE;
        return this.f140825c.emit(null, this);
    }
}
