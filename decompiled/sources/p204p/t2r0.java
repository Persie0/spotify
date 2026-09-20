package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class t2r0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f216613a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v2r0 f216614b;

    /* JADX INFO: renamed from: c */
    public int f216615c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2r0(v2r0 v2r0Var, ibk ibkVar) {
        super(ibkVar);
        this.f216614b = v2r0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f216613a = obj;
        this.f216615c |= Integer.MIN_VALUE;
        Serializable serializableM84526b = this.f216614b.m84526b(this);
        return serializableM84526b == yuk.f276404a ? serializableM84526b : new s6x0(serializableM84526b);
    }
}
