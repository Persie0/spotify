package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class iqw extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f104853a;

    /* JADX INFO: renamed from: b */
    public int f104854b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f104855c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqw(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f104855c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f104853a = obj;
        this.f104854b |= Integer.MIN_VALUE;
        return this.f104855c.emit(null, this);
    }
}
