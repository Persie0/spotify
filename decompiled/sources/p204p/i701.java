package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i701 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f99402a;

    /* JADX INFO: renamed from: b */
    public int f99403b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f99404c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i701(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f99404c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99402a = obj;
        this.f99403b |= Integer.MIN_VALUE;
        return this.f99404c.emit(null, this);
    }
}
