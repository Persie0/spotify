package com.spotify.agentgateway.p016v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s791;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class UpdateNotification extends AbstractC0269h implements sre0 {
    public static final int DEEPLINK_URI_FIELD_NUMBER = 4;
    private static final UpdateNotification DEFAULT_INSTANCE;
    public static final int IMAGE_URLS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private ae50 imageUrls_ = AbstractC0269h.emptyProtobufList();
    private String title_ = "";
    private String subtitle_ = "";
    private String deeplinkUri_ = "";

    static {
        UpdateNotification updateNotification = new UpdateNotification();
        DEFAULT_INSTANCE = updateNotification;
        AbstractC0269h.registerDefaultInstance(UpdateNotification.class, updateNotification);
    }

    private UpdateNotification() {
    }

    /* JADX INFO: renamed from: o */
    public static UpdateNotification m2985o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ț\u0002Ȉ\u0003Ȉ\u0004ለ\u0000", new Object[]{"bitField0_", "imageUrls_", "title_", "subtitle_", "deeplinkUri_"});
        }
        if (iOrdinal == 3) {
            return new UpdateNotification();
        }
        if (iOrdinal == 4) {
            return new s791(DEFAULT_INSTANCE, 26);
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
        synchronized (UpdateNotification.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m2986n() {
        return this.deeplinkUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m2987p() {
        return this.imageUrls_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m2988q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
