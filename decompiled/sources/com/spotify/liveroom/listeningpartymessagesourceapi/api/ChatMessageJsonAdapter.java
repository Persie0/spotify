package com.spotify.liveroom.listeningpartymessagesourceapi.api;

import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/ChatMessageJsonAdapter;", "Lp/hk60;", "Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/ChatMessage;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ChatMessageJsonAdapter extends hk60<ChatMessage> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f5172a = xl60.C2578b.m91389a("messageUuid", "textMessage", "metadata", "senderUser", "sentAt");

    /* JADX INFO: renamed from: b */
    public final hk60 f5173b;

    /* JADX INFO: renamed from: c */
    public final hk60 f5174c;

    /* JADX INFO: renamed from: d */
    public final hk60 f5175d;

    /* JADX INFO: renamed from: e */
    public final hk60 f5176e;

    public ChatMessageJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f5173b = p0i0Var.m68706f(String.class, gbuVar, "messageUuid");
        this.f5174c = p0i0Var.m68706f(TextMessage.class, gbuVar, "textMessage");
        this.f5175d = p0i0Var.m68706f(ChatMetadata.class, gbuVar, "metadata");
        this.f5176e = p0i0Var.m68706f(User.class, gbuVar, "senderUser");
    }

    @Override // p204p.hk60
    public final ChatMessage fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        TextMessage textMessage = null;
        ChatMetadata chatMetadata = null;
        User user = null;
        String str2 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f5172a);
            if (iMo51071K != -1) {
                hk60 hk60Var = this.f5173b;
                if (iMo51071K == 0) {
                    str = (String) hk60Var.fromJson(xl60Var);
                    if (str == null) {
                        throw f0b1.m40470x("messageUuid", "messageUuid", xl60Var);
                    }
                } else if (iMo51071K == 1) {
                    textMessage = (TextMessage) this.f5174c.fromJson(xl60Var);
                } else if (iMo51071K == 2) {
                    chatMetadata = (ChatMetadata) this.f5175d.fromJson(xl60Var);
                    if (chatMetadata == null) {
                        throw f0b1.m40470x("metadata", "metadata", xl60Var);
                    }
                } else if (iMo51071K == 3) {
                    user = (User) this.f5176e.fromJson(xl60Var);
                    if (user == null) {
                        throw f0b1.m40470x("senderUser", "senderUser", xl60Var);
                    }
                } else if (iMo51071K == 4 && (str2 = (String) hk60Var.fromJson(xl60Var)) == null) {
                    throw f0b1.m40470x("sentAt", "sentAt", xl60Var);
                }
            } else {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        if (str == null) {
            throw f0b1.m40461o("messageUuid", "messageUuid", xl60Var);
        }
        if (chatMetadata == null) {
            throw f0b1.m40461o("metadata", "metadata", xl60Var);
        }
        if (user == null) {
            throw f0b1.m40461o("senderUser", "senderUser", xl60Var);
        }
        if (str2 != null) {
            return new ChatMessage(str, textMessage, chatMetadata, user, str2);
        }
        throw f0b1.m40461o("sentAt", "sentAt", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, ChatMessage chatMessage) {
        ChatMessage chatMessage2 = chatMessage;
        if (chatMessage2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("messageUuid");
        String str = chatMessage2.f5167a;
        hk60 hk60Var = this.f5173b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("textMessage");
        this.f5174c.toJson(rm60Var, chatMessage2.f5168b);
        rm60Var.mo56894s("metadata");
        this.f5175d.toJson(rm60Var, chatMessage2.f5169c);
        rm60Var.mo56894s("senderUser");
        this.f5176e.toJson(rm60Var, chatMessage2.f5170d);
        rm60Var.mo56894s("sentAt");
        hk60Var.toJson(rm60Var, chatMessage2.f5171e);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(33, "GeneratedJsonAdapter(ChatMessage)");
    }
}
