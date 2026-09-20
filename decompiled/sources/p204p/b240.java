package p204p;

import com.spotify.musicappplatform.state.idle.api.MusicAppLock;

/* JADX INFO: loaded from: classes2.dex */
public final class b240 extends ibk {

    /* JADX INFO: renamed from: a */
    public MusicAppLock f22492a;

    /* JADX INFO: renamed from: b */
    public lsi0 f22493b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f22494c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ h240 f22495d;

    /* JADX INFO: renamed from: e */
    public int f22496e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b240(h240 h240Var, ibk ibkVar) {
        super(ibkVar);
        this.f22495d = h240Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f22494c = obj;
        this.f22496e |= Integer.MIN_VALUE;
        return this.f22495d.m46472c(null, this);
    }
}
