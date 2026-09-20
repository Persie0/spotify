package com.spotify.liveroom.listeningpartymessagesourceapi.api;

import java.util.List;
import kotlin.Metadata;
import p204p.ezc;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/BatchedChatChannelEventJsonAdapter;", "Lp/hk60;", "Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/BatchedChatChannelEvent;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class BatchedChatChannelEventJsonAdapter extends hk60<BatchedChatChannelEvent> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f5149a = xl60.C2578b.m91389a("common", "events");

    /* JADX INFO: renamed from: b */
    public final hk60 f5150b;

    /* JADX INFO: renamed from: c */
    public final hk60 f5151c;

    public BatchedChatChannelEventJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f5150b = p0i0Var.m68706f(CommonEventFields.class, gbuVar, "common");
        this.f5151c = p0i0Var.m68706f(mp91.m62457j(List.class, ezc.class), gbuVar, "events");
    }

    @Override // p204p.hk60
    public final BatchedChatChannelEvent fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        CommonEventFields commonEventFields = null;
        List list = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f5149a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                commonEventFields = (CommonEventFields) this.f5150b.fromJson(xl60Var);
                if (commonEventFields == null) {
                    throw f0b1.m40470x("common", "common", xl60Var);
                }
            } else if (iMo51071K == 1 && (list = (List) this.f5151c.fromJson(xl60Var)) == null) {
                throw f0b1.m40470x("events", "events", xl60Var);
            }
        }
        xl60Var.mo51078f();
        if (commonEventFields == null) {
            throw f0b1.m40461o("common", "common", xl60Var);
        }
        if (list != null) {
            return new BatchedChatChannelEvent(commonEventFields, list);
        }
        throw f0b1.m40461o("events", "events", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, BatchedChatChannelEvent batchedChatChannelEvent) {
        BatchedChatChannelEvent batchedChatChannelEvent2 = batchedChatChannelEvent;
        if (batchedChatChannelEvent2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("common");
        this.f5150b.toJson(rm60Var, batchedChatChannelEvent2.f5147a);
        rm60Var.mo56894s("events");
        this.f5151c.toJson(rm60Var, batchedChatChannelEvent2.f5148b);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(45, "GeneratedJsonAdapter(BatchedChatChannelEvent)");
    }
}
