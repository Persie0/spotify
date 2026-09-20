package com.spotify.cosmos.servicebasedrouter;

import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.cosmos.Lifetime;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.ResolveCallback;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.b0g1;
import p204p.bga;
import p204p.bhy0;
import p204p.bzf1;
import p204p.c9k;
import p204p.di41;
import p204p.eb11;
import p204p.eh00;
import p204p.fbk;
import p204p.fiz;
import p204p.g6f;
import p204p.grl0;
import p204p.hf11;
import p204p.iph0;
import p204p.kk40;
import p204p.kpo;
import p204p.mb61;
import p204p.nlv0;
import p204p.nxf1;
import p204p.qe70;
import p204p.rlv0;
import p204p.s601;
import p204p.sir0;
import p204p.th00;
import p204p.uuk;
import p204p.w2a1;
import p204p.wxf1;
import p204p.xuk;
import p204p.yuk;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m24212d2 = {"Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter;", "Lcom/spotify/cosmos/callbackrouter/CallbackRouter;", "Lcom/spotify/cosmos/servicebasedrouter/ScopeCallbackConnector;", "scopeConnector", "<init>", "(Lcom/spotify/cosmos/servicebasedrouter/ScopeCallbackConnector;)V", "Lp/fiz;", "Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$RouterState;", "routerState", "(Lcom/spotify/cosmos/servicebasedrouter/ScopeCallbackConnector;)Lp/fiz;", "Lcom/spotify/cosmos/cosmos/Request;", "request", "Lcom/spotify/cosmos/cosmos/ResolveCallback;", "callback", "Lcom/spotify/cosmos/cosmos/Lifetime;", "resolve", "(Lcom/spotify/cosmos/cosmos/Request;Lcom/spotify/cosmos/cosmos/ResolveCallback;)Lcom/spotify/cosmos/cosmos/Lifetime;", "Lp/xuk;", "scope", "Lp/xuk;", "Lp/eb11;", "routerStateFlow", "Lp/eb11;", "Companion", "RouterState", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ScopedCallbackRouter implements CallbackRouter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<String> IDEMPOTENT_ACTIONS = s601.m77310m0(Request.GET, Request.SUB);
    private final eb11 routerStateFlow;
    private final xuk scope;

    @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m24212d2 = {"Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$Companion;", "", "<init>", "()V", "IDEMPOTENT_ACTIONS", "", "", "getIDEMPOTENT_ACTIONS", "()Ljava/util/Set;", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<String> getIDEMPOTENT_ACTIONS() {
            return ScopedCallbackRouter.IDEMPOTENT_ACTIONS;
        }

        private Companion() {
        }
    }

    @Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$RouterState;", "", "Available", "NotAvailable", "Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$RouterState$Available;", "Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$RouterState$NotAvailable;", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public interface RouterState {

        @Metadata(m24211d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$RouterState$Available;", "Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$RouterState;", "router", "Lcom/spotify/cosmos/callbackrouter/CallbackRouter;", "<init>", "(Lcom/spotify/cosmos/callbackrouter/CallbackRouter;)V", "getRouter", "()Lcom/spotify/cosmos/callbackrouter/CallbackRouter;", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Available implements RouterState {
            private final CallbackRouter router;

            public Available(CallbackRouter callbackRouter) {
                this.router = callbackRouter;
            }

            public final CallbackRouter getRouter() {
                return this.router;
            }
        }

        @Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, m24212d2 = {"Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$RouterState$NotAvailable;", "Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$RouterState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final /* data */ class NotAvailable implements RouterState {
            public static final NotAvailable INSTANCE = new NotAvailable();

            private NotAvailable() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NotAvailable);
            }

            public int hashCode() {
                return 1732638440;
            }

            public String toString() {
                return "NotAvailable";
            }
        }
    }

    /* JADX INFO: renamed from: com.spotify.cosmos.servicebasedrouter.ScopedCallbackRouter$routerState$1 */
    @Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m24212d2 = {"Lp/sir0;", "Lcom/spotify/cosmos/servicebasedrouter/ScopedCallbackRouter$RouterState;", "Lp/w2a1;", "<anonymous>", "(Lp/sir0;)V"}, m24213k = 3, m24214mv = {2, 3, 0})
    @kpo(m57054c = "com.spotify.cosmos.servicebasedrouter.ScopedCallbackRouter$routerState$1", m57055f = "ScopedCallbackRouter.kt", m57056l = {79}, m57057m = "invokeSuspend", m57058v = 2)
    public static final class C06081 extends mb61 implements th00 {
        final /* synthetic */ ScopeCallbackConnector $scopeConnector;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.spotify.cosmos.servicebasedrouter.ScopedCallbackRouter$routerState$1$1, reason: invalid class name */
        @Metadata(m24211d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m24212d2 = {"Lp/w2a1;", "invoke", "()V", "<anonymous>"}, m24213k = 3, m24214mv = {2, 3, 0})
        public static final class AnonymousClass1 extends qe70 implements eh00 {
            final /* synthetic */ bhy0 $scopeDisposable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(bhy0 bhy0Var) {
                super(0);
                this.$scopeDisposable = bhy0Var;
            }

            @Override // p204p.eh00
            public /* bridge */ /* synthetic */ Object invoke() {
                m98332invoke();
                return w2a1.f247311a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m98332invoke() {
                ((iph0) this.$scopeDisposable).m51278a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06081(ScopeCallbackConnector scopeCallbackConnector, fbk<? super C06081> fbkVar) {
            super(2, fbkVar);
            this.$scopeConnector = scopeCallbackConnector;
        }

        @Override // p204p.ly8
        public final fbk<w2a1> create(Object obj, fbk<?> fbkVar) {
            C06081 c06081 = new C06081(this.$scopeConnector, fbkVar);
            c06081.L$0 = obj;
            return c06081;
        }

        @Override // p204p.ly8
        public final Object invokeSuspend(Object obj) {
            sir0 sir0Var = (sir0) this.L$0;
            int i = this.label;
            if (i == 0) {
                bga.m29073P(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scopeConnector.connect(new ScopedCallbackRouter$routerState$1$scopeDisposable$1(sir0Var), new ScopedCallbackRouter$routerState$1$scopeDisposable$2(sir0Var)));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object objM45540m = grl0.m45540m(sir0Var, anonymousClass1, this);
                yuk yukVar = yuk.f276404a;
                if (objM45540m == yukVar) {
                    return yukVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return w2a1.f247311a;
        }

        @Override // p204p.th00
        public final Object invoke(sir0 sir0Var, fbk<? super w2a1> fbkVar) {
            return ((C06081) create(sir0Var, fbkVar)).invokeSuspend(w2a1.f247311a);
        }
    }

    public ScopedCallbackRouter(ScopeCallbackConnector scopeCallbackConnector) {
        c9k c9kVarM56661c = kk40.m56661c(new uuk("ScopedCallbackRouterScope"));
        this.scope = c9kVarM56661c;
        this.routerStateFlow = bzf1.m31027s(routerState(scopeCallbackConnector), c9kVarM56661c, hf11.m47320a(3, 0L), 1);
    }

    private final fiz routerState(ScopeCallbackConnector scopeConnector) {
        return nxf1.m65827f(new C06081(scopeConnector, null));
    }

    @Override // com.spotify.cosmos.callbackrouter.CallbackRouter
    public Lifetime resolve(Request request, ResolveCallback callback) {
        boolean zM43725i0 = g6f.m43725i0(IDEMPOTENT_ACTIONS, request.getAction());
        nlv0 nlv0Var = new nlv0();
        nlv0Var.f155174a = true;
        final rlv0 rlv0Var = new rlv0();
        final di41 di41VarM89255l = wxf1.m89255l(this.scope, b0g1.m27776L(this.routerStateFlow, new ScopedCallbackRouter$resolve$job$1(nlv0Var, rlv0Var, request, callback, zM43725i0, null)));
        return new Lifetime() { // from class: com.spotify.cosmos.servicebasedrouter.ScopedCallbackRouter.resolve.1
            @Override // com.spotify.cosmos.cosmos.Lifetime
            public void release() {
                di41VarM89255l.mo26601e(null);
                Lifetime lifetime = (Lifetime) rlv0Var.f200373a;
                if (lifetime != null) {
                    lifetime.release();
                }
            }
        };
    }
}
