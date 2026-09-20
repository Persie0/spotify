package com.spotify.accountswitching.switcherimpl;

import kotlin.Metadata;
import p204p.C2025jr;
import p204p.C2136mq;
import p204p.InterfaceC1823eq;
import p204p.InterfaceC1988iq;
import p204p.InterfaceC2024jq;
import p204p.InterfaceC2186nq;
import p204p.InterfaceC2265pq;
import p204p.kgm;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m24212d2 = {"Lcom/spotify/accountswitching/switcherimpl/AccountSwitcherProviderImpl;", "Lp/pq;", "Lp/nq;", "accountSwitcherDependencies", "<init>", "(Lp/nq;)V", "Lp/jq;", "accountSwitcherCredentialManager", "()Lp/jq;", "Lp/eq;", "accountSwitcher", "()Lp/eq;", "Lp/iq;", "accountSwitcherComponent", "Lp/iq;", "Lp/mq;", "daemon", "Lp/mq;", "getDaemon$annotations", "()V", "src_main_java_com_spotify_accountswitching_switcherimpl-switcherimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AccountSwitcherProviderImpl implements InterfaceC2265pq {
    private final InterfaceC1988iq accountSwitcherComponent;
    private final C2136mq daemon;

    public AccountSwitcherProviderImpl(InterfaceC2186nq interfaceC2186nq) {
        C2025jr c2025jrM56366a = kgm.m56366a(interfaceC2186nq);
        this.accountSwitcherComponent = c2025jrM56366a;
        this.daemon = new C2136mq(c2025jrM56366a.m54127a());
    }

    private static /* synthetic */ void getDaemon$annotations() {
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
