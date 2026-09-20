package com.spotify.aipartner.aipartnerapi.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Iterator;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.czw0;
import p204p.ia7;
import p204p.n350;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.y4x0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class ResolveIntentRequest extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_FIELD_NUMBER = 3;
    private static final ResolveIntentRequest DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int RESTRICTIONS_FIELD_NUMBER = 4;
    private static final vd50 restrictions_converter_ = new ia7(23);
    private int bitField0_;
    private Context context_;
    private int limit_;
    private Query query_;
    private int restrictionsMemoizedSerializedSize;
    private String requestId_ = "";
    private ud50 restrictions_ = AbstractC0269h.emptyIntList();

    static {
        ResolveIntentRequest resolveIntentRequest = new ResolveIntentRequest();
        DEFAULT_INSTANCE = resolveIntentRequest;
        AbstractC0269h.registerDefaultInstance(ResolveIntentRequest.class, resolveIntentRequest);
    }

    private ResolveIntentRequest() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m3066n(ResolveIntentRequest resolveIntentRequest, List list) {
        ud50 ud50Var = resolveIntentRequest.restrictions_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            resolveIntentRequest.restrictions_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y4x0 y4x0Var = (y4x0) it.next();
            ((n350) resolveIntentRequest.restrictions_).m63581b(y4x0Var.getNumber());
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m3067o(ResolveIntentRequest resolveIntentRequest, Context context) {
        resolveIntentRequest.getClass();
        context.getClass();
        resolveIntentRequest.context_ = context;
        resolveIntentRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static void m3068p(ResolveIntentRequest resolveIntentRequest, int i) {
        resolveIntentRequest.bitField0_ |= 4;
        resolveIntentRequest.limit_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m3069q(ResolveIntentRequest resolveIntentRequest, Query query) {
        resolveIntentRequest.getClass();
        query.getClass();
        resolveIntentRequest.query_ = query;
        resolveIntentRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static void m3070r(ResolveIntentRequest resolveIntentRequest, String str) {
        resolveIntentRequest.getClass();
        resolveIntentRequest.requestId_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static czw0 m3071v() {
        return (czw0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004,\u0005င\u0002", new Object[]{"bitField0_", "requestId_", "query_", "context_", "restrictions_", "limit_"});
        }
        if (iOrdinal == 3) {
            return new ResolveIntentRequest();
        }
        if (iOrdinal == 4) {
            return new czw0(DEFAULT_INSTANCE);
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
        synchronized (ResolveIntentRequest.class) {
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

    /* JADX INFO: renamed from: s */
    public final Context m3072s() {
        Context context = this.context_;
        return context == null ? Context.m3044r() : context;
    }

    /* JADX INFO: renamed from: t */
    public final Query m3073t() {
        Query query = this.query_;
        return query == null ? Query.m3064q() : query;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m3074u() {
        return this.requestId_;
    }
}
