package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class krf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f125637a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lrf0 f125638b;

    /* JADX INFO: renamed from: c */
    public int f125639c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krf0(lrf0 lrf0Var, ibk ibkVar) {
        super(ibkVar);
        this.f125638b = lrf0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f125637a = obj;
        this.f125639c |= Integer.MIN_VALUE;
        Serializable serializableM59802a = this.f125638b.m59802a(null, null, null, this);
        return serializableM59802a == yuk.f276404a ? serializableM59802a : new s6x0(serializableM59802a);
    }
}
