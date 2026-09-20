package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class k4q extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f119293a;

    /* JADX INFO: renamed from: b */
    public int f119294b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ j4q f119295c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4q(j4q j4qVar, fbk fbkVar) {
        super(fbkVar);
        this.f119295c = j4qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f119293a = obj;
        this.f119294b |= Integer.MIN_VALUE;
        return this.f119295c.emit(null, this);
    }
}
