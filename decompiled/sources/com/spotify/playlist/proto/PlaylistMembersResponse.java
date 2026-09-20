package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.bvo0;
import p204p.g6f0;
import p204p.knn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PlaylistMembersResponse extends AbstractC0269h implements sre0 {
    public static final int BASE_PERMISSION_LEVEL_FIELD_NUMBER = 4;
    public static final int CAPABILITIES_FIELD_NUMBER = 3;
    private static final PlaylistMembersResponse DEFAULT_INSTANCE;
    public static final int MEMBERS_FIELD_NUMBER = 5;
    public static final int NUM_TOTAL_MEMBERS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int basePermissionLevel_;
    private int bitField0_;
    private Capabilities capabilities_;
    private int numTotalMembers_;
    private String title_ = "";
    private ae50 members_ = AbstractC0269h.emptyProtobufList();

    static {
        PlaylistMembersResponse playlistMembersResponse = new PlaylistMembersResponse();
        DEFAULT_INSTANCE = playlistMembersResponse;
        AbstractC0269h.registerDefaultInstance(PlaylistMembersResponse.class, playlistMembersResponse);
    }

    private PlaylistMembersResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static PlaylistMembersResponse m18535o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005\u001b", new Object[]{"bitField0_", "title_", "numTotalMembers_", "capabilities_", "basePermissionLevel_", g6f0.f77035h, "members_", Member.class});
        }
        if (iOrdinal == 3) {
            return new PlaylistMembersResponse();
        }
        if (iOrdinal == 4) {
            return new bvo0(DEFAULT_INSTANCE, 28);
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
        synchronized (PlaylistMembersResponse.class) {
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

    public final Capabilities getCapabilities() {
        Capabilities capabilities = this.capabilities_;
        return capabilities == null ? Capabilities.m18456w() : capabilities;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final knn0 m18536n() {
        knn0 knn0VarM56948a = knn0.m56948a(this.basePermissionLevel_);
        return knn0VarM56948a == null ? knn0.UNKNOWN : knn0VarM56948a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m18537p() {
        return this.members_;
    }

    /* JADX INFO: renamed from: q */
    public final int m18538q() {
        return this.numTotalMembers_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
