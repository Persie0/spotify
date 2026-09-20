package com.spotify.familyviewservice.p066v1;

import com.google.protobuf.AbstractC0269h;
import p204p.hz00;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class GenAlphaManagedSettings extends AbstractC0269h implements sre0 {
    public static final int ALLOW_CONNECT_FIELD_NUMBER = 5;
    public static final int ALLOW_EXPLICIT_CONTENT_FIELD_NUMBER = 3;
    public static final int ALLOW_VIDEO_CONTENT_FIELD_NUMBER = 4;
    public static final int DATE_OF_BIRTH_FIELD_NUMBER = 2;
    private static final GenAlphaManagedSettings DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private boolean allowConnect_;
    private boolean allowExplicitContent_;
    private boolean allowVideoContent_;
    private int bitField0_;
    private String displayName_ = "";
    private String dateOfBirth_ = "";

    static {
        GenAlphaManagedSettings genAlphaManagedSettings = new GenAlphaManagedSettings();
        DEFAULT_INSTANCE = genAlphaManagedSettings;
        AbstractC0269h.registerDefaultInstance(GenAlphaManagedSettings.class, genAlphaManagedSettings);
    }

    private GenAlphaManagedSettings() {
    }

    /* JADX INFO: renamed from: n */
    public static void m10698n(GenAlphaManagedSettings genAlphaManagedSettings, boolean z) {
        genAlphaManagedSettings.bitField0_ |= 16;
        genAlphaManagedSettings.allowConnect_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m10699o(GenAlphaManagedSettings genAlphaManagedSettings, boolean z) {
        genAlphaManagedSettings.bitField0_ |= 4;
        genAlphaManagedSettings.allowExplicitContent_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m10700p(GenAlphaManagedSettings genAlphaManagedSettings, boolean z) {
        genAlphaManagedSettings.bitField0_ |= 8;
        genAlphaManagedSettings.allowVideoContent_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m10701q(GenAlphaManagedSettings genAlphaManagedSettings, String str) {
        genAlphaManagedSettings.getClass();
        str.getClass();
        genAlphaManagedSettings.bitField0_ |= 2;
        genAlphaManagedSettings.dateOfBirth_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m10702r(GenAlphaManagedSettings genAlphaManagedSettings, String str) {
        genAlphaManagedSettings.getClass();
        str.getClass();
        genAlphaManagedSettings.bitField0_ |= 1;
        genAlphaManagedSettings.displayName_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static hz00 m10703s() {
        return (hz00) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "displayName_", "dateOfBirth_", "allowExplicitContent_", "allowVideoContent_", "allowConnect_"});
        }
        if (iOrdinal == 3) {
            return new GenAlphaManagedSettings();
        }
        if (iOrdinal == 4) {
            return new hz00(DEFAULT_INSTANCE);
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
        synchronized (GenAlphaManagedSettings.class) {
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
