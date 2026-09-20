package spotify.playlist.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.dkp0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class PlaylistFindRequest extends AbstractC0269h implements sre0 {
    private static final PlaylistFindRequest DEFAULT_INSTANCE;
    public static final int ITEM_URIS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 1;
    private String playlistUri_ = "";
    private ae50 itemUris_ = AbstractC0269h.emptyProtobufList();

    static {
        PlaylistFindRequest playlistFindRequest = new PlaylistFindRequest();
        DEFAULT_INSTANCE = playlistFindRequest;
        AbstractC0269h.registerDefaultInstance(PlaylistFindRequest.class, playlistFindRequest);
    }

    private PlaylistFindRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97661n(PlaylistFindRequest playlistFindRequest, List list) {
        ae50 ae50Var = playlistFindRequest.itemUris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            playlistFindRequest.itemUris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(list, playlistFindRequest.itemUris_);
    }

    /* JADX INFO: renamed from: o */
    public static void m97662o(PlaylistFindRequest playlistFindRequest, String str) {
        playlistFindRequest.getClass();
        str.getClass();
        playlistFindRequest.playlistUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static dkp0 m97663p() {
        return (dkp0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"playlistUri_", "itemUris_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistFindRequest();
        }
        if (iOrdinal == 4) {
            return new dkp0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistFindRequest.class) {
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
