package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.ihc0;
import p204p.kw91;
import p204p.lw91;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class UbiProd1PageVisitChange extends AbstractC0269h implements sre0 {
    public static final int CHANGE_TIMESTAMP_FIELD_NUMBER = 12;
    public static final int CLIENT_DEBUG_METADATA_FIELD_NUMBER = 15;
    public static final int CLIENT_TIMEZONE_FIELD_NUMBER = 13;
    private static final UbiProd1PageVisitChange DEFAULT_INSTANCE;
    public static final int ERRORS_FIELD_NUMBER = 16;
    public static final int FEATURE_FIELD_NUMBER = 17;
    public static final int NAVIGATION_REASON_FIELD_NUMBER = 11;
    public static final int PAGE_IDENTIFIER_FIELD_NUMBER = 18;
    public static final int PAGE_ID_FIELD_NUMBER = 4;
    public static final int PAGE_PRESENTATION_ID_FIELD_NUMBER = 2;
    public static final int PAGE_VISIT_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PATH_IDS_FIELD_NUMBER = 7;
    public static final int PATH_NAMES_FIELD_NUMBER = 5;
    public static final int PATH_POS_FIELD_NUMBER = 6;
    public static final int PATH_REASONS_FIELD_NUMBER = 9;
    public static final int PATH_SPECIFICATION_VERSIONS_FIELD_NUMBER = 10;
    public static final int PATH_URIS_FIELD_NUMBER = 8;
    public static final int PREVIOUS_PAGE_PRESENTATION_ID_FIELD_NUMBER = 3;
    public static final int SCENE_ID_FIELD_NUMBER = 14;
    private int bitField0_;
    private long changeTimestamp_;
    private int pagePresentationId_;
    private int previousPagePresentationId_;
    private ihc0 clientDebugMetadata_ = ihc0.f102235b;
    private String pageVisitId_ = "";
    private String pageId_ = "";
    private ae50 pathNames_ = AbstractC0269h.emptyProtobufList();
    private ae50 pathPos_ = AbstractC0269h.emptyProtobufList();
    private ae50 pathIds_ = AbstractC0269h.emptyProtobufList();
    private ae50 pathUris_ = AbstractC0269h.emptyProtobufList();
    private ae50 pathReasons_ = AbstractC0269h.emptyProtobufList();
    private ae50 pathSpecificationVersions_ = AbstractC0269h.emptyProtobufList();
    private String navigationReason_ = "";
    private String clientTimezone_ = "";
    private String sceneId_ = "";
    private ae50 errors_ = AbstractC0269h.emptyProtobufList();
    private String feature_ = "";
    private String pageIdentifier_ = "";

    static {
        UbiProd1PageVisitChange ubiProd1PageVisitChange = new UbiProd1PageVisitChange();
        DEFAULT_INSTANCE = ubiProd1PageVisitChange;
        AbstractC0269h.registerDefaultInstance(UbiProd1PageVisitChange.class, ubiProd1PageVisitChange);
    }

    private UbiProd1PageVisitChange() {
    }

    /* JADX INFO: renamed from: A */
    public static void m14797A(UbiProd1PageVisitChange ubiProd1PageVisitChange, String str) {
        ubiProd1PageVisitChange.getClass();
        ubiProd1PageVisitChange.bitField0_ |= 128;
        ubiProd1PageVisitChange.sceneId_ = str;
    }

    /* JADX INFO: renamed from: B */
    public static kw91 m14798B() {
        return (kw91) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m14799n(UbiProd1PageVisitChange ubiProd1PageVisitChange, String str) {
        ubiProd1PageVisitChange.getClass();
        ae50 ae50Var = ubiProd1PageVisitChange.pathIds_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1PageVisitChange.pathIds_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1PageVisitChange.pathIds_.add(str);
    }

    /* JADX INFO: renamed from: o */
    public static void m14800o(UbiProd1PageVisitChange ubiProd1PageVisitChange, String str) {
        ubiProd1PageVisitChange.getClass();
        str.getClass();
        ae50 ae50Var = ubiProd1PageVisitChange.pathNames_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1PageVisitChange.pathNames_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1PageVisitChange.pathNames_.add(str);
    }

    /* JADX INFO: renamed from: p */
    public static void m14801p(UbiProd1PageVisitChange ubiProd1PageVisitChange, String str) {
        ubiProd1PageVisitChange.getClass();
        ae50 ae50Var = ubiProd1PageVisitChange.pathPos_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1PageVisitChange.pathPos_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1PageVisitChange.pathPos_.add(str);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14802q(UbiProd1PageVisitChange ubiProd1PageVisitChange, String str) {
        ubiProd1PageVisitChange.getClass();
        ae50 ae50Var = ubiProd1PageVisitChange.pathReasons_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1PageVisitChange.pathReasons_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1PageVisitChange.pathReasons_.add(str);
    }

    /* JADX INFO: renamed from: r */
    public static void m14803r(UbiProd1PageVisitChange ubiProd1PageVisitChange, String str) {
        ubiProd1PageVisitChange.getClass();
        str.getClass();
        ae50 ae50Var = ubiProd1PageVisitChange.pathSpecificationVersions_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1PageVisitChange.pathSpecificationVersions_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1PageVisitChange.pathSpecificationVersions_.add(str);
    }

    /* JADX INFO: renamed from: s */
    public static void m14804s(UbiProd1PageVisitChange ubiProd1PageVisitChange, String str) {
        ubiProd1PageVisitChange.getClass();
        ae50 ae50Var = ubiProd1PageVisitChange.pathUris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            ubiProd1PageVisitChange.pathUris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        ubiProd1PageVisitChange.pathUris_.add(str);
    }

    /* JADX INFO: renamed from: t */
    public static void m14805t(UbiProd1PageVisitChange ubiProd1PageVisitChange, long j) {
        ubiProd1PageVisitChange.bitField0_ |= 32;
        ubiProd1PageVisitChange.changeTimestamp_ = j;
    }

    /* JADX INFO: renamed from: u */
    public static void m14806u(UbiProd1PageVisitChange ubiProd1PageVisitChange, String str) {
        ubiProd1PageVisitChange.getClass();
        str.getClass();
        ubiProd1PageVisitChange.bitField0_ |= 64;
        ubiProd1PageVisitChange.clientTimezone_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m14807v(UbiProd1PageVisitChange ubiProd1PageVisitChange, String str) {
        ubiProd1PageVisitChange.getClass();
        str.getClass();
        ubiProd1PageVisitChange.bitField0_ |= 16;
        ubiProd1PageVisitChange.navigationReason_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m14808w(UbiProd1PageVisitChange ubiProd1PageVisitChange, String str) {
        ubiProd1PageVisitChange.getClass();
        str.getClass();
        ubiProd1PageVisitChange.bitField0_ |= 8;
        ubiProd1PageVisitChange.pageId_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m14809x(UbiProd1PageVisitChange ubiProd1PageVisitChange, int i) {
        ubiProd1PageVisitChange.bitField0_ |= 2;
        ubiProd1PageVisitChange.pagePresentationId_ = i;
    }

    /* JADX INFO: renamed from: y */
    public static void m14810y(UbiProd1PageVisitChange ubiProd1PageVisitChange, String str) {
        ubiProd1PageVisitChange.getClass();
        str.getClass();
        ubiProd1PageVisitChange.bitField0_ |= 1;
        ubiProd1PageVisitChange.pageVisitId_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static void m14811z(UbiProd1PageVisitChange ubiProd1PageVisitChange, int i) {
        ubiProd1PageVisitChange.bitField0_ |= 4;
        ubiProd1PageVisitChange.previousPagePresentationId_ = i;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0001\u0007\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005\u001a\u0006\u001a\u0007\u001a\b\u001a\t\u001a\n\u001a\u000bဈ\u0004\fဂ\u0005\rဈ\u0006\u000eဈ\u0007\u000f2\u0010\u001a\u0011ဈ\b\u0012ဈ\t", new Object[]{"bitField0_", "pageVisitId_", "pagePresentationId_", "previousPagePresentationId_", "pageId_", "pathNames_", "pathPos_", "pathIds_", "pathUris_", "pathReasons_", "pathSpecificationVersions_", "navigationReason_", "changeTimestamp_", "clientTimezone_", "sceneId_", "clientDebugMetadata_", lw91.f137491a, "errors_", "feature_", "pageIdentifier_"});
        }
        if (iOrdinal == 3) {
            return new UbiProd1PageVisitChange();
        }
        if (iOrdinal == 4) {
            return new kw91(DEFAULT_INSTANCE);
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
        synchronized (UbiProd1PageVisitChange.class) {
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
