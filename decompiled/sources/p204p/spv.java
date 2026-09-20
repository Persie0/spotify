package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class spv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f212958a;

    /* JADX INFO: renamed from: b */
    public int f212959b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f212960c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spv(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f212960c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f212958a = obj;
        this.f212959b |= Integer.MIN_VALUE;
        return this.f212960c.emit(null, this);
    }
}
