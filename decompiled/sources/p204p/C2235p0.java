package p204p;

import com.spotify.liveroom.listeningpartymessagesourceapi.api.BatchedChatChannelEvent;
import com.spotify.liveroom.listeningpartymessagesourceapi.api.ChatChannelEvent$DeleteMessageEvent;
import com.spotify.liveroom.listeningpartymessagesourceapi.api.ChatChannelEvent$SendMessageEvent;
import com.spotify.liveroom.listeningpartymessagesourceapi.api.ChatChannelEvent$UnpinMessageEvent;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: p.p0 */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C2235p0 extends ri00 implements gh00 {

    /* JADX INFO: renamed from: h */
    public static final C2235p0 f172419h = new C2235p0(1, AbstractC2555x0.class, "toChatMessageData", "toChatMessageData(Lcom/spotify/liveroom/listeningpartymessagesourceimpl/AblyMessage;)Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/BatchedChatChannelEvent;", 1);

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        ezc ezcVar;
        C2478v0 c2478v0 = (C2478v0) obj;
        p0i0 p0i0Var = AbstractC2555x0.f256714a;
        String str = c2478v0.f235863b;
        String str2 = c2478v0.f235862a;
        int i = 0;
        for (int i2 : edb.m38551G(4)) {
            if (AbstractC1650a0.m24304a(i2).equalsIgnoreCase(str2)) {
                i = i2;
                break;
            }
        }
        if (i == 0) {
            return null;
        }
        if (i == 1) {
            return (BatchedChatChannelEvent) p0i0Var.m68703c(BatchedChatChannelEvent.class).lenient().fromJson(str);
        }
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 1) {
            ezcVar = (ezc) p0i0Var.m68703c(ChatChannelEvent$SendMessageEvent.class).lenient().fromJson(str);
        } else if (iM38547C == 2) {
            ezcVar = (ezc) p0i0Var.m68703c(ChatChannelEvent$DeleteMessageEvent.class).lenient().fromJson(str);
        } else {
            if (iM38547C != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ezcVar = (ezc) p0i0Var.m68703c(ChatChannelEvent$UnpinMessageEvent.class).lenient().fromJson(str);
        }
        if (ezcVar != null) {
            return new BatchedChatChannelEvent(ezcVar.getF5154a(), Collections.singletonList(ezcVar));
        }
        return null;
    }
}
