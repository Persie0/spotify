package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bie extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27416a;

    /* JADX INFO: renamed from: b */
    public int f27417b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ede f27418c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bie(ede edeVar, fbk fbkVar) {
        super(fbkVar);
        this.f27418c = edeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f27416a = obj;
        this.f27417b |= Integer.MIN_VALUE;
        return this.f27418c.emit(null, this);
    }
}
