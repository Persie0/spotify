package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lcx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f132000a;

    /* JADX INFO: renamed from: b */
    public int f132001b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f132002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lcx(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f132002c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f132000a = obj;
        this.f132001b |= Integer.MIN_VALUE;
        return this.f132002c.emit(null, this);
    }
}
