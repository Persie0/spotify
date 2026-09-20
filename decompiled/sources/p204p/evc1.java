package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class evc1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f63205a;

    /* JADX INFO: renamed from: b */
    public int f63206b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di91 f63207c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evc1(di91 di91Var, fbk fbkVar) {
        super(fbkVar);
        this.f63207c = di91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f63205a = obj;
        this.f63206b |= Integer.MIN_VALUE;
        return this.f63207c.emit(null, this);
    }
}
