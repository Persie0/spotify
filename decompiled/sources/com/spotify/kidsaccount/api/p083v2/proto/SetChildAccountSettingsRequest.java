package com.spotify.kidsaccount.api.p083v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.a501;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class SetChildAccountSettingsRequest extends AbstractC0269h implements sre0 {
    public static final int CHILD_ID_FIELD_NUMBER = 1;
    public static final int DATE_OF_BIRTH_FIELD_NUMBER = 3;
    private static final SetChildAccountSettingsRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int PARENTAL_CONTROL_CONNECT_FIELD_NUMBER = 4;
    public static final int PARENTAL_CONTROL_EXPLICIT_CONTENT_FIELD_NUMBER = 5;
    public static final int PARENTAL_CONTROL_VIDEO_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private boolean parentalControlConnect_;
    private boolean parentalControlExplicitContent_;
    private boolean parentalControlVideo_;
    private String childId_ = "";
    private String name_ = "";
    private String dateOfBirth_ = "";

    static {
        SetChildAccountSettingsRequest setChildAccountSettingsRequest = new SetChildAccountSettingsRequest();
        DEFAULT_INSTANCE = setChildAccountSettingsRequest;
        AbstractC0269h.registerDefaultInstance(SetChildAccountSettingsRequest.class, setChildAccountSettingsRequest);
    }

    private SetChildAccountSettingsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12098n(SetChildAccountSettingsRequest setChildAccountSettingsRequest, String str) {
        setChildAccountSettingsRequest.getClass();
        str.getClass();
        setChildAccountSettingsRequest.childId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12099o(SetChildAccountSettingsRequest setChildAccountSettingsRequest, String str) {
        setChildAccountSettingsRequest.getClass();
        setChildAccountSettingsRequest.bitField0_ |= 2;
        setChildAccountSettingsRequest.dateOfBirth_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12100p(SetChildAccountSettingsRequest setChildAccountSettingsRequest, String str) {
        setChildAccountSettingsRequest.getClass();
        setChildAccountSettingsRequest.bitField0_ |= 1;
        setChildAccountSettingsRequest.name_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12101q(SetChildAccountSettingsRequest setChildAccountSettingsRequest, boolean z) {
        setChildAccountSettingsRequest.bitField0_ |= 8;
        setChildAccountSettingsRequest.parentalControlExplicitContent_ = z;
    }

    /* JADX INFO: renamed from: r */
    public static void m12102r(SetChildAccountSettingsRequest setChildAccountSettingsRequest, boolean z) {
        setChildAccountSettingsRequest.bitField0_ |= 16;
        setChildAccountSettingsRequest.parentalControlVideo_ = z;
    }

    /* JADX INFO: renamed from: t */
    public static a501 m12104t() {
        return (a501) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "childId_", "name_", "dateOfBirth_", "parentalControlConnect_", "parentalControlExplicitContent_", "parentalControlVideo_"});
        }
        if (iOrdinal == 3) {
            return new SetChildAccountSettingsRequest();
        }
        if (iOrdinal == 4) {
            return new a501();
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
        synchronized (SetChildAccountSettingsRequest.class) {
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
