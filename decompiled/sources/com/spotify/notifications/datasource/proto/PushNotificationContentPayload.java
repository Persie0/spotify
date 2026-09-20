package com.spotify.notifications.datasource.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.d5t0;
import p204p.net0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class PushNotificationContentPayload extends AbstractC0269h implements sre0 {
    public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
    private static final PushNotificationContentPayload DEFAULT_INSTANCE;
    public static final int MEDIA_CONTENT_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_CONTENT_FIELD_NUMBER = 2;
    private int contentCase_ = 0;
    private int contentType_;
    private Object content_;

    static {
        PushNotificationContentPayload pushNotificationContentPayload = new PushNotificationContentPayload();
        DEFAULT_INSTANCE = pushNotificationContentPayload;
        AbstractC0269h.registerDefaultInstance(PushNotificationContentPayload.class, pushNotificationContentPayload);
    }

    private PushNotificationContentPayload() {
    }

    /* JADX INFO: renamed from: o */
    public static PushNotificationContentPayload m15972o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000", new Object[]{"content_", "contentCase_", "contentType_", TextContent.class, MediaContent.class});
        }
        if (iOrdinal == 3) {
            return new PushNotificationContentPayload();
        }
        if (iOrdinal == 4) {
            return new d5t0(DEFAULT_INSTANCE, 7);
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
        synchronized (PushNotificationContentPayload.class) {
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
    public final net0 m15973n() {
        net0 net0Var;
        int i = this.contentType_;
        if (i == 0) {
            net0Var = net0.CONTENT_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            net0Var = i != 2 ? null : net0.CONTENT_TYPE_MEDIA;
        } else {
            net0Var = net0.CONTENT_TYPE_TEXT;
        }
        return net0Var == null ? net0.UNRECOGNIZED : net0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final MediaContent m15974p() {
        return this.contentCase_ == 3 ? (MediaContent) this.content_ : MediaContent.m15967o();
    }

    /* JADX INFO: renamed from: q */
    public final TextContent m15975q() {
        return this.contentCase_ == 2 ? (TextContent) this.content_ : TextContent.m15976o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
