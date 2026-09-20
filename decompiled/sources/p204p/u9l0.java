package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class u9l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f228220a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v9l0 f228221b;

    /* JADX INFO: renamed from: c */
    public int f228222c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9l0(v9l0 v9l0Var, ibk ibkVar) {
        super(ibkVar);
        this.f228221b = v9l0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f228220a = obj;
        this.f228222c |= Integer.MIN_VALUE;
        Serializable serializableM84972c = this.f228221b.m84972c(this);
        return serializableM84972c == yuk.f276404a ? serializableM84972c : new s6x0(serializableM84972c);
    }
}
