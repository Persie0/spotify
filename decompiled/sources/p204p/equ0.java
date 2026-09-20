package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class equ0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61950a;

    /* JADX INFO: renamed from: b */
    public int f61951b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f61952c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public equ0(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f61952c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f61950a = obj;
        this.f61951b |= Integer.MIN_VALUE;
        return this.f61952c.emit(null, this);
    }
}
