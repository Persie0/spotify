package com.spotify.audiobookdirectsales.p026v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z5u;

/* JADX INFO: loaded from: classes5.dex */
public final class EngagementUnlock extends AbstractC0269h implements sre0 {
    public static final int ACTION_TYPE_FIELD_NUMBER = 6;
    public static final int BODY_FIELD_NUMBER = 2;
    public static final int BODY_SECONDARY_FIELD_NUMBER = 3;
    public static final int CTA_LABEL_FIELD_NUMBER = 4;
    private static final EngagementUnlock DEFAULT_INSTANCE;
    public static final int DISMISS_LABEL_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private String body_ = "";
    private String bodySecondary_ = "";
    private String ctaLabel_ = "";
    private String dismissLabel_ = "";
    private String actionType_ = "";

    static {
        EngagementUnlock engagementUnlock = new EngagementUnlock();
        DEFAULT_INSTANCE = engagementUnlock;
        AbstractC0269h.registerDefaultInstance(EngagementUnlock.class, engagementUnlock);
    }

    private EngagementUnlock() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static EngagementUnlock m3411r() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", new Object[]{"title_", "body_", "bodySecondary_", "ctaLabel_", "dismissLabel_", "actionType_"});
        }
        if (iOrdinal == 3) {
            return new EngagementUnlock();
        }
        if (iOrdinal == 4) {
            return new z5u(DEFAULT_INSTANCE, 13);
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
        synchronized (EngagementUnlock.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m3412n() {
        return this.actionType_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m3413o() {
        return this.body_;
    }

    /* JADX INFO: renamed from: p */
    public final String m3414p() {
        return this.bodySecondary_;
    }

    /* JADX INFO: renamed from: q */
    public final String m3415q() {
        return this.ctaLabel_;
    }

    /* JADX INFO: renamed from: s */
    public final String m3416s() {
        return this.dismissLabel_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
