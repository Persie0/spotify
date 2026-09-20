package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.b5u;
import p204p.c5u;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
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

    /* JADX INFO: renamed from: A */
    public static b5u m5619A() {
        return (b5u) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m5620n(EmbeddedAdMetadata embeddedAdMetadata, String str) {
        embeddedAdMetadata.getClass();
        str.getClass();
        embeddedAdMetadata.creativeId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m5621o(EmbeddedAdMetadata embeddedAdMetadata, String str) {
        embeddedAdMetadata.getClass();
        str.getClass();
        embeddedAdMetadata.id_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m5622p(EmbeddedAdMetadata embeddedAdMetadata, String str) {
        embeddedAdMetadata.getClass();
        str.getClass();
        embeddedAdMetadata.lineitemId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m5623q(EmbeddedAdMetadata embeddedAdMetadata, String str) {
        embeddedAdMetadata.getClass();
        str.getClass();
        embeddedAdMetadata.productName_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m5624r(EmbeddedAdMetadata embeddedAdMetadata, String str) {
        embeddedAdMetadata.getClass();
        str.getClass();
        embeddedAdMetadata.slot_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static EmbeddedAdMetadata m5626u() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u00072", new Object[]{"id_", "creativeId_", "playbackId_", "productName_", "lineitemId_", "slot_", "trackingEventUrls_", c5u.f34290a});
        }
        if (iOrdinal == 3) {
            return new EmbeddedAdMetadata();
        }
        if (iOrdinal == 4) {
            return new b5u();
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: t */
    public final String m5627t() {
        return this.creativeId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: v */
    public final String m5628v() {
        return this.lineitemId_;
    }

    /* JADX INFO: renamed from: w */
    public final String m5629w() {
        return this.playbackId_;
    }

    /* JADX INFO: renamed from: x */
    public final String m5630x() {
        return this.productName_;
    }

    /* JADX INFO: renamed from: y */
    public final String m5631y() {
        return this.slot_;
    }

    /* JADX INFO: renamed from: z */
    public final Map m5632z() {
        return Collections.unmodifiableMap(this.trackingEventUrls_);
    }
}
