package com.spotify.cosmos.sharedcosmosrouterservice;

import p204p.jg31;
import p204p.xtk;

/* JADX INFO: loaded from: classes.dex */
final class DaggerSharedCosmosRouterServiceFactoryComponent {

    public static final class Factory implements SharedCosmosRouterServiceFactoryComponent.Factory {
        public /* synthetic */ Factory(int i) {
            this();
        }

        @Override // com.spotify.cosmos.sharedcosmosrouterservice.SharedCosmosRouterServiceFactoryComponent.Factory
        public SharedCosmosRouterServiceFactoryComponent create(SharedCosmosRouterServiceDependencies sharedCosmosRouterServiceDependencies) {
            jg31.m53268f(sharedCosmosRouterServiceDependencies);
            return new SharedCosmosRouterServiceFactoryComponentImpl(sharedCosmosRouterServiceDependencies);
        }

        private Factory() {
        }
    }

    public static final class SharedCosmosRouterServiceFactoryComponentImpl implements SharedCosmosRouterServiceFactoryComponent {
        private final SharedCosmosRouterServiceDependencies sharedCosmosRouterServiceDependencies;
        private final SharedCosmosRouterServiceFactoryComponentImpl sharedCosmosRouterServiceFactoryComponentImpl = this;

        public SharedCosmosRouterServiceFactoryComponentImpl(SharedCosmosRouterServiceDependencies sharedCosmosRouterServiceDependencies) {
            this.sharedCosmosRouterServiceDependencies = sharedCosmosRouterServiceDependencies;
        }

        @Override // com.spotify.cosmos.sharedcosmosrouterservice.SharedCosmosRouterServiceFactoryComponent
        public SharedCosmosRouterService sharedCosmosRouterService() {
            xtk coreThreadingApi = this.sharedCosmosRouterServiceDependencies.getCoreThreadingApi();
            jg31.m53271i(coreThreadingApi);
            return new SharedCosmosRouterService(coreThreadingApi, RemoteRouterFactoryModule_ProvideRemoteRouterFactoryFactory.provideRemoteRouterFactory());
        }
    }

    private DaggerSharedCosmosRouterServiceFactoryComponent() {
    }

    public static SharedCosmosRouterServiceFactoryComponent.Factory factory() {
        return new Factory(0);
    }
}
