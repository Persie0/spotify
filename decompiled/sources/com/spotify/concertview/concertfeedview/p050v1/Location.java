package com.spotify.concertview.concertfeedview.p050v1;

import com.google.protobuf.AbstractC0269h;
import p204p.lj90;
import p204p.ofa0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class Location extends AbstractC0269h implements sre0 {
    private static final Location DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int RESOLUTION_METHOD_FIELD_NUMBER = 2;
    private String displayName_ = "";
    private int resolutionMethod_;

    static {
        Location location = new Location();
        DEFAULT_INSTANCE = location;
        AbstractC0269h.registerDefaultInstance(Location.class, location);
    }

    private Location() {
    }

    /* JADX INFO: renamed from: n */
    public static Location m7258n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"displayName_", "resolutionMethod_"});
        }
        if (iOrdinal == 3) {
            return new Location();
        }
        if (iOrdinal == 4) {
            return new lj90(DEFAULT_INSTANCE, 22);
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
        synchronized (Location.class) {
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

    public final String getDisplayName() {
        return this.displayName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ofa0 m7259o() {
        ofa0 ofa0Var;
        int i = this.resolutionMethod_;
        if (i == 0) {
            ofa0Var = ofa0.RESOLUTION_METHOD_UNSPECIFIED;
        } else if (i == 1) {
            ofa0Var = ofa0.RESOLUTION_METHOD_STORE;
        } else if (i != 2) {
            ofa0Var = i != 3 ? null : ofa0.RESOLUTION_METHOD_PROVIDED;
        } else {
            ofa0Var = ofa0.RESOLUTION_METHOD_INFERRED;
        }
        return ofa0Var == null ? ofa0.UNRECOGNIZED : ofa0Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
