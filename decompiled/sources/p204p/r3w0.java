package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r3w0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f195579a;

    /* JADX INFO: renamed from: b */
    public int f195580b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zso f195581c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3w0(zso zsoVar, fbk fbkVar) {
        super(fbkVar);
        this.f195581c = zsoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f195579a = obj;
        this.f195580b |= Integer.MIN_VALUE;
        return this.f195581c.emit(null, this);
    }
}
