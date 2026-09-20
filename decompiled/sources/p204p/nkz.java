package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class nkz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f154970a;

    /* JADX INFO: renamed from: b */
    public int f154971b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ okz f154972c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkz(okz okzVar, fbk fbkVar) {
        super(fbkVar);
        this.f154972c = okzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f154970a = obj;
        this.f154971b |= Integer.MIN_VALUE;
        return this.f154972c.emit(null, this);
    }
}
