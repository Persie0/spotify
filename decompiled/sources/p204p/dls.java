package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dls extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f50349a;

    /* JADX INFO: renamed from: b */
    public int f50350b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f50351c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dls(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f50351c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f50349a = obj;
        this.f50350b |= Integer.MIN_VALUE;
        return this.f50351c.emit(null, this);
    }
}
