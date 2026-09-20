package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class e1d0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55180a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h1d0 f55181b;

    /* JADX INFO: renamed from: c */
    public int f55182c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1d0(h1d0 h1d0Var, ibk ibkVar) {
        super(ibkVar);
        this.f55181b = h1d0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f55180a = obj;
        this.f55182c |= Integer.MIN_VALUE;
        Serializable serializableM46425i = this.f55181b.m46425i(null, this);
        return serializableM46425i == yuk.f276404a ? serializableM46425i : new s6x0(serializableM46425i);
    }
}
