package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class chq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f38062a;

    /* JADX INFO: renamed from: b */
    public int f38063b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bhq f38064c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chq(bhq bhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f38064c = bhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f38062a = obj;
        this.f38063b |= Integer.MIN_VALUE;
        return this.f38064c.emit(null, this);
    }
}
