package com.spotify.extendedmetadata.extensions.chatsharepreviewimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ioc;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ChatSharePreview extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_FIELD_NUMBER = 1;
    private static final ChatSharePreview DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_FORMAT_FIELD_NUMBER = 3;
    public static final int STICKER_FIELD_NUMBER = 2;
    private Background background_;
    private int bitField0_;
    private ShareFormat shareFormat_;
    private Image sticker_;

    static {
        ChatSharePreview chatSharePreview = new ChatSharePreview();
        DEFAULT_INSTANCE = chatSharePreview;
        AbstractC0269h.registerDefaultInstance(ChatSharePreview.class, chatSharePreview);
    }

    private ChatSharePreview() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ChatSharePreview m9915q(byte[] bArr) {
        return (ChatSharePreview) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "background_", "sticker_", "shareFormat_"});
        }
        if (iOrdinal == 3) {
            return new ChatSharePreview();
        }
        if (iOrdinal == 4) {
            return new ioc(DEFAULT_INSTANCE, 13);
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
        synchronized (ChatSharePreview.class) {
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

    public final boolean hasSticker() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final Background m9916n() {
        Background background = this.background_;
        return background == null ? Background.m9909p() : background;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ShareFormat m9917o() {
        ShareFormat shareFormat = this.shareFormat_;
        return shareFormat == null ? ShareFormat.m9923n() : shareFormat;
    }

    /* JADX INFO: renamed from: p */
    public final Image m9918p() {
        Image image = this.sticker_;
        return image == null ? Image.m9922n() : image;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
