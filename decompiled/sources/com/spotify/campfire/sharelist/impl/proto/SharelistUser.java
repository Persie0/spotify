package com.spotify.campfire.sharelist.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.a6z0;
import p204p.kxa1;
import p204p.n350;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t36;
import p204p.ud50;
import p204p.vd50;
import p204p.wd50;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class SharelistUser extends AbstractC0269h implements sre0 {
    public static final int AGENT_URI_FIELD_NUMBER = 8;
    private static final SharelistUser DEFAULT_INSTANCE;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 5;
    public static final int HIERARCHY_REFERENCE_FIELD_NUMBER = 7;
    public static final int IS_ENABLED_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 3;
    public static final int SECTION_FIELD_NUMBER = 6;
    public static final int USERNAME_FIELD_NUMBER = 1;
    public static final int USER_STATUS_FIELD_NUMBER = 4;
    private static final vd50 reason_converter_ = new t36(25);
    private int bitField0_;
    private HierarchyReference hierarchyReference_;
    private boolean isEnabled_;
    private int reasonMemoizedSerializedSize;
    private int section_;
    private int userStatus_;
    private String username_ = "";
    private ud50 reason_ = AbstractC0269h.emptyIntList();
    private String hierarchyId_ = "";
    private String agentUri_ = "";

    public static final class HierarchyReference extends AbstractC0269h implements sre0 {
        private static final HierarchyReference DEFAULT_INSTANCE;
        public static final int HIERARCHY_EXISTS_FIELD_NUMBER = 2;
        public static final int HIERARCHY_ID_FIELD_NUMBER = 1;
        public static final int IS_ACTIVE_FIELD_NUMBER = 3;
        private static volatile r2n0 PARSER;
        private boolean hierarchyExists_;
        private String hierarchyId_ = "";
        private boolean isActive_;

        static {
            HierarchyReference hierarchyReference = new HierarchyReference();
            DEFAULT_INSTANCE = hierarchyReference;
            AbstractC0269h.registerDefaultInstance(HierarchyReference.class, hierarchyReference);
        }

        private HierarchyReference() {
        }

        /* JADX INFO: renamed from: n */
        public static HierarchyReference m5510n() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007", new Object[]{"hierarchyId_", "hierarchyExists_", "isActive_"});
            }
            if (iOrdinal == 3) {
                return new HierarchyReference();
            }
            if (iOrdinal == 4) {
                return new C0466d(DEFAULT_INSTANCE);
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
            synchronized (HierarchyReference.class) {
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

        public final String getHierarchyId() {
            return this.hierarchyId_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final boolean m5511o() {
            return this.hierarchyExists_;
        }

        /* JADX INFO: renamed from: p */
        public final boolean m5512p() {
            return this.isActive_;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        SharelistUser sharelistUser = new SharelistUser();
        DEFAULT_INSTANCE = sharelistUser;
        AbstractC0269h.registerDefaultInstance(SharelistUser.class, sharelistUser);
    }

    private SharelistUser() {
    }

    /* JADX INFO: renamed from: n */
    public static SharelistUser m5502n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002\u0007\u0003,\u0004\f\u0005ለ\u0000\u0006\f\u0007ဉ\u0001\bለ\u0002", new Object[]{"bitField0_", "username_", "isEnabled_", "reason_", "userStatus_", "hierarchyId_", "section_", "hierarchyReference_", "agentUri_"});
        }
        if (iOrdinal == 3) {
            return new SharelistUser();
        }
        if (iOrdinal == 4) {
            return new C0465c(DEFAULT_INSTANCE);
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
        synchronized (SharelistUser.class) {
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

    public final String getAgentUri() {
        return this.agentUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getUsername() {
        return this.username_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final HierarchyReference m5503o() {
        HierarchyReference hierarchyReference = this.hierarchyReference_;
        return hierarchyReference == null ? HierarchyReference.m5510n() : hierarchyReference;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m5504p() {
        return this.isEnabled_;
    }

    /* JADX INFO: renamed from: q */
    public final int m5505q() {
        return ((n350) this.reason_).size();
    }

    /* JADX INFO: renamed from: r */
    public final wd50 m5506r() {
        return new wd50(this.reason_, reason_converter_);
    }

    /* JADX INFO: renamed from: s */
    public final a6z0 m5507s() {
        a6z0 a6z0Var;
        int i = this.section_;
        if (i == 0) {
            a6z0Var = a6z0.SECTION_UNSPECIFIED;
        } else if (i != 1) {
            a6z0Var = i != 2 ? null : a6z0.SECTION_SUGGESTED;
        } else {
            a6z0Var = a6z0.SECTION_ACTIVE;
        }
        return a6z0Var == null ? a6z0.UNRECOGNIZED : a6z0Var;
    }

    /* JADX INFO: renamed from: t */
    public final kxa1 m5508t() {
        kxa1 kxa1Var;
        int i = this.userStatus_;
        if (i == 0) {
            kxa1Var = kxa1.USER_STATUS_UNSPECIFIED;
        } else if (i == 1) {
            kxa1Var = kxa1.USER_STATUS_ACTIVE;
        } else if (i == 2) {
            kxa1Var = kxa1.USER_STATUS_SUGGESTED_BUT_DISABLED;
        } else if (i != 3) {
            kxa1Var = i != 4 ? null : kxa1.USER_STATUS_NOT_ACCEPTED;
        } else {
            kxa1Var = kxa1.USER_STATUS_SUGGESTED;
        }
        return kxa1Var == null ? kxa1.UNRECOGNIZED : kxa1Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m5509u() {
        return (this.bitField0_ & 4) != 0;
    }
}
