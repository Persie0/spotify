package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class un3 extends ibk {

    /* JADX INFO: renamed from: a */
    public hd41 f232022a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f232023b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hd41 f232024c;

    /* JADX INFO: renamed from: d */
    public int f232025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un3(hd41 hd41Var, ibk ibkVar) {
        super(ibkVar);
        this.f232024c = hd41Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f232023b = obj;
        this.f232025d |= Integer.MIN_VALUE;
        Serializable serializableM47167c = this.f232024c.m47167c(null, this);
        return serializableM47167c == yuk.f276404a ? serializableM47167c : new s6x0(serializableM47167c);
    }
}
