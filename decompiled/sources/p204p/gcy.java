package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class gcy extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f78667a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hcy f78668b;

    /* JADX INFO: renamed from: c */
    public int f78669c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcy(hcy hcyVar, ibk ibkVar) {
        super(ibkVar);
        this.f78668b = hcyVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f78667a = obj;
        this.f78669c |= Integer.MIN_VALUE;
        Serializable serializableM47142a = this.f78668b.m47142a(null, null, this);
        return serializableM47142a == yuk.f276404a ? serializableM47142a : new s6x0(serializableM47142a);
    }
}
