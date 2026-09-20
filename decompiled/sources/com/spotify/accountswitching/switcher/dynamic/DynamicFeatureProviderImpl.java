package com.spotify.accountswitching.switcher.dynamic;

import kotlin.Metadata;
import p204p.C2025jr;
import p204p.InterfaceC1823eq;
import p204p.InterfaceC1988iq;
import p204p.InterfaceC2024jq;
import p204p.InterfaceC2186nq;
import p204p.InterfaceC2265pq;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m24212d2 = {"Lcom/spotify/accountswitching/switcher/dynamic/DynamicFeatureProviderImpl;", "Lp/pq;", "Lp/nq;", "accountSwitcherDependencies", "<init>", "(Lp/nq;)V", "Lp/jq;", "accountSwitcherCredentialManager", "()Lp/jq;", "Lp/eq;", "accountSwitcher", "()Lp/eq;", "Lp/iq;", "accountSwitcherComponent", "Lp/iq;", "src_main_java_com_spotify_accountswitching_switcher_dynamic-dynamic"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class DynamicFeatureProviderImpl implements InterfaceC2265pq {
    private final InterfaceC1988iq accountSwitcherComponent;

    public DynamicFeatureProviderImpl(InterfaceC2186nq interfaceC2186nq) {
        this.accountSwitcherComponent = new C2025jr(interfaceC2186nq);
    }

    @Override // p204p.InterfaceC2265pq
    public InterfaceC1823eq accountSwitcher() {
        return ((C2025jr) this.accountSwitcherComponent).m54127a();
    }

    @Override // p204p.InterfaceC2265pq
    public InterfaceC2024jq accountSwitcherCredentialManager() {
        return ((C2025jr) this.accountSwitcherComponent).m54128b();
    }
}
