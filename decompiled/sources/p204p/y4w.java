package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class y4w extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f269234a;

    /* JADX INFO: renamed from: b */
    public int f269235b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f269236c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4w(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f269236c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f269234a = obj;
        this.f269235b |= Integer.MIN_VALUE;
        return this.f269236c.emit(null, this);
    }
}
