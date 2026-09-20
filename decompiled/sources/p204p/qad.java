package p204p;

import com.spotify.liveroom.listeningpartymessagesourceapi.api.ChatMessage;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class qad {

    /* JADX INFO: renamed from: a */
    public final ChatMessage f186848a;

    /* JADX INFO: renamed from: b */
    public final List f186849b;

    public qad(ChatMessage chatMessage, List list) {
        this.f186848a = chatMessage;
        this.f186849b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qad)) {
            return false;
        }
        qad qadVar = (qad) obj;
        return wj50.m88271j(this.f186848a, qadVar.f186848a) && wj50.m88271j(this.f186849b, qadVar.f186849b);
    }

    public final int hashCode() {
        ChatMessage chatMessage = this.f186848a;
        return this.f186849b.hashCode() + ((chatMessage == null ? 0 : chatMessage.hashCode()) * 31);
    }
}
