package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class oss0 extends ibk {

    /* JADX INFO: renamed from: a */
    public hts0 f168884a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f168885b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pss0 f168886c;

    /* JADX INFO: renamed from: d */
    public int f168887d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oss0(pss0 pss0Var, ibk ibkVar) {
        super(ibkVar);
        this.f168886c = pss0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f168885b = obj;
        this.f168887d |= Integer.MIN_VALUE;
        return this.f168886c.m70887a(null, this);
    }
}
