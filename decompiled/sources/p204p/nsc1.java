package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class nsc1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f157747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ psc1 f157748b;

    /* JADX INFO: renamed from: c */
    public int f157749c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsc1(psc1 psc1Var, ibk ibkVar) {
        super(ibkVar);
        this.f157748b = psc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f157747a = obj;
        this.f157749c |= Integer.MIN_VALUE;
        Serializable serializableM70773b = this.f157748b.m70773b(this);
        return serializableM70773b == yuk.f276404a ? serializableM70773b : new s6x0(serializableM70773b);
    }
}
