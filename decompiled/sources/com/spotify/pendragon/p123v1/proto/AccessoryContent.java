package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p000.AbstractC0000a;
import p204p.C1997j;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class AccessoryContent extends AbstractC0269h implements sre0 {
    private static final AccessoryContent DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 1;
    public static final int IMAGE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int contentCase_ = 0;
    private Object content_;

    static {
        AccessoryContent accessoryContent = new AccessoryContent();
        DEFAULT_INSTANCE = accessoryContent;
        AbstractC0269h.registerDefaultInstance(AccessoryContent.class, accessoryContent);
    }

    private AccessoryContent() {
    }

    /* JADX INFO: renamed from: p */
    public static AccessoryContent m16980p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"content_", "contentCase_", Icon.class, AccessoryImage.class});
        }
        if (iOrdinal == 3) {
            return new AccessoryContent();
        }
        if (iOrdinal == 4) {
            return new C1997j(2);
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
        synchronized (AccessoryContent.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m16981o() {
        return AbstractC0000a.m2a(this.contentCase_);
    }

    /* JADX INFO: renamed from: q */
    public final Icon m16982q() {
        return this.contentCase_ == 1 ? (Icon) this.content_ : Icon.m17217p();
    }

    /* JADX INFO: renamed from: r */
    public final AccessoryImage m16983r() {
        return this.contentCase_ == 2 ? (AccessoryImage) this.content_ : AccessoryImage.m16985o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
