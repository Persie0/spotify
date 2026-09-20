package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q8n0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f186346a;

    /* JADX INFO: renamed from: b */
    public int f186347b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ m8n0 f186348c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8n0(m8n0 m8n0Var, fbk fbkVar) {
        super(fbkVar);
        this.f186348c = m8n0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f186346a = obj;
        this.f186347b |= Integer.MIN_VALUE;
        return this.f186348c.emit(null, this);
    }
}
