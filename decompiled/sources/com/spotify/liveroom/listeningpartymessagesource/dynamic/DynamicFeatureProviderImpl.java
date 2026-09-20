package com.spotify.liveroom.listeningpartymessagesource.dynamic;

import kotlin.Metadata;
import p204p.C1880g0;
import p204p.InterfaceC1917h0;
import p204p.m6n0;
import p204p.n6n0;
import p204p.o6n0;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m24212d2 = {"Lcom/spotify/liveroom/listeningpartymessagesource/dynamic/DynamicFeatureProviderImpl;", "Lp/o6n0;", "Lp/n6n0;", "dependencies", "<init>", "(Lp/n6n0;)V", "Lp/m6n0;", "partyMessageSource", "()Lp/m6n0;", "Lp/h0;", "messageSourceComponent", "Lp/h0;", "src_main_java_com_spotify_liveroom_listeningpartymessagesource_dynamic-dynamic"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class DynamicFeatureProviderImpl implements o6n0 {
    private final InterfaceC1917h0 messageSourceComponent;

    public DynamicFeatureProviderImpl(n6n0 n6n0Var) {
        this.messageSourceComponent = new C1880g0(n6n0Var);
    }

    @Override // p204p.o6n0
    public m6n0 partyMessageSource() {
        return ((C1880g0) this.messageSourceComponent).m43249b();
    }
}
