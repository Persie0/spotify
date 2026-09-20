package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u4l extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f226768a;

    /* JADX INFO: renamed from: b */
    public int f226769b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f226770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4l(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f226770c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f226768a = obj;
        this.f226769b |= Integer.MIN_VALUE;
        return this.f226770c.emit(null, this);
    }
}
