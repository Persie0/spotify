package p204p;

import com.spotify.liveroom.listeningpartymessagesourceapi.api.ChatMessage;

/* JADX INFO: loaded from: classes8.dex */
public final class q6n0 {

    /* JADX INFO: renamed from: a */
    public final String f185865a;

    /* JADX INFO: renamed from: b */
    public final Long f185866b;

    /* JADX INFO: renamed from: c */
    public final ChatMessage f185867c;

    public /* synthetic */ q6n0(String str, int i) {
        this((i & 1) != 0 ? null : str, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6n0)) {
            return false;
        }
        q6n0 q6n0Var = (q6n0) obj;
        return wj50.m88271j(this.f185865a, q6n0Var.f185865a) && wj50.m88271j(this.f185866b, q6n0Var.f185866b) && wj50.m88271j(this.f185867c, q6n0Var.f185867c);
    }

    public final int hashCode() {
        String str = this.f185865a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.f185866b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        ChatMessage chatMessage = this.f185867c;
        return iHashCode2 + (chatMessage != null ? chatMessage.hashCode() : 0);
    }

    public q6n0(String str, Long l, ChatMessage chatMessage) {
        this.f185865a = str;
        this.f185866b = l;
        this.f185867c = chatMessage;
    }
}
