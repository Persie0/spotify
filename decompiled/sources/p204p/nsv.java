package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nsv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f157901a;

    /* JADX INFO: renamed from: b */
    public int f157902b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f157903c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsv(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f157903c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f157901a = obj;
        this.f157902b |= Integer.MIN_VALUE;
        return this.f157903c.emit(null, this);
    }
}
