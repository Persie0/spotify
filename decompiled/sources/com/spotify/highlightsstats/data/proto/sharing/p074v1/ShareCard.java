package com.spotify.highlightsstats.data.proto.sharing.p074v1;

import com.google.protobuf.AbstractC0269h;
import p204p.o511;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ui01;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ShareCard extends AbstractC0269h implements sre0 {
    private static final ShareCard DEFAULT_INSTANCE;
    public static final int HIGHLIGHTS_TYPE_FIELD_NUMBER = 4;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    public static final int MESSAGING_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int STATS_TYPE_FIELD_NUMBER = 3;
    private int bitField0_;
    private ShareMessaging messaging_;
    private Object type_;
    private int typeCase_ = 0;
    private String imageUrl_ = "";

    static {
        ShareCard shareCard = new ShareCard();
        DEFAULT_INSTANCE = shareCard;
        AbstractC0269h.registerDefaultInstance(ShareCard.class, shareCard);
    }

    private ShareCard() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003?\u0000\u0004?\u0000", new Object[]{"type_", "typeCase_", "bitField0_", "imageUrl_", "messaging_"});
        }
        if (iOrdinal == 3) {
            return new ShareCard();
        }
        if (iOrdinal == 4) {
            return new ui01(DEFAULT_INSTANCE, 2);
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
        synchronized (ShareCard.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    /* JADX INFO: renamed from: n */
    public final ShareMessaging m11301n() {
        ShareMessaging shareMessaging = this.messaging_;
        return shareMessaging == null ? ShareMessaging.m11308n() : shareMessaging;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final o511 m11302o() {
        if (this.typeCase_ != 3) {
            return o511.UNSPECIFIED_TYPE;
        }
        o511 o511VarM66266a = o511.m66266a(((Integer) this.type_).intValue());
        return o511VarM66266a == null ? o511.UNRECOGNIZED : o511VarM66266a;
    }

    /* JADX INFO: renamed from: p */
    public final int m11303p() {
        int i = this.typeCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
