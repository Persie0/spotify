package com.spotify.libs.sociallistening.events.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.b760;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class JamResolveTokenResult extends AbstractC0269h implements sre0 {
    public static final int CORRELATION_ID_FIELD_NUMBER = 4;
    private static final JamResolveTokenResult DEFAULT_INSTANCE;
    public static final int DISCOVERY_METHODS_FIELD_NUMBER = 2;
    public static final int ERROR_CATEGORY_FIELD_NUMBER = 6;
    public static final int ERROR_DATA_FIELD_NUMBER = 5;
    public static final int JOIN_TOKEN_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TOKENS_FIELD_NUMBER = 1;
    private int bitField0_;
    private ae50 tokens_ = AbstractC0269h.emptyProtobufList();
    private ae50 discoveryMethods_ = AbstractC0269h.emptyProtobufList();
    private String joinToken_ = "";
    private String correlationId_ = "";
    private String errorData_ = "";
    private String errorCategory_ = "";

    static {
        JamResolveTokenResult jamResolveTokenResult = new JamResolveTokenResult();
        DEFAULT_INSTANCE = jamResolveTokenResult;
        AbstractC0269h.registerDefaultInstance(JamResolveTokenResult.class, jamResolveTokenResult);
    }

    private JamResolveTokenResult() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12832n(JamResolveTokenResult jamResolveTokenResult, ArrayList arrayList) {
        ae50 ae50Var = jamResolveTokenResult.discoveryMethods_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            jamResolveTokenResult.discoveryMethods_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, jamResolveTokenResult.discoveryMethods_);
    }

    /* JADX INFO: renamed from: o */
    public static void m12833o(JamResolveTokenResult jamResolveTokenResult, ArrayList arrayList) {
        ae50 ae50Var = jamResolveTokenResult.tokens_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            jamResolveTokenResult.tokens_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, jamResolveTokenResult.tokens_);
    }

    /* JADX INFO: renamed from: p */
    public static void m12834p(JamResolveTokenResult jamResolveTokenResult, String str) {
        jamResolveTokenResult.getClass();
        str.getClass();
        jamResolveTokenResult.bitField0_ |= 2;
        jamResolveTokenResult.correlationId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12835q(JamResolveTokenResult jamResolveTokenResult, String str) {
        jamResolveTokenResult.getClass();
        jamResolveTokenResult.bitField0_ |= 8;
        jamResolveTokenResult.errorCategory_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m12836r(JamResolveTokenResult jamResolveTokenResult, String str) {
        jamResolveTokenResult.getClass();
        str.getClass();
        jamResolveTokenResult.bitField0_ |= 4;
        jamResolveTokenResult.errorData_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m12837s(JamResolveTokenResult jamResolveTokenResult, String str) {
        jamResolveTokenResult.getClass();
        jamResolveTokenResult.bitField0_ |= 1;
        jamResolveTokenResult.joinToken_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static b760 m12838t() {
        return (b760) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u001a\u0002\u001a\u0003ဈ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u0006ဈ\u0003", new Object[]{"bitField0_", "tokens_", "discoveryMethods_", "joinToken_", "correlationId_", "errorData_", "errorCategory_"});
        }
        if (iOrdinal == 3) {
            return new JamResolveTokenResult();
        }
        if (iOrdinal == 4) {
            return new b760(DEFAULT_INSTANCE);
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
        synchronized (JamResolveTokenResult.class) {
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
