package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class lwf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f137562a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mwf0 f137563b;

    /* JADX INFO: renamed from: c */
    public int f137564c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwf0(mwf0 mwf0Var, ibk ibkVar) {
        super(ibkVar);
        this.f137563b = mwf0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f137562a = obj;
        this.f137564c |= Integer.MIN_VALUE;
        Serializable serializableM63011a = this.f137563b.m63011a(null, null, null, false, this);
        return serializableM63011a == yuk.f276404a ? serializableM63011a : new s6x0(serializableM63011a);
    }
}
