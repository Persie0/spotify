package com.spotify.extendedmetadata.extensions.contextualflairtrackimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.na8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class Badge extends AbstractC0269h implements sre0 {
    private static final Badge DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 2;
    public static final int LOCALIZED_TEXT_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    private String localizedText_ = "";
    private String icon_ = "";
    private String type_ = "";

    static {
        Badge badge = new Badge();
        DEFAULT_INSTANCE = badge;
        AbstractC0269h.registerDefaultInstance(Badge.class, badge);
    }

    private Badge() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static Badge m10078q(byte[] bArr) {
        return (Badge) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"localizedText_", "icon_", "type_"});
        }
        if (iOrdinal == 3) {
            return new Badge();
        }
        if (iOrdinal == 4) {
            return new na8(DEFAULT_INSTANCE, 11);
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
        synchronized (Badge.class) {
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
    public final String m10079n() {
        return this.icon_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10080o() {
        return this.localizedText_;
    }

    /* JADX INFO: renamed from: p */
    public final String m10081p() {
        return this.type_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
