package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sms extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f210724a;

    /* JADX INFO: renamed from: b */
    public int f210725b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f210726c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sms(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f210726c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f210724a = obj;
        this.f210725b |= Integer.MIN_VALUE;
        return this.f210726c.emit(null, this);
    }
}
