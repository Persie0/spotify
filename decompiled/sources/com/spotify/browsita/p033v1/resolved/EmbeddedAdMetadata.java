package com.spotify.browsita.p033v1.resolved;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.d5u;
import p204p.ihc0;
import p204p.omr;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EmbeddedAdMetadata extends AbstractC0269h implements sre0 {
    public static final int CREATIVE_ID_FIELD_NUMBER = 2;
    private static final EmbeddedAdMetadata DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LINEITEM_ID_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_ID_FIELD_NUMBER = 3;
    public static final int PRODUCT_NAME_FIELD_NUMBER = 4;
    public static final int SLOT_FIELD_NUMBER = 6;
    public static final int TRACKING_EVENT_URLS_FIELD_NUMBER = 7;
    private ihc0 trackingEventUrls_ = ihc0.f102235b;
    private String id_ = "";
    private String creativeId_ = "";
    private String playbackId_ = "";
    private String productName_ = "";
    private String lineitemId_ = "";
    private String slot_ = "";

    static {
        EmbeddedAdMetadata embeddedAdMetadata = new EmbeddedAdMetadata();
        DEFAULT_INSTANCE = embeddedAdMetadata;
        AbstractC0269h.registerDefaultInstance(EmbeddedAdMetadata.class, embeddedAdMetadata);
    }

    private EmbeddedAdMetadata() {
    }

    /* JADX INFO: renamed from: o */
    public static EmbeddedAdMetadata m4071o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u00072", new Object[]{"id_", "creativeId_", "playbackId_", "productName_", "lineitemId_", "slot_", "trackingEventUrls_", d5u.f45489a});
        }
        if (iOrdinal == 3) {
            return new EmbeddedAdMetadata();
        }
        if (iOrdinal == 4) {
            return new omr(DEFAULT_INSTANCE, 23);
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
        synchronized (EmbeddedAdMetadata.class) {
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

    public final String getId() {
        return this.id_;
    }

    /* JADX INFO: renamed from: n */
    public final String m4072n() {
        return this.creativeId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m4073p() {
        return this.lineitemId_;
    }

    /* JADX INFO: renamed from: q */
    public final String m4074q() {
        return this.playbackId_;
    }

    /* JADX INFO: renamed from: r */
    public final String m4075r() {
        return this.productName_;
    }

    /* JADX INFO: renamed from: s */
    public final String m4076s() {
        return this.slot_;
    }

    /* JADX INFO: renamed from: t */
    public final Map m4077t() {
        return Collections.unmodifiableMap(this.trackingEventUrls_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
