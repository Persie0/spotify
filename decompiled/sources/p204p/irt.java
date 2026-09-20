package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class irt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f105051a;

    /* JADX INFO: renamed from: b */
    public int f105052b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jrt f105053c;

    /* JADX INFO: renamed from: d */
    public bqz0 f105054d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irt(jrt jrtVar, ibk ibkVar) {
        super(ibkVar);
        this.f105053c = jrtVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f105051a = obj;
        this.f105052b |= Integer.MIN_VALUE;
        return this.f105053c.mo15629a(null, null, this);
    }
}
