package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;
import java.util.List;
import p204p.ae50;
import p204p.m87;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Audiobook extends AbstractC0269h implements sre0 {
    public static final int ACCESS_FIELD_NUMBER = 6;
    public static final int AUTHOR_NAMES_FIELD_NUMBER = 1;
    private static final Audiobook DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 5;
    public static final int DURATION_FIELD_NUMBER = 4;
    public static final int EXPLICIT_FIELD_NUMBER = 3;
    public static final int NARRATOR_NAMES_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int RATING_FIELD_NUMBER = 9;
    public static final int RELEASE_TIME_FIELD_NUMBER = 8;
    public static final int STATE_FIELD_NUMBER = 7;
    public static final int TAGS_FIELD_NUMBER = 10;
    private Access access_;
    private int bitField0_;
    private Duration duration_;
    private boolean explicit_;
    private DoubleValue rating_;
    private Timestamp releaseTime_;
    private int state_;
    private ae50 authorNames_ = AbstractC0269h.emptyProtobufList();
    private ae50 narratorNames_ = AbstractC0269h.emptyProtobufList();
    private String description_ = "";
    private ae50 tags_ = AbstractC0269h.emptyProtobufList();

    public static final class Access extends AbstractC0269h implements sre0 {
        public static final int BOOK_IS_UNLOCKED_BY_USER_FIELD_NUMBER = 2;
        private static final Access DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int SIGNIFIER_TEXT_FIELD_NUMBER = 1;
        private boolean bookIsUnlockedByUser_;
        private String signifierText_ = "";

        static {
            Access access = new Access();
            DEFAULT_INSTANCE = access;
            AbstractC0269h.registerDefaultInstance(Access.class, access);
        }

        private Access() {
        }

        /* JADX INFO: renamed from: o */
        public static Access m20772o() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"signifierText_", "bookIsUnlockedByUser_"});
            }
            if (iOrdinal == 3) {
                return new Access();
            }
            if (iOrdinal == 4) {
                return new C1287a(DEFAULT_INSTANCE);
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
            synchronized (Access.class) {
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
        public final boolean m20773n() {
            return this.bookIsUnlockedByUser_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: p */
        public final String m20774p() {
            return this.signifierText_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        Audiobook audiobook = new Audiobook();
        DEFAULT_INSTANCE = audiobook;
        AbstractC0269h.registerDefaultInstance(Audiobook.class, audiobook);
    }

    private Audiobook() {
    }

    /* JADX INFO: renamed from: p */
    public static Audiobook m20764p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0003\u0000\u0001Ț\u0002Ț\u0003\u0007\u0004ဉ\u0000\u0005Ȉ\u0006ဉ\u0001\u0007\f\bဉ\u0002\tဉ\u0003\n\u001b", new Object[]{"bitField0_", "authorNames_", "narratorNames_", "explicit_", "duration_", "description_", "access_", "state_", "releaseTime_", "rating_", "tags_", Tag.class});
        }
        if (iOrdinal == 3) {
            return new Audiobook();
        }
        if (iOrdinal == 4) {
            return new C1288b(DEFAULT_INSTANCE);
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
        synchronized (Audiobook.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final Duration getDuration() {
        Duration duration = this.duration_;
        return duration == null ? Duration.m1928p() : duration;
    }

    /* JADX INFO: renamed from: n */
    public final Access m20765n() {
        Access access = this.access_;
        return access == null ? Access.m20772o() : access;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m20766o() {
        return this.authorNames_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m20767q() {
        return this.explicit_;
    }

    /* JADX INFO: renamed from: r */
    public final DoubleValue m20768r() {
        DoubleValue doubleValue = this.rating_;
        return doubleValue == null ? DoubleValue.m1924n() : doubleValue;
    }

    /* JADX INFO: renamed from: s */
    public final Timestamp m20769s() {
        Timestamp timestamp = this.releaseTime_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: t */
    public final m87 m20770t() {
        m87 m87Var;
        int i = this.state_;
        if (i == 0) {
            m87Var = m87.UNKNOWN;
        } else if (i != 1) {
            m87Var = i != 2 ? null : m87.LIVE;
        } else {
            m87Var = m87.PRERELEASE;
        }
        return m87Var == null ? m87.UNRECOGNIZED : m87Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final List m20771u() {
        return this.tags_;
    }
}
