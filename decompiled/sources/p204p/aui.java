package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class aui extends ibk {

    /* JADX INFO: renamed from: a */
    public String f19937a;

    /* JADX INFO: renamed from: b */
    public int f19938b;

    /* JADX INFO: renamed from: c */
    public int f19939c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f19940d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ cui f19941e;

    /* JADX INFO: renamed from: f */
    public int f19942f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aui(cui cuiVar, ibk ibkVar) {
        super(ibkVar);
        this.f19941e = cuiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f19940d = obj;
        this.f19942f |= Integer.MIN_VALUE;
        return this.f19941e.m33925a(null, this);
    }
}
