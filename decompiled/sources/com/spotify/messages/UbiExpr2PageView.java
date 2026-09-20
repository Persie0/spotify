package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.fu91;
import p204p.gu91;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class UbiExpr2PageView extends AbstractC0269h implements sre0 {
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 26;
    public static final int APP_VISIT_INDEX_FIELD_NUMBER = 27;
    public static final int BRANCHING_SOURCE_PAGE_INSTANCE_ID_FIELD_NUMBER = 25;
    public static final int CLIENT_DEBUG_METADATA_FIELD_NUMBER = 16;
    public static final int CLIENT_TIMEZONE_FIELD_NUMBER = 15;
    private static final UbiExpr2PageView DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 3;
    public static final int ERRORS_DETECTED_FIELD_NUMBER = 24;
    public static final int ERRORS_FIELD_NUMBER = 11;
    public static final int FEATURE_FIELD_NUMBER = 28;
    public static final int FROM_ENTITY_URI_FIELD_NUMBER = 7;
    public static final int FROM_NAVIGATIONAL_ROOT_FIELD_NUMBER = 8;
    public static final int FROM_PAGE_ID_FIELD_NUMBER = 6;
    public static final int FROM_PAGE_INSTANCE_ID_FIELD_NUMBER = 5;
    public static final int NAVIGATIONAL_ROOT_FIELD_NUMBER = 4;
    public static final int NAVIGATION_REASON_FIELD_NUMBER = 9;
    public static final int PAGE_IDENTIFIER_FIELD_NUMBER = 29;
    public static final int PAGE_ID_FIELD_NUMBER = 2;
    public static final int PAGE_INSTANCE_ID_FIELD_NUMBER = 1;
    public static final int PAGE_PRESENTATION_ID_FIELD_NUMBER = 17;
    private static volatile r2n0 PARSER = null;
    public static final int PATH_IDS_FIELD_NUMBER = 20;
    public static final int PATH_NAMES_FIELD_NUMBER = 18;
    public static final int PATH_POS_FIELD_NUMBER = 19;
    public static final int PATH_REASONS_FIELD_NUMBER = 22;
    public static final int PATH_SPECIFICATION_VERSIONS_FIELD_NUMBER = 23;
    public static final int PATH_URIS_FIELD_NUMBER = 21;
    public static final int PREVIOUS_INTERACTION_IDS_FIELD_NUMBER = 10;
    public static final int REPORTED_CLIENT_TIMESTAMP_FIELD_NUMBER = 12;
    public static final int SCENE_ID_FIELD_NUMBER = 14;
    public static final int TRANSITION_START_TIMESTAMP_FIELD_NUMBER = 13;
    private int appVisitIndex_;
    private int bitField0_;
    private int pagePresentationId_;
    private long reportedClientTimestamp_;
    private long transitionStartTimestamp_;
    private ihc0 clientDebugMetadata_ = ihc0.f102235b;
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
    private String sceneId_ = "";
    private String clientTimezone_ = "";
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
        UbiExpr2PageView ubiExpr2PageView = new UbiExpr2PageView();
        DEFAULT_INSTANCE = ubiExpr2PageView;
        AbstractC0269h.registerDefaultInstance(UbiExpr2PageView.class, ubiExpr2PageView);
    }

    private UbiExpr2PageView() {
    }

    /* JADX INFO: renamed from: A */
    public static void m14492A(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.bitField0_ |= 4;
        ubiExpr2PageView.entityUri_ = str;
    }

    /* JADX INFO: renamed from: B */
    public static void m14493B(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.bitField0_ |= 64;
        ubiExpr2PageView.fromEntityUri_ = str;
    }

    /* JADX INFO: renamed from: C */
    public static void m14494C(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.bitField0_ |= 128;
        ubiExpr2PageView.fromNavigationalRoot_ = str;
    }

    /* JADX INFO: renamed from: D */
    public static void m14495D(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.bitField0_ |= 32;
        ubiExpr2PageView.fromPageId_ = str;
    }

    /* JADX INFO: renamed from: E */
    public static void m14496E(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.bitField0_ |= 16;
        ubiExpr2PageView.fromPageInstanceId_ = str;
    }

    /* JADX INFO: renamed from: F */
    public static void m14497F(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.bitField0_ |= 256;
        ubiExpr2PageView.navigationReason_ = str;
    }

    /* JADX INFO: renamed from: G */
    public static void m14498G(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.bitField0_ |= 8;
        ubiExpr2PageView.navigationalRoot_ = str;
    }

    /* JADX INFO: renamed from: H */
    public static void m14499H(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.bitField0_ |= 2;
        ubiExpr2PageView.pageId_ = str;
    }

    /* JADX INFO: renamed from: I */
    public static void m14500I(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.bitField0_ |= 1;
        ubiExpr2PageView.pageInstanceId_ = str;
    }

    /* JADX INFO: renamed from: J */
    public static void m14501J(UbiExpr2PageView ubiExpr2PageView, int i) {
        ubiExpr2PageView.bitField0_ |= 8192;
        ubiExpr2PageView.pagePresentationId_ = i;
    }

    /* JADX INFO: renamed from: K */
    public static void m14502K(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        ubiExpr2PageView.bitField0_ |= 2048;
        ubiExpr2PageView.sceneId_ = str;
    }

    /* JADX INFO: renamed from: L */
    public static void m14503L(UbiExpr2PageView ubiExpr2PageView, long j) {
        ubiExpr2PageView.bitField0_ |= 1024;
        ubiExpr2PageView.transitionStartTimestamp_ = j;
    }

    /* JADX INFO: renamed from: M */
    public static fu91 m14504M() {
        return (fu91) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m14505n(UbiExpr2PageView ubiExpr2PageView, ArrayList arrayList) {
        ae50 ae50Var = ubiExpr2PageView.errorsDetected_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiExpr2PageView.errorsDetected_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, ubiExpr2PageView.errorsDetected_);
    }

    /* JADX INFO: renamed from: o */
    public static void m14506o(UbiExpr2PageView ubiExpr2PageView, ArrayList arrayList) {
        ae50 ae50Var = ubiExpr2PageView.previousInteractionIds_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiExpr2PageView.previousInteractionIds_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, ubiExpr2PageView.previousInteractionIds_);
    }

    /* JADX INFO: renamed from: p */
    public static void m14507p(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        ae50 ae50Var = ubiExpr2PageView.pathIds_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiExpr2PageView.pathIds_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiExpr2PageView.pathIds_.add(str);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14508q(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ae50 ae50Var = ubiExpr2PageView.pathNames_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiExpr2PageView.pathNames_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiExpr2PageView.pathNames_.add(str);
    }

    /* JADX INFO: renamed from: r */
    public static void m14509r(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        ae50 ae50Var = ubiExpr2PageView.pathPos_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiExpr2PageView.pathPos_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiExpr2PageView.pathPos_.add(str);
    }

    /* JADX INFO: renamed from: s */
    public static void m14510s(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        ae50 ae50Var = ubiExpr2PageView.pathReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiExpr2PageView.pathReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiExpr2PageView.pathReasons_.add(str);
    }

    /* JADX INFO: renamed from: t */
    public static void m14511t(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ae50 ae50Var = ubiExpr2PageView.pathSpecificationVersions_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiExpr2PageView.pathSpecificationVersions_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiExpr2PageView.pathSpecificationVersions_.add(str);
    }

    /* JADX INFO: renamed from: u */
    public static void m14512u(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        ae50 ae50Var = ubiExpr2PageView.pathUris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiExpr2PageView.pathUris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiExpr2PageView.pathUris_.add(str);
    }

    /* JADX INFO: renamed from: v */
    public static ihc0 m14513v(UbiExpr2PageView ubiExpr2PageView) {
        ihc0 ihc0Var = ubiExpr2PageView.clientDebugMetadata_;
        if (!ihc0Var.f102236a) {
            ubiExpr2PageView.clientDebugMetadata_ = ihc0Var.m50613h();
        }
        return ubiExpr2PageView.clientDebugMetadata_;
    }

    /* JADX INFO: renamed from: w */
    public static void m14514w(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.bitField0_ |= 32768;
        ubiExpr2PageView.appInstanceId_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m14515x(UbiExpr2PageView ubiExpr2PageView, int i) {
        ubiExpr2PageView.bitField0_ |= 65536;
        ubiExpr2PageView.appVisitIndex_ = i;
    }

    /* JADX INFO: renamed from: y */
    public static void m14516y(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.bitField0_ |= 16384;
        ubiExpr2PageView.branchingSourcePageInstanceId_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m14517z(UbiExpr2PageView ubiExpr2PageView, String str) {
        ubiExpr2PageView.getClass();
        str.getClass();
        ubiExpr2PageView.bitField0_ |= 4096;
        ubiExpr2PageView.clientTimezone_ = str;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001d\u0000\u0001\u0001\u001d\u001d\u0001\t\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\n\u001a\u000b\u001a\fဂ\t\rဂ\n\u000eဈ\u000b\u000fဈ\f\u00102\u0011င\r\u0012\u001a\u0013\u001a\u0014\u001a\u0015\u001a\u0016\u001a\u0017\u001a\u0018\u001a\u0019ဈ\u000e\u001aဈ\u000f\u001bင\u0010\u001cဈ\u0011\u001dဈ\u0012", new Object[]{"bitField0_", "pageInstanceId_", "pageId_", "entityUri_", "navigationalRoot_", "fromPageInstanceId_", "fromPageId_", "fromEntityUri_", "fromNavigationalRoot_", "navigationReason_", "previousInteractionIds_", "errors_", "reportedClientTimestamp_", "transitionStartTimestamp_", "sceneId_", "clientTimezone_", "clientDebugMetadata_", gu91.f84420a, "pagePresentationId_", "pathNames_", "pathPos_", "pathIds_", "pathUris_", "pathReasons_", "pathSpecificationVersions_", "errorsDetected_", "branchingSourcePageInstanceId_", "appInstanceId_", "appVisitIndex_", "feature_", "pageIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new UbiExpr2PageView();
        }
        if (iOrdinal == 4) {
            return new fu91(DEFAULT_INSTANCE);
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
        synchronized (UbiExpr2PageView.class) {
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
