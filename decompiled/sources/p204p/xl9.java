package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xl9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f263067a;

    /* JADX INFO: renamed from: b */
    public int f263068b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f263069c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl9(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f263069c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f263067a = obj;
        this.f263068b |= Integer.MIN_VALUE;
        return this.f263069c.emit(null, this);
    }
}
