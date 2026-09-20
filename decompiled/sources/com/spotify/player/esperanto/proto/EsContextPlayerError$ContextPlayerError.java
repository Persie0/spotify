package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.ihc0;
import p204p.iiw;
import p204p.ljw;
import p204p.mjw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsContextPlayerError$ContextPlayerError extends AbstractC0269h implements sre0 {
    public static final int CODE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 3;
    private static final EsContextPlayerError$ContextPlayerError DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int code_;
    private ihc0 data_ = ihc0.f102235b;
    private String message_ = "";

    static {
        EsContextPlayerError$ContextPlayerError esContextPlayerError$ContextPlayerError = new EsContextPlayerError$ContextPlayerError();
        DEFAULT_INSTANCE = esContextPlayerError$ContextPlayerError;
        AbstractC0269h.registerDefaultInstance(EsContextPlayerError$ContextPlayerError.class, esContextPlayerError$ContextPlayerError);
    }

    private EsContextPlayerError$ContextPlayerError() {
    }

    /* JADX INFO: renamed from: o */
    public static EsContextPlayerError$ContextPlayerError m17682o(byte[] bArr) {
        return (EsContextPlayerError$ContextPlayerError) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\f\u0002Ȉ\u00032", new Object[]{"code_", "message_", "data_", ljw.f134156a});
        }
        if (iOrdinal == 3) {
            return new EsContextPlayerError$ContextPlayerError();
        }
        if (iOrdinal == 4) {
            return new iiw(DEFAULT_INSTANCE, 28);
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
        synchronized (EsContextPlayerError$ContextPlayerError.class) {
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

    public final Map getDataMap() {
        return Collections.unmodifiableMap(this.data_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getMessage() {
        return this.message_;
    }

    /* JADX INFO: renamed from: n */
    public final mjw m17683n() {
        mjw mjwVar;
        switch (this.code_) {
            case 0:
                mjwVar = mjw.SUCCESS;
                break;
            case 1:
                mjwVar = mjw.PLAYBACK_STUCK;
                break;
            case 2:
                mjwVar = mjw.PLAYBACK_ERROR;
                break;
            case 3:
                mjwVar = mjw.LICENSE_CHANGE;
                break;
            case 4:
                mjwVar = mjw.PLAY_RESTRICTED;
                break;
            case 5:
                mjwVar = mjw.STOP_RESTRICTED;
                break;
            case 6:
                mjwVar = mjw.UPDATE_RESTRICTED;
                break;
            case 7:
                mjwVar = mjw.PAUSE_RESTRICTED;
                break;
            case 8:
                mjwVar = mjw.RESUME_RESTRICTED;
                break;
            case 9:
                mjwVar = mjw.SKIP_TO_PREV_RESTRICTED;
                break;
            case 10:
                mjwVar = mjw.SKIP_TO_NEXT_RESTRICTED;
                break;
            case 11:
                mjwVar = mjw.SKIP_TO_NON_EXISTENT_TRACK;
                break;
            case 12:
                mjwVar = mjw.SEEK_TO_RESTRICTED;
                break;
            case 13:
                mjwVar = mjw.TOGGLE_REPEAT_CONTEXT_RESTRICTED;
                break;
            case 14:
                mjwVar = mjw.TOGGLE_REPEAT_TRACK_RESTRICTED;
                break;
            case 15:
                mjwVar = mjw.SET_OPTIONS_RESTRICTED;
                break;
            case 16:
                mjwVar = mjw.TOGGLE_SHUFFLE_RESTRICTED;
                break;
            case 17:
                mjwVar = mjw.SET_QUEUE_RESTRICTED;
                break;
            case 18:
                mjwVar = mjw.INTERRUPT_PLAYBACK_RESTRICTED;
                break;
            case 19:
                mjwVar = mjw.ONE_TRACK_UNPLAYABLE;
                break;
            case 20:
                mjwVar = mjw.ONE_TRACK_UNPLAYABLE_AUTO_STOPPED;
                break;
            case 21:
                mjwVar = mjw.ALL_TRACKS_UNPLAYABLE_AUTO_STOPPED;
                break;
            case 22:
                mjwVar = mjw.SKIP_TO_NON_EXISTENT_TRACK_AUTO_STOPPED;
                break;
            case 23:
                mjwVar = mjw.QUEUE_REVISION_MISMATCH;
                break;
            case 24:
                mjwVar = mjw.VIDEO_PLAYBACK_ERROR;
                break;
            case 25:
                mjwVar = mjw.VIDEO_GEOGRAPHICALLY_RESTRICTED;
                break;
            case 26:
                mjwVar = mjw.VIDEO_UNSUPPORTED_PLATFORM_VERSION;
                break;
            case 27:
                mjwVar = mjw.VIDEO_UNSUPPORTED_CLIENT_VERSION;
                break;
            case 28:
                mjwVar = mjw.VIDEO_UNSUPPORTED_KEY_SYSTEM;
                break;
            case 29:
                mjwVar = mjw.VIDEO_MANIFEST_DELETED;
                break;
            case 30:
                mjwVar = mjw.VIDEO_COUNTRY_RESTRICTED;
                break;
            case 31:
                mjwVar = mjw.VIDEO_UNAVAILABLE;
                break;
            case 32:
                mjwVar = mjw.VIDEO_CATALOGUE_RESTRICTED;
                break;
            case 33:
                mjwVar = mjw.INVALID;
                break;
            case 34:
                mjwVar = mjw.TIMEOUT;
                break;
            case 35:
                mjwVar = mjw.PLAYBACK_REPORTING_ERROR;
                break;
            case 36:
                mjwVar = mjw.UNKNOWN;
                break;
            case 37:
                mjwVar = mjw.ADD_TO_QUEUE_RESTRICTED;
                break;
            case 38:
                mjwVar = mjw.PICK_AND_SHUFFLE_CAPPED;
                break;
            case 39:
                mjwVar = mjw.PICK_AND_SHUFFLE_CONNECT_RESTRICTED;
                break;
            case 40:
                mjwVar = mjw.CONTEXT_LOADING_FAILED;
                break;
            case 41:
                mjwVar = mjw.AUDIOBOOK_NOT_PLAYABLE;
                break;
            case 42:
                mjwVar = mjw.SIGNAL_NOT_AVAILABLE;
                break;
            case 43:
                mjwVar = mjw.SET_SLEEP_TIMER_RESTRICTED;
                break;
            case 44:
                mjwVar = mjw.PLAYBACK_START_SLOW;
                break;
            case 45:
                mjwVar = mjw.PLAYBACK_START_TIMEOUT;
                break;
            case 46:
                mjwVar = mjw.PLAYBACK_STUCK_TIMEOUT;
                break;
            case 47:
                mjwVar = mjw.PLAYBACK_CLIENT_VERSION_IS_SUNSETTED;
                break;
            case 48:
                mjwVar = mjw.PLAYBACK_AUDIO_FORMAT_NEGOTIATION_FAIL;
                break;
            default:
                mjwVar = null;
                break;
        }
        return mjwVar == null ? mjw.UNRECOGNIZED : mjwVar;
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
