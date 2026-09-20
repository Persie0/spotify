package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rlb extends ibk {

    /* JADX INFO: renamed from: a */
    public String f200261a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f200262b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lmb f200263c;

    /* JADX INFO: renamed from: d */
    public int f200264d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rlb(lmb lmbVar, ibk ibkVar) {
        super(ibkVar);
        this.f200263c = lmbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f200262b = obj;
        this.f200264d |= Integer.MIN_VALUE;
        return this.f200263c.m59332i(null, this);
    }
}
