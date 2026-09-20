package com.spotify.extendedmetadata.extensions.showaccessimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dbd0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class MemberBadgeExplanation extends AbstractC0269h implements sre0 {
    public static final int BODY_FIELD_NUMBER = 2;
    public static final int BODY_SECONDARY_FIELD_NUMBER = 3;
    public static final int CTA_FIELD_NUMBER = 4;
    private static final MemberBadgeExplanation DEFAULT_INSTANCE;
    public static final int DISMISS_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private String title_ = "";
    private String body_ = "";
    private String bodySecondary_ = "";
    private String cta_ = "";
    private String dismiss_ = "";

    static {
        MemberBadgeExplanation memberBadgeExplanation = new MemberBadgeExplanation();
        DEFAULT_INSTANCE = memberBadgeExplanation;
        AbstractC0269h.registerDefaultInstance(MemberBadgeExplanation.class, memberBadgeExplanation);
    }

    private MemberBadgeExplanation() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static MemberBadgeExplanation m10426r() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"title_", "body_", "bodySecondary_", "cta_", "dismiss_"});
        }
        if (iOrdinal == 3) {
            return new MemberBadgeExplanation();
        }
        if (iOrdinal == 4) {
            return new dbd0(8);
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
        synchronized (MemberBadgeExplanation.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10427o() {
        return this.body_;
    }

    /* JADX INFO: renamed from: p */
    public final String m10428p() {
        return this.bodySecondary_;
    }

    /* JADX INFO: renamed from: q */
    public final String m10429q() {
        return this.cta_;
    }

    /* JADX INFO: renamed from: s */
    public final String m10430s() {
        return this.dismiss_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
