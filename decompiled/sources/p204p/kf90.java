package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kf90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f122109a;

    /* JADX INFO: renamed from: b */
    public int f122110b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f122111c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf90(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f122111c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f122109a = obj;
        this.f122110b |= Integer.MIN_VALUE;
        return this.f122111c.emit(null, this);
    }
}
