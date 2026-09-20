package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class il8 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f103312a;

    /* JADX INFO: renamed from: b */
    public int f103313b;

    /* JADX INFO: renamed from: c */
    public niz f103314c;

    /* JADX INFO: renamed from: d */
    public int f103315d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ jl8 f103316e;

    /* JADX INFO: renamed from: f */
    public int f103317f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il8(jl8 jl8Var, fbk fbkVar) {
        super(fbkVar);
        this.f103316e = jl8Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f103312a = obj;
        this.f103313b |= Integer.MIN_VALUE;
        return this.f103316e.emit(null, this);
    }
}
