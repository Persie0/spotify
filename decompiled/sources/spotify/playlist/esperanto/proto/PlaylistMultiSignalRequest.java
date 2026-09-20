package spotify.playlist.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.enp0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class PlaylistMultiSignalRequest extends AbstractC0269h implements sre0 {
    private static final PlaylistMultiSignalRequest DEFAULT_INSTANCE;
    public static final int LENSES_FIELD_NUMBER = 3;
    public static final int LIST_URI_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SIGNALS_FIELD_NUMBER = 2;
    private String listUri_ = "";
    private ae50 signals_ = AbstractC0269h.emptyProtobufList();
    private ae50 lenses_ = AbstractC0269h.emptyProtobufList();

    static {
        PlaylistMultiSignalRequest playlistMultiSignalRequest = new PlaylistMultiSignalRequest();
        DEFAULT_INSTANCE = playlistMultiSignalRequest;
        AbstractC0269h.registerDefaultInstance(PlaylistMultiSignalRequest.class, playlistMultiSignalRequest);
    }

    private PlaylistMultiSignalRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97709n(PlaylistMultiSignalRequest playlistMultiSignalRequest, Iterable iterable) {
        ae50 ae50Var = playlistMultiSignalRequest.lenses_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            playlistMultiSignalRequest.lenses_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, playlistMultiSignalRequest.lenses_);
    }

    /* JADX INFO: renamed from: o */
    public static void m97710o(PlaylistMultiSignalRequest playlistMultiSignalRequest, ArrayList arrayList) {
        ae50 ae50Var = playlistMultiSignalRequest.signals_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            playlistMultiSignalRequest.signals_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, playlistMultiSignalRequest.signals_);
    }

    /* JADX INFO: renamed from: p */
    public static void m97711p(PlaylistMultiSignalRequest playlistMultiSignalRequest, String str) {
        playlistMultiSignalRequest.getClass();
        str.getClass();
        playlistMultiSignalRequest.listUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static enp0 m97712q() {
        return (enp0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003Ț", new Object[]{"listUri_", "signals_", Signal.class, "lenses_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistMultiSignalRequest();
        }
        if (iOrdinal == 4) {
            return new enp0(DEFAULT_INSTANCE);
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
        synchronized (PlaylistMultiSignalRequest.class) {
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
