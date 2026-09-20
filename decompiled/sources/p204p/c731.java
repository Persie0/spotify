package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class c731 extends ibk {

    /* JADX INFO: renamed from: a */
    public a731 f34734a;

    /* JADX INFO: renamed from: b */
    public jsi0 f34735b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f34736c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ d731 f34737d;

    /* JADX INFO: renamed from: e */
    public int f34738e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c731(d731 d731Var, ibk ibkVar) {
        super(ibkVar);
        this.f34737d = d731Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f34736c = obj;
        this.f34738e |= Integer.MIN_VALUE;
        return this.f34737d.m35174b(null, this);
    }
}
