package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class nav0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f152123a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rwt0 f152124b;

    /* JADX INFO: renamed from: c */
    public int f152125c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nav0(rwt0 rwt0Var, ibk ibkVar) {
        super(ibkVar);
        this.f152124b = rwt0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f152123a = obj;
        this.f152125c |= Integer.MIN_VALUE;
        Serializable serializableM76584g = this.f152124b.m76584g(null, this);
        return serializableM76584g == yuk.f276404a ? serializableM76584g : new s6x0(serializableM76584g);
    }
}
