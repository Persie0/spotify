package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.b9t0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class PuffinFiltersUsage extends AbstractC0269h implements sre0 {
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 8;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 4;
    public static final int CONTENT_URI_FIELD_NUMBER = 5;
    private static final PuffinFiltersUsage DEFAULT_INSTANCE;
    public static final int EXTERNALIZATION_ENABLED_FIELD_NUMBER = 2;
    public static final int FORMAT_FIELD_NUMBER = 7;
    public static final int HEADPHONE_IDENTIFIER_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int SPECIFIC_ENABLED_FIELD_NUMBER = 1;
    public static final int SPECIFIC_ENABLED_REVISION_FIELD_NUMBER = 6;
    public static final int SPECIFIC_FILTER_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean externalizationEnabled_;
    private int format_;
    private int specificEnabledRevision_;
    private boolean specificEnabled_;
    private String specificFilterId_ = "";
    private String contentType_ = "";
    private String contentUri_ = "";
    private String connectionType_ = "";
    private String headphoneIdentifier_ = "";

    static {
        PuffinFiltersUsage puffinFiltersUsage = new PuffinFiltersUsage();
        DEFAULT_INSTANCE = puffinFiltersUsage;
        AbstractC0269h.registerDefaultInstance(PuffinFiltersUsage.class, puffinFiltersUsage);
    }

    private PuffinFiltersUsage() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14347n(PuffinFiltersUsage puffinFiltersUsage, String str) {
        puffinFiltersUsage.getClass();
        puffinFiltersUsage.bitField0_ |= 128;
        puffinFiltersUsage.connectionType_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14348o(PuffinFiltersUsage puffinFiltersUsage, String str) {
        puffinFiltersUsage.getClass();
        puffinFiltersUsage.bitField0_ |= 8;
        puffinFiltersUsage.contentType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14349p(PuffinFiltersUsage puffinFiltersUsage, String str) {
        puffinFiltersUsage.getClass();
        str.getClass();
        puffinFiltersUsage.bitField0_ |= 16;
        puffinFiltersUsage.contentUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14350q(PuffinFiltersUsage puffinFiltersUsage, boolean z) {
        puffinFiltersUsage.bitField0_ |= 2;
        puffinFiltersUsage.externalizationEnabled_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m14351r(PuffinFiltersUsage puffinFiltersUsage, int i) {
        puffinFiltersUsage.bitField0_ |= 64;
        puffinFiltersUsage.format_ = i;
    }

    /* JADX INFO: renamed from: s */
    public static void m14352s(PuffinFiltersUsage puffinFiltersUsage, String str) {
        puffinFiltersUsage.getClass();
        str.getClass();
        puffinFiltersUsage.bitField0_ |= 256;
        puffinFiltersUsage.headphoneIdentifier_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m14353t(PuffinFiltersUsage puffinFiltersUsage, boolean z) {
        puffinFiltersUsage.bitField0_ |= 1;
        puffinFiltersUsage.specificEnabled_ = z;
    }

    /* JADX INFO: renamed from: u */
    public static void m14354u(PuffinFiltersUsage puffinFiltersUsage, int i) {
        puffinFiltersUsage.bitField0_ |= 32;
        puffinFiltersUsage.specificEnabledRevision_ = i;
    }

    /* JADX INFO: renamed from: v */
    public static void m14355v(PuffinFiltersUsage puffinFiltersUsage, String str) {
        puffinFiltersUsage.getClass();
        str.getClass();
        puffinFiltersUsage.bitField0_ |= 4;
        puffinFiltersUsage.specificFilterId_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static b9t0 m14356w() {
        return (b9t0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006င\u0005\u0007င\u0006\bဈ\u0007\tဈ\b", new Object[]{"bitField0_", "specificEnabled_", "externalizationEnabled_", "specificFilterId_", "contentType_", "contentUri_", "specificEnabledRevision_", "format_", "connectionType_", "headphoneIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new PuffinFiltersUsage();
        }
        if (iOrdinal == 4) {
            return new b9t0(DEFAULT_INSTANCE);
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
        synchronized (PuffinFiltersUsage.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
