package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class ac90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14298a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gc90 f14299b;

    /* JADX INFO: renamed from: c */
    public int f14300c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac90(gc90 gc90Var, ibk ibkVar) {
        super(ibkVar);
        this.f14299b = gc90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f14298a = obj;
        this.f14300c |= Integer.MIN_VALUE;
        Serializable serializableM44306f = this.f14299b.m44306f(null, this);
        return serializableM44306f == yuk.f276404a ? serializableM44306f : new s6x0(serializableM44306f);
    }
}
