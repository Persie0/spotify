package com.spotify.kidsaccount.api.p084v3.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.aa1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class AddChildRequest extends AbstractC0269h implements sre0 {
    public static final int ATTRIBUTES_FIELD_NUMBER = 1;
    private static final AddChildRequest DEFAULT_INSTANCE;
    public static final int PARENTAL_CONSENT_SESSION_ID_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PIN_FIELD_NUMBER = 3;
    public static final int PROFILE_FIELD_NUMBER = 2;
    private ChildAttributes attributes_;
    private int bitField0_;
    private ChildProfile profile_;
    private String pin_ = "";
    private String parentalConsentSessionId_ = "";

    static {
        AddChildRequest addChildRequest = new AddChildRequest();
        DEFAULT_INSTANCE = addChildRequest;
        AbstractC0269h.registerDefaultInstance(AddChildRequest.class, addChildRequest);
    }

    private AddChildRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12109n(AddChildRequest addChildRequest, ChildAttributes childAttributes) {
        addChildRequest.getClass();
        childAttributes.getClass();
        addChildRequest.attributes_ = childAttributes;
        addChildRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m12110o(AddChildRequest addChildRequest, String str) {
        addChildRequest.getClass();
        str.getClass();
        addChildRequest.bitField0_ |= 8;
        addChildRequest.parentalConsentSessionId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12111p(AddChildRequest addChildRequest, String str) {
        addChildRequest.getClass();
        addChildRequest.bitField0_ |= 4;
        addChildRequest.pin_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12112q(AddChildRequest addChildRequest, ChildProfile childProfile) {
        addChildRequest.getClass();
        childProfile.getClass();
        addChildRequest.profile_ = childProfile;
        addChildRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: r */
    public static aa1 m12113r() {
        return (aa1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "attributes_", "profile_", "pin_", "parentalConsentSessionId_"});
        }
        if (iOrdinal == 3) {
            return new AddChildRequest();
        }
        if (iOrdinal == 4) {
            return new aa1(DEFAULT_INSTANCE);
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
        synchronized (AddChildRequest.class) {
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
