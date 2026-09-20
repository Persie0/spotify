package com.spotify.playback_settings.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Iterator;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.n350;
import p204p.ore0;
import p204p.pre0;
import p204p.q2p0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u2p0;
import p204p.ud50;
import p204p.ui5;
import p204p.vd50;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaybackSettingsEsperantoService$GetSettingsRequest extends AbstractC0269h implements sre0 {
    public static final int CONTENT_IDS_FIELD_NUMBER = 2;
    private static final PlaybackSettingsEsperantoService$GetSettingsRequest DEFAULT_INSTANCE;
    public static final int INCLUDE_USER_SETTINGS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REQUESTED_SETTING_FIELDS_FIELD_NUMBER = 1;
    private static final vd50 requestedSettingFields_converter_ = new ui5(20);
    private int bitField0_;
    private boolean includeUserSettings_;
    private int requestedSettingFieldsMemoizedSerializedSize;
    private ud50 requestedSettingFields_ = AbstractC0269h.emptyIntList();
    private ae50 contentIds_ = AbstractC0269h.emptyProtobufList();

    static {
        PlaybackSettingsEsperantoService$GetSettingsRequest playbackSettingsEsperantoService$GetSettingsRequest = new PlaybackSettingsEsperantoService$GetSettingsRequest();
        DEFAULT_INSTANCE = playbackSettingsEsperantoService$GetSettingsRequest;
        AbstractC0269h.registerDefaultInstance(PlaybackSettingsEsperantoService$GetSettingsRequest.class, playbackSettingsEsperantoService$GetSettingsRequest);
    }

    private PlaybackSettingsEsperantoService$GetSettingsRequest() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m17584n(PlaybackSettingsEsperantoService$GetSettingsRequest playbackSettingsEsperantoService$GetSettingsRequest, List list) {
        ud50 ud50Var = playbackSettingsEsperantoService$GetSettingsRequest.requestedSettingFields_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            playbackSettingsEsperantoService$GetSettingsRequest.requestedSettingFields_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q2p0 q2p0Var = (q2p0) it.next();
            ((n350) playbackSettingsEsperantoService$GetSettingsRequest.requestedSettingFields_).m63581b(q2p0Var.getNumber());
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m17585o(PlaybackSettingsEsperantoService$GetSettingsRequest playbackSettingsEsperantoService$GetSettingsRequest, String str) {
        playbackSettingsEsperantoService$GetSettingsRequest.getClass();
        str.getClass();
        ae50 ae50Var = playbackSettingsEsperantoService$GetSettingsRequest.contentIds_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            playbackSettingsEsperantoService$GetSettingsRequest.contentIds_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        playbackSettingsEsperantoService$GetSettingsRequest.contentIds_.add(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static void m17586p(PlaybackSettingsEsperantoService$GetSettingsRequest playbackSettingsEsperantoService$GetSettingsRequest, q2p0 q2p0Var) {
        playbackSettingsEsperantoService$GetSettingsRequest.getClass();
        ud50 ud50Var = playbackSettingsEsperantoService$GetSettingsRequest.requestedSettingFields_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            playbackSettingsEsperantoService$GetSettingsRequest.requestedSettingFields_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        ((n350) playbackSettingsEsperantoService$GetSettingsRequest.requestedSettingFields_).m63581b(q2p0Var.getNumber());
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17587q(PlaybackSettingsEsperantoService$GetSettingsRequest playbackSettingsEsperantoService$GetSettingsRequest, boolean z) {
        playbackSettingsEsperantoService$GetSettingsRequest.bitField0_ |= 1;
        playbackSettingsEsperantoService$GetSettingsRequest.includeUserSettings_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static u2p0 m17588r() {
        return (u2p0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001,\u0002Ț\u0003ဇ\u0000", new Object[]{"bitField0_", "requestedSettingFields_", "contentIds_", "includeUserSettings_"});
        }
        if (iOrdinal == 3) {
            return new PlaybackSettingsEsperantoService$GetSettingsRequest();
        }
        if (iOrdinal == 4) {
            return new u2p0(DEFAULT_INSTANCE);
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
        synchronized (PlaybackSettingsEsperantoService$GetSettingsRequest.class) {
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
