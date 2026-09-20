package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xnu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f263711a;

    /* JADX INFO: renamed from: b */
    public int f263712b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f263713c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnu0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f263713c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f263711a = obj;
        this.f263712b |= Integer.MIN_VALUE;
        return this.f263713c.emit(null, this);
    }
}
