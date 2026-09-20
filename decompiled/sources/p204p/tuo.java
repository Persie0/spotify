package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tuo extends ibk {

    /* JADX INFO: renamed from: a */
    public List f223886a;

    /* JADX INFO: renamed from: b */
    public grb0 f223887b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f223888c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vuo f223889d;

    /* JADX INFO: renamed from: e */
    public int f223890e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tuo(vuo vuoVar, ibk ibkVar) {
        super(ibkVar);
        this.f223889d = vuoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f223888c = obj;
        this.f223890e |= Integer.MIN_VALUE;
        return this.f223889d.m86440a(null, null, this);
    }
}
