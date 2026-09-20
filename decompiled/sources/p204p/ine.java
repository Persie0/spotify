package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ine extends ibk {

    /* JADX INFO: renamed from: a */
    public String f103956a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f103957b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lne f103958c;

    /* JADX INFO: renamed from: d */
    public int f103959d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ine(lne lneVar, ibk ibkVar) {
        super(ibkVar);
        this.f103958c = lneVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f103957b = obj;
        this.f103959d |= Integer.MIN_VALUE;
        return this.f103958c.m59495a(null, this);
    }
}
