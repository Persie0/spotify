package p204p;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class nt31 extends ibk {

    /* JADX INFO: renamed from: a */
    public nvo0 f157969a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap f157970b;

    /* JADX INFO: renamed from: c */
    public String f157971c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f157972d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ qt31 f157973e;

    /* JADX INFO: renamed from: f */
    public int f157974f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt31(qt31 qt31Var, ibk ibkVar) {
        super(ibkVar);
        this.f157973e = qt31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f157972d = obj;
        this.f157974f |= Integer.MIN_VALUE;
        return qt31.m73789a(this.f157973e, null, this);
    }
}
