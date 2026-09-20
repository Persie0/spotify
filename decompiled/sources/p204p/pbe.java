package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pbe extends ibk {

    /* JADX INFO: renamed from: a */
    public String f175788a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f175789b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sbe f175790c;

    /* JADX INFO: renamed from: d */
    public int f175791d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbe(sbe sbeVar, ibk ibkVar) {
        super(ibkVar);
        this.f175790c = sbeVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175789b = obj;
        this.f175791d |= Integer.MIN_VALUE;
        return sbe.m77726d(this.f175790c, null, this);
    }
}
