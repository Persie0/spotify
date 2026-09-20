package com.spotify.liveroom.listeningpartymessagesourceapi.api;

import kotlin.Metadata;
import p204p.ok60;
import p204p.tb80;
import p204p.wj50;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"com/spotify/liveroom/listeningpartymessagesourceapi/api/LifecycleChannelEvent$ArchivePartyEvent", "Lp/tb80;", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class LifecycleChannelEvent$ArchivePartyEvent implements tb80 {

    /* JADX INFO: renamed from: a */
    public final CommonEventFields f5191a;

    /* JADX INFO: renamed from: b */
    public final ArchivePartyMessage f5192b;

    public LifecycleChannelEvent$ArchivePartyEvent(CommonEventFields commonEventFields, ArchivePartyMessage archivePartyMessage) {
        this.f5191a = commonEventFields;
        this.f5192b = archivePartyMessage;
    }

    @Override // p204p.tb80
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CommonEventFields getF5191a() {
        return this.f5191a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LifecycleChannelEvent$ArchivePartyEvent)) {
            return false;
        }
        LifecycleChannelEvent$ArchivePartyEvent lifecycleChannelEvent$ArchivePartyEvent = (LifecycleChannelEvent$ArchivePartyEvent) obj;
        return wj50.m88271j(this.f5191a, lifecycleChannelEvent$ArchivePartyEvent.f5191a) && wj50.m88271j(this.f5192b, lifecycleChannelEvent$ArchivePartyEvent.f5192b);
    }

    public final int hashCode() {
        return this.f5192b.hashCode() + (this.f5191a.hashCode() * 31);
    }
}
