package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ik20 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f102950a;

    /* JADX INFO: renamed from: b */
    public int f102951b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f102952c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik20(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f102952c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f102950a = obj;
        this.f102951b |= Integer.MIN_VALUE;
        return this.f102952c.emit(null, this);
    }
}
