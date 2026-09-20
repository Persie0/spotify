package com.spotify.campfire.sharelist.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ui01;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class SharelistGroup extends AbstractC0269h implements sre0 {
    private static final SharelistGroup DEFAULT_INSTANCE;
    public static final int GROUP_NAME_FIELD_NUMBER = 1;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int USERNAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String groupName_ = "";
    private ae50 username_ = AbstractC0269h.emptyProtobufList();
    private String hierarchyId_ = "";

    static {
        SharelistGroup sharelistGroup = new SharelistGroup();
        DEFAULT_INSTANCE = sharelistGroup;
        AbstractC0269h.registerDefaultInstance(SharelistGroup.class, sharelistGroup);
    }

    private SharelistGroup() {
    }

    /* JADX INFO: renamed from: n */
    public static SharelistGroup m5491n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ለ\u0000\u0003Ț\u0004ለ\u0001", new Object[]{"bitField0_", "groupName_", "username_", "hierarchyId_"});
        }
        if (iOrdinal == 3) {
            return new SharelistGroup();
        }
        if (iOrdinal == 4) {
            return new ui01(DEFAULT_INSTANCE, 24);
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
        synchronized (SharelistGroup.class) {
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
    public final String m5492o() {
        return this.groupName_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m5493p() {
        return this.username_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m5494q() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m5495r() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
