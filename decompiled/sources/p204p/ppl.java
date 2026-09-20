package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ppl extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f180062a;

    /* JADX INFO: renamed from: b */
    public int f180063b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ opl f180064c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppl(opl oplVar, fbk fbkVar) {
        super(fbkVar);
        this.f180064c = oplVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f180062a = obj;
        this.f180063b |= Integer.MIN_VALUE;
        return this.f180064c.emit(null, this);
    }
}
