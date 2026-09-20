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
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/ChatChannelEvent_SendMessageEventJsonAdapter;", "Lp/hk60;", "Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/ChatChannelEvent$SendMessageEvent;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ChatChannelEvent_SendMessageEventJsonAdapter extends hk60<ChatChannelEvent$SendMessageEvent> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f5161a = xl60.C2578b.m91389a("common", "sendMessage");

    /* JADX INFO: renamed from: b */
    public final hk60 f5162b;

    /* JADX INFO: renamed from: c */
    public final hk60 f5163c;

    public ChatChannelEvent_SendMessageEventJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f5162b = p0i0Var.m68706f(CommonEventFields.class, gbuVar, "common");
        this.f5163c = p0i0Var.m68706f(SendMessage.class, gbuVar, "sendMessage");
    }

    @Override // p204p.hk60
    public final ChatChannelEvent$SendMessageEvent fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        CommonEventFields commonEventFields = null;
        SendMessage sendMessage = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f5161a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                commonEventFields = (CommonEventFields) this.f5162b.fromJson(xl60Var);
                if (commonEventFields == null) {
                    throw f0b1.m40470x("common", "common", xl60Var);
                }
            } else if (iMo51071K == 1 && (sendMessage = (SendMessage) this.f5163c.fromJson(xl60Var)) == null) {
                throw f0b1.m40470x("sendMessage", "sendMessage", xl60Var);
            }
        }
        xl60Var.mo51078f();
        if (commonEventFields == null) {
            throw f0b1.m40461o("common", "common", xl60Var);
        }
        if (sendMessage != null) {
            return new ChatChannelEvent$SendMessageEvent(commonEventFields, sendMessage);
        }
        throw f0b1.m40461o("sendMessage", "sendMessage", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, ChatChannelEvent$SendMessageEvent chatChannelEvent$SendMessageEvent) {
        ChatChannelEvent$SendMessageEvent chatChannelEvent$SendMessageEvent2 = chatChannelEvent$SendMessageEvent;
        if (chatChannelEvent$SendMessageEvent2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("common");
        this.f5162b.toJson(rm60Var, chatChannelEvent$SendMessageEvent2.f5154a);
        rm60Var.mo56894s("sendMessage");
        this.f5163c.toJson(rm60Var, chatChannelEvent$SendMessageEvent2.f5155b);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(55, "GeneratedJsonAdapter(ChatChannelEvent.SendMessageEvent)");
    }
}
