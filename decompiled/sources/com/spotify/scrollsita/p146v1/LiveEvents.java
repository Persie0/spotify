package com.spotify.scrollsita.p146v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.al90;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class LiveEvents extends AbstractC0269h implements sre0 {
    public static final int ARTISTURI_FIELD_NUMBER = 2;
    public static final int CONCERT_URI_FIELD_NUMBER = 1;
    private static final LiveEvents DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private ae50 concertUri_ = AbstractC0269h.emptyProtobufList();
    private String artistUri_ = "";

    static {
        LiveEvents liveEvents = new LiveEvents();
        DEFAULT_INSTANCE = liveEvents;
        AbstractC0269h.registerDefaultInstance(LiveEvents.class, liveEvents);
    }

    private LiveEvents() {
    }

    /* JADX INFO: renamed from: o */
    public static LiveEvents m20525o() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static al90 m20526p() {
        return (al90) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002Ȉ", new Object[]{"concertUri_", "artistUri_"});
        }
        if (iOrdinal == 3) {
            return new LiveEvents();
        }
        if (iOrdinal == 4) {
            return new al90(DEFAULT_INSTANCE);
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
        synchronized (LiveEvents.class) {
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
    public final String m20527n() {
        return this.artistUri_;
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
