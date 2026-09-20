package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import java.util.Iterator;
import p204p.AbstractC1733c9;
import p204p.mje;
import p204p.n350;
import p204p.o710;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.r46;
import p204p.sre0;
import p204p.ud50;
import p204p.vd50;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class GetConcertPageRequest extends AbstractC0269h implements sre0 {
    public static final int CAPABILITIES_FIELD_NUMBER = 2;
    public static final int CONCERT_URI_FIELD_NUMBER = 1;
    private static final GetConcertPageRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private static final vd50 capabilities_converter_ = new r46(12);
    private int capabilitiesMemoizedSerializedSize;
    private String concertUri_ = "";
    private ud50 capabilities_ = AbstractC0269h.emptyIntList();

    static {
        GetConcertPageRequest getConcertPageRequest = new GetConcertPageRequest();
        DEFAULT_INSTANCE = getConcertPageRequest;
        AbstractC0269h.registerDefaultInstance(GetConcertPageRequest.class, getConcertPageRequest);
    }

    private GetConcertPageRequest() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static void m7041n(GetConcertPageRequest getConcertPageRequest, Iterable iterable) {
        ud50 ud50Var = getConcertPageRequest.capabilities_;
        if (!((AbstractC1733c9) ud50Var).f35342a) {
            getConcertPageRequest.capabilities_ = AbstractC0269h.mutableCopy(ud50Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mje mjeVar = (mje) it.next();
            ((n350) getConcertPageRequest.capabilities_).m63581b(mjeVar.getNumber());
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m7042o(GetConcertPageRequest getConcertPageRequest, String str) {
        getConcertPageRequest.getClass();
        str.getClass();
        getConcertPageRequest.concertUri_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static o710 m7043p() {
        return (o710) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002,", new Object[]{"concertUri_", "capabilities_"});
        }
        if (iOrdinal == 3) {
            return new GetConcertPageRequest();
        }
        if (iOrdinal == 4) {
            return new o710(DEFAULT_INSTANCE);
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
        synchronized (GetConcertPageRequest.class) {
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
