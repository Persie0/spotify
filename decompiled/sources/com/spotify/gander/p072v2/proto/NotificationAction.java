package com.spotify.gander.p072v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.h70;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ssj0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class NotificationAction extends AbstractC0269h implements sre0 {
    private static final NotificationAction DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    private int type_;
    private String uri_ = "";

    static {
        NotificationAction notificationAction = new NotificationAction();
        DEFAULT_INSTANCE = notificationAction;
        AbstractC0269h.registerDefaultInstance(NotificationAction.class, notificationAction);
    }

    private NotificationAction() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11106n(NotificationAction notificationAction, h70 h70Var) {
        notificationAction.getClass();
        notificationAction.type_ = h70Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m11107o(NotificationAction notificationAction, String str) {
        notificationAction.getClass();
        notificationAction.uri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static NotificationAction m11108p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static ssj0 m11109r() {
        return (ssj0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"uri_", "type_"});
        }
        if (iOrdinal == 3) {
            return new NotificationAction();
        }
        if (iOrdinal == 4) {
            return new ssj0(DEFAULT_INSTANCE);
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
        synchronized (NotificationAction.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: q */
    public final h70 m11110q() {
        h70 h70Var;
        int i = this.type_;
        if (i == 0) {
            h70Var = h70.ACTION_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            h70Var = i != 2 ? null : h70.NAVIGATE_WEBVIEW;
        } else {
            h70Var = h70.NAVIGATE;
        }
        return h70Var == null ? h70.UNRECOGNIZED : h70Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
