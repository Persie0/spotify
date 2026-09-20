package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class kna1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f124369a;

    /* JADX INFO: renamed from: b */
    public int f124370b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f124371c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kna1(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f124371c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124369a = obj;
        this.f124370b |= Integer.MIN_VALUE;
        return this.f124371c.emit(null, this);
    }
}
