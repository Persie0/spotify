package spotify.spotbot.p212v2.promptable_playlist;

import com.google.protobuf.AbstractC0269h;
import p204p.c8s0;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uos0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Promptableplaylist$PromptablePlaylistError extends AbstractC0269h implements sre0 {
    private static final Promptableplaylist$PromptablePlaylistError DEFAULT_INSTANCE;
    public static final int DISPLAY_TEXT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PROMPTABLE_PLAYLIST_ERROR_TYPE_FIELD_NUMBER = 1;
    public static final int RATE_LIMIT_EXCEEDED_ERROR_DETAILS_FIELD_NUMBER = 3;
    private Object details_;
    private int promptablePlaylistErrorType_;
    private int detailsCase_ = 0;
    private String displayText_ = "";

    static {
        Promptableplaylist$PromptablePlaylistError promptableplaylist$PromptablePlaylistError = new Promptableplaylist$PromptablePlaylistError();
        DEFAULT_INSTANCE = promptableplaylist$PromptablePlaylistError;
        AbstractC0269h.registerDefaultInstance(Promptableplaylist$PromptablePlaylistError.class, promptableplaylist$PromptablePlaylistError);
    }

    private Promptableplaylist$PromptablePlaylistError() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static Promptableplaylist$PromptablePlaylistError m98031q(gva gvaVar) {
        return (Promptableplaylist$PromptablePlaylistError) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003<\u0000", new Object[]{"details_", "detailsCase_", "promptablePlaylistErrorType_", "displayText_", Promptableplaylist$RateLimitExceededErrorDetails.class});
        }
        if (iOrdinal == 3) {
            return new Promptableplaylist$PromptablePlaylistError();
        }
        if (iOrdinal == 4) {
            return new c8s0(DEFAULT_INSTANCE, 19);
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
        synchronized (Promptableplaylist$PromptablePlaylistError.class) {
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

    /* JADX INFO: renamed from: n */
    public final String m98032n() {
        return this.displayText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final uos0 m98033o() {
        uos0 uos0Var;
        int i = this.promptablePlaylistErrorType_;
        if (i == 0) {
            uos0Var = uos0.BACKEND_ERROR;
        } else if (i == 1) {
            uos0Var = uos0.PROMPT_VALIDATOR_ERROR;
        } else if (i != 2) {
            uos0Var = i != 3 ? null : uos0.RATE_LIMIT_EXCEEDED_ERROR;
        } else {
            uos0Var = uos0.TERMS_AND_SERVICES_CHECKER_ERROR;
        }
        return uos0Var == null ? uos0.UNRECOGNIZED : uos0Var;
    }

    /* JADX INFO: renamed from: p */
    public final Promptableplaylist$RateLimitExceededErrorDetails m98034p() {
        return this.detailsCase_ == 3 ? (Promptableplaylist$RateLimitExceededErrorDetails) this.details_ : Promptableplaylist$RateLimitExceededErrorDetails.m98035n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
