package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zmp0;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistRequest$Collaborators extends AbstractC0269h implements sre0 {
    public static final int COLLABORATOR_FIELD_NUMBER = 2;
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final PlaylistRequest$Collaborators DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ae50 collaborator_ = AbstractC0269h.emptyProtobufList();
    private int count_;

    static {
        PlaylistRequest$Collaborators playlistRequest$Collaborators = new PlaylistRequest$Collaborators();
        DEFAULT_INSTANCE = playlistRequest$Collaborators;
        AbstractC0269h.registerDefaultInstance(PlaylistRequest$Collaborators.class, playlistRequest$Collaborators);
    }

    private PlaylistRequest$Collaborators() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static PlaylistRequest$Collaborators m18576q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဋ\u0000\u0002\u001b", new Object[]{"bitField0_", "count_", "collaborator_", PlaylistRequest$Collaborator.class});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequest$Collaborators();
        }
        if (iOrdinal == 4) {
            return new zmp0(8);
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
        synchronized (PlaylistRequest$Collaborators.class) {
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

    /* JADX INFO: renamed from: o */
    public final ae50 m18577o() {
        return this.collaborator_;
    }

    /* JADX INFO: renamed from: p */
    public final int m18578p() {
        return this.count_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
