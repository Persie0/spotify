package com.spotify.extendedmetadata.extensions.episodeaccessimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.a5q0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class PodcastSubscription extends AbstractC0269h implements sre0 {
    public static final int BADGE_FIELD_NUMBER = 5;
    private static final PodcastSubscription DEFAULT_INSTANCE;
    public static final int IS_PAYWALLED_FIELD_NUMBER = 1;
    public static final int IS_USER_SUBSCRIBED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SIGNIFIER_FIELD_NUMBER = 4;
    public static final int USER_EXPLANATION_FIELD_NUMBER = 3;
    private int badge_;
    private int bitField0_;
    private boolean isPaywalled_;
    private boolean isUserSubscribed_;
    private Signifier signifier_;
    private int userExplanation_;

    public static final class Signifier extends AbstractC0269h implements sre0 {
        private static final Signifier DEFAULT_INSTANCE;
        private static volatile r2n0 PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private String text_ = "";

        static {
            Signifier signifier = new Signifier();
            DEFAULT_INSTANCE = signifier;
            AbstractC0269h.registerDefaultInstance(Signifier.class, signifier);
        }

        private Signifier() {
        }

        /* JADX INFO: renamed from: n */
        public static Signifier m10117n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"text_"});
            }
            if (iOrdinal == 3) {
                return new Signifier();
            }
            if (iOrdinal == 4) {
                return new C0746b(DEFAULT_INSTANCE);
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
            synchronized (Signifier.class) {
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
        public final String m10118o() {
            return this.text_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PodcastSubscription podcastSubscription = new PodcastSubscription();
        DEFAULT_INSTANCE = podcastSubscription;
        AbstractC0269h.registerDefaultInstance(PodcastSubscription.class, podcastSubscription);
    }

    private PodcastSubscription() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static PodcastSubscription m10112r(byte[] bArr) {
        return (PodcastSubscription) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\f\u0004ဉ\u0000\u0005\f", new Object[]{"bitField0_", "isPaywalled_", "isUserSubscribed_", "userExplanation_", "signifier_", "badge_"});
        }
        if (iOrdinal == 3) {
            return new PodcastSubscription();
        }
        if (iOrdinal == 4) {
            return new C0745a(DEFAULT_INSTANCE);
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
        synchronized (PodcastSubscription.class) {
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
    public final a5q0 m10113n() {
        a5q0 a5q0Var;
        int i = this.badge_;
        if (i != 0) {
            a5q0Var = i != 1 ? null : a5q0.BADGE_EXTRAS;
        } else {
            a5q0Var = a5q0.BADGE_UNSPECIFIED;
        }
        return a5q0Var == null ? a5q0.UNRECOGNIZED : a5q0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m10114o() {
        return this.isPaywalled_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m10115p() {
        return this.isUserSubscribed_;
    }

    /* JADX INFO: renamed from: q */
    public final Signifier m10116q() {
        Signifier signifier = this.signifier_;
        return signifier == null ? Signifier.m10117n() : signifier;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
