package com.spotify.share.restrictions.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.cu5;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.ui01;
import p204p.vd50;
import p204p.wd50;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ShareRestrictionsProto$ShareFormatRestriction extends AbstractC0269h implements sre0 {
    public static final int BLOCKED_DESTINATIONS_FIELD_NUMBER = 4;
    public static final int BLOCKED_FEATURES_FIELD_NUMBER = 2;
    private static final ShareRestrictionsProto$ShareFormatRestriction DEFAULT_INSTANCE;
    public static final int IS_BLOCKED_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_FORMAT_ID_FIELD_NUMBER = 1;
    private static final vd50 blockedFeatures_converter_ = new cu5(25);
    private int blockedFeaturesMemoizedSerializedSize;
    private boolean isBlocked_;
    private String shareFormatId_ = "";
    private ud50 blockedFeatures_ = AbstractC0269h.emptyIntList();
    private ae50 blockedDestinations_ = AbstractC0269h.emptyProtobufList();

    static {
        ShareRestrictionsProto$ShareFormatRestriction shareRestrictionsProto$ShareFormatRestriction = new ShareRestrictionsProto$ShareFormatRestriction();
        DEFAULT_INSTANCE = shareRestrictionsProto$ShareFormatRestriction;
        AbstractC0269h.registerDefaultInstance(ShareRestrictionsProto$ShareFormatRestriction.class, shareRestrictionsProto$ShareFormatRestriction);
    }

    private ShareRestrictionsProto$ShareFormatRestriction() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002,\u0003\u0007\u0004\u001b", new Object[]{"shareFormatId_", "blockedFeatures_", "isBlocked_", "blockedDestinations_", ShareRestrictionsProto$ShareDestination.class});
        }
        if (iOrdinal == 3) {
            return new ShareRestrictionsProto$ShareFormatRestriction();
        }
        if (iOrdinal == 4) {
            return new ui01(DEFAULT_INSTANCE, 17);
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
        synchronized (ShareRestrictionsProto$ShareFormatRestriction.class) {
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
    public final ae50 m21119n() {
        return this.blockedDestinations_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final wd50 m21120o() {
        return new wd50(this.blockedFeatures_, blockedFeatures_converter_);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m21121p() {
        return this.isBlocked_;
    }

    /* JADX INFO: renamed from: q */
    public final String m21122q() {
        return this.shareFormatId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
