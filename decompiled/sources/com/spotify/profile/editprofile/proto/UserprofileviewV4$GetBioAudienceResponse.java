package com.spotify.profile.editprofile.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cza1;
import p204p.i97;
import p204p.kea1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.wd50;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class UserprofileviewV4$GetBioAudienceResponse extends AbstractC0269h implements sre0 {
    public static final int AVAILABLE_FIELD_NUMBER = 2;
    public static final int CURRENT_FIELD_NUMBER = 1;
    private static final UserprofileviewV4$GetBioAudienceResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private static final vd50 available_converter_ = new i97(29);
    private int availableMemoizedSerializedSize;
    private ud50 available_ = AbstractC0269h.emptyIntList();
    private int current_;

    static {
        UserprofileviewV4$GetBioAudienceResponse userprofileviewV4$GetBioAudienceResponse = new UserprofileviewV4$GetBioAudienceResponse();
        DEFAULT_INSTANCE = userprofileviewV4$GetBioAudienceResponse;
        AbstractC0269h.registerDefaultInstance(UserprofileviewV4$GetBioAudienceResponse.class, userprofileviewV4$GetBioAudienceResponse);
    }

    private UserprofileviewV4$GetBioAudienceResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002,", new Object[]{"current_", "available_"});
        }
        if (iOrdinal == 3) {
            return new UserprofileviewV4$GetBioAudienceResponse();
        }
        if (iOrdinal == 4) {
            return new kea1(DEFAULT_INSTANCE, 22);
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
        synchronized (UserprofileviewV4$GetBioAudienceResponse.class) {
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
    public final wd50 m19780n() {
        return new wd50(this.available_, available_converter_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final cza1 m19781o() {
        cza1 cza1VarM34429a = cza1.m34429a(this.current_);
        return cza1VarM34429a == null ? cza1.UNRECOGNIZED : cza1VarM34429a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
