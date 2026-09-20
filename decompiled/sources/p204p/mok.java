package p204p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes8.dex */
public final class mok extends ibk {

    /* JADX INFO: renamed from: a */
    public String f145691a;

    /* JADX INFO: renamed from: b */
    public LinkedHashSet f145692b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f145693c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bpk f145694d;

    /* JADX INFO: renamed from: e */
    public int f145695e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mok(bpk bpkVar, ibk ibkVar) {
        super(ibkVar);
        this.f145694d = bpkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f145693c = obj;
        this.f145695e |= Integer.MIN_VALUE;
        return this.f145694d.m30156v(null, this);
    }
}
