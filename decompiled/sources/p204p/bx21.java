package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class bx21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31770a;

    /* JADX INFO: renamed from: b */
    public int f31771b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f31772c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx21(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f31772c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f31770a = obj;
        this.f31771b |= Integer.MIN_VALUE;
        return this.f31772c.emit(null, this);
    }
}
