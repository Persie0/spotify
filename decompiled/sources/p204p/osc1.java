package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class osc1 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f168797a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f168798b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ psc1 f168799c;

    /* JADX INFO: renamed from: d */
    public int f168800d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osc1(psc1 psc1Var, ibk ibkVar) {
        super(ibkVar);
        this.f168799c = psc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f168798b = obj;
        this.f168800d |= Integer.MIN_VALUE;
        Serializable serializableM70774c = this.f168799c.m70774c(false, this);
        return serializableM70774c == yuk.f276404a ? serializableM70774c : new s6x0(serializableM70774c);
    }
}
