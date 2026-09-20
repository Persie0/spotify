package com.spotify.cosmos.cosmonautdi;

import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.cosmos.cosmonaut.CosmonautFactory;
import com.spotify.cosmos.fireandforgetresolver.FireAndForgetResolver;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.cosmos.rxrouter.RxRouterProvider;
import com.spotify.cosmos.rxrouter.RxRouterProviderModule_Companion_ProvideRxRouterProviderFactory;
import com.spotify.cosmos.servicebasedrouterimpl.RxFireAndForgetResolver;
import p204p.b2s;
import p204p.fk60;
import p204p.h4t0;
import p204p.jg31;
import p204p.p0i0;

/* JADX INFO: loaded from: classes.dex */
public final class DaggerCosmosComponent {

    public static final class CosmosComponentImpl implements CosmosComponent {
        private final CosmosComponentImpl cosmosComponentImpl = this;
        private final CosmosDeps cosmosDeps;
        h4t0 provideCosmonautFactoryProvider;
        h4t0 provideCosmonautProvider;
        h4t0 provideRxRouterProvider;
        h4t0 rxFireAndForgetResolverProvider;

        public static final class SwitchingProvider<T> implements h4t0 {
            private final CosmosComponentImpl cosmosComponentImpl;

            /* JADX INFO: renamed from: id */
            private final int f3473id;

            public SwitchingProvider(CosmosComponentImpl cosmosComponentImpl, int i) {
                this.cosmosComponentImpl = cosmosComponentImpl;
                this.f3473id = i;
            }

            @Override // p204p.i4t0
            public T get() {
                int i = this.f3473id;
                if (i == 0) {
                    CosmonautFactory cosmonautFactory = (CosmonautFactory) this.cosmosComponentImpl.provideCosmonautFactoryProvider.get();
                    RxRouter rxRouter = this.cosmosComponentImpl.cosmosDeps.getRxRouter();
                    jg31.m53271i(rxRouter);
                    return (T) CosmonautModule_Companion_ProvideCosmonautFactory.provideCosmonaut(cosmonautFactory, rxRouter);
                }
                if (i == 1) {
                    p0i0 moshi = this.cosmosComponentImpl.cosmosDeps.getMoshi();
                    jg31.m53271i(moshi);
                    fk60 json = this.cosmosComponentImpl.cosmosDeps.getJson();
                    jg31.m53271i(json);
                    return (T) CosmonautModule_Companion_ProvideCosmonautFactoryFactory.provideCosmonautFactory(moshi, json);
                }
                if (i == 2) {
                    RxRouter rxRouter2 = this.cosmosComponentImpl.cosmosDeps.getRxRouter();
                    jg31.m53271i(rxRouter2);
                    return (T) new RxFireAndForgetResolver(rxRouter2);
                }
                if (i != 3) {
                    throw new AssertionError(this.f3473id);
                }
                RxRouter rxRouter3 = this.cosmosComponentImpl.cosmosDeps.getRxRouter();
                jg31.m53271i(rxRouter3);
                return (T) RxRouterProviderModule_Companion_ProvideRxRouterProviderFactory.provideRxRouterProvider(rxRouter3);
            }
        }

        public CosmosComponentImpl(CosmosDeps cosmosDeps) {
            this.cosmosDeps = cosmosDeps;
            initialize(cosmosDeps);
        }

        private void initialize(CosmosDeps cosmosDeps) {
            this.provideCosmonautFactoryProvider = b2s.m27972b(new SwitchingProvider(this.cosmosComponentImpl, 1));
            this.provideCosmonautProvider = b2s.m27972b(new SwitchingProvider(this.cosmosComponentImpl, 0));
            this.rxFireAndForgetResolverProvider = b2s.m27972b(new SwitchingProvider(this.cosmosComponentImpl, 2));
            this.provideRxRouterProvider = b2s.m27972b(new SwitchingProvider(this.cosmosComponentImpl, 3));
        }

        @Override // com.spotify.cosmos.cosmoscomponentapi.CosmosComponentApi
        public Cosmonaut getCosmonaut() {
            return (Cosmonaut) this.provideCosmonautProvider.get();
        }

        @Override // com.spotify.cosmos.cosmoscomponentapi.CosmosComponentApi
        public CosmonautFactory getCosmonautFactory() {
            return (CosmonautFactory) this.provideCosmonautFactoryProvider.get();
        }

        @Override // com.spotify.cosmos.cosmoscomponentapi.CosmosComponentApi
        public FireAndForgetResolver getFireAndForgetResolver() {
            return (FireAndForgetResolver) this.rxFireAndForgetResolverProvider.get();
        }

        @Override // com.spotify.cosmos.cosmoscomponentapi.CosmosComponentApi
        public RxRouterProvider getRxRouterProvider() {
            return (RxRouterProvider) this.provideRxRouterProvider.get();
        }
    }

    public static final class Factory implements CosmosComponent.Factory {
        public /* synthetic */ Factory(int i) {
            this();
        }

        @Override // com.spotify.cosmos.cosmonautdi.CosmosComponent.Factory
        public CosmosComponent create(CosmosDeps cosmosDeps) {
            jg31.m53268f(cosmosDeps);
            return new CosmosComponentImpl(cosmosDeps);
        }

        private Factory() {
        }
    }

    private DaggerCosmosComponent() {
    }

    public static CosmosComponent.Factory factory() {
        return new Factory(0);
    }
}
