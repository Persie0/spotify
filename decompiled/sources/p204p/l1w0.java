package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class l1w0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f128832a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f128833b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ q1w0 f128834c;

    /* JADX INFO: renamed from: d */
    public int f128835d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1w0(q1w0 q1w0Var, ibk ibkVar) {
        super(ibkVar);
        this.f128834c = q1w0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f128833b = obj;
        this.f128835d |= Integer.MIN_VALUE;
        Serializable serializableM71960f = this.f128834c.m71960f(null, null, null, null, null, null, null, false, this);
        return serializableM71960f == yuk.f276404a ? serializableM71960f : new s6x0(serializableM71960f);
    }
}
