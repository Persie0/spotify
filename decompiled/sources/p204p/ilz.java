package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ilz extends ibk {

    /* JADX INFO: renamed from: a */
    public rlv0 f103554a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f103555b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fwj f103556c;

    /* JADX INFO: renamed from: d */
    public int f103557d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilz(fwj fwjVar, fbk fbkVar) {
        super(fbkVar);
        this.f103556c = fwjVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f103555b = obj;
        this.f103557d |= Integer.MIN_VALUE;
        return this.f103556c.emit(null, this);
    }
}
