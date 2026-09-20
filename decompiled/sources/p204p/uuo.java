package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uuo extends ibk {

    /* JADX INFO: renamed from: a */
    public List f234226a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f234227b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vuo f234228c;

    /* JADX INFO: renamed from: d */
    public int f234229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uuo(vuo vuoVar, ibk ibkVar) {
        super(ibkVar);
        this.f234228c = vuoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f234227b = obj;
        this.f234229d |= Integer.MIN_VALUE;
        return this.f234228c.m86441c(null, this);
    }
}
