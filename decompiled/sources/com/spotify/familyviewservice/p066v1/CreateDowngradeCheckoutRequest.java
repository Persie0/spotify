package com.spotify.familyviewservice.p066v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z5l;

/* JADX INFO: loaded from: classes2.dex */
public final class CreateDowngradeCheckoutRequest extends AbstractC0269h implements sre0 {
    private static final CreateDowngradeCheckoutRequest DEFAULT_INSTANCE;
    public static final int MEMBER_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REMOVE_SEAT_FIELD_NUMBER = 2;
    private int bitField0_;
    private String memberId_ = "";
    private boolean removeSeat_;

    static {
        CreateDowngradeCheckoutRequest createDowngradeCheckoutRequest = new CreateDowngradeCheckoutRequest();
        DEFAULT_INSTANCE = createDowngradeCheckoutRequest;
        AbstractC0269h.registerDefaultInstance(CreateDowngradeCheckoutRequest.class, createDowngradeCheckoutRequest);
    }

    private CreateDowngradeCheckoutRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m10688n(CreateDowngradeCheckoutRequest createDowngradeCheckoutRequest, String str) {
        createDowngradeCheckoutRequest.getClass();
        str.getClass();
        createDowngradeCheckoutRequest.bitField0_ |= 1;
        createDowngradeCheckoutRequest.memberId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m10689o(CreateDowngradeCheckoutRequest createDowngradeCheckoutRequest, boolean z) {
        createDowngradeCheckoutRequest.bitField0_ |= 2;
        createDowngradeCheckoutRequest.removeSeat_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static z5l m10691q() {
        return (z5l) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "memberId_", "removeSeat_"});
        }
        if (iOrdinal == 3) {
            return new CreateDowngradeCheckoutRequest();
        }
        if (iOrdinal == 4) {
            return new z5l();
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
        synchronized (CreateDowngradeCheckoutRequest.class) {
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
