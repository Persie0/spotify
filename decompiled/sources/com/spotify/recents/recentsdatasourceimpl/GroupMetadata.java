package com.spotify.recents.recentsdatasourceimpl;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.ae50;
import p204p.ihc0;
import p204p.iw10;
import p204p.m720;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class GroupMetadata extends AbstractC0269h implements sre0 {
    private static final GroupMetadata DEFAULT_INSTANCE;
    public static final int ENTITY_URIS_FIELD_NUMBER = 2;
    public static final int FILTERED_COUNT_FIELD_NUMBER = 4;
    public static final int GROUP_NAME_FIELD_NUMBER = 5;
    public static final int ITEMS_COUNT_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int USER_URIS_FIELD_NUMBER = 3;
    private int itemsCount_;
    private ihc0 filteredCount_ = ihc0.f102235b;
    private ae50 entityUris_ = AbstractC0269h.emptyProtobufList();
    private ae50 userUris_ = AbstractC0269h.emptyProtobufList();
    private String groupName_ = "";

    static {
        GroupMetadata groupMetadata = new GroupMetadata();
        DEFAULT_INSTANCE = groupMetadata;
        AbstractC0269h.registerDefaultInstance(GroupMetadata.class, groupMetadata);
    }

    private GroupMetadata() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static GroupMetadata m20334s(byte[] bArr) {
        return (GroupMetadata) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0002\u0000\u0001\u0004\u0002Ț\u0003Ț\u00042\u0005Ȉ", new Object[]{"itemsCount_", "entityUris_", "userUris_", "filteredCount_", m720.f140630a, "groupName_"});
        }
        if (iOrdinal == 3) {
            return new GroupMetadata();
        }
        if (iOrdinal == 4) {
            return new iw10(15);
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
        synchronized (GroupMetadata.class) {
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

    public final int getItemsCount() {
        return this.itemsCount_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m20335o() {
        return this.entityUris_;
    }

    /* JADX INFO: renamed from: p */
    public final Map m20336p() {
        return Collections.unmodifiableMap(this.filteredCount_);
    }

    /* JADX INFO: renamed from: q */
    public final String m20337q() {
        return this.groupName_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m20338r() {
        return this.userUris_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
