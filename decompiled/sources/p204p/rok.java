package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class rok extends ibk {

    /* JADX INFO: renamed from: a */
    public LinkedHashMap f201277a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f201278b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bpk f201279c;

    /* JADX INFO: renamed from: d */
    public int f201280d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f201279c = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f201278b = obj;
        this.f201280d |= Integer.MIN_VALUE;
        return this.f201279c.m30126A(null, this);
    }
}
