package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hmp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f93013a;

    /* JADX INFO: renamed from: b */
    public int f93014b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gxo f93015c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmp(gxo gxoVar, fbk fbkVar) {
        super(fbkVar);
        this.f93015c = gxoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f93013a = obj;
        this.f93014b |= Integer.MIN_VALUE;
        return this.f93015c.emit(null, this);
    }
}
