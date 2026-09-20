package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class pt21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f181030a;

    /* JADX INFO: renamed from: b */
    public int f181031b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f181032c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt21(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f181032c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f181030a = obj;
        this.f181031b |= Integer.MIN_VALUE;
        return this.f181032c.emit(null, this);
    }
}
