package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hqw extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f94257a;

    /* JADX INFO: renamed from: b */
    public int f94258b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f94259c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqw(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f94259c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f94257a = obj;
        this.f94258b |= Integer.MIN_VALUE;
        return this.f94259c.emit(null, this);
    }
}
