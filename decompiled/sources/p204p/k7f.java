package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class k7f extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f120078a;

    /* JADX INFO: renamed from: b */
    public int f120079b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f120080c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7f(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f120080c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f120078a = obj;
        this.f120079b |= Integer.MIN_VALUE;
        return this.f120080c.emit(null, this);
    }
}
