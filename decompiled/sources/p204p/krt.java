package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class krt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f125722a;

    /* JADX INFO: renamed from: b */
    public int f125723b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lrt f125724c;

    /* JADX INFO: renamed from: d */
    public bqz0 f125725d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krt(lrt lrtVar, ibk ibkVar) {
        super(ibkVar);
        this.f125724c = lrtVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f125722a = obj;
        this.f125723b |= Integer.MIN_VALUE;
        return this.f125724c.mo15629a(null, null, this);
    }
}
