package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class xfa0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f260883a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yfa0 f260884b;

    /* JADX INFO: renamed from: c */
    public int f260885c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfa0(yfa0 yfa0Var, ibk ibkVar) {
        super(ibkVar);
        this.f260884b = yfa0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f260883a = obj;
        this.f260885c |= Integer.MIN_VALUE;
        Serializable serializableM93551b = this.f260884b.m93551b(null, this);
        return serializableM93551b == yuk.f276404a ? serializableM93551b : new s6x0(serializableM93551b);
    }
}
