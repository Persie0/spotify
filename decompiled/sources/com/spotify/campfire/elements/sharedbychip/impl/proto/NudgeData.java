package com.spotify.campfire.elements.sharedbychip.impl.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.bpj0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class NudgeData extends AbstractC0269h implements sre0 {
    private static final NudgeData DEFAULT_INSTANCE;
    public static final int HIERARCHY_ID_FIELD_NUMBER = 4;
    public static final int NODE_PATH_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SHARED_TIMESTAMP_FIELD_NUMBER = 3;
    public static final int SHARE_INITIATOR_USERNAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private Timestamp sharedTimestamp_;
    private String shareInitiatorUsername_ = "";
    private String nodePathId_ = "";
    private String hierarchyId_ = "";

    static {
        NudgeData nudgeData = new NudgeData();
        DEFAULT_INSTANCE = nudgeData;
        AbstractC0269h.registerDefaultInstance(NudgeData.class, nudgeData);
    }

    private NudgeData() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ", new Object[]{"bitField0_", "shareInitiatorUsername_", "nodePathId_", "sharedTimestamp_", "hierarchyId_"});
        }
        if (iOrdinal == 3) {
            return new NudgeData();
        }
        if (iOrdinal == 4) {
            return new bpj0(DEFAULT_INSTANCE, 8);
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
        synchronized (NudgeData.class) {
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

    public final String getNodePathId() {
        return this.nodePathId_;
    }

    /* JADX INFO: renamed from: n */
    public final String m5457n() {
        return this.shareInitiatorUsername_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Timestamp m5458o() {
        Timestamp timestamp = this.sharedTimestamp_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
