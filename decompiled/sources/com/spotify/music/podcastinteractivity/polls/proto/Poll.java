package com.spotify.music.podcastinteractivity.polls.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.b8q0;
import p204p.c8q0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z6q0;

/* JADX INFO: loaded from: classes8.dex */
public final class Poll extends AbstractC0269h implements sre0 {
    public static final int CLOSING_DATE_FIELD_NUMBER = 3;
    private static final Poll DEFAULT_INSTANCE;
    public static final int ENTITY_TIMESTAMP_MS_FIELD_NUMBER = 4;
    public static final int ENTITY_URI_FIELD_NUMBER = 5;
    public static final int EPISODE_METADATA_FIELD_NUMBER = 15;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 6;
    public static final int OPENING_DATE_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int POLL_URI_FIELD_NUMBER = 12;
    public static final int QUESTION_FIELD_NUMBER = 7;
    public static final int REPORTING_LINK_FIELD_NUMBER = 11;
    public static final int STATUS_FIELD_NUMBER = 10;
    public static final int TYPE_FIELD_NUMBER = 8;
    private int bitField0_;
    private int entityTimestampMs_;
    private EpisodeMetadata episodeMetadata_;
    private int id_;
    private int status_;
    private int type_;
    private String openingDate_ = "";
    private String closingDate_ = "";
    private String entityUri_ = "";
    private String name_ = "";
    private String question_ = "";
    private ae50 options_ = AbstractC0269h.emptyProtobufList();
    private String reportingLink_ = "";
    private String pollUri_ = "";

    static {
        Poll poll = new Poll();
        DEFAULT_INSTANCE = poll;
        AbstractC0269h.registerDefaultInstance(Poll.class, poll);
    }

    private Poll() {
    }

    /* JADX INFO: renamed from: n */
    public static void m15734n(Poll poll, EpisodeMetadata episodeMetadata) {
        poll.getClass();
        episodeMetadata.getClass();
        poll.episodeMetadata_ = episodeMetadata;
        poll.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static Poll m15735p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: z */
    public static z6q0 m15736z(Poll poll) {
        return (z6q0) DEFAULT_INSTANCE.createBuilder(poll);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\u000f\r\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\f\t\u001b\n\f\u000bȈ\fȈ\u000fဉ\u0000", new Object[]{"bitField0_", "id_", "openingDate_", "closingDate_", "entityTimestampMs_", "entityUri_", "name_", "question_", "type_", "options_", PollOption.class, "status_", "reportingLink_", "pollUri_", "episodeMetadata_"});
        }
        if (iOrdinal == 3) {
            return new Poll();
        }
        if (iOrdinal == 4) {
            return new z6q0(DEFAULT_INSTANCE);
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
        synchronized (Poll.class) {
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

    /* JADX INFO: renamed from: o */
    public final String m15737o() {
        return this.closingDate_;
    }

    /* JADX INFO: renamed from: q */
    public final String m15738q() {
        return this.entityUri_;
    }

    /* JADX INFO: renamed from: r */
    public final EpisodeMetadata m15739r() {
        EpisodeMetadata episodeMetadata = this.episodeMetadata_;
        return episodeMetadata == null ? EpisodeMetadata.m15730n() : episodeMetadata;
    }

    /* JADX INFO: renamed from: s */
    public final int m15740s() {
        return this.id_;
    }

    /* JADX INFO: renamed from: t */
    public final ae50 m15741t() {
        return this.options_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m15742u() {
        return this.pollUri_;
    }

    /* JADX INFO: renamed from: v */
    public final String m15743v() {
        return this.question_;
    }

    /* JADX INFO: renamed from: w */
    public final b8q0 m15744w() {
        b8q0 b8q0Var;
        int i = this.status_;
        if (i == 0) {
            b8q0Var = b8q0.DRAFT;
        } else if (i == 1) {
            b8q0Var = b8q0.SCHEDULED;
        } else if (i == 2) {
            b8q0Var = b8q0.LIVE;
        } else if (i != 3) {
            b8q0Var = i != 4 ? null : b8q0.BLOCKED;
        } else {
            b8q0Var = b8q0.CLOSED;
        }
        return b8q0Var == null ? b8q0.UNRECOGNIZED : b8q0Var;
    }

    /* JADX INFO: renamed from: x */
    public final c8q0 m15745x() {
        c8q0 c8q0Var;
        int i = this.type_;
        if (i != 0) {
            c8q0Var = i != 1 ? null : c8q0.SINGLE_CHOICE;
        } else {
            c8q0Var = c8q0.MULTIPLE_CHOICE;
        }
        return c8q0Var == null ? c8q0.UNRECOGNIZED : c8q0Var;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m15746y() {
        return (this.bitField0_ & 1) != 0;
    }
}
