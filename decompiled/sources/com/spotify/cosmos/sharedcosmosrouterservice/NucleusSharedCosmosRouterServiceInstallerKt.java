package com.spotify.cosmos.sharedcosmosrouterservice;

import kotlin.Metadata;
import p204p.b9k;
import p204p.eh00;
import p204p.fwz0;
import p204p.qe70;
import p204p.v050;
import p204p.xtk;
import p204p.z8k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m24212d2 = {"Lp/z8k;", "contextRuntime", "Lkotlin/Function0;", "Lp/xtk;", "coreThreadingApi", "Lp/v050;", "Lcom/spotify/cosmos/sharedcosmosrouterapi/SharedCosmosRouterApi;", "installSharedCosmosRouterService", "(Lp/z8k;Lp/eh00;)Lp/v050;", "src_main_java_com_spotify_cosmos_sharedcosmosrouterservice-sharedcosmosrouterservice"}, m24213k = 2, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NucleusSharedCosmosRouterServiceInstallerKt {

    /* JADX INFO: renamed from: com.spotify.cosmos.sharedcosmosrouterservice.NucleusSharedCosmosRouterServiceInstallerKt$installSharedCosmosRouterService$1 */
    @Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m24212d2 = {"Lp/fwz0;", "Lcom/spotify/cosmos/sharedcosmosrouterapi/SharedCosmosRouterApi;", "invoke", "()Lp/fwz0;", "<anonymous>"}, m24213k = 3, m24214mv = {2, 3, 0})
    public static final class C06201 extends qe70 implements eh00 {
        final /* synthetic */ eh00 $coreThreadingApi;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06201(eh00 eh00Var) {
            super(0);
            this.$coreThreadingApi = eh00Var;
        }

        @Override // p204p.eh00
        public final fwz0 invoke() {
            return SharedCosmosRouterServiceKt.createSharedCosmosRouterService(new SharedCosmosRouterServiceDependencies((xtk) this.$coreThreadingApi.invoke()));
        }
    }

    public static final v050 installSharedCosmosRouterService(z8k z8kVar, eh00 eh00Var) {
        return ((b9k) z8kVar).m28490h("SharedCosmosRouterService", new C06201(eh00Var));
    }
}
