package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.watchfeed.component.model.p187v1.proto.Artist;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vnw;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class EventData extends AbstractC0269h implements sre0 {
    public static final int ARTIST_CONCERTS_URI_FIELD_NUMBER = 4;
    public static final int ARTIST_FIELD_NUMBER = 1;
    private static final EventData DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 2;
    public static final int IS_NEARBY_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TOTAL_EVENT_COUNT_FIELD_NUMBER = 5;
    private Artist artist_;
    private int bitField0_;
    private boolean isNearby_;
    private int totalEventCount_;
    private ae50 events_ = AbstractC0269h.emptyProtobufList();
    private String artistConcertsUri_ = "";

    static {
        EventData eventData = new EventData();
        DEFAULT_INSTANCE = eventData;
        AbstractC0269h.registerDefaultInstance(EventData.class, eventData);
    }

    private EventData() {
    }

    /* JADX INFO: renamed from: p */
    public static EventData m22644p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u0007\u0004Ȉ\u0005\u0004", new Object[]{"bitField0_", "artist_", "events_", Event.class, "isNearby_", "artistConcertsUri_", "totalEventCount_"});
        }
        if (iOrdinal == 3) {
            return new EventData();
        }
        if (iOrdinal == 4) {
            return new vnw(DEFAULT_INSTANCE, 22);
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
        synchronized (EventData.class) {
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
    public final Artist m22645n() {
        Artist artist = this.artist_;
        return artist == null ? Artist.m22877n() : artist;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m22646o() {
        return this.artistConcertsUri_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m22647q() {
        return this.events_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m22648r() {
        return this.isNearby_;
    }

    /* JADX INFO: renamed from: s */
    public final int m22649s() {
        return this.totalEventCount_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
