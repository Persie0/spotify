package p204p;

import com.spotify.core.coreimpl.ApplicationScopeConfiguration;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;
import com.spotify.eventsender.api.EventSenderCoreBridge;

/* JADX INFO: loaded from: classes.dex */
public final class zik0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ u050 f283185a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mik0 f283186b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mik0 f283187c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ l02 f283188d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ mik0 f283189e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ oik0 f283190f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ mik0 f283191g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zik0(u050 u050Var, mik0 mik0Var, mik0 mik0Var2, l02 l02Var, mik0 mik0Var3, oik0 oik0Var, mik0 mik0Var4) {
        super(0);
        this.f283185a = u050Var;
        this.f283186b = mik0Var;
        this.f283187c = mik0Var2;
        this.f283188d = l02Var;
        this.f283189e = mik0Var3;
        this.f283190f = oik0Var;
        this.f283191g = mik0Var4;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new btk((xtk) this.f283185a.invoke(), (ztk) this.f283186b.invoke(), (psk) this.f283187c.invoke(), (ApplicationScopeConfiguration) this.f283188d.invoke(), (SharedCosmosRouterApi) this.f283189e.invoke(), (EventSenderCoreBridge) this.f283190f.invoke(), (bwy) this.f283191g.invoke());
    }
}
