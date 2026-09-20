package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gca0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f78526a;

    /* JADX INFO: renamed from: b */
    public int f78527b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f78528c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gca0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f78528c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f78526a = obj;
        this.f78527b |= Integer.MIN_VALUE;
        return this.f78528c.emit(null, this);
    }
}
