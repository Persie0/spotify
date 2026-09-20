package spotify.spotbot.p212v2.promptable_playlist;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.ros0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Promptableplaylist$CreatePromptablePlaylistRequest extends AbstractC0269h implements sre0 {
    public static final int BLOCK_GENERATION_IF_LOCATION_SENSITIVE_PROMPT_FIELD_NUMBER = 10;
    public static final int CLONED_FROM_PLAYLIST_URI_FIELD_NUMBER = 6;
    private static final Promptableplaylist$CreatePromptablePlaylistRequest DEFAULT_INSTANCE;
    public static final int IS_PRIVATE_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int QUERY_TEXT_FIELD_NUMBER = 3;
    public static final int REFRESH_METADATA_FIELD_NUMBER = 4;
    public static final int USERNAME_FIELD_NUMBER = 2;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean blockGenerationIfLocationSensitivePrompt_;
    private Object identifier_;
    private boolean isPrivate_;
    private Promptableplaylist$RefreshMetadata refreshMetadata_;
    private int identifierCase_ = 0;
    private String queryText_ = "";
    private String clonedFromPlaylistUri_ = "";

    static {
        Promptableplaylist$CreatePromptablePlaylistRequest promptableplaylist$CreatePromptablePlaylistRequest = new Promptableplaylist$CreatePromptablePlaylistRequest();
        DEFAULT_INSTANCE = promptableplaylist$CreatePromptablePlaylistRequest;
        AbstractC0269h.registerDefaultInstance(Promptableplaylist$CreatePromptablePlaylistRequest.class, promptableplaylist$CreatePromptablePlaylistRequest);
    }

    private Promptableplaylist$CreatePromptablePlaylistRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m98011n(Promptableplaylist$CreatePromptablePlaylistRequest promptableplaylist$CreatePromptablePlaylistRequest, boolean z) {
        promptableplaylist$CreatePromptablePlaylistRequest.blockGenerationIfLocationSensitivePrompt_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m98012o(Promptableplaylist$CreatePromptablePlaylistRequest promptableplaylist$CreatePromptablePlaylistRequest, String str) {
        promptableplaylist$CreatePromptablePlaylistRequest.getClass();
        str.getClass();
        promptableplaylist$CreatePromptablePlaylistRequest.clonedFromPlaylistUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m98013p(Promptableplaylist$CreatePromptablePlaylistRequest promptableplaylist$CreatePromptablePlaylistRequest, boolean z) {
        promptableplaylist$CreatePromptablePlaylistRequest.isPrivate_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m98014q(Promptableplaylist$CreatePromptablePlaylistRequest promptableplaylist$CreatePromptablePlaylistRequest, String str) {
        promptableplaylist$CreatePromptablePlaylistRequest.getClass();
        str.getClass();
        promptableplaylist$CreatePromptablePlaylistRequest.queryText_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m98015r(Promptableplaylist$CreatePromptablePlaylistRequest promptableplaylist$CreatePromptablePlaylistRequest, Promptableplaylist$RefreshMetadata promptableplaylist$RefreshMetadata) {
        promptableplaylist$CreatePromptablePlaylistRequest.getClass();
        promptableplaylist$RefreshMetadata.getClass();
        promptableplaylist$CreatePromptablePlaylistRequest.refreshMetadata_ = promptableplaylist$RefreshMetadata;
        promptableplaylist$CreatePromptablePlaylistRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: s */
    public static void m98016s(Promptableplaylist$CreatePromptablePlaylistRequest promptableplaylist$CreatePromptablePlaylistRequest, String str) {
        promptableplaylist$CreatePromptablePlaylistRequest.getClass();
        str.getClass();
        promptableplaylist$CreatePromptablePlaylistRequest.identifierCase_ = 2;
        promptableplaylist$CreatePromptablePlaylistRequest.identifier_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static ros0 m98017t() {
        return (ros0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\n\u0007\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003Ȉ\u0004ဉ\u0000\u0005\u0007\u0006Ȉ\n\u0007", new Object[]{"identifier_", "identifierCase_", "bitField0_", "queryText_", "refreshMetadata_", "isPrivate_", "clonedFromPlaylistUri_", "blockGenerationIfLocationSensitivePrompt_"});
        }
        if (iOrdinal == 3) {
            return new Promptableplaylist$CreatePromptablePlaylistRequest();
        }
        if (iOrdinal == 4) {
            return new ros0(DEFAULT_INSTANCE);
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
        synchronized (Promptableplaylist$CreatePromptablePlaylistRequest.class) {
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
