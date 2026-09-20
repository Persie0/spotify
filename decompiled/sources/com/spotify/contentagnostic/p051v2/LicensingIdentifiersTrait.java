package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.dv50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class LicensingIdentifiersTrait extends AbstractC0269h implements sre0 {
    public static final int ALBUM_URI_FIELD_NUMBER = 2;
    public static final int ARTIST_URI_FIELD_NUMBER = 3;
    private static final LicensingIdentifiersTrait DEFAULT_INSTANCE;
    public static final int ITEM_URI_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private String itemUri_ = "";
    private String albumUri_ = "";
    private ae50 artistUri_ = AbstractC0269h.emptyProtobufList();

    static {
        LicensingIdentifiersTrait licensingIdentifiersTrait = new LicensingIdentifiersTrait();
        DEFAULT_INSTANCE = licensingIdentifiersTrait;
        AbstractC0269h.registerDefaultInstance(LicensingIdentifiersTrait.class, licensingIdentifiersTrait);
    }

    private LicensingIdentifiersTrait() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static LicensingIdentifiersTrait m7882r(byte[] bArr) {
        return (LicensingIdentifiersTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț", new Object[]{"itemUri_", "albumUri_", "artistUri_"});
        }
        if (iOrdinal == 3) {
            return new LicensingIdentifiersTrait();
        }
        if (iOrdinal == 4) {
            return new dv50(27);
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
        synchronized (LicensingIdentifiersTrait.class) {
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
    public final String m7883o() {
        return this.albumUri_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m7884p() {
        return this.artistUri_;
    }

    /* JADX INFO: renamed from: q */
    public final String m7885q() {
        return this.itemUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
