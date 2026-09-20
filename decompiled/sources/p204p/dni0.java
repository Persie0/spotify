package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dni0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f50844a;

    /* JADX INFO: renamed from: b */
    public int f50845b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f50846c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dni0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f50846c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f50844a = obj;
        this.f50845b |= Integer.MIN_VALUE;
        return this.f50846c.emit(null, this);
    }
}
