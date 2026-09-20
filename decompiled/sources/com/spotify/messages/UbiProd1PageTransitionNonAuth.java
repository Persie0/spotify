package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.jw91;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class UbiProd1PageTransitionNonAuth extends AbstractC0269h implements sre0 {
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 25;
    public static final int APP_VISIT_INDEX_FIELD_NUMBER = 26;
    public static final int BRANCHING_SOURCE_PAGE_INSTANCE_ID_FIELD_NUMBER = 24;
    public static final int CLIENT_TIMEZONE_FIELD_NUMBER = 13;
    private static final UbiProd1PageTransitionNonAuth DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 3;
    public static final int ERRORS_DETECTED_FIELD_NUMBER = 23;
    public static final int ERRORS_FIELD_NUMBER = 11;
    public static final int FEATURE_FIELD_NUMBER = 27;
    public static final int FLOW_ID_FIELD_NUMBER = 12;
    public static final int FROM_ENTITY_URI_FIELD_NUMBER = 7;
    public static final int FROM_NAVIGATIONAL_ROOT_FIELD_NUMBER = 8;
    public static final int FROM_PAGE_ID_FIELD_NUMBER = 6;
    public static final int FROM_PAGE_INSTANCE_ID_FIELD_NUMBER = 5;
    public static final int NAVIGATIONAL_ROOT_FIELD_NUMBER = 4;
    public static final int NAVIGATION_REASON_FIELD_NUMBER = 9;
    public static final int PAGE_IDENTIFIER_FIELD_NUMBER = 28;
    public static final int PAGE_ID_FIELD_NUMBER = 2;
    public static final int PAGE_INSTANCE_ID_FIELD_NUMBER = 1;
    public static final int PAGE_PRESENTATION_ID_FIELD_NUMBER = 16;
    private static volatile r2n0 PARSER = null;
    public static final int PATH_IDS_FIELD_NUMBER = 19;
    public static final int PATH_NAMES_FIELD_NUMBER = 17;
    public static final int PATH_POS_FIELD_NUMBER = 18;
    public static final int PATH_REASONS_FIELD_NUMBER = 21;
    public static final int PATH_SPECIFICATION_VERSIONS_FIELD_NUMBER = 22;
    public static final int PATH_URIS_FIELD_NUMBER = 20;
    public static final int PREVIOUS_INTERACTION_IDS_FIELD_NUMBER = 10;
    public static final int SCENE_ID_FIELD_NUMBER = 15;
    public static final int TRANSITION_START_TIMESTAMP_FIELD_NUMBER = 14;
    private int appVisitIndex_;
    private int bitField0_;
    private int pagePresentationId_;
    private long transitionStartTimestamp_;
    private String pageInstanceId_ = "";
    private String pageId_ = "";
    private String entityUri_ = "";
    private String navigationalRoot_ = "";
    private String fromPageInstanceId_ = "";
    private String fromPageId_ = "";
    private String fromEntityUri_ = "";
    private String fromNavigationalRoot_ = "";
    private String navigationReason_ = "";
    private ae50 previousInteractionIds_ = AbstractC0269h.emptyProtobufList();
    private ae50 errors_ = AbstractC0269h.emptyProtobufList();
    private String flowId_ = "";
    private String clientTimezone_ = "";
    private String sceneId_ = "";
    private ae50 pathNames_ = AbstractC0269h.emptyProtobufList();
    private ae50 pathPos_ = AbstractC0269h.emptyProtobufList();
    private ae50 pathIds_ = AbstractC0269h.emptyProtobufList();
    private ae50 pathUris_ = AbstractC0269h.emptyProtobufList();
    private ae50 pathReasons_ = AbstractC0269h.emptyProtobufList();
    private ae50 pathSpecificationVersions_ = AbstractC0269h.emptyProtobufList();
    private ae50 errorsDetected_ = AbstractC0269h.emptyProtobufList();
    private String branchingSourcePageInstanceId_ = "";
    private String appInstanceId_ = "";
    private String feature_ = "";
    private String pageIdentifier_ = "";

    static {
        UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth = new UbiProd1PageTransitionNonAuth();
        DEFAULT_INSTANCE = ubiProd1PageTransitionNonAuth;
        AbstractC0269h.registerDefaultInstance(UbiProd1PageTransitionNonAuth.class, ubiProd1PageTransitionNonAuth);
    }

    private UbiProd1PageTransitionNonAuth() {
    }

    /* JADX INFO: renamed from: A */
    public static void m14774A(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, String str) {
        ubiProd1PageTransitionNonAuth.getClass();
        str.getClass();
        ubiProd1PageTransitionNonAuth.bitField0_ |= 64;
        ubiProd1PageTransitionNonAuth.fromEntityUri_ = str;
    }

    /* JADX INFO: renamed from: B */
    public static void m14775B(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, String str) {
        ubiProd1PageTransitionNonAuth.getClass();
        str.getClass();
        ubiProd1PageTransitionNonAuth.bitField0_ |= 128;
        ubiProd1PageTransitionNonAuth.fromNavigationalRoot_ = str;
    }

    /* JADX INFO: renamed from: C */
    public static void m14776C(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, String str) {
        ubiProd1PageTransitionNonAuth.getClass();
        str.getClass();
        ubiProd1PageTransitionNonAuth.bitField0_ |= 32;
        ubiProd1PageTransitionNonAuth.fromPageId_ = str;
    }

    /* JADX INFO: renamed from: D */
    public static void m14777D(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, String str) {
        ubiProd1PageTransitionNonAuth.getClass();
        str.getClass();
        ubiProd1PageTransitionNonAuth.bitField0_ |= 16;
        ubiProd1PageTransitionNonAuth.fromPageInstanceId_ = str;
    }

    /* JADX INFO: renamed from: E */
    public static void m14778E(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, String str) {
        ubiProd1PageTransitionNonAuth.getClass();
        str.getClass();
        ubiProd1PageTransitionNonAuth.bitField0_ |= 256;
        ubiProd1PageTransitionNonAuth.navigationReason_ = str;
    }

    /* JADX INFO: renamed from: F */
    public static void m14779F(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, String str) {
        ubiProd1PageTransitionNonAuth.getClass();
        str.getClass();
        ubiProd1PageTransitionNonAuth.bitField0_ |= 8;
        ubiProd1PageTransitionNonAuth.navigationalRoot_ = str;
    }

    /* JADX INFO: renamed from: G */
    public static void m14780G(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, String str) {
        ubiProd1PageTransitionNonAuth.getClass();
        str.getClass();
        ubiProd1PageTransitionNonAuth.bitField0_ |= 2;
        ubiProd1PageTransitionNonAuth.pageId_ = str;
    }

    /* JADX INFO: renamed from: H */
    public static void m14781H(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, String str) {
        ubiProd1PageTransitionNonAuth.getClass();
        str.getClass();
        ubiProd1PageTransitionNonAuth.bitField0_ |= 1;
        ubiProd1PageTransitionNonAuth.pageInstanceId_ = str;
    }

    /* JADX INFO: renamed from: I */
    public static void m14782I(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, int i) {
        ubiProd1PageTransitionNonAuth.bitField0_ |= 8192;
        ubiProd1PageTransitionNonAuth.pagePresentationId_ = i;
    }

    /* JADX INFO: renamed from: J */
    public static jw91 m14783J() {
        return (jw91) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m14784n(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, ArrayList arrayList) {
        ae50 ae50Var = ubiProd1PageTransitionNonAuth.errorsDetected_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1PageTransitionNonAuth.errorsDetected_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, ubiProd1PageTransitionNonAuth.errorsDetected_);
    }

    /* JADX INFO: renamed from: o */
    public static void m14785o(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, ArrayList arrayList) {
        ae50 ae50Var = ubiProd1PageTransitionNonAuth.previousInteractionIds_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1PageTransitionNonAuth.previousInteractionIds_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, ubiProd1PageTransitionNonAuth.previousInteractionIds_);
    }

    /* JADX INFO: renamed from: p */
    public static void m14786p(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, String str) {
        ubiProd1PageTransitionNonAuth.getClass();
        ae50 ae50Var = ubiProd1PageTransitionNonAuth.pathIds_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1PageTransitionNonAuth.pathIds_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1PageTransitionNonAuth.pathIds_.add(str);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14787q(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, String str) {
        ubiProd1PageTransitionNonAuth.getClass();
        str.getClass();
        ae50 ae50Var = ubiProd1PageTransitionNonAuth.pathNames_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1PageTransitionNonAuth.pathNames_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1PageTransitionNonAuth.pathNames_.add(str);
    }

    /* JADX INFO: renamed from: r */
    public static void m14788r(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, String str) {
        ubiProd1PageTransitionNonAuth.getClass();
        ae50 ae50Var = ubiProd1PageTransitionNonAuth.pathPos_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1PageTransitionNonAuth.pathPos_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1PageTransitionNonAuth.pathPos_.add(str);
    }

    /* JADX INFO: renamed from: s */
    public static void m14789s(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, String str) {
        ubiProd1PageTransitionNonAuth.getClass();
        ae50 ae50Var = ubiProd1PageTransitionNonAuth.pathReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1PageTransitionNonAuth.pathReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1PageTransitionNonAuth.pathReasons_.add(str);
    }

    /* JADX INFO: renamed from: t */
    public static void m14790t(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, String str) {
        ubiProd1PageTransitionNonAuth.getClass();
        str.getClass();
        ae50 ae50Var = ubiProd1PageTransitionNonAuth.pathSpecificationVersions_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1PageTransitionNonAuth.pathSpecificationVersions_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1PageTransitionNonAuth.pathSpecificationVersions_.add(str);
    }

    /* JADX INFO: renamed from: u */
    public static void m14791u(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, String str) {
        ubiProd1PageTransitionNonAuth.getClass();
        ae50 ae50Var = ubiProd1PageTransitionNonAuth.pathUris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1PageTransitionNonAuth.pathUris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1PageTransitionNonAuth.pathUris_.add(str);
    }

    /* JADX INFO: renamed from: v */
    public static void m14792v(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, String str) {
        ubiProd1PageTransitionNonAuth.getClass();
        str.getClass();
        ubiProd1PageTransitionNonAuth.bitField0_ |= 32768;
        ubiProd1PageTransitionNonAuth.appInstanceId_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m14793w(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, int i) {
        ubiProd1PageTransitionNonAuth.bitField0_ |= 65536;
        ubiProd1PageTransitionNonAuth.appVisitIndex_ = i;
    }

    /* JADX INFO: renamed from: x */
    public static void m14794x(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, String str) {
        ubiProd1PageTransitionNonAuth.getClass();
        str.getClass();
        ubiProd1PageTransitionNonAuth.bitField0_ |= 16384;
        ubiProd1PageTransitionNonAuth.branchingSourcePageInstanceId_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static void m14795y(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, String str) {
        ubiProd1PageTransitionNonAuth.getClass();
        str.getClass();
        ubiProd1PageTransitionNonAuth.bitField0_ |= 1024;
        ubiProd1PageTransitionNonAuth.clientTimezone_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m14796z(UbiProd1PageTransitionNonAuth ubiProd1PageTransitionNonAuth, String str) {
        ubiProd1PageTransitionNonAuth.getClass();
        str.getClass();
        ubiProd1PageTransitionNonAuth.bitField0_ |= 4;
        ubiProd1PageTransitionNonAuth.entityUri_ = str;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001c\u0000\u0001\u0001\u001c\u001c\u0000\t\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\n\u001a\u000b\u001a\fဈ\t\rဈ\n\u000eဂ\u000b\u000fဈ\f\u0010င\r\u0011\u001a\u0012\u001a\u0013\u001a\u0014\u001a\u0015\u001a\u0016\u001a\u0017\u001a\u0018ဈ\u000e\u0019ဈ\u000f\u001aင\u0010\u001bဈ\u0011\u001cဈ\u0012", new Object[]{"bitField0_", "pageInstanceId_", "pageId_", "entityUri_", "navigationalRoot_", "fromPageInstanceId_", "fromPageId_", "fromEntityUri_", "fromNavigationalRoot_", "navigationReason_", "previousInteractionIds_", "errors_", "flowId_", "clientTimezone_", "transitionStartTimestamp_", "sceneId_", "pagePresentationId_", "pathNames_", "pathPos_", "pathIds_", "pathUris_", "pathReasons_", "pathSpecificationVersions_", "errorsDetected_", "branchingSourcePageInstanceId_", "appInstanceId_", "appVisitIndex_", "feature_", "pageIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new UbiProd1PageTransitionNonAuth();
        }
        if (iOrdinal == 4) {
            return new jw91(DEFAULT_INSTANCE);
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
        synchronized (UbiProd1PageTransitionNonAuth.class) {
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
