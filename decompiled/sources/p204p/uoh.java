package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uoh extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f232430a;

    /* JADX INFO: renamed from: b */
    public int f232431b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f232432c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uoh(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f232432c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f232430a = obj;
        this.f232431b |= Integer.MIN_VALUE;
        return this.f232432c.emit(null, this);
    }
}
