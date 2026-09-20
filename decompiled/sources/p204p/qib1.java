package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qib1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f188977a;

    /* JADX INFO: renamed from: b */
    public int f188978b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f188979c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qib1(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f188979c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f188977a = obj;
        this.f188978b |= Integer.MIN_VALUE;
        return this.f188979c.emit(null, this);
    }
}
