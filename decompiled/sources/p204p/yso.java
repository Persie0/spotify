package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yso extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f275845a;

    /* JADX INFO: renamed from: b */
    public int f275846b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zso f275847c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yso(zso zsoVar, fbk fbkVar) {
        super(fbkVar);
        this.f275847c = zsoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f275845a = obj;
        this.f275846b |= Integer.MIN_VALUE;
        return this.f275847c.emit(null, this);
    }
}
