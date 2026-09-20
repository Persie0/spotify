package p204p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class rad extends ibk {

    /* JADX INFO: renamed from: a */
    public String f197264a;

    /* JADX INFO: renamed from: b */
    public String f197265b;

    /* JADX INFO: renamed from: c */
    public CancellationException f197266c;

    /* JADX INFO: renamed from: d */
    public int f197267d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f197268e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ sad f197269f;

    /* JADX INFO: renamed from: g */
    public int f197270g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rad(sad sadVar, ibk ibkVar) {
        super(ibkVar);
        this.f197269f = sadVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f197268e = obj;
        this.f197270g |= Integer.MIN_VALUE;
        return this.f197269f.m77620a(0, null, this);
    }
}
