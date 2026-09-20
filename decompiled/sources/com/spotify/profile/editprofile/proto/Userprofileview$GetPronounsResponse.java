package com.spotify.profile.editprofile.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.kea1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Userprofileview$GetPronounsResponse extends AbstractC0269h implements sre0 {
    private static final Userprofileview$GetPronounsResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PRONOUNS_BY_LANGUAGE_FIELD_NUMBER = 1;
    private ae50 pronounsByLanguage_ = AbstractC0269h.emptyProtobufList();

    static {
        Userprofileview$GetPronounsResponse userprofileview$GetPronounsResponse = new Userprofileview$GetPronounsResponse();
        DEFAULT_INSTANCE = userprofileview$GetPronounsResponse;
        AbstractC0269h.registerDefaultInstance(Userprofileview$GetPronounsResponse.class, userprofileview$GetPronounsResponse);
    }

    private Userprofileview$GetPronounsResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static Userprofileview$GetPronounsResponse m19770n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"pronounsByLanguage_", Userprofileview$PronounsByLanguage.class});
        }
        if (iOrdinal == 3) {
            return new Userprofileview$GetPronounsResponse();
        }
        if (iOrdinal == 4) {
            return new kea1(DEFAULT_INSTANCE, 20);
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
        synchronized (Userprofileview$GetPronounsResponse.class) {
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
    public final ae50 m19771o() {
        return this.pronounsByLanguage_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
