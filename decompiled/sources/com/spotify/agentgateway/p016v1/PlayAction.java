package com.spotify.agentgateway.p016v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.hnn0;
import p204p.ore0;
import p204p.ov11;
import p204p.pre0;
import p204p.q891;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class PlayAction extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_URI_FIELD_NUMBER = 3;
    private static final PlayAction DEFAULT_INSTANCE;
    public static final int FIRST_TRACK_URIS_FIELD_NUMBER = 5;
    public static final int OFFSET_MS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SHUFFLE_MODE_FIELD_NUMBER = 6;
    public static final int TRANSITION_MODE_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private long offsetMs_;
    private int shuffleMode_;
    private int transitionMode_;
    private String uri_ = "";
    private String contextUri_ = "";
    private ae50 firstTrackUris_ = AbstractC0269h.emptyProtobufList();

    static {
        PlayAction playAction = new PlayAction();
        DEFAULT_INSTANCE = playAction;
        AbstractC0269h.registerDefaultInstance(PlayAction.class, playAction);
    }

    private PlayAction() {
    }

    /* JADX INFO: renamed from: o */
    public static PlayAction m2949o() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002ဂ\u0000\u0003ለ\u0001\u0004ဌ\u0002\u0005Ț\u0006ဌ\u0003", new Object[]{"bitField0_", "uri_", "offsetMs_", "contextUri_", "transitionMode_", "firstTrackUris_", "shuffleMode_"});
        }
        if (iOrdinal == 3) {
            return new PlayAction();
        }
        if (iOrdinal == 4) {
            return new hnn0(DEFAULT_INSTANCE, 24);
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
        synchronized (PlayAction.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final String m2950n() {
        return this.contextUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m2951p() {
        return this.firstTrackUris_;
    }

    /* JADX INFO: renamed from: q */
    public final long m2952q() {
        return this.offsetMs_;
    }

    /* JADX INFO: renamed from: r */
    public final ov11 m2953r() {
        ov11 ov11Var;
        int i = this.shuffleMode_;
        if (i == 0) {
            ov11Var = ov11.SHUFFLE_MODE_UNSPECIFIED;
        } else if (i != 1) {
            ov11Var = i != 2 ? null : ov11.SHUFFLE_MODE_OFF;
        } else {
            ov11Var = ov11.SHUFFLE_MODE_ON;
        }
        return ov11Var == null ? ov11.UNRECOGNIZED : ov11Var;
    }

    /* JADX INFO: renamed from: s */
    public final q891 m2954s() {
        q891 q891Var;
        int i = this.transitionMode_;
        if (i == 0) {
            q891Var = q891.TRANSITION_MODE_UNSPECIFIED;
        } else if (i != 1) {
            q891Var = i != 2 ? null : q891.TRANSITION_MODE_SEAMLESS;
        } else {
            q891Var = q891.TRANSITION_MODE_INSTANT;
        }
        return q891Var == null ? q891.UNRECOGNIZED : q891Var;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m2955t() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m2956u() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m2957v() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m2958w() {
        return (this.bitField0_ & 4) != 0;
    }
}
