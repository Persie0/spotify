package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.iu0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class AdministratePermissionCapabilities extends AbstractC0269h implements sre0 {
    public static final int CAN_REMOVE_FIELD_NUMBER = 2;
    public static final int CAN_REMOVE_OWN_FIELD_NUMBER = 3;
    public static final int CAN_SET_FIELD_NUMBER = 1;
    private static final AdministratePermissionCapabilities DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private boolean canRemoveOwn_;
    private boolean canRemove_;
    private boolean canSet_;

    static {
        AdministratePermissionCapabilities administratePermissionCapabilities = new AdministratePermissionCapabilities();
        DEFAULT_INSTANCE = administratePermissionCapabilities;
        AbstractC0269h.registerDefaultInstance(AdministratePermissionCapabilities.class, administratePermissionCapabilities);
    }

    private AdministratePermissionCapabilities() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "canSet_", "canRemove_", "canRemoveOwn_"});
        }
        if (iOrdinal == 3) {
            return new AdministratePermissionCapabilities();
        }
        if (iOrdinal == 4) {
            return new iu0(DEFAULT_INSTANCE, 9);
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
        synchronized (AdministratePermissionCapabilities.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
