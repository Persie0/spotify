package com.spotify.campfire.insights.proto.p038v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ct31;
import p204p.lg41;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class SpotlightContent extends AbstractC0269h implements sre0 {
    private static final SpotlightContent DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLAY_COUNT_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 3;
    public static final int USERNAMES_FIELD_NUMBER = 5;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private int playCount_;
    private int type_;
    private String username_ = "";
    private String entityUri_ = "";
    private ae50 usernames_ = AbstractC0269h.emptyProtobufList();

    static {
        SpotlightContent spotlightContent = new SpotlightContent();
        DEFAULT_INSTANCE = spotlightContent;
        AbstractC0269h.registerDefaultInstance(SpotlightContent.class, spotlightContent);
    }

    private SpotlightContent() {
    }

    /* JADX INFO: renamed from: n */
    public static SpotlightContent m5474n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\u000b\u0005Ț", new Object[]{"username_", "entityUri_", "type_", "playCount_", "usernames_"});
        }
        if (iOrdinal == 3) {
            return new SpotlightContent();
        }
        if (iOrdinal == 4) {
            return new ct31(DEFAULT_INSTANCE, 13);
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
        synchronized (SpotlightContent.class) {
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

    public final String getUsername() {
        return this.username_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m5475o() {
        return this.entityUri_;
    }

    /* JADX INFO: renamed from: p */
    public final int m5476p() {
        return this.playCount_;
    }

    /* JADX INFO: renamed from: q */
    public final lg41 m5477q() {
        lg41 lg41Var;
        int i = this.type_;
        if (i == 0) {
            lg41Var = lg41.SPOTLIGHT_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            lg41Var = i != 2 ? null : lg41.SPOTLIGHT_TYPE_TOP_SONG;
        } else {
            lg41Var = lg41.SPOTLIGHT_TYPE_TOP_ARTIST;
        }
        return lg41Var == null ? lg41.UNRECOGNIZED : lg41Var;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m5478r() {
        return this.usernames_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
