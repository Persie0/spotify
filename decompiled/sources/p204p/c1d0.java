package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class c1d0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33055a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h1d0 f33056b;

    /* JADX INFO: renamed from: c */
    public int f33057c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1d0(h1d0 h1d0Var, ibk ibkVar) {
        super(ibkVar);
        this.f33056b = h1d0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f33055a = obj;
        this.f33057c |= Integer.MIN_VALUE;
        Serializable serializableM46423g = this.f33056b.m46423g(null, this);
        return serializableM46423g == yuk.f276404a ? serializableM46423g : new s6x0(serializableM46423g);
    }
}
