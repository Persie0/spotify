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
public final class Promptableplaylist$PlaylistMetadata extends AbstractC0269h implements sre0 {
    private static final Promptableplaylist$PlaylistMetadata DEFAULT_INSTANCE;
    public static final int LOCATION_SENSITIVE_FIELD_NUMBER = 14;
    public static final int OWNER_USERNAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_TITLE_FIELD_NUMBER = 3;
    public static final int PROMPT_FIELD_NUMBER = 1;
    public static final int PROMPT_SUMMARY_FIELD_NUMBER = 4;
    public static final int REFRESH_METADATA_FIELD_NUMBER = 6;
    public static final int STOP_PERSONALIZING_PLAYLIST_FIELD_NUMBER = 7;
    public static final int TRACKLIST_SUMMARY_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean locationSensitive_;
    private Promptableplaylist$RefreshMetadata refreshMetadata_;
    private boolean stopPersonalizingPlaylist_;
    private String prompt_ = "";
    private String ownerUsername_ = "";
    private String playlistTitle_ = "";
    private String promptSummary_ = "";
    private String tracklistSummary_ = "";

    static {
        Promptableplaylist$PlaylistMetadata promptableplaylist$PlaylistMetadata = new Promptableplaylist$PlaylistMetadata();
        DEFAULT_INSTANCE = promptableplaylist$PlaylistMetadata;
        AbstractC0269h.registerDefaultInstance(Promptableplaylist$PlaylistMetadata.class, promptableplaylist$PlaylistMetadata);
    }

    private Promptableplaylist$PlaylistMetadata() {
    }

    /* JADX INFO: renamed from: n */
    public static Promptableplaylist$PlaylistMetadata m98029n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\u000e\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0000\u0007\u0007\u000e\u0007", new Object[]{"bitField0_", "prompt_", "ownerUsername_", "playlistTitle_", "promptSummary_", "tracklistSummary_", "refreshMetadata_", "stopPersonalizingPlaylist_", "locationSensitive_"});
        }
        if (iOrdinal == 3) {
            return new Promptableplaylist$PlaylistMetadata();
        }
        if (iOrdinal == 4) {
            return new c8s0(DEFAULT_INSTANCE, 18);
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
        synchronized (Promptableplaylist$PlaylistMetadata.class) {
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
    public final boolean m98030o() {
        return this.locationSensitive_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
