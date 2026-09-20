package spotify.spotbot.p212v2.promptable_playlist;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xos0;
import p204p.yos0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Promptableplaylist$RefreshPromptablePlaylistRequest extends AbstractC0269h implements sre0 {
    private static final Promptableplaylist$RefreshPromptablePlaylistRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REFRESH_TYPE_FIELD_NUMBER = 3;
    public static final int SPOTBOT_URI_FIELD_NUMBER = 1;
    private int refreshType_;
    private String spotbotUri_ = "";

    static {
        Promptableplaylist$RefreshPromptablePlaylistRequest promptableplaylist$RefreshPromptablePlaylistRequest = new Promptableplaylist$RefreshPromptablePlaylistRequest();
        DEFAULT_INSTANCE = promptableplaylist$RefreshPromptablePlaylistRequest;
        AbstractC0269h.registerDefaultInstance(Promptableplaylist$RefreshPromptablePlaylistRequest.class, promptableplaylist$RefreshPromptablePlaylistRequest);
    }

    private Promptableplaylist$RefreshPromptablePlaylistRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m98040n(Promptableplaylist$RefreshPromptablePlaylistRequest promptableplaylist$RefreshPromptablePlaylistRequest, yos0 yos0Var) {
        promptableplaylist$RefreshPromptablePlaylistRequest.getClass();
        promptableplaylist$RefreshPromptablePlaylistRequest.refreshType_ = yos0Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m98041o(Promptableplaylist$RefreshPromptablePlaylistRequest promptableplaylist$RefreshPromptablePlaylistRequest, String str) {
        promptableplaylist$RefreshPromptablePlaylistRequest.getClass();
        str.getClass();
        promptableplaylist$RefreshPromptablePlaylistRequest.spotbotUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static xos0 m98042p() {
        return (xos0) DEFAULT_INSTANCE.createBuilder();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001Ȉ\u0003\f", new Object[]{"spotbotUri_", "refreshType_"});
        }
        if (iOrdinal == 3) {
            return new Promptableplaylist$RefreshPromptablePlaylistRequest();
        }
        if (iOrdinal == 4) {
            return new xos0(DEFAULT_INSTANCE);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (Promptableplaylist$RefreshPromptablePlaylistRequest.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
