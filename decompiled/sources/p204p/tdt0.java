package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class tdt0 extends ibk {

    /* JADX INFO: renamed from: a */
    public xz8 f219480a;

    /* JADX INFO: renamed from: b */
    public Iterator f219481b;

    /* JADX INFO: renamed from: c */
    public r160 f219482c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f219483d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ udt0 f219484e;

    /* JADX INFO: renamed from: f */
    public int f219485f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdt0(udt0 udt0Var, ibk ibkVar) {
        super(ibkVar);
        this.f219484e = udt0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f219483d = obj;
        this.f219485f |= Integer.MIN_VALUE;
        return this.f219484e.m82865a(null, this);
    }
}
