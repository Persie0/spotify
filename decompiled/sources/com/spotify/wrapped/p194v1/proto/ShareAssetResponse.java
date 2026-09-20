package com.spotify.wrapped.p194v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ShareAssetResponse extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 4;
    public static final int ASSET_FIELD_NUMBER = 6;
    public static final int AUDIO_ATTACHMENT_FIELD_NUMBER = 5;
    private static final ShareAssetResponse DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    public static final int MESSAGING_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_URI_FIELD_NUMBER = 1;
    private ShareAsset asset_;
    private AudioAttachment audioAttachment_;
    private int bitField0_;
    private ConsumerShareMessaging messaging_;
    private String shareUri_ = "";
    private String imageUrl_ = "";
    private String accessibilityText_ = "";

    public static final class AudioAttachment extends AbstractC0269h implements sre0 {
        private static final AudioAttachment DEFAULT_INSTANCE;
        public static final int DISABLE_SELECTION_FIELD_NUMBER = 2;
        public static final int ENTITY_URI_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER;
        private int bitField0_;
        private boolean disableSelection_;
        private String entityUri_ = "";

        static {
            AudioAttachment audioAttachment = new AudioAttachment();
            DEFAULT_INSTANCE = audioAttachment;
            AbstractC0269h.registerDefaultInstance(AudioAttachment.class, audioAttachment);
        }

        private AudioAttachment() {
        }

        /* JADX INFO: renamed from: n */
        public static AudioAttachment m23224n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002\u0007", new Object[]{"bitField0_", "entityUri_", "disableSelection_"});
            }
            if (iOrdinal == 3) {
                return new AudioAttachment();
            }
            if (iOrdinal == 4) {
                return new C1393o(DEFAULT_INSTANCE);
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
            synchronized (AudioAttachment.class) {
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
        public final boolean m23225o() {
            return this.disableSelection_;
        }

        /* JADX INFO: renamed from: p */
        public final String m23226p() {
            return this.entityUri_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        ShareAssetResponse shareAssetResponse = new ShareAssetResponse();
        DEFAULT_INSTANCE = shareAssetResponse;
        AbstractC0269h.registerDefaultInstance(ShareAssetResponse.class, shareAssetResponse);
    }

    private ShareAssetResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ\u0005ဉ\u0001\u0006ဉ\u0002", new Object[]{"bitField0_", "shareUri_", "imageUrl_", "messaging_", "accessibilityText_", "audioAttachment_", "asset_"});
        }
        if (iOrdinal == 3) {
            return new ShareAssetResponse();
        }
        if (iOrdinal == 4) {
            return new C1394p(DEFAULT_INSTANCE);
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
        synchronized (ShareAssetResponse.class) {
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
    public final String m23219n() {
        return this.accessibilityText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ShareAsset m23220o() {
        ShareAsset shareAsset = this.asset_;
        return shareAsset == null ? ShareAsset.m23215o() : shareAsset;
    }

    /* JADX INFO: renamed from: p */
    public final AudioAttachment m23221p() {
        AudioAttachment audioAttachment = this.audioAttachment_;
        return audioAttachment == null ? AudioAttachment.m23224n() : audioAttachment;
    }

    /* JADX INFO: renamed from: q */
    public final ConsumerShareMessaging m23222q() {
        ConsumerShareMessaging consumerShareMessaging = this.messaging_;
        return consumerShareMessaging == null ? ConsumerShareMessaging.m23136n() : consumerShareMessaging;
    }

    /* JADX INFO: renamed from: r */
    public final String m23223r() {
        return this.shareUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
