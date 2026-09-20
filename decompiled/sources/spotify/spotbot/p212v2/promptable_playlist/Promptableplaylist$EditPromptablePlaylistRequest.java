package spotify.spotbot.p212v2.promptable_playlist;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sos0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Promptableplaylist$EditPromptablePlaylistRequest extends AbstractC0269h implements sre0 {
    public static final int ATTRIBUTES_TO_UPDATE_FIELD_NUMBER = 2;
    public static final int BLOCK_GENERATION_IF_LOCATION_SENSITIVE_PROMPT_FIELD_NUMBER = 3;
    private static final Promptableplaylist$EditPromptablePlaylistRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SPOTBOT_URI_FIELD_NUMBER = 1;
    private boolean blockGenerationIfLocationSensitivePrompt_;
    private String spotbotUri_ = "";
    private ae50 attributesToUpdate_ = AbstractC0269h.emptyProtobufList();

    static {
        Promptableplaylist$EditPromptablePlaylistRequest promptableplaylist$EditPromptablePlaylistRequest = new Promptableplaylist$EditPromptablePlaylistRequest();
        DEFAULT_INSTANCE = promptableplaylist$EditPromptablePlaylistRequest;
        AbstractC0269h.registerDefaultInstance(Promptableplaylist$EditPromptablePlaylistRequest.class, promptableplaylist$EditPromptablePlaylistRequest);
    }

    private Promptableplaylist$EditPromptablePlaylistRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m98021n(Promptableplaylist$EditPromptablePlaylistRequest promptableplaylist$EditPromptablePlaylistRequest, Promptableplaylist$AttributeUpdate promptableplaylist$AttributeUpdate) {
        promptableplaylist$EditPromptablePlaylistRequest.getClass();
        promptableplaylist$AttributeUpdate.getClass();
        ae50 ae50Var = promptableplaylist$EditPromptablePlaylistRequest.attributesToUpdate_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            promptableplaylist$EditPromptablePlaylistRequest.attributesToUpdate_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        promptableplaylist$EditPromptablePlaylistRequest.attributesToUpdate_.add(promptableplaylist$AttributeUpdate);
    }

    /* JADX INFO: renamed from: o */
    public static void m98022o(Promptableplaylist$EditPromptablePlaylistRequest promptableplaylist$EditPromptablePlaylistRequest, boolean z) {
        promptableplaylist$EditPromptablePlaylistRequest.blockGenerationIfLocationSensitivePrompt_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m98023p(Promptableplaylist$EditPromptablePlaylistRequest promptableplaylist$EditPromptablePlaylistRequest, String str) {
        promptableplaylist$EditPromptablePlaylistRequest.getClass();
        str.getClass();
        promptableplaylist$EditPromptablePlaylistRequest.spotbotUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static sos0 m98024q() {
        return (sos0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\u0007", new Object[]{"spotbotUri_", "attributesToUpdate_", Promptableplaylist$AttributeUpdate.class, "blockGenerationIfLocationSensitivePrompt_"});
        }
        if (iOrdinal == 3) {
            return new Promptableplaylist$EditPromptablePlaylistRequest();
        }
        if (iOrdinal == 4) {
            return new sos0(DEFAULT_INSTANCE);
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
        synchronized (Promptableplaylist$EditPromptablePlaylistRequest.class) {
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
