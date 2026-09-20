package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class qok extends ibk {

    /* JADX INFO: renamed from: a */
    public LinkedHashMap f190992a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f190993b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bpk f190994c;

    /* JADX INFO: renamed from: d */
    public int f190995d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f190994c = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f190993b = obj;
        this.f190995d |= Integer.MIN_VALUE;
        return this.f190994c.m30160z(null, this);
    }
}
