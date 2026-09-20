package com.spotify.fandomcollectibles.protos;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.q610;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class GetCollectibleDetailResponse extends AbstractC0269h implements sre0 {
    public static final int COLLECTIBLE_ID_FIELD_NUMBER = 1;
    private static final GetCollectibleDetailResponse DEFAULT_INSTANCE;
    public static final int NAVIGATE_URI_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int STORY_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 2;
    private String collectibleId_ = "";
    private String navigateUri_ = "";
    private ae50 story_ = AbstractC0269h.emptyProtobufList();
    private int type_;

    static {
        GetCollectibleDetailResponse getCollectibleDetailResponse = new GetCollectibleDetailResponse();
        DEFAULT_INSTANCE = getCollectibleDetailResponse;
        AbstractC0269h.registerDefaultInstance(GetCollectibleDetailResponse.class, getCollectibleDetailResponse);
    }

    private GetCollectibleDetailResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004\u001b", new Object[]{"collectibleId_", "type_", "navigateUri_", "story_", Story.class});
        }
        if (iOrdinal == 3) {
            return new GetCollectibleDetailResponse();
        }
        if (iOrdinal == 4) {
            return new q610(DEFAULT_INSTANCE, 12);
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
        synchronized (GetCollectibleDetailResponse.class) {
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
    public final String m10857n() {
        return this.collectibleId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10858o() {
        return this.navigateUri_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m10859p() {
        return this.story_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
