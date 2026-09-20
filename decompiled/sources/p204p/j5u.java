package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class j5u extends ibk {

    /* JADX INFO: renamed from: a */
    public nyt f109096a;

    /* JADX INFO: renamed from: b */
    public qs0 f109097b;

    /* JADX INFO: renamed from: c */
    public String f109098c;

    /* JADX INFO: renamed from: d */
    public List f109099d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f109100e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ u5u f109101f;

    /* JADX INFO: renamed from: g */
    public int f109102g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5u(u5u u5uVar, ibk ibkVar) {
        super(ibkVar);
        this.f109101f = u5uVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f109100e = obj;
        this.f109102g |= Integer.MIN_VALUE;
        return u5u.m82417a(this.f109101f, null, null, this);
    }
}
