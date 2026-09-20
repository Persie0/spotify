package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m1t extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f139084a;

    /* JADX INFO: renamed from: b */
    public int f139085b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hhq f139086c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1t(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f139086c = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f139084a = obj;
        this.f139085b |= Integer.MIN_VALUE;
        return this.f139086c.emit(null, this);
    }
}
