package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class l8n0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f130897a;

    /* JADX INFO: renamed from: b */
    public int f130898b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ m8n0 f130899c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8n0(m8n0 m8n0Var, fbk fbkVar) {
        super(fbkVar);
        this.f130899c = m8n0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f130897a = obj;
        this.f130898b |= Integer.MIN_VALUE;
        return this.f130899c.emit(null, this);
    }
}
