package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class yp6 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f274827a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fj1 f274828b;

    /* JADX INFO: renamed from: c */
    public int f274829c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp6(fj1 fj1Var, ibk ibkVar) {
        super(ibkVar);
        this.f274828b = fj1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f274827a = obj;
        this.f274829c |= Integer.MIN_VALUE;
        Serializable serializableM41780c = this.f274828b.m41780c(null, this);
        return serializableM41780c == yuk.f276404a ? serializableM41780c : new s6x0(serializableM41780c);
    }
}
