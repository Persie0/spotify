package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class dlz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f50391a;

    /* JADX INFO: renamed from: b */
    public int f50392b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hhq f50393c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlz(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f50393c = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f50391a = obj;
        this.f50392b |= Integer.MIN_VALUE;
        return this.f50393c.emit(null, this);
    }
}
