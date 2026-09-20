package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.d3v0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class RecentlyPlayedProfileDecorationPolicy extends AbstractC0269h implements sre0 {
    private static final RecentlyPlayedProfileDecorationPolicy DEFAULT_INSTANCE;
    public static final int IMAGE_URI_FIELD_NUMBER = 3;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int OFFLINE_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 5;
    private boolean imageUri_;
    private boolean link_;
    private boolean name_;
    private boolean offline_;
    private boolean timestamp_;
    private boolean type_;

    static {
        RecentlyPlayedProfileDecorationPolicy recentlyPlayedProfileDecorationPolicy = new RecentlyPlayedProfileDecorationPolicy();
        DEFAULT_INSTANCE = recentlyPlayedProfileDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(RecentlyPlayedProfileDecorationPolicy.class, recentlyPlayedProfileDecorationPolicy);
    }

    private RecentlyPlayedProfileDecorationPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20290n(RecentlyPlayedProfileDecorationPolicy recentlyPlayedProfileDecorationPolicy) {
        recentlyPlayedProfileDecorationPolicy.imageUri_ = true;
    }

    /* JADX INFO: renamed from: o */
    public static void m20291o(RecentlyPlayedProfileDecorationPolicy recentlyPlayedProfileDecorationPolicy) {
        recentlyPlayedProfileDecorationPolicy.link_ = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m20292p(RecentlyPlayedProfileDecorationPolicy recentlyPlayedProfileDecorationPolicy) {
        recentlyPlayedProfileDecorationPolicy.name_ = true;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m20293q(RecentlyPlayedProfileDecorationPolicy recentlyPlayedProfileDecorationPolicy) {
        recentlyPlayedProfileDecorationPolicy.offline_ = true;
    }

    /* JADX INFO: renamed from: r */
    public static void m20294r(RecentlyPlayedProfileDecorationPolicy recentlyPlayedProfileDecorationPolicy) {
        recentlyPlayedProfileDecorationPolicy.timestamp_ = true;
    }

    /* JADX INFO: renamed from: s */
    public static void m20295s(RecentlyPlayedProfileDecorationPolicy recentlyPlayedProfileDecorationPolicy) {
        recentlyPlayedProfileDecorationPolicy.type_ = true;
    }

    /* JADX INFO: renamed from: t */
    public static d3v0 m20296t() {
        return (d3v0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007", new Object[]{"link_", "name_", "imageUri_", "offline_", "type_", "timestamp_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedProfileDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new d3v0(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedProfileDecorationPolicy.class) {
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
