package com.spotify.liveroom.listeningparty.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bpj0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservePartyResponse extends AbstractC0269h implements sre0 {
    public static final int ARCHIVED_ROOM_FIELD_NUMBER = 6;
    public static final int CLOSED_ROOM_FIELD_NUMBER = 5;
    public static final int CURRENT_USER_FIELD_NUMBER = 2;
    private static final ObservePartyResponse DEFAULT_INSTANCE;
    public static final int HYPE_ROOM_FIELD_NUMBER = 3;
    public static final int LIVE_ROOM_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PARTY_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private CurrentUser currentUser_;
    private Object room_;
    private int roomCase_ = 0;
    private String partyUri_ = "";

    static {
        ObservePartyResponse observePartyResponse = new ObservePartyResponse();
        DEFAULT_INSTANCE = observePartyResponse;
        AbstractC0269h.registerDefaultInstance(ObservePartyResponse.class, observePartyResponse);
    }

    private ObservePartyResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"room_", "roomCase_", "bitField0_", "partyUri_", "currentUser_", HypeRoom.class, LiveRoom.class, ClosedRoom.class, ArchivedRoom.class});
        }
        if (iOrdinal == 3) {
            return new ObservePartyResponse();
        }
        if (iOrdinal == 4) {
            return new bpj0(DEFAULT_INSTANCE, 12);
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
        synchronized (ObservePartyResponse.class) {
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
    public final ClosedRoom m13081n() {
        return this.roomCase_ == 5 ? (ClosedRoom) this.room_ : ClosedRoom.m13066n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final HypeRoom m13082o() {
        return this.roomCase_ == 3 ? (HypeRoom) this.room_ : HypeRoom.m13071n();
    }

    /* JADX INFO: renamed from: p */
    public final LiveRoom m13083p() {
        return this.roomCase_ == 4 ? (LiveRoom) this.room_ : LiveRoom.m13073n();
    }

    /* JADX INFO: renamed from: q */
    public final int m13084q() {
        int i = this.roomCase_;
        if (i == 0) {
            return 5;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i != 5) {
            return i != 6 ? 0 : 4;
        }
        return 3;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m13085r() {
        return this.roomCase_ == 5;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m13086s() {
        return this.roomCase_ == 3;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m13087t() {
        return this.roomCase_ == 4;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
