package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xex extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f260782a;

    /* JADX INFO: renamed from: b */
    public int f260783b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yex f260784c;

    /* JADX INFO: renamed from: d */
    public bqz0 f260785d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xex(yex yexVar, ibk ibkVar) {
        super(ibkVar);
        this.f260784c = yexVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f260782a = obj;
        this.f260783b |= Integer.MIN_VALUE;
        return this.f260784c.mo15629a(null, null, this);
    }
}
