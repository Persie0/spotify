package com.spotify.your_library_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.aw2;
import p204p.ore0;
import p204p.pre0;
import p204p.qo3;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: loaded from: classes11.dex */
public final class AlsoAvailableOfflineSuggestion extends AbstractC0269h implements sre0 {
    public static final int CACHED_DURATION_SECONDS_FIELD_NUMBER = 6;
    public static final int CACHED_PERCENTAGE_FIELD_NUMBER = 5;
    public static final int CACHED_TRACK_COUNT_FIELD_NUMBER = 3;
    private static final AlsoAvailableOfflineSuggestion DEFAULT_INSTANCE;
    public static final int ENTITY_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TOTAL_TRACK_COUNT_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int cachedDurationSeconds_;
    private float cachedPercentage_;
    private int cachedTrackCount_;
    private YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity entity_;
    private int totalTrackCount_;
    private int type_;

    static {
        AlsoAvailableOfflineSuggestion alsoAvailableOfflineSuggestion = new AlsoAvailableOfflineSuggestion();
        DEFAULT_INSTANCE = alsoAvailableOfflineSuggestion;
        AbstractC0269h.registerDefaultInstance(AlsoAvailableOfflineSuggestion.class, alsoAvailableOfflineSuggestion);
    }

    private AlsoAvailableOfflineSuggestion() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u0004\u0004\u0004\u0005\u0001\u0006\u0004", new Object[]{"bitField0_", "entity_", "type_", "cachedTrackCount_", "totalTrackCount_", "cachedPercentage_", "cachedDurationSeconds_"});
        }
        if (iOrdinal == 3) {
            return new AlsoAvailableOfflineSuggestion();
        }
        if (iOrdinal == 4) {
            return new aw2(DEFAULT_INSTANCE, 9);
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
        synchronized (AlsoAvailableOfflineSuggestion.class) {
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
    public final int m23246n() {
        return this.cachedDurationSeconds_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m23247o() {
        return this.cachedTrackCount_;
    }

    /* JADX INFO: renamed from: p */
    public final YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity m23248p() {
        YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity = this.entity_;
        return yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity == null ? YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.m98254q() : yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;
    }

    /* JADX INFO: renamed from: q */
    public final int m23249q() {
        return this.totalTrackCount_;
    }

    /* JADX INFO: renamed from: r */
    public final qo3 m23250r() {
        qo3 qo3Var;
        int i = this.type_;
        if (i == 0) {
            qo3Var = qo3.ALSO_AVAILABLE_OFFLINE_SUGGESTION_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            qo3Var = qo3.ALSO_AVAILABLE_OFFLINE_SUGGESTION_TYPE_OFFLINE_BACKUP;
        } else if (i == 2) {
            qo3Var = qo3.ALSO_AVAILABLE_OFFLINE_SUGGESTION_TYPE_OFFLINE_ARTIST;
        } else if (i != 3) {
            qo3Var = i != 4 ? null : qo3.ALSO_AVAILABLE_OFFLINE_SUGGESTION_TYPE_CACHED_ALBUM;
        } else {
            qo3Var = qo3.ALSO_AVAILABLE_OFFLINE_SUGGESTION_TYPE_CACHED_PLAYLIST;
        }
        return qo3Var == null ? qo3.UNRECOGNIZED : qo3Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
