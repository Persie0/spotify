package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Iterator;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.a3p0;
import p204p.n350;
import p204p.ore0;
import p204p.pre0;
import p204p.q2p0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.z110;
import p204p.zi5;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaybackSettingsEsperantoService$StreamSettingChangesRequest extends AbstractC0269h implements sre0 {
    private static final PlaybackSettingsEsperantoService$StreamSettingChangesRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REQUESTED_SETTING_FIELDS_FIELD_NUMBER = 1;
    private static final vd50 requestedSettingFields_converter_ = new zi5(20);
    private int requestedSettingFieldsMemoizedSerializedSize;
    private ud50 requestedSettingFields_ = AbstractC0269h.emptyIntList();

    static {
        PlaybackSettingsEsperantoService$StreamSettingChangesRequest playbackSettingsEsperantoService$StreamSettingChangesRequest = new PlaybackSettingsEsperantoService$StreamSettingChangesRequest();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$StreamSettingChangesRequest;
        AbstractC0269h.registerDefaultInstance(PlaybackSettingsEsperantoService$StreamSettingChangesRequest.class, playbackSettingsEsperantoService$StreamSettingChangesRequest);
    }

    private PlaybackSettingsEsperantoService$StreamSettingChangesRequest() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m17616n(PlaybackSettingsEsperantoService$StreamSettingChangesRequest playbackSettingsEsperantoService$StreamSettingChangesRequest, List list) {
        ud50 ud50Var = playbackSettingsEsperantoService$StreamSettingChangesRequest.requestedSettingFields_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            playbackSettingsEsperantoService$StreamSettingChangesRequest.requestedSettingFields_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q2p0 q2p0Var = (q2p0) it.next();
            ((n350) playbackSettingsEsperantoService$StreamSettingChangesRequest.requestedSettingFields_).m63581b(q2p0Var.getNumber());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static void m17617o(PlaybackSettingsEsperantoService$StreamSettingChangesRequest playbackSettingsEsperantoService$StreamSettingChangesRequest, q2p0 q2p0Var) {
        playbackSettingsEsperantoService$StreamSettingChangesRequest.getClass();
        ud50 ud50Var = playbackSettingsEsperantoService$StreamSettingChangesRequest.requestedSettingFields_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            playbackSettingsEsperantoService$StreamSettingChangesRequest.requestedSettingFields_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) playbackSettingsEsperantoService$StreamSettingChangesRequest.requestedSettingFields_).m63581b(q2p0Var.getNumber());
    }

    /* JADX INFO: renamed from: p */
    public static a3p0 m17618p() {
        return (a3p0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"requestedSettingFields_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$StreamSettingChangesRequest();
        }
        if (iOrdinal == 4) {
            return new a3p0(DEFAULT_INSTANCE);
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
        synchronized (PlaybackSettingsEsperantoService$StreamSettingChangesRequest.class) {
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
