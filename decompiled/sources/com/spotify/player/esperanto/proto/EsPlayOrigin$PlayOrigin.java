package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.dnw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsPlayOrigin$PlayOrigin extends AbstractC0269h implements sre0 {
    private static final EsPlayOrigin$PlayOrigin DEFAULT_INSTANCE;
    public static final int DEVICE_IDENTIFIER_FIELD_NUMBER = 6;
    public static final int EXTERNAL_REFERRER_FIELD_NUMBER = 4;
    public static final int FEATURE_CLASSES_FIELD_NUMBER = 7;
    public static final int FEATURE_IDENTIFIER_FIELD_NUMBER = 1;
    public static final int FEATURE_VERSION_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int REFERRER_IDENTIFIER_FIELD_NUMBER = 5;
    public static final int RESTRICTION_IDENTIFIER_FIELD_NUMBER = 8;
    public static final int VIEW_URI_FIELD_NUMBER = 3;
    private String featureIdentifier_ = "";
    private String featureVersion_ = "";
    private String viewUri_ = "";
    private String externalReferrer_ = "";
    private String referrerIdentifier_ = "";
    private String deviceIdentifier_ = "";
    private ae50 featureClasses_ = AbstractC0269h.emptyProtobufList();
    private String restrictionIdentifier_ = "";

    static {
        EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin = new EsPlayOrigin$PlayOrigin();
        DEFAULT_INSTANCE = esPlayOrigin$PlayOrigin;
        AbstractC0269h.registerDefaultInstance(EsPlayOrigin$PlayOrigin.class, esPlayOrigin$PlayOrigin);
    }

    private EsPlayOrigin$PlayOrigin() {
    }

    /* JADX INFO: renamed from: F */
    public static dnw m17804F() {
        return (dnw) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m17805n(EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, Iterable iterable) {
        ae50 ae50Var = esPlayOrigin$PlayOrigin.featureClasses_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esPlayOrigin$PlayOrigin.featureClasses_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, esPlayOrigin$PlayOrigin.featureClasses_);
    }

    /* JADX INFO: renamed from: o */
    public static void m17806o(EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, String str) {
        esPlayOrigin$PlayOrigin.getClass();
        str.getClass();
        esPlayOrigin$PlayOrigin.deviceIdentifier_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m17807p(EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, String str) {
        esPlayOrigin$PlayOrigin.getClass();
        str.getClass();
        esPlayOrigin$PlayOrigin.externalReferrer_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17808q(EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, String str) {
        esPlayOrigin$PlayOrigin.getClass();
        str.getClass();
        esPlayOrigin$PlayOrigin.featureIdentifier_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m17809r(EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, String str) {
        esPlayOrigin$PlayOrigin.getClass();
        str.getClass();
        esPlayOrigin$PlayOrigin.featureVersion_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m17810s(EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, String str) {
        esPlayOrigin$PlayOrigin.getClass();
        str.getClass();
        esPlayOrigin$PlayOrigin.referrerIdentifier_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m17811t(EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, String str) {
        esPlayOrigin$PlayOrigin.getClass();
        str.getClass();
        esPlayOrigin$PlayOrigin.restrictionIdentifier_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m17812u(EsPlayOrigin$PlayOrigin esPlayOrigin$PlayOrigin, String str) {
        esPlayOrigin$PlayOrigin.getClass();
        str.getClass();
        esPlayOrigin$PlayOrigin.viewUri_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static EsPlayOrigin$PlayOrigin m17814w() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final String m17815A() {
        return this.featureIdentifier_;
    }

    /* JADX INFO: renamed from: B */
    public final String m17816B() {
        return this.featureVersion_;
    }

    /* JADX INFO: renamed from: C */
    public final String m17817C() {
        return this.referrerIdentifier_;
    }

    /* JADX INFO: renamed from: D */
    public final String m17818D() {
        return this.restrictionIdentifier_;
    }

    /* JADX INFO: renamed from: E */
    public final String m17819E() {
        return this.viewUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ț\bȈ", new Object[]{"featureIdentifier_", "featureVersion_", "viewUri_", "externalReferrer_", "referrerIdentifier_", "deviceIdentifier_", "featureClasses_", "restrictionIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new EsPlayOrigin$PlayOrigin();
        }
        if (iOrdinal == 4) {
            return new dnw();
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
        synchronized (EsPlayOrigin$PlayOrigin.class) {
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

    /* JADX INFO: renamed from: x */
    public final String m17820x() {
        return this.deviceIdentifier_;
    }

    /* JADX INFO: renamed from: y */
    public final String m17821y() {
        return this.externalReferrer_;
    }

    /* JADX INFO: renamed from: z */
    public final ae50 m17822z() {
        return this.featureClasses_;
    }
}
