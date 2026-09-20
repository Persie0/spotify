package com.spotify.campfire.sharelist.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ui01;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class SharelistItem extends AbstractC0269h implements sre0 {
    private static final SharelistItem DEFAULT_INSTANCE;
    public static final int GROUP_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int USER_FIELD_NUMBER = 1;
    private int sharelistItemCase_ = 0;
    private Object sharelistItem_;

    static {
        SharelistItem sharelistItem = new SharelistItem();
        DEFAULT_INSTANCE = sharelistItem;
        AbstractC0269h.registerDefaultInstance(SharelistItem.class, sharelistItem);
    }

    private SharelistItem() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"sharelistItem_", "sharelistItemCase_", SharelistUser.class, SharelistGroup.class});
        }
        if (iOrdinal == 3) {
            return new SharelistItem();
        }
        if (iOrdinal == 4) {
            return new ui01(DEFAULT_INSTANCE, 25);
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
        synchronized (SharelistItem.class) {
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

    public final boolean hasGroup() {
        return this.sharelistItemCase_ == 2;
    }

    public final boolean hasUser() {
        return this.sharelistItemCase_ == 1;
    }

    /* JADX INFO: renamed from: n */
    public final SharelistGroup m5496n() {
        return this.sharelistItemCase_ == 2 ? (SharelistGroup) this.sharelistItem_ : SharelistGroup.m5491n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final SharelistUser m5497o() {
        return this.sharelistItemCase_ == 1 ? (SharelistUser) this.sharelistItem_ : SharelistUser.m5502n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
