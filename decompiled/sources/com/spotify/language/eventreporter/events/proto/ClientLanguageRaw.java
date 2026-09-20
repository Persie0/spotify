package com.spotify.language.eventreporter.events.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.nke;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientLanguageRaw extends AbstractC0269h implements sre0 {
    public static final int CLIENT_LOCALE_FIELD_NUMBER = 1;
    private static final ClientLanguageRaw DEFAULT_INSTANCE;
    public static final int OS_LOCALES_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String clientLocale_ = "";
    private ae50 osLocales_ = AbstractC0269h.emptyProtobufList();

    static {
        ClientLanguageRaw clientLanguageRaw = new ClientLanguageRaw();
        DEFAULT_INSTANCE = clientLanguageRaw;
        AbstractC0269h.registerDefaultInstance(ClientLanguageRaw.class, clientLanguageRaw);
    }

    private ClientLanguageRaw() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12529n(ClientLanguageRaw clientLanguageRaw, ArrayList arrayList) {
        ae50 ae50Var = clientLanguageRaw.osLocales_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            clientLanguageRaw.osLocales_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, clientLanguageRaw.osLocales_);
    }

    /* JADX INFO: renamed from: o */
    public static void m12530o(ClientLanguageRaw clientLanguageRaw, String str) {
        clientLanguageRaw.getClass();
        str.getClass();
        clientLanguageRaw.bitField0_ |= 1;
        clientLanguageRaw.clientLocale_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static nke m12531p() {
        return (nke) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"bitField0_", "clientLocale_", "osLocales_"});
        }
        if (iOrdinal == 3) {
            return new ClientLanguageRaw();
        }
        if (iOrdinal == 4) {
            return new nke(DEFAULT_INSTANCE);
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
        synchronized (ClientLanguageRaw.class) {
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
