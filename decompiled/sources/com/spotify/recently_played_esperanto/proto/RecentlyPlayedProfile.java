package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u6u0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class RecentlyPlayedProfile extends AbstractC0269h implements sre0 {
    public static final int ADD_TIME_FIELD_NUMBER = 6;
    private static final RecentlyPlayedProfile DEFAULT_INSTANCE;
    public static final int IMAGE_URI_FIELD_NUMBER = 3;
    public static final int LINK_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int OFFLINE_STATE_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int TYPE_STR_FIELD_NUMBER = 7;
    private int addTime_;
    private int offlineState_;
    private int type_;
    private String link_ = "";
    private String name_ = "";
    private String imageUri_ = "";
    private String typeStr_ = "";

    static {
        RecentlyPlayedProfile recentlyPlayedProfile = new RecentlyPlayedProfile();
        DEFAULT_INSTANCE = recentlyPlayedProfile;
        AbstractC0269h.registerDefaultInstance(RecentlyPlayedProfile.class, recentlyPlayedProfile);
    }

    private RecentlyPlayedProfile() {
    }

    /* JADX INFO: renamed from: n */
    public static RecentlyPlayedProfile m20286n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u000b\u0005\u000b\u0006\u000b\u0007Ȉ", new Object[]{"link_", "name_", "imageUri_", "offlineState_", "type_", "addTime_", "typeStr_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedProfile();
        }
        if (iOrdinal == 4) {
            return new u6u0(DEFAULT_INSTANCE, 19);
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
        synchronized (RecentlyPlayedProfile.class) {
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

    public final String getLink() {
        return this.link_;
    }

    public final String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m20287o() {
        return this.imageUri_;
    }

    /* JADX INFO: renamed from: p */
    public final int m20288p() {
        return this.offlineState_;
    }

    /* JADX INFO: renamed from: q */
    public final String m20289q() {
        return this.typeStr_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
