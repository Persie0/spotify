package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ahq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15752a;

    /* JADX INFO: renamed from: b */
    public int f15753b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bhq f15754c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahq(bhq bhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f15754c = bhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f15752a = obj;
        this.f15753b |= Integer.MIN_VALUE;
        return this.f15754c.emit(null, this);
    }
}
