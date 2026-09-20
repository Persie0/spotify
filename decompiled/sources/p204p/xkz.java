package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class xkz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f262965a;

    /* JADX INFO: renamed from: b */
    public int f262966b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hhq f262967c;

    /* JADX INFO: renamed from: d */
    public Object f262968d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkz(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f262967c = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f262965a = obj;
        this.f262966b |= Integer.MIN_VALUE;
        return this.f262967c.emit(null, this);
    }
}
