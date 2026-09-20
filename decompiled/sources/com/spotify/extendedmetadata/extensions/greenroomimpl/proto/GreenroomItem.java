package com.spotify.extendedmetadata.extensions.greenroomimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.iw10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class GreenroomItem extends AbstractC0269h implements sre0 {
    public static final int ALLOWED_COUNTRIES_FIELD_NUMBER = 10;
    public static final int DEEPLINK_URL_FIELD_NUMBER = 5;
    private static final GreenroomItem DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int ENTITY_URIS_FIELD_NUMBER = 9;
    public static final int HOSTS_FIELD_NUMBER = 3;
    public static final int LIVE_FIELD_NUMBER = 6;
    public static final int OPTED_IN_FIELD_NUMBER = 11;
    private static volatile r2n0 PARSER = null;
    public static final int ROOM_ID_FIELD_NUMBER = 8;
    public static final int ROOM_URI_FIELD_NUMBER = 7;
    public static final int START_TIMESTAMP_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 1;
    private boolean live_;
    private boolean optedIn_;
    private long startTimestamp_;
    private String title_ = "";
    private String description_ = "";
    private ae50 hosts_ = AbstractC0269h.emptyProtobufList();
    private String deeplinkUrl_ = "";
    private String roomUri_ = "";
    private String roomId_ = "";
    private ae50 entityUris_ = AbstractC0269h.emptyProtobufList();
    private ae50 allowedCountries_ = AbstractC0269h.emptyProtobufList();

    static {
        GreenroomItem greenroomItem = new GreenroomItem();
        DEFAULT_INSTANCE = greenroomItem;
        AbstractC0269h.registerDefaultInstance(GreenroomItem.class, greenroomItem);
    }

    private GreenroomItem() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0003\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u0002\u0005Ȉ\u0006\u0007\u0007Ȉ\bȈ\tȚ\nȚ\u000b\u0007", new Object[]{"title_", "description_", "hosts_", GreenroomHost.class, "startTimestamp_", "deeplinkUrl_", "live_", "roomUri_", "roomId_", "entityUris_", "allowedCountries_", "optedIn_"});
        }
        if (iOrdinal == 3) {
            return new GreenroomItem();
        }
        if (iOrdinal == 4) {
            return new iw10(7);
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
        synchronized (GreenroomItem.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10144o() {
        return this.deeplinkUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m10145p() {
        return this.hosts_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m10146q() {
        return this.live_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m10147r() {
        return this.optedIn_;
    }

    /* JADX INFO: renamed from: s */
    public final String m10148s() {
        return this.roomUri_;
    }

    /* JADX INFO: renamed from: t */
    public final long m10149t() {
        return this.startTimestamp_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
