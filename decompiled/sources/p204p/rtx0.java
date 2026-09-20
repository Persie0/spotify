package p204p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import spotify.party.orchestra.p209v1.Rsvp$GetRsvpStatusRequest;
import spotify.party.orchestra.p209v1.Rsvp$GetRsvpStatusResponse;
import spotify.party.orchestra.p209v1.Rsvp$RsvpFreeRequest;
import spotify.party.orchestra.p209v1.Rsvp$RsvpFreeResponse;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m24212d2 = {"Lp/rtx0;", "", "Lspotify/party/orchestra/v1/Rsvp$RsvpFreeRequest;", "request", "Lio/reactivex/rxjava3/core/Single;", "Lspotify/party/orchestra/v1/Rsvp$RsvpFreeResponse;", "a", "(Lspotify/party/orchestra/v1/Rsvp$RsvpFreeRequest;)Lio/reactivex/rxjava3/core/Single;", "Lspotify/party/orchestra/v1/Rsvp$GetRsvpStatusRequest;", "Lspotify/party/orchestra/v1/Rsvp$GetRsvpStatusResponse;", "b", "(Lspotify/party/orchestra/v1/Rsvp$GetRsvpStatusRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_liveroom_livestreampagefragment-livestreampagefragment"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface rtx0 {
    @j3m0("party-orchestra/spotify.party.orchestra.v1.PartyService/RegisterFreeRsvp")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Single<Rsvp$RsvpFreeResponse> m76406a(@h4a Rsvp$RsvpFreeRequest request);

    @j3m0("party-orchestra/spotify.party.orchestra.v1.PartyService/GetRsvpStatus")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Single<Rsvp$GetRsvpStatusResponse> m76407b(@h4a Rsvp$GetRsvpStatusRequest request);
}
