package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class yok extends ibk {

    /* JADX INFO: renamed from: a */
    public String f274683a;

    /* JADX INFO: renamed from: b */
    public LinkedHashMap f274684b;

    /* JADX INFO: renamed from: c */
    public long f274685c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f274686d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ bpk f274687e;

    /* JADX INFO: renamed from: f */
    public int f274688f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f274687e = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f274686d = obj;
        this.f274688f |= Integer.MIN_VALUE;
        return this.f274687e.m30133H(null, this);
    }
}
