package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class aka extends ibk {

    /* JADX INFO: renamed from: a */
    public int f16471a;

    /* JADX INFO: renamed from: b */
    public Set f16472b;

    /* JADX INFO: renamed from: c */
    public String f16473c;

    /* JADX INFO: renamed from: d */
    public boolean f16474d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f16475e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ hka f16476f;

    /* JADX INFO: renamed from: g */
    public int f16477g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aka(hka hkaVar, ibk ibkVar) {
        super(ibkVar);
        this.f16476f = hkaVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f16475e = obj;
        this.f16477g |= Integer.MIN_VALUE;
        return hka.m47749n(this.f16476f, 0, null, null, this);
    }
}
