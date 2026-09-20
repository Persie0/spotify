package com.spotify.campfire.sharelist.impl.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.campfire.datasource.impl.proto.CreateGroupOptions;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rd11;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class SharelistResponse extends AbstractC0269h implements sre0 {
    public static final int CREATE_GROUP_OPTIONS_FIELD_NUMBER = 4;
    private static final SharelistResponse DEFAULT_INSTANCE;
    public static final int GROUP_SIZE_LIMIT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SHARELIST_ITEM_FIELD_NUMBER = 1;
    public static final int SUGGESTIONS_DISABLED_FIELD_NUMBER = 3;
    private int bitField0_;
    private CreateGroupOptions createGroupOptions_;
    private int groupSizeLimit_;
    private ae50 sharelistItem_ = AbstractC0269h.emptyProtobufList();
    private boolean suggestionsDisabled_;

    static {
        SharelistResponse sharelistResponse = new SharelistResponse();
        DEFAULT_INSTANCE = sharelistResponse;
        AbstractC0269h.registerDefaultInstance(SharelistResponse.class, sharelistResponse);
    }

    private SharelistResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003\u0007\u0004ဉ\u0001", new Object[]{"bitField0_", "sharelistItem_", SharelistItem.class, "groupSizeLimit_", "suggestionsDisabled_", "createGroupOptions_"});
        }
        if (iOrdinal == 3) {
            return new SharelistResponse();
        }
        if (iOrdinal == 4) {
            return new rd11(DEFAULT_INSTANCE);
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
        synchronized (SharelistResponse.class) {
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

    public final CreateGroupOptions getCreateGroupOptions() {
        CreateGroupOptions createGroupOptions = this.createGroupOptions_;
        return createGroupOptions == null ? CreateGroupOptions.getDefaultInstance() : createGroupOptions;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final boolean hasCreateGroupOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final int m5498n() {
        return this.groupSizeLimit_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m5499o() {
        return this.sharelistItem_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m5500p() {
        return this.suggestionsDisabled_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m5501q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
