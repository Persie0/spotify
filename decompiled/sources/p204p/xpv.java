package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xpv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f264741a;

    /* JADX INFO: renamed from: b */
    public int f264742b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f264743c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpv(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f264743c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f264741a = obj;
        this.f264742b |= Integer.MIN_VALUE;
        return this.f264743c.emit(null, this);
    }
}
