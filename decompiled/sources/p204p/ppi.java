package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ppi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f180047a;

    /* JADX INFO: renamed from: b */
    public int f180048b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f180049c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f180049c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f180047a = obj;
        this.f180048b |= Integer.MIN_VALUE;
        return this.f180049c.emit(null, this);
    }
}
