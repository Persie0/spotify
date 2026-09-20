package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k5e extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f119486a;

    /* JADX INFO: renamed from: b */
    public int f119487b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i5e f119488c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5e(i5e i5eVar, fbk fbkVar) {
        super(fbkVar);
        this.f119488c = i5eVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f119486a = obj;
        this.f119487b |= Integer.MIN_VALUE;
        return this.f119488c.emit(null, this);
    }
}
