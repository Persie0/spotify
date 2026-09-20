package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class g5b extends ibk {

    /* JADX INFO: renamed from: a */
    public jsi0 f76634a;

    /* JADX INFO: renamed from: b */
    public int f76635b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f76636c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ j5b f76637d;

    /* JADX INFO: renamed from: e */
    public int f76638e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5b(j5b j5bVar, ibk ibkVar) {
        super(ibkVar);
        this.f76637d = j5bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f76636c = obj;
        this.f76638e |= Integer.MIN_VALUE;
        return this.f76637d.mo52454a(this);
    }
}
