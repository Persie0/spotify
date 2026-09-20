package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class v4j extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f237184a;

    /* JADX INFO: renamed from: b */
    public String f237185b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f237186c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ w4j f237187d;

    /* JADX INFO: renamed from: e */
    public int f237188e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4j(w4j w4jVar, ibk ibkVar) {
        super(ibkVar);
        this.f237187d = w4jVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f237186c = obj;
        this.f237188e |= Integer.MIN_VALUE;
        Serializable serializableM87200b = this.f237187d.m87200b(null, null, this, false);
        return serializableM87200b == yuk.f276404a ? serializableM87200b : new s6x0(serializableM87200b);
    }
}
