package spotify.spotbot.p212v2.promptable_playlist;

import com.google.protobuf.AbstractC0269h;
import p204p.c8s0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Promptableplaylist$CreatePromptablePlaylistResponse extends AbstractC0269h implements sre0 {
    private static final Promptableplaylist$CreatePromptablePlaylistResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_METADATA_FIELD_NUMBER = 3;
    public static final int SPOTBOT_URI_FIELD_NUMBER = 2;
    public static final int VIOLATING_TRUST_AND_SAFETY_FIELD_NUMBER = 1;
    private int bitField0_;
    private Promptableplaylist$PlaylistMetadata playlistMetadata_;
    private String spotbotUri_ = "";
    private boolean violatingTrustAndSafety_;

    static {
        Promptableplaylist$CreatePromptablePlaylistResponse promptableplaylist$CreatePromptablePlaylistResponse = new Promptableplaylist$CreatePromptablePlaylistResponse();
        DEFAULT_INSTANCE = promptableplaylist$CreatePromptablePlaylistResponse;
        AbstractC0269h.registerDefaultInstance(Promptableplaylist$CreatePromptablePlaylistResponse.class, promptableplaylist$CreatePromptablePlaylistResponse);
    }

    private Promptableplaylist$CreatePromptablePlaylistResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "violatingTrustAndSafety_", "spotbotUri_", "playlistMetadata_"});
        }
        if (iOrdinal == 3) {
            return new Promptableplaylist$CreatePromptablePlaylistResponse();
        }
        if (iOrdinal == 4) {
            return new c8s0(DEFAULT_INSTANCE, 15);
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
        synchronized (Promptableplaylist$CreatePromptablePlaylistResponse.class) {
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
    public final Promptableplaylist$PlaylistMetadata m98018n() {
        Promptableplaylist$PlaylistMetadata promptableplaylist$PlaylistMetadata = this.playlistMetadata_;
        return promptableplaylist$PlaylistMetadata == null ? Promptableplaylist$PlaylistMetadata.m98029n() : promptableplaylist$PlaylistMetadata;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m98019o() {
        return this.spotbotUri_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m98020p() {
        return this.violatingTrustAndSafety_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
