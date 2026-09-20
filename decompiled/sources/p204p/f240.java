package p204p;

import com.spotify.musicappplatform.state.idle.api.MusicAppLock;

/* JADX INFO: loaded from: classes2.dex */
public final class f240 extends ibk {

    /* JADX INFO: renamed from: a */
    public MusicAppLock f65105a;

    /* JADX INFO: renamed from: b */
    public lsi0 f65106b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f65107c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ h240 f65108d;

    /* JADX INFO: renamed from: e */
    public int f65109e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f240(h240 h240Var, ibk ibkVar) {
        super(ibkVar);
        this.f65108d = h240Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f65107c = obj;
        this.f65109e |= Integer.MIN_VALUE;
        return this.f65108d.m46478i(null, this);
    }
}
