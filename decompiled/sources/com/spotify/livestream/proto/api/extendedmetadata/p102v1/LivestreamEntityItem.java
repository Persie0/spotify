package com.spotify.livestream.proto.api.extendedmetadata.p102v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.lj90;
import p204p.ms90;
import p204p.ns90;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class LivestreamEntityItem extends AbstractC0269h implements sre0 {
    public static final int CAN_OBSERVE_FIELD_NUMBER = 16;
    public static final int CTA_DISPLAY_FIELD_NUMBER = 18;
    public static final int DEEPLINK_URL_FIELD_NUMBER = 6;
    private static final LivestreamEntityItem DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int END_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int ENTITY_URIS_FIELD_NUMBER = 8;
    public static final int HOSTS_FIELD_NUMBER = 3;
    public static final int IMAGE_URL_FIELD_NUMBER = 11;
    public static final int IS_LISTEN_ONLY_FIELD_NUMBER = 19;
    public static final int OPTED_IN_FIELD_NUMBER = 13;
    public static final int PARENT_FIELD_NUMBER = 12;
    private static volatile r2n0 PARSER = null;
    public static final int PARTY_ACCESS_RESTRICTED_FIELD_NUMBER = 15;
    public static final int ROOM_STATE_FIELD_NUMBER = 10;
    public static final int ROOM_URI_FIELD_NUMBER = 7;
    public static final int RSVP_STATUS_FIELD_NUMBER = 17;
    public static final int START_TIMESTAMP_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int USER_RSVPED_FIELD_NUMBER = 14;
    public static final int VOTING_ROOT_URI_FIELD_NUMBER = 20;
    private boolean canObserve_;
    private int ctaDisplay_;
    private long endTimestamp_;
    private boolean isListenOnly_;
    private boolean optedIn_;
    private boolean partyAccessRestricted_;
    private int roomState_;
    private int rsvpStatus_;
    private long startTimestamp_;
    private boolean userRsvped_;
    private String title_ = "";
    private String description_ = "";
    private ae50 hosts_ = AbstractC0269h.emptyProtobufList();
    private String deeplinkUrl_ = "";
    private String roomUri_ = "";
    private ae50 entityUris_ = AbstractC0269h.emptyProtobufList();
    private String imageUrl_ = "";
    private ae50 parent_ = AbstractC0269h.emptyProtobufList();
    private String votingRootUri_ = "";

    static {
        LivestreamEntityItem livestreamEntityItem = new LivestreamEntityItem();
        DEFAULT_INSTANCE = livestreamEntityItem;
        AbstractC0269h.registerDefaultInstance(LivestreamEntityItem.class, livestreamEntityItem);
    }

    private LivestreamEntityItem() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static LivestreamEntityItem m13121r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final String m13122A() {
        return this.votingRootUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0013\u0000\u0000\u0001\u0014\u0013\u0000\u0003\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u0002\u0005\u0002\u0006Ȉ\u0007Ȉ\bȚ\n\f\u000bȈ\f\u001b\r\u0007\u000e\u0007\u000f\u0007\u0010\u0007\u0011\f\u0012\f\u0013\u0007\u0014Ȉ", new Object[]{"title_", "description_", "hosts_", LivestreamHost.class, "startTimestamp_", "endTimestamp_", "deeplinkUrl_", "roomUri_", "entityUris_", "roomState_", "imageUrl_", "parent_", ParentInfo.class, "optedIn_", "userRsvped_", "partyAccessRestricted_", "canObserve_", "rsvpStatus_", "ctaDisplay_", "isListenOnly_", "votingRootUri_"});
        }
        if (iOrdinal == 3) {
            return new LivestreamEntityItem();
        }
        if (iOrdinal == 4) {
            return new lj90(10);
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
        synchronized (LivestreamEntityItem.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m13123o() {
        return this.canObserve_;
    }

    /* JADX INFO: renamed from: p */
    public final ms90 m13124p() {
        ms90 ms90VarM62705a = ms90.m62705a(this.ctaDisplay_);
        return ms90VarM62705a == null ? ms90.UNRECOGNIZED : ms90VarM62705a;
    }

    /* JADX INFO: renamed from: q */
    public final String m13125q() {
        return this.deeplinkUrl_;
    }

    /* JADX INFO: renamed from: s */
    public final long m13126s() {
        return this.endTimestamp_;
    }

    /* JADX INFO: renamed from: t */
    public final ae50 m13127t() {
        return this.entityUris_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final ae50 m13128u() {
        return this.hosts_;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m13129v() {
        return this.isListenOnly_;
    }

    /* JADX INFO: renamed from: w */
    public final ae50 m13130w() {
        return this.parent_;
    }

    /* JADX INFO: renamed from: x */
    public final ns90 m13131x() {
        ns90 ns90VarM65507a = ns90.m65507a(this.roomState_);
        return ns90VarM65507a == null ? ns90.UNRECOGNIZED : ns90VarM65507a;
    }

    /* JADX INFO: renamed from: y */
    public final String m13132y() {
        return this.roomUri_;
    }

    /* JADX INFO: renamed from: z */
    public final long m13133z() {
        return this.startTimestamp_;
    }
}
