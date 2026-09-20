package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import p204p.C2042k7;
import p204p.bm51;
import p204p.gk60;
import p204p.ok60;
import p204p.qi60;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0010\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\n\u0010\u0011¨\u0006\u0014"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/JoinOption;", "", "", "rawPlaybackControl", "Lcom/spotify/jam/internal/socialconnect/models/HostApproval;", "hostApproval", "<init>", "(Ljava/lang/String;Lcom/spotify/jam/internal/socialconnect/models/HostApproval;)V", "copy", "(Ljava/lang/String;Lcom/spotify/jam/internal/socialconnect/models/HostApproval;)Lcom/spotify/jam/internal/socialconnect/models/JoinOption;", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getRawPlaybackControl$annotations", "()V", "Lcom/spotify/jam/internal/socialconnect/models/HostApproval;", "()Lcom/spotify/jam/internal/socialconnect/models/HostApproval;", "getHostApproval$annotations", "p/qi60", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class JoinOption {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String rawPlaybackControl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final HostApproval hostApproval;

    /* JADX INFO: renamed from: c */
    public final qi60 f4773c;

    public JoinOption(@gk60(name = "playback_control") String str, @gk60(name = "host_approval") HostApproval hostApproval) {
        Object next;
        this.rawPlaybackControl = str;
        this.hostApproval = hostApproval;
        C2042k7 c2042k7 = new C2042k7(qi60.f188947e, 0);
        do {
            if (!c2042k7.hasNext()) {
                next = null;
                break;
            }
            next = c2042k7.next();
        } while (!bm51.m29797h0(((qi60) next).name(), str, true));
        qi60 qi60Var = (qi60) next;
        this.f4773c = qi60Var == null ? qi60.f188943a : qi60Var;
    }

    @gk60(name = "host_approval")
    public static /* synthetic */ void getHostApproval$annotations() {
    }

    @gk60(name = "playback_control")
    public static /* synthetic */ void getRawPlaybackControl$annotations() {
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final HostApproval getHostApproval() {
        return this.hostApproval;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRawPlaybackControl() {
        return this.rawPlaybackControl;
    }

    public final JoinOption copy(@gk60(name = "playback_control") String rawPlaybackControl, @gk60(name = "host_approval") HostApproval hostApproval) {
        return new JoinOption(rawPlaybackControl, hostApproval);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinOption)) {
            return false;
        }
        JoinOption joinOption = (JoinOption) obj;
        return wj50.m88271j(this.rawPlaybackControl, joinOption.rawPlaybackControl) && wj50.m88271j(this.hostApproval, joinOption.hostApproval);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.hostApproval.required) + (this.rawPlaybackControl.hashCode() * 31);
    }
}
