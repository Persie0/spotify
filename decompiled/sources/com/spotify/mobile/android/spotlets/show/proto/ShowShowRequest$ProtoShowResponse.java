package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.qr11;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ShowShowRequest$ProtoShowResponse extends AbstractC0269h implements sre0 {
    public static final int AUXILIARY_SECTIONS_FIELD_NUMBER = 8;
    private static final ShowShowRequest$ProtoShowResponse DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 2;
    public static final int ITEM_FIELD_NUMBER = 1;
    public static final int LENGTH_FIELD_NUMBER = 5;
    public static final int LOADING_CONTENTS_FIELD_NUMBER = 6;
    public static final int ONLINE_DATA_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int UNFILTERED_LENGTH_FIELD_NUMBER = 4;
    public static final int UNRANGED_LENGTH_FIELD_NUMBER = 7;
    private ShowShowRequest$AuxiliarySections auxiliarySections_;
    private int bitField0_;
    private ShowShowRequest$ProtoShowRequestHeader header_;
    private ae50 item_ = AbstractC0269h.emptyProtobufList();
    private int length_;
    private boolean loadingContents_;
    private ShowShowRequest$ProtoOnlineData onlineData_;
    private int unfilteredLength_;
    private int unrangedLength_;

    static {
        ShowShowRequest$ProtoShowResponse showShowRequest$ProtoShowResponse = new ShowShowRequest$ProtoShowResponse();
        DEFAULT_INSTANCE = showShowRequest$ProtoShowResponse;
        AbstractC0269h.registerDefaultInstance(ShowShowRequest$ProtoShowResponse.class, showShowRequest$ProtoShowResponse);
    }

    private ShowShowRequest$ProtoShowResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: x */
    public static ShowShowRequest$ProtoShowResponse m15530x(byte[] bArr) {
        return (ShowShowRequest$ProtoShowResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဋ\u0002\u0005ဋ\u0003\u0006ဇ\u0004\u0007ဋ\u0005\bဉ\u0006", new Object[]{"bitField0_", "item_", ShowShowRequest$ProtoShowRequestItem.class, "header_", "onlineData_", "unfilteredLength_", "length_", "loadingContents_", "unrangedLength_", "auxiliarySections_"});
        }
        if (iOrdinal == 3) {
            return new ShowShowRequest$ProtoShowResponse();
        }
        if (iOrdinal == 4) {
            return new qr11(DEFAULT_INSTANCE, 1);
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
        synchronized (ShowShowRequest$ProtoShowResponse.class) {
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
    public final ShowShowRequest$AuxiliarySections m15531n() {
        ShowShowRequest$AuxiliarySections showShowRequest$AuxiliarySections = this.auxiliarySections_;
        return showShowRequest$AuxiliarySections == null ? ShowShowRequest$AuxiliarySections.m15496o() : showShowRequest$AuxiliarySections;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ShowShowRequest$ProtoShowRequestHeader m15532o() {
        ShowShowRequest$ProtoShowRequestHeader showShowRequest$ProtoShowRequestHeader = this.header_;
        return showShowRequest$ProtoShowRequestHeader == null ? ShowShowRequest$ProtoShowRequestHeader.m15510n() : showShowRequest$ProtoShowRequestHeader;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m15533p() {
        return this.item_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m15534q() {
        return this.loadingContents_;
    }

    /* JADX INFO: renamed from: r */
    public final ShowShowRequest$ProtoOnlineData m15535r() {
        ShowShowRequest$ProtoOnlineData showShowRequest$ProtoOnlineData = this.onlineData_;
        return showShowRequest$ProtoOnlineData == null ? ShowShowRequest$ProtoOnlineData.m15508n() : showShowRequest$ProtoOnlineData;
    }

    /* JADX INFO: renamed from: s */
    public final int m15536s() {
        return this.unfilteredLength_;
    }

    /* JADX INFO: renamed from: t */
    public final int m15537t() {
        return this.unrangedLength_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m15538u() {
        return (this.bitField0_ & 64) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m15539v() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m15540w() {
        return (this.bitField0_ & 2) != 0;
    }
}
