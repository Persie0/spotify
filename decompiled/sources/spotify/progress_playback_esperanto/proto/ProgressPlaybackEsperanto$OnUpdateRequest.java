package spotify.progress_playback_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import p204p.o6s0;
import p204p.ore0;
import p204p.p6s0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ProgressPlaybackEsperanto$OnUpdateRequest extends AbstractC0269h implements sre0 {
    private static final ProgressPlaybackEsperanto$OnUpdateRequest DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 3;
    public static final int ITEM_URI_FIELD_NUMBER = 1;
    public static final int PAGE_IDENTIFIER_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 5;
    public static final int PLAYED_UNTIL_COMPLETION_FIELD_NUMBER = 4;
    public static final int POSITION_FIELD_NUMBER = 2;
    public static final int REASON_FIELD_NUMBER = 8;
    public static final int USE_CASE_IDENTIFIER_FIELD_NUMBER = 7;
    private int bitField0_;
    private Duration duration_;
    private boolean playedUntilCompletion_;
    private Duration position_;
    private int reason_;
    private String itemUri_ = "";
    private String playbackId_ = "";
    private String pageIdentifier_ = "";
    private String useCaseIdentifier_ = "";

    static {
        ProgressPlaybackEsperanto$OnUpdateRequest progressPlaybackEsperanto$OnUpdateRequest = new ProgressPlaybackEsperanto$OnUpdateRequest();
        DEFAULT_INSTANCE = progressPlaybackEsperanto$OnUpdateRequest;
        AbstractC0269h.registerDefaultInstance(ProgressPlaybackEsperanto$OnUpdateRequest.class, progressPlaybackEsperanto$OnUpdateRequest);
    }

    private ProgressPlaybackEsperanto$OnUpdateRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97827n(ProgressPlaybackEsperanto$OnUpdateRequest progressPlaybackEsperanto$OnUpdateRequest, Duration duration) {
        progressPlaybackEsperanto$OnUpdateRequest.getClass();
        duration.getClass();
        progressPlaybackEsperanto$OnUpdateRequest.duration_ = duration;
        progressPlaybackEsperanto$OnUpdateRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m97828o(ProgressPlaybackEsperanto$OnUpdateRequest progressPlaybackEsperanto$OnUpdateRequest, String str) {
        progressPlaybackEsperanto$OnUpdateRequest.getClass();
        str.getClass();
        progressPlaybackEsperanto$OnUpdateRequest.itemUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m97829p(ProgressPlaybackEsperanto$OnUpdateRequest progressPlaybackEsperanto$OnUpdateRequest, String str) {
        progressPlaybackEsperanto$OnUpdateRequest.getClass();
        str.getClass();
        progressPlaybackEsperanto$OnUpdateRequest.pageIdentifier_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m97830q(ProgressPlaybackEsperanto$OnUpdateRequest progressPlaybackEsperanto$OnUpdateRequest, boolean z) {
        progressPlaybackEsperanto$OnUpdateRequest.playedUntilCompletion_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m97831r(ProgressPlaybackEsperanto$OnUpdateRequest progressPlaybackEsperanto$OnUpdateRequest, Duration duration) {
        progressPlaybackEsperanto$OnUpdateRequest.getClass();
        duration.getClass();
        progressPlaybackEsperanto$OnUpdateRequest.position_ = duration;
        progressPlaybackEsperanto$OnUpdateRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: s */
    public static void m97832s(ProgressPlaybackEsperanto$OnUpdateRequest progressPlaybackEsperanto$OnUpdateRequest, p6s0 p6s0Var) {
        progressPlaybackEsperanto$OnUpdateRequest.getClass();
        progressPlaybackEsperanto$OnUpdateRequest.reason_ = p6s0Var.getNumber();
    }

    /* JADX INFO: renamed from: t */
    public static void m97833t(ProgressPlaybackEsperanto$OnUpdateRequest progressPlaybackEsperanto$OnUpdateRequest, String str) {
        progressPlaybackEsperanto$OnUpdateRequest.getClass();
        progressPlaybackEsperanto$OnUpdateRequest.useCaseIdentifier_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static o6s0 m97834u() {
        return (o6s0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u0007\u0005ለ\u0002\u0006Ȉ\u0007Ȉ\b\f", new Object[]{"bitField0_", "itemUri_", "position_", "duration_", "playedUntilCompletion_", "playbackId_", "pageIdentifier_", "useCaseIdentifier_", "reason_"});
        }
        if (iOrdinal == 3) {
            return new ProgressPlaybackEsperanto$OnUpdateRequest();
        }
        if (iOrdinal == 4) {
            return new o6s0(DEFAULT_INSTANCE);
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
        synchronized (ProgressPlaybackEsperanto$OnUpdateRequest.class) {
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
