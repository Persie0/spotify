package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xa10;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class GetRecentlyPlayedTracksResponse extends AbstractC0269h implements sre0 {
    private static final GetRecentlyPlayedTracksResponse DEFAULT_INSTANCE;
    public static final int ENTITY_FIELD_NUMBER = 1;
    public static final int ERROR_FIELD_NUMBER = 7;
    public static final int LOADED_FIELD_NUMBER = 3;
    public static final int MISSING_METADATA_COUNT_FIELD_NUMBER = 2;
    public static final int ORIGINAL_LENGTH_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 6;
    public static final int UNFILTERED_LENGTH_FIELD_NUMBER = 5;
    private ae50 entity_ = AbstractC0269h.emptyProtobufList();
    private String error_ = "";
    private boolean loaded_;
    private int missingMetadataCount_;
    private int originalLength_;
    private int status_;
    private int unfilteredLength_;

    static {
        GetRecentlyPlayedTracksResponse getRecentlyPlayedTracksResponse = new GetRecentlyPlayedTracksResponse();
        DEFAULT_INSTANCE = getRecentlyPlayedTracksResponse;
        AbstractC0269h.registerDefaultInstance(GetRecentlyPlayedTracksResponse.class, getRecentlyPlayedTracksResponse);
    }

    private GetRecentlyPlayedTracksResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static xa10 m20235o() {
        return (xa10) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: p */
    public static GetRecentlyPlayedTracksResponse m20236p(byte[] bArr) {
        return (GetRecentlyPlayedTracksResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002\u000b\u0003\u0007\u0004\u000b\u0005\u000b\u0006\u000b\u0007Ȉ", new Object[]{"entity_", RecentlyPlayedEntity.class, "missingMetadataCount_", "loaded_", "originalLength_", "unfilteredLength_", "status_", "error_"});
        }
        if (iOrdinal == 3) {
            return new GetRecentlyPlayedTracksResponse();
        }
        if (iOrdinal == 4) {
            return new xa10(DEFAULT_INSTANCE);
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
        synchronized (GetRecentlyPlayedTracksResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final ae50 m20237n() {
        return this.entity_;
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
